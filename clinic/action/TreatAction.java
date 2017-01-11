package com.clinic.action;

import java.util.List;

import com.clinic.domain.Drug;
import com.clinic.domain.DrugRecord;
import com.clinic.domain.DrugRecordVo;
import com.clinic.domain.Registration;
import com.clinic.domain.TreatmentDetailVo;
import com.clinic.persistence.DataFactory;
import com.opensymphony.xwork2.ActionSupport;

public class TreatAction extends ActionSupport  {
	private String registrationId = "";
	private String treatmentId = "";
	private Registration registration;
	private List<Drug> drugList;
	private TreatmentDetailVo treatmentDetailVo;
	private List<DrugRecordVo> drugRecords;
	
	public String openTreatmentPage() {
		DataFactory dataFactory = new DataFactory();
		
		drugList = dataFactory.selectAllDrug();
		registration = dataFactory.selectRegistrationById(Integer.parseInt(registrationId));
		return "success";
	}
	
	public String openTreatmentDetailPage() {
		DataFactory dataFactory = new DataFactory();
		
		drugList = dataFactory.selectAllDrug();
		drugRecords = dataFactory.findDrugRecordByTreatmentId(Integer.parseInt(treatmentId));
		treatmentDetailVo = dataFactory.findTreatmentDetailById(Integer.parseInt(treatmentId));
		return "success";
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public List<Drug> getDrugList() {
		return drugList;
	}

	public void setDrugList(List<Drug> drugList) {
		this.drugList = drugList;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	public String getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(String treatmentId) {
		this.treatmentId = treatmentId;
	}

	public TreatmentDetailVo getTreatmentDetailVo() {
		return treatmentDetailVo;
	}

	public void setTreatmentDetailVo(TreatmentDetailVo treatmentDetailVo) {
		this.treatmentDetailVo = treatmentDetailVo;
	}

	public List<DrugRecordVo> getDrugRecords() {
		return drugRecords;
	}

	public void setDrugRecords(List<DrugRecordVo> drugRecords) {
		this.drugRecords = drugRecords;
	}
}
