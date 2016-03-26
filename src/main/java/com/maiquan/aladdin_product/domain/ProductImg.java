package com.maiquan.aladdin_product.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductImg implements Serializable{

	private static final long serialVersionUID = 1929462720516107517L;

	private Integer ID;

    private Integer productID;

    private String imgPos;

    private String status;

    private String imgPath;

    private Integer uid;

    private Integer sortOrder;

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

    public String getImgPos() {
        return imgPos;
    }

    public void setImgPos(String imgPos) {
        this.imgPos = imgPos == null ? null : imgPos.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	@Override
	public String toString() {
		return "ProductImg [ID=" + ID + ", productID=" + productID
				+ ", imgPos=" + imgPos + ", status=" + status + ", imgPath="
				+ imgPath + ", uid=" + uid + ", sortOrder=" + sortOrder
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}
}