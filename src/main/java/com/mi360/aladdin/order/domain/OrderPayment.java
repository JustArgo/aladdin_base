package com.mi360.aladdin.order.domain;

import java.io.Serializable;
import java.util.Date;

public class OrderPayment implements Serializable {
	
	private static final long serialVersionUID = 8960696949096330218L;

	private Integer ID;

    private String orderCode;

    private String payNum;

    private String payChannel;

    private String payStatus;

    private String mqID;

    private String moneyType;

    private Long paySum;

    private Date payTime;

    private Date createTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getPayNum() {
        return payNum;
    }

    public void setPayNum(String payNum) {
        this.payNum = payNum == null ? null : payNum.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getMqID() {
        return mqID;
    }

    public void setMqID(String mqID) {
        this.mqID = mqID == null ? null : mqID.trim();
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType == null ? null : moneyType.trim();
    }

    public Long getPaySum() {
        return paySum;
    }

    public void setPaySum(Long paySum) {
        this.paySum = paySum;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", payNum=").append(payNum);
        sb.append(", payChannel=").append(payChannel);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", mqID=").append(mqID);
        sb.append(", moneyType=").append(moneyType);
        sb.append(", paySum=").append(paySum);
        sb.append(", payTime=").append(payTime);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}