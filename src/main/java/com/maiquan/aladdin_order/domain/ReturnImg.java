package com.maiquan.aladdin_order.domain;

import java.io.Serializable;
import java.util.Date;

public class ReturnImg implements Serializable{

	private static final long serialVersionUID = 8114990128057878181L;

	private Integer ID;

    private Integer returnID;

    private Integer returnType;

    private String status;

    private String imgPath;

    private Integer mqID;

    private Integer sortOrder;

    private Date createTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getReturnID() {
        return returnID;
    }

    public void setReturnID(Integer returnID) {
        this.returnID = returnID;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
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

    public Integer getMqID() {
        return mqID;
    }

    public void setMqID(Integer mqID) {
        this.mqID = mqID;
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

	@Override
	public String toString() {
		return "ReturnImg [ID=" + ID + ", returnID=" + returnID
				+ ", returnType=" + returnType + ", status=" + status
				+ ", imgPath=" + imgPath + ", mqID=" + mqID + ", sortOrder="
				+ sortOrder + ", createTime=" + createTime + "]";
	}
}