package com.jikewang.send.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: Repaymentplan
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:52
 * @Version: 1.0
 */

public class Repaymentplan extends RepaymentplanKey {
    private BigDecimal pmtAmt;
    private BigDecimal principal;
    private BigDecimal interest;
    private BigDecimal remainTotalAmt;
    private BigDecimal penalty;
    private BigDecimal liqui;
    private BigDecimal termNeedAmt;
    private BigDecimal compenGold;
    private BigDecimal compenRecei;
    private BigDecimal amtAfterCompen;
    private Date actualRepayDate;
    private String isOverdue;
    private String isPayPrincipal;
    private String dealDetail;
    private String reliefInfo;
    private Date shouldTime;
    private Integer terms;
    private BigDecimal repaidCurrentAmt;
    private BigDecimal remainCurrentAmt;
    private BigDecimal earlyCurrentAmt;
    private BigDecimal shouldPenalty;
    private BigDecimal shouldLiqui;
    private BigDecimal shouldLatefee;
    private BigDecimal alsoPenalty;
    private BigDecimal alsoLiqui;
    private BigDecimal alsoLatefee;
    private BigDecimal breaksPenalty;
    private BigDecimal breaksLiqui;
    private BigDecimal breaksLatefee;
    private BigDecimal remainPenalty;
    private BigDecimal remainLiqui;
    private BigDecimal remainLatefee;
    private Integer currentOverDueDays;
    private String tremStatus;
    private BigDecimal tremServicesCharge;
    private Date payoffTime;
    private String repayType;
    private BigDecimal mgmtFee;
    private BigDecimal leftPrincipal;
    private BigDecimal leftInterest;
    private BigDecimal repaidPrincipal;
    private BigDecimal repaidInterest;
    private BigDecimal repaidMgmtFee;
    private BigDecimal t0EarlyServiceFee;
    private BigDecimal t0EarlyServiceFeeOverdueInterest;
    private BigDecimal leftT0EarlyServiceFee;
    private BigDecimal leftT0EarlyServiceFeeOverdueInterest;
    private BigDecimal breaksT0EarlyServiceFee;
    private BigDecimal breaksT0EarlyServiceFeeOverdueInterest;
    private BigDecimal guaranteeDeposit;
    private BigDecimal guaranteeDepositServiceFee;
    private BigDecimal leftGuaranteeDeposit;
    private BigDecimal leftGuaranteeDepositServiceFee;
    private BigDecimal breaksGuaranteeDeposit;
    private BigDecimal breaksGuaranteeDepositServiceFee;
    private BigDecimal funderOverdueInterest;
    private BigDecimal leftFunderOverdueInterest;
    private BigDecimal breaksFunderOverdueInterest;
    private Date updateTime;

    public BigDecimal getPmtAmt() { return this.pmtAmt; }



    public void setPmtAmt(BigDecimal pmtAmt) { this.pmtAmt = pmtAmt; }



    public BigDecimal getPrincipal() { return this.principal; }



    public void setPrincipal(BigDecimal principal) { this.principal = principal; }



    public BigDecimal getInterest() { return this.interest; }



    public void setInterest(BigDecimal interest) { this.interest = interest; }



    public BigDecimal getRemainTotalAmt() { return this.remainTotalAmt; }



    public void setRemainTotalAmt(BigDecimal remainTotalAmt) { this.remainTotalAmt = remainTotalAmt; }



    public BigDecimal getPenalty() { return this.penalty; }



    public void setPenalty(BigDecimal penalty) { this.penalty = penalty; }



    public BigDecimal getLiqui() { return this.liqui; }



    public void setLiqui(BigDecimal liqui) { this.liqui = liqui; }



    public BigDecimal getTermNeedAmt() { return this.termNeedAmt; }



    public void setTermNeedAmt(BigDecimal termNeedAmt) { this.termNeedAmt = termNeedAmt; }



    public BigDecimal getCompenGold() { return this.compenGold; }



    public void setCompenGold(BigDecimal compenGold) { this.compenGold = compenGold; }



    public BigDecimal getCompenRecei() { return this.compenRecei; }



    public void setCompenRecei(BigDecimal compenRecei) { this.compenRecei = compenRecei; }



    public BigDecimal getAmtAfterCompen() { return this.amtAfterCompen; }



    public void setAmtAfterCompen(BigDecimal amtAfterCompen) { this.amtAfterCompen = amtAfterCompen; }



    public Date getActualRepayDate() { return this.actualRepayDate; }



    public void setActualRepayDate(Date actualRepayDate) { this.actualRepayDate = actualRepayDate; }



    public String getIsOverdue() { return this.isOverdue; }



    public void setIsOverdue(String isOverdue) { this.isOverdue = (isOverdue == null) ? null : isOverdue.trim(); }



    public String getIsPayPrincipal() { return this.isPayPrincipal; }



    public void setIsPayPrincipal(String isPayPrincipal) { this.isPayPrincipal = (isPayPrincipal == null) ? null : isPayPrincipal.trim(); }



    public String getDealDetail() { return this.dealDetail; }



    public void setDealDetail(String dealDetail) { this.dealDetail = (dealDetail == null) ? null : dealDetail.trim(); }



    public String getReliefInfo() { return this.reliefInfo; }



    public void setReliefInfo(String reliefInfo) { this.reliefInfo = (reliefInfo == null) ? null : reliefInfo.trim(); }



    public Date getShouldTime() { return this.shouldTime; }



    public void setShouldTime(Date shouldTime) { this.shouldTime = shouldTime; }



    public Integer getTerms() { return this.terms; }



    public void setTerms(Integer terms) { this.terms = terms; }



    public BigDecimal getRepaidCurrentAmt() { return this.repaidCurrentAmt; }



    public void setRepaidCurrentAmt(BigDecimal repaidCurrentAmt) { this.repaidCurrentAmt = repaidCurrentAmt; }



    public BigDecimal getRemainCurrentAmt() { return this.remainCurrentAmt; }



    public void setRemainCurrentAmt(BigDecimal remainCurrentAmt) { this.remainCurrentAmt = remainCurrentAmt; }



    public BigDecimal getEarlyCurrentAmt() { return this.earlyCurrentAmt; }



    public void setEarlyCurrentAmt(BigDecimal earlyCurrentAmt) { this.earlyCurrentAmt = earlyCurrentAmt; }



    public BigDecimal getShouldPenalty() { return this.shouldPenalty; }



    public void setShouldPenalty(BigDecimal shouldPenalty) { this.shouldPenalty = shouldPenalty; }



    public BigDecimal getShouldLiqui() { return this.shouldLiqui; }



    public void setShouldLiqui(BigDecimal shouldLiqui) { this.shouldLiqui = shouldLiqui; }



    public BigDecimal getShouldLatefee() { return this.shouldLatefee; }



    public void setShouldLatefee(BigDecimal shouldLatefee) { this.shouldLatefee = shouldLatefee; }



    public BigDecimal getAlsoPenalty() { return this.alsoPenalty; }



    public void setAlsoPenalty(BigDecimal alsoPenalty) { this.alsoPenalty = alsoPenalty; }



    public BigDecimal getAlsoLiqui() { return this.alsoLiqui; }



    public void setAlsoLiqui(BigDecimal alsoLiqui) { this.alsoLiqui = alsoLiqui; }



    public BigDecimal getAlsoLatefee() { return this.alsoLatefee; }



    public void setAlsoLatefee(BigDecimal alsoLatefee) { this.alsoLatefee = alsoLatefee; }



    public BigDecimal getBreaksPenalty() { return this.breaksPenalty; }



    public void setBreaksPenalty(BigDecimal breaksPenalty) { this.breaksPenalty = breaksPenalty; }



    public BigDecimal getBreaksLiqui() { return this.breaksLiqui; }



    public void setBreaksLiqui(BigDecimal breaksLiqui) { this.breaksLiqui = breaksLiqui; }



    public BigDecimal getBreaksLatefee() { return this.breaksLatefee; }



    public void setBreaksLatefee(BigDecimal breaksLatefee) { this.breaksLatefee = breaksLatefee; }



    public BigDecimal getRemainPenalty() { return this.remainPenalty; }



    public void setRemainPenalty(BigDecimal remainPenalty) { this.remainPenalty = remainPenalty; }



    public BigDecimal getRemainLiqui() { return this.remainLiqui; }



    public void setRemainLiqui(BigDecimal remainLiqui) { this.remainLiqui = remainLiqui; }



    public BigDecimal getRemainLatefee() { return this.remainLatefee; }



    public void setRemainLatefee(BigDecimal remainLatefee) { this.remainLatefee = remainLatefee; }



    public Integer getCurrentOverDueDays() { return this.currentOverDueDays; }



    public void setCurrentOverDueDays(Integer currentOverDueDays) { this.currentOverDueDays = currentOverDueDays; }



    public String getTremStatus() { return this.tremStatus; }



    public void setTremStatus(String tremStatus) { this.tremStatus = (tremStatus == null) ? null : tremStatus.trim(); }



    public BigDecimal getTremServicesCharge() { return this.tremServicesCharge; }



    public void setTremServicesCharge(BigDecimal tremServicesCharge) { this.tremServicesCharge = tremServicesCharge; }



    public Date getPayoffTime() { return this.payoffTime; }



    public void setPayoffTime(Date payoffTime) { this.payoffTime = payoffTime; }



    public String getRepayType() { return this.repayType; }



    public void setRepayType(String repayType) { this.repayType = (repayType == null) ? null : repayType.trim(); }



    public BigDecimal getMgmtFee() { return this.mgmtFee; }



    public void setMgmtFee(BigDecimal mgmtFee) { this.mgmtFee = mgmtFee; }



    public BigDecimal getLeftPrincipal() { return this.leftPrincipal; }



    public void setLeftPrincipal(BigDecimal leftPrincipal) { this.leftPrincipal = leftPrincipal; }



    public BigDecimal getLeftInterest() { return this.leftInterest; }



    public void setLeftInterest(BigDecimal leftInterest) { this.leftInterest = leftInterest; }



    public BigDecimal getRepaidPrincipal() { return this.repaidPrincipal; }



    public void setRepaidPrincipal(BigDecimal repaidPrincipal) { this.repaidPrincipal = repaidPrincipal; }



    public BigDecimal getRepaidInterest() { return this.repaidInterest; }



    public void setRepaidInterest(BigDecimal repaidInterest) { this.repaidInterest = repaidInterest; }



    public BigDecimal getRepaidMgmtFee() { return this.repaidMgmtFee; }



    public void setRepaidMgmtFee(BigDecimal repaidMgmtFee) { this.repaidMgmtFee = repaidMgmtFee; }



    public BigDecimal getT0EarlyServiceFee() { return this.t0EarlyServiceFee; }



    public void setT0EarlyServiceFee(BigDecimal t0EarlyServiceFee) { this.t0EarlyServiceFee = t0EarlyServiceFee; }



    public BigDecimal getT0EarlyServiceFeeOverdueInterest() { return this.t0EarlyServiceFeeOverdueInterest; }



    public void setT0EarlyServiceFeeOverdueInterest(BigDecimal t0EarlyServiceFeeOverdueInterest) { this.t0EarlyServiceFeeOverdueInterest = t0EarlyServiceFeeOverdueInterest; }



    public BigDecimal getLeftT0EarlyServiceFee() { return this.leftT0EarlyServiceFee; }



    public void setLeftT0EarlyServiceFee(BigDecimal leftT0EarlyServiceFee) { this.leftT0EarlyServiceFee = leftT0EarlyServiceFee; }



    public BigDecimal getLeftT0EarlyServiceFeeOverdueInterest() { return this.leftT0EarlyServiceFeeOverdueInterest; }



    public void setLeftT0EarlyServiceFeeOverdueInterest(BigDecimal leftT0EarlyServiceFeeOverdueInterest) { this.leftT0EarlyServiceFeeOverdueInterest = leftT0EarlyServiceFeeOverdueInterest; }



    public BigDecimal getBreaksT0EarlyServiceFee() { return this.breaksT0EarlyServiceFee; }



    public void setBreaksT0EarlyServiceFee(BigDecimal breaksT0EarlyServiceFee) { this.breaksT0EarlyServiceFee = breaksT0EarlyServiceFee; }



    public BigDecimal getBreaksT0EarlyServiceFeeOverdueInterest() { return this.breaksT0EarlyServiceFeeOverdueInterest; }



    public void setBreaksT0EarlyServiceFeeOverdueInterest(BigDecimal breaksT0EarlyServiceFeeOverdueInterest) { this.breaksT0EarlyServiceFeeOverdueInterest = breaksT0EarlyServiceFeeOverdueInterest; }



    public BigDecimal getGuaranteeDeposit() { return this.guaranteeDeposit; }



    public void setGuaranteeDeposit(BigDecimal guaranteeDeposit) { this.guaranteeDeposit = guaranteeDeposit; }



    public BigDecimal getGuaranteeDepositServiceFee() { return this.guaranteeDepositServiceFee; }



    public void setGuaranteeDepositServiceFee(BigDecimal guaranteeDepositServiceFee) { this.guaranteeDepositServiceFee = guaranteeDepositServiceFee; }



    public BigDecimal getLeftGuaranteeDeposit() { return this.leftGuaranteeDeposit; }



    public void setLeftGuaranteeDeposit(BigDecimal leftGuaranteeDeposit) { this.leftGuaranteeDeposit = leftGuaranteeDeposit; }



    public BigDecimal getLeftGuaranteeDepositServiceFee() { return this.leftGuaranteeDepositServiceFee; }



    public void setLeftGuaranteeDepositServiceFee(BigDecimal leftGuaranteeDepositServiceFee) { this.leftGuaranteeDepositServiceFee = leftGuaranteeDepositServiceFee; }



    public BigDecimal getBreaksGuaranteeDeposit() { return this.breaksGuaranteeDeposit; }



    public void setBreaksGuaranteeDeposit(BigDecimal breaksGuaranteeDeposit) { this.breaksGuaranteeDeposit = breaksGuaranteeDeposit; }



    public BigDecimal getBreaksGuaranteeDepositServiceFee() { return this.breaksGuaranteeDepositServiceFee; }



    public void setBreaksGuaranteeDepositServiceFee(BigDecimal breaksGuaranteeDepositServiceFee) { this.breaksGuaranteeDepositServiceFee = breaksGuaranteeDepositServiceFee; }



    public BigDecimal getFunderOverdueInterest() { return this.funderOverdueInterest; }



    public void setFunderOverdueInterest(BigDecimal funderOverdueInterest) { this.funderOverdueInterest = funderOverdueInterest; }



    public BigDecimal getLeftFunderOverdueInterest() { return this.leftFunderOverdueInterest; }



    public void setLeftFunderOverdueInterest(BigDecimal leftFunderOverdueInterest) { this.leftFunderOverdueInterest = leftFunderOverdueInterest; }



    public BigDecimal getBreaksFunderOverdueInterest() { return this.breaksFunderOverdueInterest; }



    public void setBreaksFunderOverdueInterest(BigDecimal breaksFunderOverdueInterest) { this.breaksFunderOverdueInterest = breaksFunderOverdueInterest; }



    public Date getUpdateTime() { return this.updateTime; }



    public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }
}

