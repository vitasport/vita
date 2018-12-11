package com.vita.entity;

public class Master {
    private Integer id;

    private String termNo;

    private String intranetIp;

    private String intranetPort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo == null ? null : termNo.trim();
    }

    public String getIntranetIp() {
        return intranetIp;
    }

    public void setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp == null ? null : intranetIp.trim();
    }

    public String getIntranetPort() {
        return intranetPort;
    }

    public void setIntranetPort(String intranetPort) {
        this.intranetPort = intranetPort == null ? null : intranetPort.trim();
    }
}