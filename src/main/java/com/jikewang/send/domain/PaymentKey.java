package com.jikewang.send.domain;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: PaymentKey
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:52
 * @Version: 1.0
 */
public class PaymentKey {
    private Integer acctNo;
    private Integer planId;

    public Integer getAcctNo() { return this.acctNo; }

    public void setAcctNo(Integer acctNo) { this.acctNo = acctNo; }

    public Integer getPlanId() { return this.planId; }

    public void setPlanId(Integer planId) { this.planId = planId; }
}
