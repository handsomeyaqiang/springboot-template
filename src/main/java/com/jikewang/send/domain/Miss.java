package com.jikewang.send.domain;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: Miss
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:50
 * @Version: 1.0
 */

public class Miss {
    private Integer id;
    private Integer acctNo;
    private String dataTime;
    private Byte status;

    public Integer getId() { return this.id; }



    public void setId(Integer id) { this.id = id; }



    public Integer getAcctNo() { return this.acctNo; }



    public void setAcctNo(Integer acctNo) { this.acctNo = acctNo; }



    public String getDataTime() { return this.dataTime; }



    public void setDataTime(String dataTime) { this.dataTime = (dataTime == null) ? null : dataTime.trim(); }



    public Byte getStatus() { return this.status; }



    public void setStatus(Byte status) { this.status = status; }
}

