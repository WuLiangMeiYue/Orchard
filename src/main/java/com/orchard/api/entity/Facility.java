package com.orchard.api.entity;

public class Facility {

    /**
     * 主键ID
     */
    private long facilityId;

    /**
     * 硬件名称
     */
    private String facilityName;

    /**
     * 硬件唯一性标识
     */
    private String facilityCode;

    /**
     * 硬件IP地址
     */
    private String facilityIp;

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getFacilityIp() {
        return facilityIp;
    }

    public void setFacilityIp(String facilityIp) {
        this.facilityIp = facilityIp;
    }
}
