package com.jikewang.send.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jikewang.send.domain.ImageMessage;
import com.jikewang.send.domain.MarkdownMessage;
import com.jikewang.send.domain.NewsMessage;
import com.jikewang.send.domain.TextMessage;
import com.jikewang.send.service.SendService;
import com.jikewang.send.utils.*;
import com.jikewang.send.vo.RestResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.controller
 * @ClassName: SendController
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 14:03
 * @Version: 1.0
 */
@RestController
@RequestMapping({"/send/"})
public class SendController {
    private static final Logger log = LoggerFactory.getLogger(SendController.class);
    @Autowired
    private SendService sendService;

    @RequestMapping({"/sendMail"})
    public RestResult sendMail(@RequestParam Map<String, String> params) throws Exception {
        log.info("请求数据：%s", params.toString());
        String subject = (String)params.get("subject");
        String content = (String)params.get("content");
        String recipientTo = (String)params.get("recipientTo");
        String recipientCc = (String)params.get("recipientCc");
        String recipientBcc = (String)params.get("recipientBcc");

        String type = (String)params.get("type");

        String name = (String)params.get("name");
        boolean show = "1".equals(params.get("show"));
        String dt = (String)params.get("dt");
        if (StringUtils.isEmpty(subject) || StringUtils.isEmpty(recipientTo) ||
                StringUtils.isEmpty(dt)) {
            return RestResult.error("参数错误");
        }
        String pattern = "yyyyMMddHHmmss".substring(0, dt.length());
        Date date = (new SimpleDateFormat(pattern)).parse(dt);
        subject = StrUtil.replace(subject, date);
        content = StrUtil.replace(content, date);

        if ("cpt".equals(type)) {
            Map<String, String> paramMap = null;
            String cptParams = (String)params.get("cptParams");
            if (!StringUtils.isEmpty(cptParams)) {
                String comma = ",";
                paramMap = new HashMap<String, String>(3);
                for (String str : cptParams.split(comma)) {
                    String[] entry = str.split("=");
                    if (entry.length == 2) {
                        String value = entry[1].trim();
                        value = StrUtil.replace(value, date);
                        paramMap.put(entry[0].trim(), value);
                    }
                }
            }
            MailUtil.sendCpt(subject, content, recipientTo, recipientCc, recipientBcc, name, paramMap, show);
        }
        else {
            File parentFile = new File(Consts.DW_PATH + name + "/" + TimeUtil.format(new Date(), "yyyyMMdd") + "/");
            List<File> attachments = null;
            if (parentFile.exists()) {
                File[] files = parentFile.listFiles();
                if (files != null && files.length > 0) {
                    String fileCnt = (String)params.get("fileCnt");
                    attachments = (List) Arrays.stream(files).sorted(Comparator.comparing(File::lastModified).reversed()).limit(StringUtils.isEmpty(fileCnt) ? files.length : Long.valueOf(fileCnt).longValue()).collect(Collectors.toList());
                }
            }
            MailUtil.sendMail(subject, content, recipientTo, recipientCc, recipientBcc, attachments, null, show);
        }
        return RestResult.success();
    }


    @RequestMapping({"/sendTextMsg"})
    public RestResult sendTextMsg(String content) throws IOException {
        if (StringUtils.isEmpty(content)) {
            return RestResult.error("文本信息为空");
        }
        TextMessage message = new TextMessage();
        message.setContent(content);
        int result = MsgUtil.send(message);
        return (result == 1) ? RestResult.success() : RestResult.error("发送失败");
    }
    @RequestMapping({"/sendMarkdownMsg"})
    public RestResult sendMarkdownMsg(String content) throws IOException {
        if (StringUtils.isEmpty(content)) {
            return RestResult.error("markdown信息为空");
        }
        MarkdownMessage message = new MarkdownMessage();
        int result = MsgUtil.send(message);
        return (result == 1) ? RestResult.success() : RestResult.error("发送失败");
    }

    @RequestMapping({"/sendImageMsg"})
    public RestResult sendImageMsg(String fileName) throws IOException {
        if (StringUtils.isEmpty(fileName)) {
            return RestResult.error("图片信息为空");
        }
        File file = new File(Consts.TMP_PATH, fileName);
        if (!file.exists()) {
            return RestResult.error("图片不存在");
        }
        ImageMessage message = new ImageMessage();
        message.setMd5(DigestUtils.md5Hex(new FileInputStream(file)));
        message.setBase64(FileUtil.getImageStr(file));
        int result = MsgUtil.send(message);
        return (result == 1) ? RestResult.success() : RestResult.error("发送失败");
    }

    @RequestMapping({"/sendNewsMsg"})
    public RestResult sendNewsMsg(@RequestBody JSONArray jsonArray) throws IOException {
        if (jsonArray.isEmpty()) {
            return RestResult.error();
        }
        NewsMessage message = new NewsMessage();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject json = jsonArray.getJSONObject(i);
            if (StringUtils.isEmpty(json.getString("title")) ||
                    StringUtils.isEmpty(json.getString("url"))) {
                return RestResult.error();
            }
            String picurl = json.getString("picurl");
            if (!StringUtils.isEmpty(picurl)) {
                File file = new File(Consts.TMP_PATH, picurl);
                if (!file.exists()) {
                    return RestResult.error("图片不存在");
                }
                json.put("picurl", "http://10.255.33.5/images/send/tmp/" + picurl);
            }
            message.add(json);
        }
        int result = MsgUtil.send(message);
        return (result == 1) ? RestResult.success() : RestResult.error("发送失败");
    }

    @RequestMapping({"/sendKt"})
    public RestResult sendKt(String dt) throws IOException {
        log.info("发送资管数据开始" + LocalDateTime.now().toString());
        if (StringUtils.isEmpty(dt)) {
            dt = LocalDate.now().toString();
        }
        List<Integer> acctNos = this.sendService.findLatest(dt);

        if (acctNos.isEmpty()) {
            log.info("没有新更新的数据，发送资管数据结束" + LocalDateTime.now().toString());
            return RestResult.success();
        }
        int limit = 50;
        int start = 0;
        int end = limit;
        int last = acctNos.size();
        while (start < last) {
            if (end > last) {
                end = last;
            }
            List<Integer> subAcctNos = acctNos.subList(start, end);
            start += limit;
            end += limit;
            sendService.sendKt(dt, subAcctNos, true);
        }
        log.info("没有新更新的数据，发送资管数据结束" + LocalDateTime.now().toString());
        return RestResult.success();
    }

    @RequestMapping({"/sendKtTmp"})
    public RestResult sendKtTmp(String dt) throws IOException {
        log.info("临时发送进件信息表" + LocalDateTime.now().toString());
        if (StringUtils.isEmpty(dt)) {
            dt = LocalDate.now().toString();
        }
        List<Integer> acctNos = this.sendService.findLoanLatest(dt);
        if (acctNos.isEmpty()) {
            log.info("没有新更新的数据，临时发送进件信息表结束" + LocalDateTime.now().toString());
            return RestResult.success();
        }
        int limit = 10;
        int start = 0;
        int end = limit;
        int last = acctNos.size();

        while (start < last) {
            if (end > last) {
                end = last;
            }
            List<Integer> subAcctNos = acctNos.subList(start, end);
            start += limit;
            end += limit;
            this.sendService.sendKtTmp(dt, subAcctNos, true);
        }
        log.info("发送资管数据结束：" + LocalDateTime.now().toString());
        return RestResult.success();
    }

    @RequestMapping({"/sendKtMiss"})
    public RestResult sendKtMiss(String dt) throws IOException {
        log.info("发送资管遗漏数据开始：" + LocalDateTime.now().toString());
        if (StringUtils.isEmpty(dt)) {
            dt = LocalDate.now().toString();
        }
        List<Integer> acctNos = this.sendService.findMiss(dt);
        if (acctNos.isEmpty()) {
            log.info("没有遗漏的数据，发送资管遗漏数据结束" + LocalDateTime.now().toString());
            return RestResult.success();
        }
        int limit = 200;
        int start = 0;
        int end = limit;
        while (start < acctNos.size()) {
            if (end > acctNos.size()) {
                end = acctNos.size();
            }
            List<Integer> subAcctNos = acctNos.subList(start, end);
            start += limit;
            end += limit;
            this.sendService.sendKt(dt, subAcctNos, false);
        }
        log.info("发送资管遗漏数据结束" + LocalDateTime.now().toString());
        return RestResult.success();
    }

    public RestResult batchInsert() {
        String dt = LocalDate.now().toString();
        List<Integer> acctNos = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            acctNos.add(Integer.valueOf(random.nextInt(6)));
        }
        this.sendService.batchInsert(dt, acctNos);
        return RestResult.success();
    }

    public RestResult batchUpdate() {
        String dt = LocalDate.now().toString();
        List<Integer> acctNos = this.sendService.findMiss(dt);

        this.sendService.batchUpdate(dt, acctNos);
        return RestResult.success();
    }
    @RequestMapping({"/sendWd"})
    public RestResult sendWd(Integer appNo) {
        log.info("发送网贷平台数据开始：" + LocalDateTime.now().toString());
        List<Integer> appNos = null;
        if (appNo == null) {
            appNos = this.sendService.findWdAll();
        } else {
            appNos = Arrays.asList(new Integer[] { appNo });
        }
        if (appNos.isEmpty()) {
            log.info("没有数据，发送网贷平台数据结束：" + LocalDateTime.now().toString());
            return RestResult.success();
        }
        int limit = 2000;
        int start = 0;
        int end = limit;
        int last = appNos.size();
        while (start < last) {
            if (end > last) {
                end = last;
            }
            List<Integer> subAppNos = appNos.subList(start, end);
            start += limit;
            end += limit;
            this.sendService.sendWd(subAppNos, true);
        }
        log.info("发送网贷平台数据结束：" + LocalDateTime.now().toString());
        return RestResult.success();
    }


    @RequestMapping({"/sendWdFail"})
    public RestResult sendWdFail() {
        log.info("发送网贷平台失败数据开始：" + LocalDateTime.now().toString());
        List<Integer> appNos = this.sendService.findFail();

        if (appNos.isEmpty()) {
            log.info("没有数据，发送网贷平台失败数据结束：" + LocalDateTime.now().toString());
            return RestResult.success();
        }
        int limit = 2000;
        int start = 0;
        int end = limit;
        int last = appNos.size();
        while (start < last) {
            if (end > last) {
                end = last;
            }
            List<Integer> subAppNos = appNos.subList(start, end);
            start += limit;
            end += limit;
            this.sendService.sendWd(subAppNos, false);
        }
        log.info("发送网贷平台失败数据结束：" + LocalDateTime.now().toString());
        return RestResult.success();
    }
    @RequestMapping({"/ping"})
    public String ping() {
        return "pong";
    }
}