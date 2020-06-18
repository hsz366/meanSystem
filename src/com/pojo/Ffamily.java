package com.pojo;

public class Ffamily {
    private int id;
    private String family;
    private String zcid;
    private String cpid;
    private String cpname;
    private String cpnorm;
    private int status;
    private String cakename;
    private String applyname;



    public Ffamily(int id, String family, String zcid, String cpid, String cpname, String cpnorm, int status, String cakename, String applyname) {
        this.id = id;
        this.family = family;
        this.zcid = zcid;
        this.cpid = cpid;
        this.cpname = cpname;
        this.cpnorm = cpnorm;
        this.status = status;
        this.cakename = cakename;
        this.applyname = applyname;
    }

    @Override
    public String toString() {
        return "Ffamily{" +
                "id=" + id +
                ", family='" + family + '\'' +
                ", zcid='" + zcid + '\'' +
                ", cpid='" + cpid + '\'' +
                ", cpname='" + cpname + '\'' +
                ", cpnorm='" + cpnorm + '\'' +
                ", status=" + status +
                ", cakename='" + cakename + '\'' +
                ", applyname='" + applyname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getZcid() {
        return zcid;
    }

    public void setZcid(String zcid) {
        this.zcid = zcid;
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

    public int setStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCakename() {
        return cakename;
    }

    public void setCakename(String cakename) {
        this.cakename = cakename;
    }

    public String getApplyname() {
        return applyname;
    }

    public void setApplyname(String applyname) {
        this.applyname = applyname;
    }
}
