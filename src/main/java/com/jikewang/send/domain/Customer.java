package com.jikewang.send.domain;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: Customer
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:30
 * @Version: 1.0
 */
@ToString
public class Customer implements Serializable {
    private Integer acctNo;
    private Integer id;
    private String custName;
    private String idType;
    private String idNo;
    private String gender;
    private Integer age;
    private Date birtdate;
    private String maritalStatus;
    private String education;
    private Integer hasChild;
    private Integer hasHouse;
    private String email;
    private String mobilePhone;
    private String regiseat;
    private String address;
    private String bankCardNo;
    private String bankName;
    private String customerType;
    private String caCompany;
    private String caType;
    private String caIndustryType;
    private String caDepartment;
    private String caWorkPhone;
    private String caDuty;
    private Date caEnterTime;
    private Long caIncome;
    private String agency;
    private String campus;
    private String viDriverLicense;
    private String viPlateNum;
    private String viVehicleType;
    private String viFrameNum;
    private String viEngineNum;
    private String viFirstOncard;
    private String viIsmort;
    private Date lastUpdateTime;
    private List<Contact> contacts;

    public List<Contact> getContacts() { return this.contacts; }

    public void setContacts(List<Contact> contacts) { this.contacts = contacts; }

    public Integer getAcctNo() { return this.acctNo; }

    public void setAcctNo(Integer acctNo) { this.acctNo = acctNo; }

    public Integer getId() { return this.id; }

    public void setId(Integer id) { this.id = id; }

    public String getCustName() { return this.custName; }

    public void setCustName(String custName) { this.custName = (custName == null) ? null : custName.trim(); }

    public String getIdType() { return this.idType; }

    public void setIdType(String idType) { this.idType = (idType == null) ? null : idType.trim(); }

    public String getIdNo() { return this.idNo; }

    public void setIdNo(String idNo) { this.idNo = (idNo == null) ? null : idNo.trim(); }

    public String getGender() { return this.gender; }

    public void setGender(String gender) { this.gender = (gender == null) ? null : gender.trim(); }

    public Integer getAge() { return this.age; }

    public void setAge(Integer age) { this.age = age; }

    public Date getBirtdate() { return this.birtdate; }

    public void setBirtdate(Date birtdate) { this.birtdate = birtdate; }

    public String getMaritalStatus() { return this.maritalStatus; }

    public void setMaritalStatus(String maritalStatus) { this.maritalStatus = (maritalStatus == null) ? null : maritalStatus.trim(); }

    public String getEducation() { return this.education; }

    public void setEducation(String education) { this.education = (education == null) ? null : education.trim(); }

    public Integer getHasChild() { return this.hasChild; }

    public void setHasChild(Integer hasChild) { this.hasChild = hasChild; }

    public Integer getHasHouse() { return this.hasHouse; }

    public void setHasHouse(Integer hasHouse) { this.hasHouse = hasHouse; }

    public String getEmail() { return this.email; }

    public void setEmail(String email) { this.email = (email == null) ? null : email.trim(); }

    public String getMobilePhone() { return this.mobilePhone; }

    public void setMobilePhone(String mobilePhone) { this.mobilePhone = (mobilePhone == null) ? null : mobilePhone.trim(); }

    public String getRegiseat() { return this.regiseat; }

    public void setRegiseat(String regiseat) { this.regiseat = (regiseat == null) ? null : regiseat.trim(); }

    public String getAddress() { return this.address; }

    public void setAddress(String address) { this.address = (address == null) ? null : address.trim(); }

    public String getBankCardNo() { return this.bankCardNo; }

    public void setBankCardNo(String bankCardNo) { this.bankCardNo = (bankCardNo == null) ? null : bankCardNo.trim(); }

    public String getBankName() { return this.bankName; }

    public void setBankName(String bankName) { this.bankName = (bankName == null) ? null : bankName.trim(); }

    public String getCustomerType() { return this.customerType; }

    public void setCustomerType(String customerType) { this.customerType = (customerType == null) ? null : customerType.trim(); }

    public String getCaCompany() { return this.caCompany; }

    public void setCaCompany(String caCompany) { this.caCompany = (caCompany == null) ? null : caCompany.trim(); }

    public String getCaType() { return this.caType; }

    public void setCaType(String caType) { this.caType = (caType == null) ? null : caType.trim(); }

    public String getCaIndustryType() { return this.caIndustryType; }

    public void setCaIndustryType(String caIndustryType) { this.caIndustryType = (caIndustryType == null) ? null : caIndustryType.trim(); }

    public String getCaDepartment() { return this.caDepartment; }

    public void setCaDepartment(String caDepartment) { this.caDepartment = (caDepartment == null) ? null : caDepartment.trim(); }

    public String getCaWorkPhone() { return this.caWorkPhone; }

    public void setCaWorkPhone(String caWorkPhone) { this.caWorkPhone = (caWorkPhone == null) ? null : caWorkPhone.trim(); }

    public String getCaDuty() { return this.caDuty; }

    public void setCaDuty(String caDuty) { this.caDuty = (caDuty == null) ? null : caDuty.trim(); }

    public Date getCaEnterTime() { return this.caEnterTime; }

    public void setCaEnterTime(Date caEnterTime) { this.caEnterTime = caEnterTime; }

    public Long getCaIncome() { return this.caIncome; }

    public void setCaIncome(Long caIncome) { this.caIncome = caIncome; }

    public String getAgency() { return this.agency; }

    public void setAgency(String agency) { this.agency = (agency == null) ? null : agency.trim(); }

    public String getCampus() { return this.campus; }

    public void setCampus(String campus) { this.campus = (campus == null) ? null : campus.trim(); }

    public String getViDriverLicense() { return this.viDriverLicense; }

    public void setViDriverLicense(String viDriverLicense) { this.viDriverLicense = (viDriverLicense == null) ? null : viDriverLicense.trim(); }

    public String getViPlateNum() { return this.viPlateNum; }

    public void setViPlateNum(String viPlateNum) { this.viPlateNum = (viPlateNum == null) ? null : viPlateNum.trim(); }

    public String getViVehicleType() { return this.viVehicleType; }

    public void setViVehicleType(String viVehicleType) { this.viVehicleType = (viVehicleType == null) ? null : viVehicleType.trim(); }

    public String getViFrameNum() { return this.viFrameNum; }

    public void setViFrameNum(String viFrameNum) { this.viFrameNum = (viFrameNum == null) ? null : viFrameNum.trim(); }

    public String getViEngineNum() { return this.viEngineNum; }

    public void setViEngineNum(String viEngineNum) { this.viEngineNum = (viEngineNum == null) ? null : viEngineNum.trim(); }

    public String getViFirstOncard() { return this.viFirstOncard; }

    public void setViFirstOncard(String viFirstOncard) { this.viFirstOncard = (viFirstOncard == null) ? null : viFirstOncard.trim(); }

    public String getViIsmort() { return this.viIsmort; }

    public void setViIsmort(String viIsmort) { this.viIsmort = (viIsmort == null) ? null : viIsmort.trim(); }

    public Date getLastUpdateTime() { return this.lastUpdateTime; }

    public void setLastUpdateTime(Date lastUpdateTime) { this.lastUpdateTime = lastUpdateTime; }
}

