package com.mi360.aladdin.product.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductAttr implements Serializable{

	private static final long serialVersionUID = -7087733839749384715L;

	private Integer ID;

    private Integer productID;

    private String attrName;

    private Integer sortOrder;

    private Integer uid;

    private Date createTime;

    private Date updateTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
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
		return "ProductAttr [ID=" + ID + ", productID=" + productID
				+ ", attrName=" + attrName + ", sortOrder=" + sortOrder
				+ ", uid=" + uid + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
}