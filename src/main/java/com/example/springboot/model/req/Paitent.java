package com.example.springboot.model.req;

public class Paitent {
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPatientGenderCode() {
		return patientGenderCode;
	}
	public void setPatientGenderCode(String patientGenderCode) {
		this.patientGenderCode = patientGenderCode;
	}
	public String getPatientFirstName() {
		return patientFirstName;
	}
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public String getPatientZipCode() {
		return patientZipCode;
	}
	public void setPatientZipCode(String patientZipCode) {
		this.patientZipCode = patientZipCode;
	}
	private String dateOfBirth;
	private String patientGenderCode;
	private String patientFirstName;
	private String patientLastName;
	private String patientZipCode;

}
