package com.jikewang.send.service;

import java.util.List;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.service
 * @ClassName: SendService
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 14:07
 * @Version: 1.0
 */
public interface SendService {
    void sendKt(String paramString, List<Integer> paramList, boolean paramBoolean);

    void sendKtTmp(String paramString, List<Integer> paramList, boolean paramBoolean);

    List<Integer> findLatest(String paramString);

    List<Integer> findLoanLatest(String paramString);

    List<Integer> findMiss(String paramString);

    void batchInsert(String paramString, List<Integer> paramList);

    void batchUpdate(String paramString, List<Integer> paramList);

    List<Integer> findWdAll();

    void sendWd(List<Integer> paramList, boolean paramBoolean);

    List<Integer> findFail();
}

