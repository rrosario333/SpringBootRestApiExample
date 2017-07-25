package com.example.springboot.model.res;

public class Status {
	public String getTransactionResposneStatus() {
		return transactionResposneStatus;
	}
	public void setTransactionResposneStatus(String transactionResposneStatus) {
		this.transactionResposneStatus = transactionResposneStatus;
	}
	public String getRejectCount() {
		return rejectCount;
	}
	public void setRejectCount(String rejectCount) {
		this.rejectCount = rejectCount;
	}
	public String getRejectCode() {
		return rejectCode;
	}
	public void setRejectCode(String rejectCode) {
		this.rejectCode = rejectCode;
	}
	public String getAdditionalMessageInformationCount() {
		return additionalMessageInformationCount;
	}
	public void setAdditionalMessageInformationCount(String additionalMessageInformationCount) {
		this.additionalMessageInformationCount = additionalMessageInformationCount;
	}
	public String getAdditionalMessageInformationQualifier() {
		return additionalMessageInformationQualifier;
	}
	public void setAdditionalMessageInformationQualifier(String additionalMessageInformationQualifier) {
		this.additionalMessageInformationQualifier = additionalMessageInformationQualifier;
	}
	public String getAdditionalMessageInformation() {
		return additionalMessageInformation;
	}
	public void setAdditionalMessageInformation(String additionalMessageInformation) {
		this.additionalMessageInformation = additionalMessageInformation;
	}
	private String transactionResposneStatus;
	private String rejectCount;
	private String rejectCode;
	private String additionalMessageInformationCount;
	private String additionalMessageInformationQualifier;
	private String additionalMessageInformation;


}
