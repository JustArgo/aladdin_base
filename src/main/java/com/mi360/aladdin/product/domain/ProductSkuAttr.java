package com.mi360.aladdin.product.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductSkuAttr implements Serializable{
	
	private static final long serialVersionUID = -8018343504928751341L;

	private Integer ID;

    private Integer skuID;

    private Integer attrID;

    private Integer attrValueID;

    private Integer sortOrder;

    private Date createTime;

    private Integer uid;

    private Date updateTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getSkuID() {
        return skuID;
    }

    public void setSkuID(Integer skuID) {
        this.skuID = skuID;
    }

    public Integer getAttrID() {
        return attrID;
    }

    public void setAttrID(Integer attrID) {
        this.attrID = attrID;
    }

    public Integer getAttrValueID() {
        return attrValueID;
    }

    public void setAttrValueID(Integer attrValueID) {
        this.attrValueID = attrValueID;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	@Override
	public String toString() {
		return "ProductSkuAttr [ID=" + ID + ", skuID=" + skuID + ", attrID="
				+ attrID + ", attrValueID=" + attrValueID + ", sortOrder="
				+ sortOrder + ", createTime=" + createTime + ", uid=" + uid
				+ ", updateTime=" + updateTime + "]";
	}
}