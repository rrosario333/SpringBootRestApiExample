package com.example.springboot.model.res;

public class Response {
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public MessageSegment getMessageSegment() {
		return messageSegment;
	}
	public void setMessageSegment(MessageSegment messageSegment) {
		this.messageSegment = messageSegment;
	}
	public InsuranceAdditionalInformation getInsuranceAdditionalInformation() {
		return insuranceAdditionalInformation;
	}
	public void setInsuranceAdditionalInformation(InsuranceAdditionalInformation insuranceAdditionalInformation) {
		this.insuranceAdditionalInformation = insuranceAdditionalInformation;
	}
	public Paitent getPaitent() {
		return paitent;
	}
	public void setPaitent(Paitent paitent) {
		this.paitent = paitent;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public CoordinationOfBenefits getCoordinationOfBenefits() {
		return coordinationOfBenefits;
	}
	public void setCoordinationOfBenefits(CoordinationOfBenefits coordinationOfBenefits) {
		this.coordinationOfBenefits = coordinationOfBenefits;
	}
	private ResponseHeader responseHeader;
	private MessageSegment messageSegment;
	private InsuranceAdditionalInformation insuranceAdditionalInformation;
	private Paitent paitent;
	private Status status;
	private CoordinationOfBenefits coordinationOfBenefits;

}
