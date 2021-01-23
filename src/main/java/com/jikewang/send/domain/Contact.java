package com.jikewang.send.domain;

import java.util.Date;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: Contact
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:29
 * @Version: 1.0
 */
public class Contact {
    private Integer id;
    private Integer acctNo;
    private String idNo;
    private String contactName;
    private String phone;
    private String email;
    private String contactType;
    private String relationship;
    private String contactDepartment;
    private String address;
    private Date lastUpdateTime;
    public Integer getId() { return this.id; }

    public void setId(Integer id) { this.id = id; }

    public Integer getAcctNo() { return this.acctNo; }

    public void setAcctNo(Integer acctNo) { this.acctNo = acctNo; }

    public String getIdNo() { return this.idNo; }

    public void setIdNo(String idNo) { this.idNo = (idNo == null) ? null : idNo.trim(); }

    public String getContactName() { return this.contactName; }

    public void setContactName(String contactName) { this.contactName = (contactName == null) ? null : contactName.trim(); }

    public String getPhone() { return this.phone; }

    public void setPhone(String phone) { this.phone = (phone == null) ? null : phone.trim(); }

    public String getEmail() { return this.email; }

    public void setEmail(String email) { this.email = (email == null) ? null : email.trim(); }

    public String getContactType() { return this.contactType; }

    public void setContactType(String contactType) { this.contactType = (contactType == null) ? null : contactType.trim(); }

    public String getRelationship() { return this.relationship; }

    public void setRelationship(String relationship) { this.relationship = (relationship == null) ? null : relationship.trim(); }

    public String getContactDepartment() { return this.contactDepartment; }

    public void setContactDepartment(String contactDepartment) { this.contactDepartment = (contactDepartment == null) ? null : contactDepartment.trim(); }

    public String getAddress() { return this.address; }

    public void setAddress(String address) { this.address = (address == null) ? null : address.trim(); }

    public Date getLastUpdateTime() { return this.lastUpdateTime; }

    public void setLastUpdateTime(Date lastUpdateTime) { this.lastUpdateTime = lastUpdateTime; }
}
