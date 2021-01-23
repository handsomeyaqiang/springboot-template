package com.jikewang.send.domain;

import java.math.BigDecimal;
import java.util.Date;

public class NetloanUpdate {
    private Integer appNo;

    private String name;

    private String idcard;

    private String phone;

    private String bankNo;

    private String address;

    private String occupation;

    private String company;

    private Date appDate;

    private String mortgage;

    private String productName;

    private Integer installment;

    private Date paymentDate;

    private BigDecimal paymentAmount;

    private BigDecimal creditLimit;

    private BigDecimal mothRepayAmount;

    private BigDecimal principalToBeRepay;

    private BigDecimal interestToBeRepay;

    private Integer monthlyRepayDay;

    private Date ﬁrstRepayDate;

    private Integer overdueDays;

    private Integer repaidTimes;

    private Integer leftTimes;

    private BigDecimal amountDue;

    private BigDecimal repaidAmount;

    private BigDecimal penaltyInterest;

    private BigDecimal liquidatedDamages;

    private BigDecimal comprehensiveRate;

    private String newCustomer;

    private String faceSigned;

    private String idCheck;

    private String phoneCheck;

    private String phoneArea;

    private String blacklistCheck;

    private String antifraudCheck;

    private String manualApproval;

    private String creditScoreCheck;

    public Integer getAppNo() {
        return appNo;
    }

    public void setAppNo(Integer appNo) {
        this.appNo = appNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }

    public String getMortgage() {
        return mortgage;
    }

    public void setMortgage(String mortgage) {
        this.mortgage = mortgage == null ? null : mortgage.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getInstallment() {
        return installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getMothRepayAmount() {
        return mothRepayAmount;
    }

    public void setMothRepayAmount(BigDecimal mothRepayAmount) {
        this.mothRepayAmount = mothRepayAmount;
    }

    public BigDecimal getPrincipalToBeRepay() {
        return principalToBeRepay;
    }

    public void setPrincipalToBeRepay(BigDecimal principalToBeRepay) {
        this.principalToBeRepay = principalToBeRepay;
    }

    public BigDecimal getInterestToBeRepay() {
        return interestToBeRepay;
    }

    public void setInterestToBeRepay(BigDecimal interestToBeRepay) {
        this.interestToBeRepay = interestToBeRepay;
    }

    public Integer getMonthlyRepayDay() {
        return monthlyRepayDay;
    }

    public void setMonthlyRepayDay(Integer monthlyRepayDay) {
        this.monthlyRepayDay = monthlyRepayDay;
    }

    public Date getﬁrstRepayDate() {
        return ﬁrstRepayDate;
    }

    public void setﬁrstRepayDate(Date ﬁrstRepayDate) {
        this.ﬁrstRepayDate = ﬁrstRepayDate;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Integer getRepaidTimes() {
        return repaidTimes;
    }

    public void setRepaidTimes(Integer repaidTimes) {
        this.repaidTimes = repaidTimes;
    }

    public Integer getLeftTimes() {
        return leftTimes;
    }

    public void setLeftTimes(Integer leftTimes) {
        this.leftTimes = leftTimes;
    }

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    public BigDecimal getRepaidAmount() {
        return repaidAmount;
    }

    public void setRepaidAmount(BigDecimal repaidAmount) {
        this.repaidAmount = repaidAmount;
    }

    public BigDecimal getPenaltyInterest() {
        return penaltyInterest;
    }

    public void setPenaltyInterest(BigDecimal penaltyInterest) {
        this.penaltyInterest = penaltyInterest;
    }

    public BigDecimal getLiquidatedDamages() {
        return liquidatedDamages;
    }

    public void setLiquidatedDamages(BigDecimal liquidatedDamages) {
        this.liquidatedDamages = liquidatedDamages;
    }

    public BigDecimal getComprehensiveRate() {
        return comprehensiveRate;
    }

    public void setComprehensiveRate(BigDecimal comprehensiveRate) {
        this.comprehensiveRate = comprehensiveRate;
    }

    public String getNewCustomer() {
        return newCustomer;
    }

    public void setNewCustomer(String newCustomer) {
        this.newCustomer = newCustomer == null ? null : newCustomer.trim();
    }

    public String getFaceSigned() {
        return faceSigned;
    }

    public void setFaceSigned(String faceSigned) {
        this.faceSigned = faceSigned == null ? null : faceSigned.trim();
    }

    public String getIdCheck() {
        return idCheck;
    }

    public void setIdCheck(String idCheck) {
        this.idCheck = idCheck == null ? null : idCheck.trim();
    }

    public String getPhoneCheck() {
        return phoneCheck;
    }

    public void setPhoneCheck(String phoneCheck) {
        this.phoneCheck = phoneCheck == null ? null : phoneCheck.trim();
    }

    public String getPhoneArea() {
        return phoneArea;
    }

    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea == null ? null : phoneArea.trim();
    }

    public String getBlacklistCheck() {
        return blacklistCheck;
    }

    public void setBlacklistCheck(String blacklistCheck) {
        this.blacklistCheck = blacklistCheck == null ? null : blacklistCheck.trim();
    }

    public String getAntifraudCheck() {
        return antifraudCheck;
    }

    public void setAntifraudCheck(String antifraudCheck) {
        this.antifraudCheck = antifraudCheck == null ? null : antifraudCheck.trim();
    }

    public String getManualApproval() {
        return manualApproval;
    }

    public void setManualApproval(String manualApproval) {
        this.manualApproval = manualApproval == null ? null : manualApproval.trim();
    }

    public String getCreditScoreCheck() {
        return creditScoreCheck;
    }

    public void setCreditScoreCheck(String creditScoreCheck) {
        this.creditScoreCheck = creditScoreCheck == null ? null : creditScoreCheck.trim();
    }
}