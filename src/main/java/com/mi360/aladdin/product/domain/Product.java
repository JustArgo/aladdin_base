package com.mi360.aladdin.product.domain;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable{
	private static final long serialVersionUID = 4830064012342630770L;

	private Integer ID;

    private Integer brandID;

    private Integer categoryID;

    private Integer supplyID;

    private String shortName;

    private String productName;

    private String sellDesc;

    private String sellType;

    private String productCode;

    private Long weight;

    private Long price;

    private Long applyPrice;

    private Integer isSystemRate;

    private Long goldRate;

    private Long channelRate;

    private Integer collects;

    private Integer views;

    private Integer sellCount;

    private Integer limitCount;

    private Integer sortOrder;

    private String platform;

    private String minusStock;

    private String status;

    private Integer uid;

    private Date createTime;

    private Date updateTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(Integer supplyID) {
        this.supplyID = supplyID;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getSellDesc() {
        return sellDesc;
    }

    public void setSellDesc(String sellDesc) {
        this.sellDesc = sellDesc == null ? null : sellDesc.trim();
    }

    public String getSellType() {
        return sellType;
    }

    public void setSellType(String sellType) {
        this.sellType = sellType == null ? null : sellType.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getApplyPrice() {
        return applyPrice;
    }

    public void setApplyPrice(Long applyPrice) {
        this.applyPrice = applyPrice;
    }

    public Integer getIsSystemRate() {
        return isSystemRate;
    }

    public void setIsSystemRate(Integer isSystemRate) {
        this.isSystemRate = isSystemRate;
    }

    public Long getGoldRate() {
        return goldRate;
    }

    public void setGoldRate(Long goldRate) {
        this.goldRate = goldRate;
    }

    public Long getChannelRate() {
        return channelRate;
    }

    public void setChannelRate(Long channelRate) {
        this.channelRate = channelRate;
    }

    public Integer getCollects() {
        return collects;
    }

    public void setCollects(Integer collects) {
        this.collects = collects;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getSellCount() {
        return sellCount;
    }

    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getMinusStock() {
        return minusStock;
    }

    public void setMinusStock(String minusStock) {
        this.minusStock = minusStock == null ? null : minusStock.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	@Override
	public String toString() {
		return "Product [ID=" + ID + ", brandID=" + brandID + ", categoryID="
				+ categoryID + ", supplyID=" + supplyID + ", shortName="
				+ shortName + ", productName=" + productName + ", sellDesc="
				+ sellDesc + ", sellType=" + sellType + ", productCode="
				+ productCode + ", weight=" + weight + ", price=" + price
				+ ", applyPrice=" + applyPrice + ", isSystemRate="
				+ isSystemRate + ", goldRate=" + goldRate + ", channelRate="
				+ channelRate + ", collects=" + collects + ", views=" + views
				+ ", sellCount=" + sellCount + ", limitCount=" + limitCount
				+ ", sortOrder=" + sortOrder + ", platform=" + platform
				+ ", minusStock=" + minusStock + ", status=" + status
				+ ", uid=" + uid + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
}