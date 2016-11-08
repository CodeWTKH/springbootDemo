package com.yisquare.domain;

import java.util.Date;

public class ErrorMsg {
	private Long msgId;
	private Long userId;
	private String userName;
	private String environment;
	private String serverId;
	private Date auditTimestamp;
	private Date timestamp;
	private String errorMessages;
	private String errStackTrace;
	private String serviceName;
	private String serviceStacks;
	
	public Long getMsgId() {
		return msgId;
	}
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public Date getAuditTimestamp() {
		return auditTimestamp;
	}
	public void setAuditTimestamp(Date auditTimestamp) {
		this.auditTimestamp = auditTimestamp;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessage(String errorMessages) {
		this.errorMessages = errorMessages;
	}
	public String getErrStackTrace() {
		return errStackTrace;
	}
	public void setErrStackTrace(String errStackTrace) {
		this.errStackTrace = errStackTrace;
	}
	public String getServiceStacks() {
		return serviceStacks;
	}
	public void setServiceStacks(String serviceStacks) {
		this.serviceStacks = serviceStacks;
	}
	
	
}