package com.maiquan.aladdin_order.domain;

import java.io.Serializable;
import java.util.Date;

public class MoneyReturn implements Serializable{

	private static final long serialVersionUID = 2053402694735819929L;

	private Integer ID;

    private String returnCode;

    private String mqID;

    private Integer orderID;

    private String orderCode;

    private Integer uid;

    private String status;

    private String auditStatus;

    private String returnStatus;

    private String returnDesc;

    private Long applySum;

    private Long realReturnSum;

    private Long thirdReturnNo;

    private Date returnTime;

    private Date auditTime;

    private Date createTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    public String getMqID() {
        return mqID;
    }

    public void setMqID(String mqID) {
        this.mqID = mqID == null ? null : mqID.trim();
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus == null ? null : returnStatus.trim();
    }

    public String getReturnDesc() {
        return returnDesc;
    }

    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc == null ? null : returnDesc.trim();
    }

    public Long getApplySum() {
        return applySum;
    }

    public void setApplySum(Long applySum) {
        this.applySum = applySum;
    }

    public Long getRealReturnSum() {
        return realReturnSum;
    }

    public void setRealReturnSum(Long realReturnSum) {
        this.realReturnSum = realReturnSum;
    }

    public Long getThirdReturnNo() {
        return thirdReturnNo;
    }

    public void setThirdReturnNo(Long thirdReturnNo) {
        this.thirdReturnNo = thirdReturnNo;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "MoneyReturn [ID=" + ID + ", returnCode=" + returnCode
				+ ", mqID=" + mqID + ", orderID=" + orderID + ", orderCode="
				+ orderCode + ", uid=" + uid + ", status=" + status
				+ ", auditStatus=" + auditStatus + ", returnStatus="
				+ returnStatus + ", returnDesc=" + returnDesc + ", applySum="
				+ applySum + ", realReturnSum=" + realReturnSum
				+ ", thirdReturnNo=" + thirdReturnNo + ", returnTime="
				+ returnTime + ", auditTime=" + auditTime + ", createTime="
				+ createTime + "]";
	}
}