package com.mi360.aladdin.order.domain;

import java.io.Serializable;
import java.util.Date;

public class GoodsReturn implements Serializable {
	
	private static final long serialVersionUID = 7790498514542785717L;
	
    private Integer ID;

    private String returnCode;

    private Integer supID;

    private String mqID;

    private Integer orderID;

    private Integer orderProductID;

    private String productCode;

    private Integer productID;

    private Integer productCount;

    private Integer uid;

    private String orderCode;

    private String status;

    private String auditStatus;

    private String returnReason;

    private Long applySum;

    private String returnDesc;

    private Long thirdReturnNo;

    private Long realReturnSum;

    private Date returnTime;

    private Date auditTime;

    private Date applyTime;

    public enum ReturnReason{
		SEV("七天无理由退货"),DES("收到商品破损"),QUA("商品质量问题"),SJ("少件/漏发"),TYF("退运费"),WAY("未按约定发货"),JMP("假冒品牌"),FP(""),REP("商品需要维修"),WRO("收到商品与描述不符");
		
		private String value;
		private ReturnReason(String value){
			this.value = value;
		}
		public String getValue(){
			return this.value;
		}
		
	}

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
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
        this.returnReason = returnReason == null ? null : returnReason.trim();
    }

    public Long getApplySum() {
        return applySum;
    }

    public void setApplySum(Long applySum) {
        this.applySum = applySum;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", returnCode=").append(returnCode);
        sb.append(", supID=").append(supID);
        sb.append(", mqID=").append(mqID);
        sb.append(", orderID=").append(orderID);
        sb.append(", orderProductID=").append(orderProductID);
        sb.append(", productCode=").append(productCode);
        sb.append(", productID=").append(productID);
        sb.append(", productCount=").append(productCount);
        sb.append(", uid=").append(uid);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", status=").append(status);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", returnReason=").append(returnReason);
        sb.append(", applySum=").append(applySum);
        sb.append(", returnDesc=").append(returnDesc);
        sb.append(", thirdReturnNo=").append(thirdReturnNo);
        sb.append(", realReturnSum=").append(realReturnSum);
        sb.append(", returnTime=").append(returnTime);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", applyTime=").append(applyTime);
        sb.append("]");
        return sb.toString();
    }
}