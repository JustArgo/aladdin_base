package com.mi360.aladdin.order.domain;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{
	
	private static final long serialVersionUID = 7578740373431553593L;

	private Integer ID;

    private Integer parentID;

    private String parentCode;

    private Integer supID;

    private String orderCode;

    private String orderType;

    private String orderStatus;

    private String payStatus;

    private String logistics;

    private String logisticsNum;

    private String returnMoneyStatus;

    private String returnGoodsStatus;

    private String commentStatus;

    private String shippingStatus;

    private String platform;

    private String mqID;

    private String invoiceName;

    private String country;

    private String province;

    private String city;

    private String district;

    private String address;

    private String recName;

    private String recMobile;

    private Long pFee;

    private Long postFee;

    private Long pSum;

    private Long orderSum;

    private Long paySum;

    private Date sendTime;

    private Date confirmTime;

    private Date payTime;

    private Date createTime;

    private String serviceNote;

    private String notes;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getLogisticsNum() {
        return logisticsNum;
    }

    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum == null ? null : logisticsNum.trim();
    }

    public String getReturnMoneyStatus() {
        return returnMoneyStatus;
    }

    public void setReturnMoneyStatus(String returnMoneyStatus) {
        this.returnMoneyStatus = returnMoneyStatus == null ? null : returnMoneyStatus.trim();
    }

    public String getReturnGoodsStatus() {
        return returnGoodsStatus;
    }

    public void setReturnGoodsStatus(String returnGoodsStatus) {
        this.returnGoodsStatus = returnGoodsStatus == null ? null : returnGoodsStatus.trim();
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
    }

    public String getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus == null ? null : shippingStatus.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getMqID() {
        return mqID;
    }

    public void setMqID(String mqID) {
        this.mqID = mqID == null ? null : mqID.trim();
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName == null ? null : invoiceName.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName == null ? null : recName.trim();
    }

    public String getRecMobile() {
        return recMobile;
    }

    public void setRecMobile(String recMobile) {
        this.recMobile = recMobile == null ? null : recMobile.trim();
    }

    public Long getpFee() {
        return pFee;
    }

    public void setpFee(Long pFee) {
        this.pFee = pFee;
    }

    public Long getPostFee() {
        return postFee;
    }

    public void setPostFee(Long postFee) {
        this.postFee = postFee;
    }

    public Long getpSum() {
        return pSum;
    }

    public void setpSum(Long pSum) {
        this.pSum = pSum;
    }

    public Long getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(Long orderSum) {
        this.orderSum = orderSum;
    }

    public Long getPaySum() {
        return paySum;
    }

    public void setPaySum(Long paySum) {
        this.paySum = paySum;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
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
    
    public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getFullAddress(){
    	return (this.province!=null?this.province:"")+(this.city!=null?this.city:"")+(this.district!=null?this.district:"")+(this.address!=null?this.address:"");
    }
	
	
	public Integer getSupID() {
		return supID;
	}

	public void setSupID(Integer supID) {
		this.supID = supID;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getLogistics() {
		return logistics;
	}

	public void setLogistics(String logistics) {
		this.logistics = logistics;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getServiceNote() {
		return serviceNote;
	}

	public void setServiceNote(String serviceNote) {
		this.serviceNote = serviceNote;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", parentID=").append(parentID);
        sb.append(", parentCode=").append(parentCode);
        sb.append(", supID=").append(supID);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", logistics=").append(logistics);
        sb.append(", logisticsNum=").append(logisticsNum);
        sb.append(", returnMoneyStatus=").append(returnMoneyStatus);
        sb.append(", returnGoodsStatus=").append(returnGoodsStatus);
        sb.append(", commentStatus=").append(commentStatus);
        sb.append(", shippingStatus=").append(shippingStatus);
        sb.append(", platform=").append(platform);
        sb.append(", mqID=").append(mqID);
        sb.append(", invoiceName=").append(invoiceName);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", recName=").append(recName);
        sb.append(", recMobile=").append(recMobile);
        sb.append(", pFee=").append(pFee);
        sb.append(", postFee=").append(postFee);
        sb.append(", pSum=").append(pSum);
        sb.append(", orderSum=").append(orderSum);
        sb.append(", paySum=").append(paySum);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serviceNote=").append(serviceNote);
        sb.append(", notes=").append(notes);
        sb.append("]");
        return sb.toString();
    }
}