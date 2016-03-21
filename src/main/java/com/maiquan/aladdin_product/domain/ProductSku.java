package com.maiquan.aladdin_product.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductSku implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8176250238376111535L;

	private Integer ID;

    private Integer uid;

    private String key;

    private String name;

    private Integer productID;

    private Integer houseID;

    private Long skuPrice;

    private Long applyPrice;

    private String skuImg;

    private Integer skuStock;

    private Date createTime;

    private Integer sortOrder;

    private Date updateTime;

    private String status;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getHouseID() {
        return houseID;
    }

    public void setHouseID(Integer houseID) {
        this.houseID = houseID;
    }

    public Long getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Long skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Long getApplyPrice() {
        return applyPrice;
    }

    public void setApplyPrice(Long applyPrice) {
        this.applyPrice = applyPrice;
    }

    public String getSkuImg() {
        return skuImg;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg == null ? null : skuImg.trim();
    }

    public Integer getSkuStock() {
        return skuStock;
    }

    public void setSkuStock(Integer skuStock) {
        this.skuStock = skuStock;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

	@Override
	public String toString() {
		return "ProductSku [ID=" + ID + ", uid=" + uid + ", key=" + key
				+ ", name=" + name + ", productID=" + productID + ", houseID="
				+ houseID + ", skuPrice=" + skuPrice + ", applyPrice="
				+ applyPrice + ", skuImg=" + skuImg + ", skuStock=" + skuStock
				+ ", createTime=" + createTime + ", sortOrder=" + sortOrder
				+ ", updateTime=" + updateTime + ", status=" + status + "]";
	}
}