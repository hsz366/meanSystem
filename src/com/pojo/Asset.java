package com.pojo;

public class Asset {
    private int id;
    private String entrytime;
    private String pzid;
    private String cwid;
    private String zcid;
    private String cpid;
    private String famliy;
    private String cpname;
    private String cpnorm;
    private String rktime;
    private String unit;
    private int count;
    private double price;

    public Asset(int id, String entrytime, String pzid, String cwid, String zcid, String cpid, String famliy, String cpname, String cpnorm, String rktime, String unit, int count, double price) {
        this.id = id;
        this.entrytime = entrytime;
        this.pzid = pzid;
        this.cwid = cwid;
        this.zcid = zcid;
        this.cpid = cpid;
        this.famliy = famliy;
        this.cpname = cpname;
        this.cpnorm = cpnorm;
        this.rktime = rktime;
        this.unit = unit;
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", entrytime='" + entrytime + '\'' +
                ", pzid='" + pzid + '\'' +
                ", cwid='" + cwid + '\'' +
                ", zcid='" + zcid + '\'' +
                ", cpid='" + cpid + '\'' +
                ", famliy='" + famliy + '\'' +
                ", cpname='" + cpname + '\'' +
                ", cpnorm='" + cpnorm + '\'' +
                ", rktime='" + rktime + '\'' +
                ", unit='" + unit + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getPzid() {
        return pzid;
    }

    public void setPzid(String pzid) {
        this.pzid = pzid;
    }

    public String getCwid() {
        return cwid;
    }

    public void setCwid(String cwid) {
        this.cwid = cwid;
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

    public String getFamliy() {
        return famliy;
    }

    public void setFamliy(String famliy) {
        this.famliy = famliy;
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

    public String getRktime() {
        return rktime;
    }

    public void setRktime(String rktime) {
        this.rktime = rktime;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
