package com.clinic.action;

import java.util.List;

import com.clinic.domain.TreatedVisit;
import com.clinic.domain.Treatment;
import com.clinic.persistence.DataFactory;
import com.opensymphony.xwork2.ActionSupport;

public class TreatedVisitAction extends ActionSupport {
	
	private String treatmentId;
	private Treatment treatment;
	private List<TreatedVisit> treatedVisits;
	
	public String openTreatedVisitPage() {
		DataFactory dataFactory = new DataFactory();
		
		treatment = dataFactory.selectTreatmentById(Integer.parseInt(treatmentId));
		treatedVisits = dataFactory.selectTreatedVisitById(Integer.parseInt(treatmentId));
		return "success";
	}
	
	public String openTreatedVisitHistoryPage() {
		DataFactory dataFactory = new DataFactory();
		
		treatment = dataFactory.selectTreatmentById(Integer.parseInt(treatmentId));
		treatedVisits = dataFactory.selectTreatedVisitById(Integer.parseInt(treatmentId));
		return "success";
	}


	public Treatment getTreatment() {
		return treatment;
	}

	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}

	public String getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(String treatmentId) {
		this.treatmentId = treatmentId;
	}


	public List<TreatedVisit> getTreatedVisits() {
		return treatedVisits;
	}


	public void setTreatedVisits(List<TreatedVisit> treatedVisits) {
		this.treatedVisits = treatedVisits;
	}
}
