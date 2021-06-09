package com.jikewang.send.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.jikewang.send.dao.LoanMapper;
import com.jikewang.send.dao.MissMapper;
import com.jikewang.send.dao.NetloanUpdateMapper;
import com.jikewang.send.dao.RepaymentplanMapper;
import com.jikewang.send.domain.Loan;
import com.jikewang.send.domain.LoanFill;
import com.jikewang.send.domain.LoanInfo;
import com.jikewang.send.domain.NetloanUpdate;
import com.jikewang.send.service.SendService;
import com.jikewang.send.utils.Consts;
import com.jikewang.send.utils.HttpUtil;
import com.jikewang.send.utils.HttpsUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.Instant;
import java.util.*;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.service.impl
 * @ClassName: SendServiceImpl
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 14:07
 * @Version: 1.0
 */
@Service
public class SendServiceImpl implements SendService {
    private static final Logger log = LoggerFactory.getLogger(SendServiceImpl.class);
    @Autowired
    private LoanMapper loanMapper;
    @Autowired
    private RepaymentplanMapper repaymentplanMapper;
    @Autowired
    private MissMapper missMapper;
    @Autowired
    private NetloanUpdateMapper netloanUpdateMapper;

    public List<Integer> findLatest(String dt) {
        return repaymentplanMapper.findLatest(dt);
    }

    public List<Integer> findLoanLatest(String dt) {
        return this.loanMapper.findLoanLatest(dt);
    }

    public List<Integer> findMiss(String dt) {
        return this.missMapper.findMiss(dt);
    }

    public void batchInsert(String dt, List<Integer> acctNos) {
        this.missMapper.batchInsert(dt, acctNos);
    }

    public void batchUpdate(String dt, List<Integer> acctNos) {
        this.missMapper.batchUpdate(dt, acctNos);
    }

    public List<Integer> findWdAll(){
        return this.netloanUpdateMapper.findWdAll();
    }
    @Async("taskExecutor")
    public void sendKt(String dt, List<Integer> subAcctNos, boolean newData) {
        Map<String, Object> params = new HashMap<String, Object>(4);
        params.put("dt", dt);
        params.put("acctNos", subAcctNos);
        List<Loan> loans = loanMapper.find(params);
        if (!loans.isEmpty()) {
            List<LoanInfo> infos = new ArrayList<LoanInfo>();
            loans.forEach(l -> {
                LoanInfo info = new LoanInfo();
                info.setContacts(l.getContacts());
                info.setCustomer(l.getCustomer());
                info.setPayments(l.getPayments());
                info.setRepaymentPlans(l.getRepaymentplans());
                LoanFill fill = new LoanFill();
                BeanUtils.copyProperties(l, fill);
                info.setLoan(fill);
                infos.add(info);
            });
            JSONObject jsonObject = null;
            try {
                jsonObject = HttpsUtil.post(Consts.RRD_SEND_URL, JSON.toJSONStringWithDateFormat(infos, "yyyy-MM-dd", new SerializerFeature[] { SerializerFeature.WriteDateUseDateFormat }), "utf-8");
            } catch (IOException |InterruptedException|java.security.NoSuchAlgorithmException|java.security.KeyManagementException e) {
                e.printStackTrace();
            }
            if (jsonObject == null) {
                log.error("发送失败---");
            } else {
                log.info("返回数据：" + jsonObject);
            }
            if (jsonObject == null || !"200".equals(jsonObject.getString("code"))) {
                if (newData) {
                    log.error("发送失败：" + subAcctNos);
                    this.missMapper.batchInsert(dt, subAcctNos);
                } else {
                    log.error("重新发送失败：" + subAcctNos);
                }
            } else if (newData) {
                log.info("发送成功：" + subAcctNos);
            } else {
                log.info("重新发送成功" + subAcctNos);
                this.missMapper.batchUpdate(dt, subAcctNos);
            }
        }
    }

    @Async("taskExecutor")
    public void sendKtTmp(String dt, List<Integer> subAcctNos, boolean newData) {
        Map<String, Object> params = new HashMap<String, Object>(4);
        params.put("dt", dt);
        params.put("acctNos", subAcctNos);
        List<Loan> loans = this.loanMapper.query(params);
        if (!loans.isEmpty()) {
            List<LoanInfo> infos = new ArrayList<LoanInfo>();
            loans.forEach(l -> {
                LoanInfo info = new LoanInfo();
                LoanFill fill = new LoanFill();
                BeanUtils.copyProperties(l, fill);
                info.setLoan(fill);
                infos.add(info);
            });
            JSONObject jsonObject = null;
            try {
                jsonObject = HttpUtil.postHttpJson(Consts.RRD_SEND_URL, JSON.toJSONStringWithDateFormat(infos, "yyyy-MM-dd", new SerializerFeature[] { SerializerFeature.WriteDateUseDateFormat }));
            } catch (IOException|InterruptedException e) {
                e.printStackTrace();
            }
            log.info("返回数据：" + jsonObject);
            if (jsonObject == null || !"200".equals(jsonObject.getString("code"))) {
                if (newData) {
                    log.error("发送失败：" + subAcctNos);
                    this.missMapper.batchInsert(dt, subAcctNos);
                } else {
                    log.error("重新发送失败：" + subAcctNos);
                }
            } else if (newData) {
                log.info("发送成功：" + subAcctNos);
            } else {
                log.info("重新发送成功：" + subAcctNos);
                this.missMapper.batchUpdate(dt, subAcctNos);
            }
        }
    }

    public void sendWd(List<Integer> subAppNos, boolean newData) {
        List<NetloanUpdate> loans = this.netloanUpdateMapper.query(subAppNos);
        Random random = new Random();
        if (!loans.isEmpty()) {
            String batchId = UUID.randomUUID().toString().replaceAll("-", "");
            String timestamp = String.valueOf(Instant.now().getEpochSecond());
            String nonce = String.valueOf(random.nextInt(9000) + 1000);
            String tokenKey = DigestUtils.md5Hex("f1d33acc3eba4de485d45689daa11ad2" + batchId + nonce + timestamp);

            JSONObject postData = new JSONObject();
            postData.put("batchId", batchId);
            postData.put("timestamp", timestamp);
            postData.put("nonce", nonce);
            postData.put("appId", "477abef28f2845c68f47d38ae28d8328");
            postData.put("tokenKey", tokenKey);
            postData.put("data", loans);
            JSONObject responseObject = null;
            try {
                log.info("发送批次：" + batchId);
                responseObject = HttpsUtil.post("https://zbb.tcredit.com/platform/upload", postData
                        .toJSONString(), "utf-8");
                System.out.println(responseObject);
            } catch (IOException|InterruptedException|java.security.NoSuchAlgorithmException|java.security.KeyManagementException e) {
                e.printStackTrace();
            }
            log.info("返回数据：" + responseObject);
            if (responseObject == null || responseObject.getIntValue("code") != 0) {
                if (newData) {
                    log.error("发送失败：" + subAppNos);
                    this.netloanUpdateMapper.batchInsert(subAppNos);
                } else {
                    log.error("重新发送失败：" + subAppNos);
                }

            } else if (newData) {
                log.info("发送成功：" + subAppNos);
            } else {
                log.info("重新发送成功：" + subAppNos);

                this.netloanUpdateMapper.batchUpdate(subAppNos);
            }
        }
    }

    public List<Integer> findFail() {
        return this.netloanUpdateMapper.findFail();
    }
}
