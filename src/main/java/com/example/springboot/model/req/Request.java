package com.example.springboot.model.req;

public class Request {
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(RequestHeader requestHeader) {
		this.requestHeader = requestHeader;
	}
	public Paitent getPaitent() {
		return paitent;
	}
	public void setPaitent(Paitent paitent) {
		this.paitent = paitent;
	}
	public Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	private RequestHeader requestHeader;
	private Paitent paitent;
	private Insurance insurance;
}
