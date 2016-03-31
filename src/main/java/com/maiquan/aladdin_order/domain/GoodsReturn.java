package com.maiquan.aladdin_order.domain;

import java.io.Serializable;
import java.util.Date;

public class GoodsReturn implements Serializable{

	private static final long serialVersionUID = 7790498514542785717L;

	private Integer ID;

    private String returnCode;

    private Integer supID;

    private String mqID;

    private Integer orderID;

    private Integer orderProductID;

    private Integer productID;

    private Integer uid;

    private String orderCode;

    private String status;

    private String auditStatus;

    private String returnReason;

    private String returnDesc;

    private Long thirdReturnNo;

    private Long realReturnSum;

    private Date returnTime;

    private Date auditTime;

    private Date applyTime;

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

    public Integer getSupID() {
        return supID;
    }

    public void setSupID(Integer supID) {
        this.supID = supID;
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

    public Integer getOrderProductID() {
        return orderProductID;
    }

    public void setOrderProductID(Integer orderProductID) {
        this.orderProductID = orderProductID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
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

    public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

    public String getReturnDesc() {
        return returnDesc;
    }

    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc == null ? null : returnDesc.trim();
    }

    public Long getThirdReturnNo() {
        return thirdReturnNo;
    }

    public void setThirdReturnNo(Long thirdReturnNo) {
        this.thirdReturnNo = thirdReturnNo;
    }

    public Long getRealReturnSum() {
        return realReturnSum;
    }

    public void setRealReturnSum(Long realReturnSum) {
        this.realReturnSum = realReturnSum;
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

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "GoodsReturn [ID=" + ID + ", returnCode=" + returnCode
				+ ", supID=" + supID + ", mqID=" + mqID + ", orderID="
				+ orderID + ", orderProductID=" + orderProductID
				+ ", productID=" + productID + ", uid=" + uid + ", orderCode="
				+ orderCode + ", status=" + status + ", auditStatus="
				+ auditStatus + ", returnReason=" + returnReason
				+ ", returnDesc=" + returnDesc + ", thirdReturnNo="
				+ thirdReturnNo + ", realReturnSum=" + realReturnSum
				+ ", returnTime=" + returnTime + ", auditTime=" + auditTime
				+ ", applyTime=" + applyTime + ", createTime=" + createTime
				+ "]";
	}
}