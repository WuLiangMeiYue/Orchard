package com.orchard.api.entity;

import java.util.Objects;

public class Threshold {

    /**
     * 阈值ID
     */
    private long thresholdId;

    /**
     * 温度
     */
    private String thresholdTemperature;

    /**
     * 湿度
     */
    private String thresholdHhumidity;

    /**
     * 光照度
     */
    private String thresholdIlluminance;

    /**
     * 土壤温湿度
     */
    private String thresholdSoil;

    /**
     * 降雨量
     */
    private String thresholdPrecipitation;

    /**
     * 对应设备的编码
     */
    private String facilityCode;

    @Override
    public String toString() {
        return "Threshold{" +
                "thresholdId=" + thresholdId +
                ", thresholdTemperature='" + thresholdTemperature + '\'' +
                ", thresholdHhumidity='" + thresholdHhumidity + '\'' +
                ", thresholdIlluminance='" + thresholdIlluminance + '\'' +
                ", thresholdSoil='" + thresholdSoil + '\'' +
                ", thresholdPrecipitation='" + thresholdPrecipitation + '\'' +
                ", facilityCode='" + facilityCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threshold threshold = (Threshold) o;
        return thresholdId == threshold.thresholdId &&
                Objects.equals(thresholdTemperature, threshold.thresholdTemperature) &&
                Objects.equals(thresholdHhumidity, threshold.thresholdHhumidity) &&
                Objects.equals(thresholdIlluminance, threshold.thresholdIlluminance) &&
                Objects.equals(thresholdSoil, threshold.thresholdSoil) &&
                Objects.equals(thresholdPrecipitation, threshold.thresholdPrecipitation) &&
                Objects.equals(facilityCode, threshold.facilityCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thresholdId, thresholdTemperature, thresholdHhumidity, thresholdIlluminance, thresholdSoil, thresholdPrecipitation, facilityCode);
    }

    public long getThresholdId() {
        return thresholdId;
    }

    public void setThresholdId(long thresholdId) {
        this.thresholdId = thresholdId;
    }

    public String getThresholdTemperature() {
        return thresholdTemperature;
    }

    public void setThresholdTemperature(String thresholdTemperature) {
        this.thresholdTemperature = thresholdTemperature;
    }

    public String getThresholdHhumidity() {
        return thresholdHhumidity;
    }

    public void setThresholdHhumidity(String thresholdHhumidity) {
        this.thresholdHhumidity = thresholdHhumidity;
    }

    public String getThresholdIlluminance() {
        return thresholdIlluminance;
    }

    public void setThresholdIlluminance(String thresholdIlluminance) {
        this.thresholdIlluminance = thresholdIlluminance;
    }

    public String getThresholdSoil() {
        return thresholdSoil;
    }

    public void setThresholdSoil(String thresholdSoil) {
        this.thresholdSoil = thresholdSoil;
    }

    public String getThresholdPrecipitation() {
        return thresholdPrecipitation;
    }

    public void setThresholdPrecipitation(String thresholdPrecipitation) {
        this.thresholdPrecipitation = thresholdPrecipitation;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }
}
