package com.maiquan.aladdin_order.domain;

import java.io.Serializable;
import java.util.Date;

public class GoodsReturnHistory implements Serializable{

	private static final long serialVersionUID = 9210173526501785004L;

	private Integer ID;

    private String returnID;

    private String mqID;

    private Integer supID;

    private Integer orderID;

    private Integer productID;

    private Integer uid;

    private Integer orderProductID;

    private String orderCode;

    private String status;

    private String checkStatus;

    private String returnReason;

    private String actionPos;

    private String actionNote;

    private Date returnTime;

    private Date payTime;

    private Date applyTime;

    private Date createTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getReturnID() {
        return returnID;
    }

    public void setReturnID(String returnID) {
        this.returnID = returnID == null ? null : returnID.trim();
    }

    public String getMqID() {
        return mqID;
    }

    public void setMqID(String mqID) {
        this.mqID = mqID == null ? null : mqID.trim();
    }

    public Integer getSupID() {
        return supID;
    }

    public void setSupID(Integer supID) {
        this.supID = supID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
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

    public Integer getOrderProductID() {
        return orderProductID;
    }

    public void setOrderProductID(Integer orderProductID) {
        this.orderProductID = orderProductID;
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

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	public String getActionPos() {
        return actionPos;
    }

    public void setActionPos(String actionPos) {
        this.actionPos = actionPos == null ? null : actionPos.trim();
    }

    public String getActionNote() {
        return actionNote;
    }

    public void setActionNote(String actionNote) {
        this.actionNote = actionNote == null ? null : actionNote.trim();
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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
		return "GoodsReturnHistory [ID=" + ID + ", returnID=" + returnID
				+ ", mqID=" + mqID + ", supID=" + supID + ", orderID="
				+ orderID + ", productID=" + productID + ", uid=" + uid
				+ ", orderProductID=" + orderProductID + ", orderCode="
				+ orderCode + ", status=" + status + ", checkStatus="
				+ checkStatus + ", returnReason=" + returnReason
				+ ", actionPos=" + actionPos + ", actionNote=" + actionNote
				+ ", returnTime=" + returnTime + ", payTime=" + payTime
				+ ", applyTime=" + applyTime + ", createTime=" + createTime
				+ "]";
	}
}