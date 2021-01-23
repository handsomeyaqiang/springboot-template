package com.jikewang.send.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: Payment
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:51
 * @Version: 1.0
 */
public class Payment extends PaymentKey {
    private Integer id;
    private String idNo;
    private Date repayTime;
    private String retuKind;
    private BigDecimal pmtAmt;
    private Integer repayTerm;
    private BigDecimal repayPrincipal;
    private BigDecimal repayInterest;
    private BigDecimal penalty;
    private BigDecimal liqui;
    private BigDecimal dealDetail;
    private BigDecimal repayFee;
    private BigDecimal repayOther;
    private BigDecimal repayManage;
    private Integer overDueDays;
    private String functionCode;
    private BigDecimal t0EarlyServiceFee;
    private BigDecimal t0EarlyServiceFeeOverdueInterest;
    private BigDecimal guaranteeDeposit;
    private BigDecimal guaranteeDepositServiceFee;
    private BigDecimal funderOverdueInterest;
    private Date updateTime;

    public Integer getId() { return this.id; }



    public void setId(Integer id) { this.id = id; }



    public String getIdNo() { return this.idNo; }



    public void setIdNo(String idNo) { this.idNo = (idNo == null) ? null : idNo.trim(); }



    public Date getRepayTime() { return this.repayTime; }



    public void setRepayTime(Date repayTime) { this.repayTime = repayTime; }



    public String getRetuKind() { return this.retuKind; }



    public void setRetuKind(String retuKind) { this.retuKind = (retuKind == null) ? null : retuKind.trim(); }



    public BigDecimal getPmtAmt() { return this.pmtAmt; }



    public void setPmtAmt(BigDecimal pmtAmt) { this.pmtAmt = pmtAmt; }



    public Integer getRepayTerm() { return this.repayTerm; }



    public void setRepayTerm(Integer repayTerm) { this.repayTerm = repayTerm; }



    public BigDecimal getRepayPrincipal() { return this.repayPrincipal; }



    public void setRepayPrincipal(BigDecimal repayPrincipal) { this.repayPrincipal = repayPrincipal; }



    public BigDecimal getRepayInterest() { return this.repayInterest; }



    public void setRepayInterest(BigDecimal repayInterest) { this.repayInterest = repayInterest; }



    public BigDecimal getPenalty() { return this.penalty; }



    public void setPenalty(BigDecimal penalty) { this.penalty = penalty; }



    public BigDecimal getLiqui() { return this.liqui; }



    public void setLiqui(BigDecimal liqui) { this.liqui = liqui; }



    public BigDecimal getDealDetail() { return this.dealDetail; }



    public void setDealDetail(BigDecimal dealDetail) { this.dealDetail = dealDetail; }



    public BigDecimal getRepayFee() { return this.repayFee; }



    public void setRepayFee(BigDecimal repayFee) { this.repayFee = repayFee; }



    public BigDecimal getRepayOther() { return this.repayOther; }



    public void setRepayOther(BigDecimal repayOther) { this.repayOther = repayOther; }



    public BigDecimal getRepayManage() { return this.repayManage; }



    public void setRepayManage(BigDecimal repayManage) { this.repayManage = repayManage; }



    public Integer getOverDueDays() { return this.overDueDays; }



    public void setOverDueDays(Integer overDueDays) { this.overDueDays = overDueDays; }



    public String getFunctionCode() { return this.functionCode; }



    public void setFunctionCode(String functionCode) { this.functionCode = (functionCode == null) ? null : functionCode.trim(); }



    public BigDecimal getT0EarlyServiceFee() { return this.t0EarlyServiceFee; }



    public void setT0EarlyServiceFee(BigDecimal t0EarlyServiceFee) { this.t0EarlyServiceFee = t0EarlyServiceFee; }



    public BigDecimal getT0EarlyServiceFeeOverdueInterest() { return this.t0EarlyServiceFeeOverdueInterest; }



    public void setT0EarlyServiceFeeOverdueInterest(BigDecimal t0EarlyServiceFeeOverdueInterest) { this.t0EarlyServiceFeeOverdueInterest = t0EarlyServiceFeeOverdueInterest; }



    public BigDecimal getGuaranteeDeposit() { return this.guaranteeDeposit; }



    public void setGuaranteeDeposit(BigDecimal guaranteeDeposit) { this.guaranteeDeposit = guaranteeDeposit; }



    public BigDecimal getGuaranteeDepositServiceFee() { return this.guaranteeDepositServiceFee; }



    public void setGuaranteeDepositServiceFee(BigDecimal guaranteeDepositServiceFee) { this.guaranteeDepositServiceFee = guaranteeDepositServiceFee; }



    public BigDecimal getFunderOverdueInterest() { return this.funderOverdueInterest; }



    public void setFunderOverdueInterest(BigDecimal funderOverdueInterest) { this.funderOverdueInterest = funderOverdueInterest; }



    public Date getUpdateTime() { return this.updateTime; }



    public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }
}
