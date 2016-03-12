package com.maiquan.aladdin_supplier.domain;

import java.io.Serializable;
import java.util.Date;

public class Supplier implements Serializable{
	
	private static final long serialVersionUID = -983448555542444354L;

	private Integer ID;

    private String name;

    private String code;

    private Integer balanceCycle;

    private String companyName;

    private String address;

    private String contactName;

    private String contactPhone;

    private Long platformServiceFee;

    private String defaultTransfer;

    private String customerServicePhone;

    private String meiqiaCustomerServicePhone;

    private String returnAddress;

    private String returnContactName;

    private String returnContactPhone;

    private String o2oType;

    private String memberId;

    private Date insertTime;

    private Date updateTime;

    private String status;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getBalanceCycle() {
        return balanceCycle;
    }

    public void setBalanceCycle(Integer balanceCycle) {
        this.balanceCycle = balanceCycle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public Long getPlatformServiceFee() {
        return platformServiceFee;
    }

    public void setPlatformServiceFee(Long platformServiceFee) {
        this.platformServiceFee = platformServiceFee;
    }

    public String getDefaultTransfer() {
        return defaultTransfer;
    }

    public void setDefaultTransfer(String defaultTransfer) {
        this.defaultTransfer = defaultTransfer == null ? null : defaultTransfer.trim();
    }

    public String getCustomerServicePhone() {
        return customerServicePhone;
    }

    public void setCustomerServicePhone(String customerServicePhone) {
        this.customerServicePhone = customerServicePhone == null ? null : customerServicePhone.trim();
    }

    public String getMeiqiaCustomerServicePhone() {
        return meiqiaCustomerServicePhone;
    }

    public void setMeiqiaCustomerServicePhone(String meiqiaCustomerServicePhone) {
        this.meiqiaCustomerServicePhone = meiqiaCustomerServicePhone == null ? null : meiqiaCustomerServicePhone.trim();
    }

    public String getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(String returnAddress) {
        this.returnAddress = returnAddress == null ? null : returnAddress.trim();
    }

    public String getReturnContactName() {
        return returnContactName;
    }

    public void setReturnContactName(String returnContactName) {
        this.returnContactName = returnContactName == null ? null : returnContactName.trim();
    }

    public String getReturnContactPhone() {
        return returnContactPhone;
    }

    public void setReturnContactPhone(String returnContactPhone) {
        this.returnContactPhone = returnContactPhone == null ? null : returnContactPhone.trim();
    }

    public String getO2oType() {
        return o2oType;
    }

    public void setO2oType(String o2oType) {
        this.o2oType = o2oType == null ? null : o2oType.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
		return "Supplier [ID=" + ID + ", name=" + name + ", code=" + code
				+ ", balanceCycle=" + balanceCycle + ", companyName="
				+ companyName + ", address=" + address + ", contactName="
				+ contactName + ", contactPhone=" + contactPhone
				+ ", platformServiceFee=" + platformServiceFee
				+ ", defaultTransfer=" + defaultTransfer
				+ ", customerServicePhone=" + customerServicePhone
				+ ", meiqiaCustomerServicePhone=" + meiqiaCustomerServicePhone
				+ ", returnAddress=" + returnAddress + ", returnContactName="
				+ returnContactName + ", returnContactPhone="
				+ returnContactPhone + ", o2oType=" + o2oType + ", memberId="
				+ memberId + ", insertTime=" + insertTime + ", updateTime="
				+ updateTime + ", status=" + status + "]";
	}
}