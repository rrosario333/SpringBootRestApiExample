package com.example.springboot.model.req;

public class RequestHeader {
	public String getBinNumber() {
		return binNumber;
	}
	public void setBinNumber(String binNumber) {
		this.binNumber = binNumber;
	}
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
	public String getProcessControlNumber() {
		return processControlNumber;
	}
	public void setProcessControlNumber(String processControlNumber) {
		this.processControlNumber = processControlNumber;
	}
	public String getTransactionCount() {
		return transactionCount;
	}
	public void setTransactionCount(String transactionCount) {
		this.transactionCount = transactionCount;
	}
	public String getServiceProviderIdQualifier() {
		return serviceProviderIdQualifier;
	}
	public void setServiceProviderIdQualifier(String serviceProviderIdQualifier) {
		this.serviceProviderIdQualifier = serviceProviderIdQualifier;
	}
	public String getServiceProviderId() {
		return serviceProviderId;
	}
	public void setServiceProviderId(String serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}
	public String getDateOfService() {
		return dateOfService;
	}
	public void setDateOfService(String dateOfService) {
		this.dateOfService = dateOfService;
	}
	public String getSoftwareVendorCertificationId() {
		return softwareVendorCertificationId;
	}
	public void setSoftwareVendorCertificationId(String softwareVendorCertificationId) {
		this.softwareVendorCertificationId = softwareVendorCertificationId;
	}
	private String binNumber;
	private String versionReleaseNumber;
	private String transactionCode;
	private String processControlNumber;
	private String transactionCount;
	private String serviceProviderIdQualifier;
	private String serviceProviderId;
	private String dateOfService;
	private String softwareVendorCertificationId;


}
