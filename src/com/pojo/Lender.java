package com.pojo;

import javax.xml.crypto.Data;

public class Lender {
    private int id;             //序号
    private String zcid;        //资产序号
    private String family;      //产品类型
    private String cpid;        //产品序号
    private String cpname;      //产品名称
    private String cpnorm;      //规格型号
    private int count;          //总数
    private String applyname;   //借用人
    private String sqtime;      //申请时间
    private int isStatus;     //申请状态
    private String sptime;      //审批时间

    public Lender(){

    }
    public Lender(String zcid,String family,String cpid,
                  String cpname,String cpnorm,int count,
                  String applyname,String sqtime,
                  int isStatus,String sptime){
        this.zcid = zcid;
        this.family = family;
        this.cpid = cpid;
        this.cpname = cpname;
        this.cpnorm = cpnorm;
        this.count = count;
        this.applyname = applyname;
        this.sqtime = sqtime;
        this.isStatus = isStatus;
        this.sptime = sptime;
    }

    public Lender(int id, String zcid, String family, String cpid, String cpname, String cpnorm, int count, String applyname, String sqtime, int isStatus, String sptime) {
        this.id = id;
        this.zcid = zcid;
        this.family = family;
        this.cpid = cpid;
        this.cpname = cpname;
        this.cpnorm = cpnorm;
        this.count = count;
        this.applyname = applyname;
        this.sqtime = sqtime;
        this.isStatus = isStatus;
        this.sptime = sptime;
    }

    @Override
    public String toString() {
        return "Lender{" +
                "id=" + id +
                ", zcid='" + zcid + '\'' +
                ", family='" + family + '\'' +
                ", cpid='" + cpid + '\'' +
                ", cpname='" + cpname + '\'' +
                ", cpnorm='" + cpnorm + '\'' +
                ", count=" + count +
                ", applyname='" + applyname + '\'' +
                ", sqtime='" + sqtime + '\'' +
                ", isStatus=" + isStatus +
                ", sptime='" + sptime + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZcid() {
        return zcid;
    }

    public void setZcid(String zcid) {
        this.zcid = zcid;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCpid() {
        return cpid;
    }

    public void setCpid(String cpid) {
        this.cpid = cpid;
    }

    public String getCpname() {
        return cpname;
    }

    public void setCpname(String cpname) {
        this.cpname = cpname;
    }

    public String getCpnorm() {
        return cpnorm;
    }

    public void setCpnorm(String cpnorm) {
        this.cpnorm = cpnorm;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getApplyname() {
        return applyname;
    }

    public void setApplyname(String applyname) {
        this.applyname = applyname;
    }

    public String getSqtime() {
        return sqtime;
    }

    public void setSqtime(String sqtime) {
        this.sqtime = sqtime;
    }

    public int getIsStatus() {
        return isStatus;
    }

    public void setIsStatus(int isStatus) {
        this.isStatus = isStatus;
    }

    public String getSptime() {
        return sptime;
    }

    public void setSptime(String sptime) {
        this.sptime = sptime;
    }
}
