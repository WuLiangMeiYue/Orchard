package com.orchard.api.entity;

public class FacilityMessage {

    /**
     * 主键ID
     */
    private long facilityMessageId;

    /**
     * 设备唯一性标识
     */
    private String facilityMessageCode;

    /**
     * 接收到数据的时间
     */
    private String facilityMessageTime;

    /**
     * 温度
     */
    private String facilityMessageTemperature;

    /**
     * 湿度
     */
    private String facilityMessageHumidity;

    /**
     * 光照度
     */
    private String facilityMessageIlluminance;

    /**
     * 土壤温湿度
     */
    private String facilityMessageSoil;

    /**
     * 降雨量
     */
    private String facilityMessagePrecipitation;

    public long getFacilityMessageId() {
        return facilityMessageId;
    }

    public void setFacilityMessageId(long facilityMessageId) {
        this.facilityMessageId = facilityMessageId;
    }

    public String getFacilityMessageCode() {
        return facilityMessageCode;
    }

    public void setFacilityMessageCode(String facilityMessageCode) {
        this.facilityMessageCode = facilityMessageCode;
    }

    public String getFacilityMessageTime() {
        return facilityMessageTime;
    }

    public void setFacilityMessageTime(String facilityMessageTime) {
        this.facilityMessageTime = facilityMessageTime;
    }

    public String getFacilityMessageTemperature() {
        return facilityMessageTemperature;
    }

    public void setFacilityMessageTemperature(String facilityMessageTemperature) {
        this.facilityMessageTemperature = facilityMessageTemperature;
    }

    public String getFacilityMessageHumidity() {
        return facilityMessageHumidity;
    }

    public void setFacilityMessageHumidity(String facilityMessageHumidity) {
        this.facilityMessageHumidity = facilityMessageHumidity;
    }

    public String getFacilityMessageIlluminance() {
        return facilityMessageIlluminance;
    }

    public void setFacilityMessageIlluminance(String facilityMessageIlluminance) {
        this.facilityMessageIlluminance = facilityMessageIlluminance;
    }

    public String getFacilityMessageSoil() {
        return facilityMessageSoil;
    }

    public void setFacilityMessageSoil(String facilityMessageSoil) {
        this.facilityMessageSoil = facilityMessageSoil;
    }

    public String getFacilityMessagePrecipitation() {
        return facilityMessagePrecipitation;
    }

    public void setFacilityMessagePrecipitation(String facilityMessagePrecipitation) {
        this.facilityMessagePrecipitation = facilityMessagePrecipitation;
    }
}
