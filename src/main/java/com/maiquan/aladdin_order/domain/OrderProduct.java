package com.maiquan.aladdin_order.domain;

import java.io.Serializable;

public class OrderProduct implements Serializable {
	
	private static final long serialVersionUID = -4376170385392828726L;
	
    private Integer ID;

    private Integer orderID;

    private Integer productID;

    private String productCode;

    private String productName;

    private Integer supID;

    private String supName;

    private Long supPrice;

    private Long sellPrice;

    private Integer skuID;

    private Integer buyNum;

    private String skuName;

    private Integer freightTplID;

    private String freightType;

    private Long postPay;

    private Integer goldRate;

    private Integer channelRate;

    private Integer isSystemRate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getSupID() {
        return supID;
    }

    public void setSupID(Integer supID) {
        this.supID = supID;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public Long getSupPrice() {
        return supPrice;
    }

    public void setSupPrice(Long supPrice) {
        this.supPrice = supPrice;
    }

    public Long getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Long sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Integer getSkuID() {
        return skuID;
    }

    public void setSkuID(Integer skuID) {
        this.skuID = skuID;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public Integer getFreightTplID() {
        return freightTplID;
    }

    public void setFreightTplID(Integer freightTplID) {
        this.freightTplID = freightTplID;
    }

    public String getFreightType() {
        return freightType;
    }

    public void setFreightType(String freightType) {
        this.freightType = freightType == null ? null : freightType.trim();
    }

    public Long getPostPay() {
        return postPay;
    }

    public void setPostPay(Long postPay) {
        this.postPay = postPay;
    }

    public Integer getGoldRate() {
		return goldRate;
	}

	public void setGoldRate(Integer goldRate) {
		this.goldRate = goldRate;
	}

	public Integer getChannelRate() {
		return channelRate;
	}

	public void setChannelRate(Integer channelRate) {
		this.channelRate = channelRate;
	}

	public Integer getIsSystemRate() {
        return isSystemRate;
    }

    public void setIsSystemRate(Integer isSystemRate) {
        this.isSystemRate = isSystemRate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", orderID=").append(orderID);
        sb.append(", productID=").append(productID);
        sb.append(", productCode=").append(productCode);
        sb.append(", productName=").append(productName);
        sb.append(", supID=").append(supID);
        sb.append(", supName=").append(supName);
        sb.append(", supPrice=").append(supPrice);
        sb.append(", sellPrice=").append(sellPrice);
        sb.append(", skuID=").append(skuID);
        sb.append(", buyNum=").append(buyNum);
        sb.append(", skuName=").append(skuName);
        sb.append(", freightTplID=").append(freightTplID);
        sb.append(", freightType=").append(freightType);
        sb.append(", postPay=").append(postPay);
        sb.append(", goldRate=").append(goldRate);
        sb.append(", channelRate=").append(channelRate);
        sb.append(", isSystemRate=").append(isSystemRate);
        sb.append("]");
        return sb.toString();
    }
}