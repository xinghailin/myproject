package com.yyq.car.portal.common.model.comm;

import java.math.BigDecimal;

public class BargainConfig {
    private Integer id;

    private BigDecimal allMoney;

    private BigDecimal stepOneMoney;

    private Integer stepOnePerson;

    private Integer stepOneWave;

    private BigDecimal stepTwoMoney;

    private Integer stepTwoPerson;

    private Integer stepTwoWave;

    private BigDecimal stepThreeMoney;

    private Integer stepThreePerson;

    private Integer stepThreeWave;

    private BigDecimal stepFourMoney;

    private Integer stepFourPerson;

    private Integer stepFourWave;

    private BigDecimal stepFiveMoney;

    private Integer stepFivePerson;

    private Integer stepFiveWave;

    private BigDecimal stepSixMoney;

    private Integer stepSixPerson;

    private Integer stepSixWave;

    private Integer downTime;

    private String pic;

    private String contentSharing;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(BigDecimal allMoney) {
        this.allMoney = allMoney;
    }

    public BigDecimal getStepOneMoney() {
        return stepOneMoney;
    }

    public void setStepOneMoney(BigDecimal stepOneMoney) {
        this.stepOneMoney = stepOneMoney;
    }

    public Integer getStepOnePerson() {
        return stepOnePerson;
    }

    public void setStepOnePerson(Integer stepOnePerson) {
        this.stepOnePerson = stepOnePerson;
    }

    public Integer getStepOneWave() {
        return stepOneWave;
    }

    public void setStepOneWave(Integer stepOneWave) {
        this.stepOneWave = stepOneWave;
    }

    public BigDecimal getStepTwoMoney() {
        return stepTwoMoney;
    }

    public void setStepTwoMoney(BigDecimal stepTwoMoney) {
        this.stepTwoMoney = stepTwoMoney;
    }

    public Integer getStepTwoPerson() {
        return stepTwoPerson;
    }

    public void setStepTwoPerson(Integer stepTwoPerson) {
        this.stepTwoPerson = stepTwoPerson;
    }

    public Integer getStepTwoWave() {
        return stepTwoWave;
    }

    public void setStepTwoWave(Integer stepTwoWave) {
        this.stepTwoWave = stepTwoWave;
    }

    public BigDecimal getStepThreeMoney() {
        return stepThreeMoney;
    }

    public void setStepThreeMoney(BigDecimal stepThreeMoney) {
        this.stepThreeMoney = stepThreeMoney;
    }

    public Integer getStepThreePerson() {
        return stepThreePerson;
    }

    public void setStepThreePerson(Integer stepThreePerson) {
        this.stepThreePerson = stepThreePerson;
    }

    public Integer getStepThreeWave() {
        return stepThreeWave;
    }

    public void setStepThreeWave(Integer stepThreeWave) {
        this.stepThreeWave = stepThreeWave;
    }

    public BigDecimal getStepFourMoney() {
        return stepFourMoney;
    }

    public void setStepFourMoney(BigDecimal stepFourMoney) {
        this.stepFourMoney = stepFourMoney;
    }

    public Integer getStepFourPerson() {
        return stepFourPerson;
    }

    public void setStepFourPerson(Integer stepFourPerson) {
        this.stepFourPerson = stepFourPerson;
    }

    public Integer getStepFourWave() {
        return stepFourWave;
    }

    public void setStepFourWave(Integer stepFourWave) {
        this.stepFourWave = stepFourWave;
    }

    public BigDecimal getStepFiveMoney() {
        return stepFiveMoney;
    }

    public void setStepFiveMoney(BigDecimal stepFiveMoney) {
        this.stepFiveMoney = stepFiveMoney;
    }

    public Integer getStepFivePerson() {
        return stepFivePerson;
    }

    public void setStepFivePerson(Integer stepFivePerson) {
        this.stepFivePerson = stepFivePerson;
    }

    public Integer getStepFiveWave() {
        return stepFiveWave;
    }

    public void setStepFiveWave(Integer stepFiveWave) {
        this.stepFiveWave = stepFiveWave;
    }

    public BigDecimal getStepSixMoney() {
        return stepSixMoney;
    }

    public void setStepSixMoney(BigDecimal stepSixMoney) {
        this.stepSixMoney = stepSixMoney;
    }

    public Integer getStepSixPerson() {
        return stepSixPerson;
    }

    public void setStepSixPerson(Integer stepSixPerson) {
        this.stepSixPerson = stepSixPerson;
    }

    public Integer getStepSixWave() {
        return stepSixWave;
    }

    public void setStepSixWave(Integer stepSixWave) {
        this.stepSixWave = stepSixWave;
    }

    public Integer getDownTime() {
        return downTime;
    }

    public void setDownTime(Integer downTime) {
        this.downTime = downTime;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getContentSharing() {
        return contentSharing;
    }

    public void setContentSharing(String contentSharing) {
        this.contentSharing = contentSharing == null ? null : contentSharing.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", allMoney=").append(allMoney);
        sb.append(", stepOneMoney=").append(stepOneMoney);
        sb.append(", stepOnePerson=").append(stepOnePerson);
        sb.append(", stepOneWave=").append(stepOneWave);
        sb.append(", stepTwoMoney=").append(stepTwoMoney);
        sb.append(", stepTwoPerson=").append(stepTwoPerson);
        sb.append(", stepTwoWave=").append(stepTwoWave);
        sb.append(", stepThreeMoney=").append(stepThreeMoney);
        sb.append(", stepThreePerson=").append(stepThreePerson);
        sb.append(", stepThreeWave=").append(stepThreeWave);
        sb.append(", stepFourMoney=").append(stepFourMoney);
        sb.append(", stepFourPerson=").append(stepFourPerson);
        sb.append(", stepFourWave=").append(stepFourWave);
        sb.append(", stepFiveMoney=").append(stepFiveMoney);
        sb.append(", stepFivePerson=").append(stepFivePerson);
        sb.append(", stepFiveWave=").append(stepFiveWave);
        sb.append(", stepSixMoney=").append(stepSixMoney);
        sb.append(", stepSixPerson=").append(stepSixPerson);
        sb.append(", stepSixWave=").append(stepSixWave);
        sb.append(", downTime=").append(downTime);
        sb.append(", pic=").append(pic);
        sb.append(", contentSharing=").append(contentSharing);
        sb.append("]");
        return sb.toString();
    }
}