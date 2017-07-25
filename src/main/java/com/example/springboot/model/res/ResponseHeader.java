package com.example.springboot.model.res;

public class ResponseHeader {
	public String getVersionReleaseNumber() {
		return versionReleaseNumber;
	}
	public void setVersionReleaseNumber(String versionReleaseNumber) {
		this.versionReleaseNumber = versionReleaseNumber;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getTransactionCount() {
		return transactionCount;
	}
	public void setTransactionCount(String transactionCount) {
		this.transactionCount = transactionCount;
	}
	public String getHeaderResponseStatus() {
		return headerResponseStatus;
	}
	public void setHeaderResponseStatus(String headerResponseStatus) {
		this.headerResponseStatus = headerResponseStatus;
	}
	public String getServiceProviderIdQualifier() {
		return serviceProviderIdQualifier;
	}
	public void setServiceProviderIdQualifier(String serviceProviderIdQualifier) {
		this.serviceProviderIdQualifier = serviceProviderIdQualifier;
	}
	public String getServiceProviderid() {
		return serviceProviderid;
	}
	public void setServiceProviderid(String serviceProviderid) {
		this.serviceProviderid = serviceProviderid;
	}
	public String getDateOfService() {
		return dateOfService;
	}
	public void setDateOfService(String dateOfService) {
		this.dateOfService = dateOfService;
	}
	private String versionReleaseNumber;
	private String transactionCode;
	private String transactionCount;
	private String headerResponseStatus;
	private String serviceProviderIdQualifier;
	private String serviceProviderid;
	private String dateOfService;


}
