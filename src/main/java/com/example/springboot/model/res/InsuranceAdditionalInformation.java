package com.example.springboot.model.res;

public class InsuranceAdditionalInformation {
	public String getMedicarePartDCoverageCode() {
		return medicarePartDCoverageCode;
	}
	public void setMedicarePartDCoverageCode(String medicarePartDCoverageCode) {
		this.medicarePartDCoverageCode = medicarePartDCoverageCode;
	}
	public String getcMSLowIncomeCostSharing() {
		return cMSLowIncomeCostSharing;
	}
	public void setcMSLowIncomeCostSharing(String cMSLowIncomeCostSharing) {
		this.cMSLowIncomeCostSharing = cMSLowIncomeCostSharing;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getFormularyId() {
		return formularyId;
	}
	public void setFormularyId(String formularyId) {
		this.formularyId = formularyId;
	}
	public String getBenefitId() {
		return benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getNextMedicarePartDEffectiveDate() {
		return nextMedicarePartDEffectiveDate;
	}
	public void setNextMedicarePartDEffectiveDate(String nextMedicarePartDEffectiveDate) {
		this.nextMedicarePartDEffectiveDate = nextMedicarePartDEffectiveDate;
	}
	public String getNextMedicarePartDTerminationDate() {
		return nextMedicarePartDTerminationDate;
	}
	public void setNextMedicarePartDTerminationDate(String nextMedicarePartDTerminationDate) {
		this.nextMedicarePartDTerminationDate = nextMedicarePartDTerminationDate;
	}
	private String medicarePartDCoverageCode;
	private String cMSLowIncomeCostSharing;
	private String contractNumber;
	private String formularyId;
	private String benefitId;
	private String nextMedicarePartDEffectiveDate;
	private String nextMedicarePartDTerminationDate;

}
