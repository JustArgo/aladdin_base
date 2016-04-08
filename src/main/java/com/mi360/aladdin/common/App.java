package com.mi360.aladdin.common;

import java.io.Serializable;

public class App implements Serializable{

	private static final long serialVersionUID = -6506436726305068048L;
	
	private String appId;
	private String timeStamp;
	private String nonce;
	private String requestID;
	private String signature;
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getNonce() {
		return nonce;
	}
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}
	
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	@Override
	public String toString() {
		return "App [appId=" + appId + ", timeStamp=" + timeStamp + ", nonce="
				+ nonce + ", requestID=" + requestID + ", signature="
				+ signature + "]";
	}
	
	
	
	
	
}
