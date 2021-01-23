package com.jikewang.send.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: LoanFill
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:49
 * @Version: 1.0
 */
public class LoanFill {
    private Integer acctNo;
    private String idNo;
    private Integer contNo;
    private String serviceCode;
    private String signSalesDepId;
    private String loanType;
    private String loanState;
    private BigDecimal rate;
    private Integer terms;
    private BigDecimal pactMoney;
    private BigDecimal grantMoney;
    private Date grantTime;
    private String purpose;
    private String collectFlag;
    private String signDate;
    private String retuKind;
    private String finishStatus;
    private BigDecimal remainPrincipal;
    private BigDecimal remainInterest;
    private BigDecimal overDueAmt;
    private BigDecimal overDuePrincipal;
    private BigDecimal overDueInterest;
    private BigDecimal overDuePenalty;
    private BigDecimal overDueLiqui;
    private Long overDueDays;
    private String overDueDate;
    private String storeProvince;
    private String storeCity;
    private String storeCounty;
    private String mark;
    private String isTeleSale;
    private BigDecimal remainPactMoney;
    private Integer repaidTerms;
    private Integer remainTerms;
    private String isOverdue;
    private String paySubject;
    private BigDecimal mgmtFee;
    private BigDecimal overdueMgmtFee;
    private BigDecimal otherFee;
    private Integer loanTimes;
    private String loanPurpose;
    private Integer partnerUserId;
    private String rankLable;
    private Long mob;
    private String loanLabel;
    private BigDecimal t0EarlyServiceFee;
    private BigDecimal overDueT0EarlyServiceFee;
    private BigDecimal t0EarlyServiceFeeOverdueInterest;
    private BigDecimal guaranteeDeposit;
    private BigDecimal guaranteeDepositServiceFee;
    private BigDecimal overDueGuaranteeDeposit;
    private BigDecimal overDueGuaranteeDepositServiceFee;
    private String divisionMonthlyOverDueLevel;
    private BigDecimal isExistT0;
    private Integer t0OverdueDays;
    private String t0DueDate;
    private BigDecimal t0OverdueAmount;
    private String billCollectionMode;
    private String hasT0Overdue;
    private String t0Funder;
    private Integer overDueTerms;
    private Date statementDate;
    private Date updateTime;
    private String pushSubject;
    private String lendChannel;
    private String fundModel;
    private String funder;
    private String creditor;
    private String firstAdvanceDate;
    private String lastAdvanceDate;

    public String getFunder() { return this.funder; }



    public void setFunder(String funder) { this.funder = funder; }



    public String getCreditor() { return this.creditor; }



    public void setCreditor(String creditor) { this.creditor = creditor; }



    public String getPushSubject() { return this.pushSubject; }



    public void setPushSubject(String pushSubject) { this.pushSubject = pushSubject; }



    public String getLendChannel() { return this.lendChannel; }



    public void setLendChannel(String lendChannel) { this.lendChannel = lendChannel; }



    public String getFundModel() { return this.fundModel; }



    public void setFundModel(String fundModel) { this.fundModel = fundModel; }



    public Integer getAcctNo() { return this.acctNo; }



    public void setAcctNo(Integer acctNo) { this.acctNo = acctNo; }



    public String getIdNo() { return this.idNo; }



    public void setIdNo(String idNo) { this.idNo = (idNo == null) ? null : idNo.trim(); }



    public Integer getContNo() { return this.contNo; }



    public void setContNo(Integer contNo) { this.contNo = contNo; }



    public String getServiceCode() { return this.serviceCode; }



    public void setServiceCode(String serviceCode) { this.serviceCode = (serviceCode == null) ? null : serviceCode.trim(); }



    public String getSignSalesDepId() { return this.signSalesDepId; }



    public void setSignSalesDepId(String signSalesDepId) { this.signSalesDepId = (signSalesDepId == null) ? null : signSalesDepId.trim(); }



    public String getLoanType() { return this.loanType; }



    public void setLoanType(String loanType) { this.loanType = (loanType == null) ? null : loanType.trim(); }



    public String getLoanState() { return this.loanState; }



    public void setLoanState(String loanState) { this.loanState = (loanState == null) ? null : loanState.trim(); }



    public BigDecimal getRate() { return this.rate; }



    public void setRate(BigDecimal rate) { this.rate = rate; }



    public Integer getTerms() { return this.terms; }



    public void setTerms(Integer terms) { this.terms = terms; }



    public BigDecimal getPactMoney() { return this.pactMoney; }



    public void setPactMoney(BigDecimal pactMoney) { this.pactMoney = pactMoney; }



    public BigDecimal getGrantMoney() { return this.grantMoney; }



    public void setGrantMoney(BigDecimal grantMoney) { this.grantMoney = grantMoney; }



    public Date getGrantTime() { return this.grantTime; }



    public void setGrantTime(Date grantTime) { this.grantTime = grantTime; }



    public String getPurpose() { return this.purpose; }



    public void setPurpose(String purpose) { this.purpose = (purpose == null) ? null : purpose.trim(); }



    public String getCollectFlag() { return this.collectFlag; }



    public void setCollectFlag(String collectFlag) { this.collectFlag = (collectFlag == null) ? null : collectFlag.trim(); }



    public String getSignDate() { return this.signDate; }



    public void setSignDate(String signDate) { this.signDate = (signDate == null) ? null : signDate.trim(); }



    public String getRetuKind() { return this.retuKind; }



    public void setRetuKind(String retuKind) { this.retuKind = (retuKind == null) ? null : retuKind.trim(); }



    public String getFinishStatus() { return this.finishStatus; }



    public void setFinishStatus(String finishStatus) { this.finishStatus = (finishStatus == null) ? null : finishStatus.trim(); }



    public BigDecimal getRemainPrincipal() { return this.remainPrincipal; }



    public void setRemainPrincipal(BigDecimal remainPrincipal) { this.remainPrincipal = remainPrincipal; }



    public BigDecimal getRemainInterest() { return this.remainInterest; }



    public void setRemainInterest(BigDecimal remainInterest) { this.remainInterest = remainInterest; }



    public BigDecimal getOverDueAmt() { return this.overDueAmt; }



    public void setOverDueAmt(BigDecimal overDueAmt) { this.overDueAmt = overDueAmt; }



    public BigDecimal getOverDuePrincipal() { return this.overDuePrincipal; }



    public void setOverDuePrincipal(BigDecimal overDuePrincipal) { this.overDuePrincipal = overDuePrincipal; }



    public BigDecimal getOverDueInterest() { return this.overDueInterest; }



    public void setOverDueInterest(BigDecimal overDueInterest) { this.overDueInterest = overDueInterest; }



    public BigDecimal getOverDuePenalty() { return this.overDuePenalty; }



    public void setOverDuePenalty(BigDecimal overDuePenalty) { this.overDuePenalty = overDuePenalty; }



    public BigDecimal getOverDueLiqui() { return this.overDueLiqui; }



    public void setOverDueLiqui(BigDecimal overDueLiqui) { this.overDueLiqui = overDueLiqui; }



    public Long getOverDueDays() { return this.overDueDays; }



    public void setOverDueDays(Long overDueDays) { this.overDueDays = overDueDays; }



    public String getOverDueDate() { return this.overDueDate; }



    public void setOverDueDate(String overDueDate) { this.overDueDate = (overDueDate == null) ? null : overDueDate.trim(); }



    public String getStoreProvince() { return this.storeProvince; }



    public void setStoreProvince(String storeProvince) { this.storeProvince = (storeProvince == null) ? null : storeProvince.trim(); }



    public String getStoreCity() { return this.storeCity; }



    public void setStoreCity(String storeCity) { this.storeCity = (storeCity == null) ? null : storeCity.trim(); }



    public String getStoreCounty() { return this.storeCounty; }



    public void setStoreCounty(String storeCounty) { this.storeCounty = (storeCounty == null) ? null : storeCounty.trim(); }



    public String getFirstAdvanceDate() { return this.firstAdvanceDate; }



    public void setFirstAdvanceDate(String firstAdvanceDate) { this.firstAdvanceDate = firstAdvanceDate; }



    public String getLastAdvanceDate() { return this.lastAdvanceDate; }



    public void setLastAdvanceDate(String lastAdvanceDate) { this.lastAdvanceDate = lastAdvanceDate; }



    public String getMark() { return this.mark; }



    public void setMark(String mark) { this.mark = (mark == null) ? null : mark.trim(); }



    public String getIsTeleSale() { return this.isTeleSale; }



    public void setIsTeleSale(String isTeleSale) { this.isTeleSale = (isTeleSale == null) ? null : isTeleSale.trim(); }



    public BigDecimal getRemainPactMoney() { return this.remainPactMoney; }



    public void setRemainPactMoney(BigDecimal remainPactMoney) { this.remainPactMoney = remainPactMoney; }



    public Integer getRepaidTerms() { return this.repaidTerms; }



    public void setRepaidTerms(Integer repaidTerms) { this.repaidTerms = repaidTerms; }



    public Integer getRemainTerms() { return this.remainTerms; }



    public void setRemainTerms(Integer remainTerms) { this.remainTerms = remainTerms; }



    public String getIsOverdue() { return this.isOverdue; }



    public void setIsOverdue(String isOverdue) { this.isOverdue = (isOverdue == null) ? null : isOverdue.trim(); }



    public String getPaySubject() { return this.paySubject; }



    public void setPaySubject(String paySubject) { this.paySubject = (paySubject == null) ? null : paySubject.trim(); }



    public BigDecimal getMgmtFee() { return this.mgmtFee; }



    public void setMgmtFee(BigDecimal mgmtFee) { this.mgmtFee = mgmtFee; }



    public BigDecimal getOverdueMgmtFee() { return this.overdueMgmtFee; }



    public void setOverdueMgmtFee(BigDecimal overdueMgmtFee) { this.overdueMgmtFee = overdueMgmtFee; }



    public BigDecimal getOtherFee() { return this.otherFee; }



    public void setOtherFee(BigDecimal otherFee) { this.otherFee = otherFee; }



    public Integer getLoanTimes() { return this.loanTimes; }



    public void setLoanTimes(Integer loanTimes) { this.loanTimes = loanTimes; }



    public String getLoanPurpose() { return this.loanPurpose; }



    public void setLoanPurpose(String loanPurpose) { this.loanPurpose = (loanPurpose == null) ? null : loanPurpose.trim(); }



    public Integer getPartnerUserId() { return this.partnerUserId; }



    public void setPartnerUserId(Integer partnerUserId) { this.partnerUserId = partnerUserId; }



    public String getRankLable() { return this.rankLable; }



    public void setRankLable(String rankLable) { this.rankLable = (rankLable == null) ? null : rankLable.trim(); }



    public Long getMob() { return this.mob; }



    public void setMob(Long mob) { this.mob = mob; }



    public String getLoanLabel() { return this.loanLabel; }



    public void setLoanLabel(String loanLabel) { this.loanLabel = (loanLabel == null) ? null : loanLabel.trim(); }



    public BigDecimal getT0EarlyServiceFee() { return this.t0EarlyServiceFee; }



    public void setT0EarlyServiceFee(BigDecimal t0EarlyServiceFee) { this.t0EarlyServiceFee = t0EarlyServiceFee; }



    public BigDecimal getOverDueT0EarlyServiceFee() { return this.overDueT0EarlyServiceFee; }



    public void setOverDueT0EarlyServiceFee(BigDecimal overDueT0EarlyServiceFee) { this.overDueT0EarlyServiceFee = overDueT0EarlyServiceFee; }



    public BigDecimal getT0EarlyServiceFeeOverdueInterest() { return this.t0EarlyServiceFeeOverdueInterest; }



    public void setT0EarlyServiceFeeOverdueInterest(BigDecimal t0EarlyServiceFeeOverdueInterest) { this.t0EarlyServiceFeeOverdueInterest = t0EarlyServiceFeeOverdueInterest; }



    public BigDecimal getGuaranteeDeposit() { return this.guaranteeDeposit; }



    public void setGuaranteeDeposit(BigDecimal guaranteeDeposit) { this.guaranteeDeposit = guaranteeDeposit; }



    public BigDecimal getGuaranteeDepositServiceFee() { return this.guaranteeDepositServiceFee; }



    public void setGuaranteeDepositServiceFee(BigDecimal guaranteeDepositServiceFee) { this.guaranteeDepositServiceFee = guaranteeDepositServiceFee; }



    public BigDecimal getOverDueGuaranteeDeposit() { return this.overDueGuaranteeDeposit; }



    public void setOverDueGuaranteeDeposit(BigDecimal overDueGuaranteeDeposit) { this.overDueGuaranteeDeposit = overDueGuaranteeDeposit; }



    public BigDecimal getOverDueGuaranteeDepositServiceFee() { return this.overDueGuaranteeDepositServiceFee; }



    public void setOverDueGuaranteeDepositServiceFee(BigDecimal overDueGuaranteeDepositServiceFee) { this.overDueGuaranteeDepositServiceFee = overDueGuaranteeDepositServiceFee; }



    public String getDivisionMonthlyOverDueLevel() { return this.divisionMonthlyOverDueLevel; }



    public void setDivisionMonthlyOverDueLevel(String divisionMonthlyOverDueLevel) { this.divisionMonthlyOverDueLevel = (divisionMonthlyOverDueLevel == null) ? null : divisionMonthlyOverDueLevel.trim(); }



    public BigDecimal getIsExistT0() { return this.isExistT0; }



    public void setIsExistT0(BigDecimal isExistT0) { this.isExistT0 = isExistT0; }



    public Integer getT0OverdueDays() { return this.t0OverdueDays; }



    public void setT0OverdueDays(Integer t0OverdueDays) { this.t0OverdueDays = t0OverdueDays; }



    public String getT0DueDate() { return this.t0DueDate; }



    public void setT0DueDate(String t0DueDate) { this.t0DueDate = (t0DueDate == null) ? null : t0DueDate.trim(); }



    public BigDecimal getT0OverdueAmount() { return this.t0OverdueAmount; }



    public void setT0OverdueAmount(BigDecimal t0OverdueAmount) { this.t0OverdueAmount = t0OverdueAmount; }



    public String getBillCollectionMode() { return this.billCollectionMode; }



    public void setBillCollectionMode(String billCollectionMode) { this.billCollectionMode = (billCollectionMode == null) ? null : billCollectionMode.trim(); }



    public String getHasT0Overdue() { return this.hasT0Overdue; }



    public void setHasT0Overdue(String hasT0Overdue) { this.hasT0Overdue = (hasT0Overdue == null) ? null : hasT0Overdue.trim(); }



    public String getT0Funder() { return this.t0Funder; }



    public void setT0Funder(String t0Funder) { this.t0Funder = (t0Funder == null) ? null : t0Funder.trim(); }



    public Integer getOverDueTerms() { return this.overDueTerms; }



    public void setOverDueTerms(Integer overDueTerms) { this.overDueTerms = overDueTerms; }



    public Date getStatementDate() { return this.statementDate; }



    public void setStatementDate(Date statementDate) { this.statementDate = statementDate; }



    public Date getUpdateTime() { return this.updateTime; }



    public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }
}