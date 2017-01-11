package com.clinic.action;

import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.clinic.domain.Drug;
import com.clinic.domain.DrugList;
import com.clinic.domain.DrugRecord;
import com.clinic.domain.Registration;
import com.clinic.domain.Revenue;
import com.clinic.domain.TreatedVisit;
import com.clinic.domain.Treatment;
import com.clinic.persistence.DataFactory;
import com.opensymphony.xwork2.ActionSupport;

public class AjaxAction extends ActionSupport {
	
	private int personId;
	private int registrationId;
	private String healthDescription = "";
	private String treatedDescription = "";
	private int treatmentId;
	private String result;
	private String suggestion;
	private String drugList;
	
	public String addRegistration() throws Exception {
		DataFactory dataFactory = new DataFactory();
		
		Registration registration = new Registration();
		registration.setPersonId(personId);
		registration.setRegistrationFee(5);
		registration.setDate(new Date());
		registration.setHealthDescription(healthDescription);
		
		dataFactory.insertRegistration(registration);
		result = "挂号成功";
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		ServletActionContext.getResponse().getWriter().print(result);
		return null;
	}
	
	public String addTreatedVisit() throws Exception {
		DataFactory dataFactory = new DataFactory();
		
		TreatedVisit treatedVisit = new TreatedVisit();
		treatedVisit.setPersonId(personId);
		treatedVisit.setTreatmentId(treatmentId);
		treatedVisit.setDate(new Date());
		treatedVisit.setTreatedDescription(treatedDescription);
		
		dataFactory.insertTreatedVisit(treatedVisit);
		result = "添加诊后随访成功";
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		ServletActionContext.getResponse().getWriter().print(result);
		return null;
	}
	
	public String addTreatment() throws Exception {
		DataFactory dataFactory = new DataFactory();
		// 插入就诊记录
		Treatment treatment = new Treatment();
		treatment.setDate(new Date());
		treatment.setHealthDescription(healthDescription);
		treatment.setPersonId(personId);
		treatment.setRegistrationId(registrationId);
		treatment.setSuggestion(suggestion);
		dataFactory.insertTreatment(treatment);
		// 根据RegistrationId、PersonId 取出treatment
		treatment = dataFactory.findTreatment(personId, registrationId);
		// 插入drugList
		DrugList drugRecords = new DrugList();
		drugRecords.setPersonId(personId);
		drugRecords.setDate(new Date());
		drugRecords.setTreatmentId(treatment.getId());
		drugRecords.setDescription(healthDescription);
		double listRevenue = 0.0;
		double totalCost = 0.0;
		// 根据drugId取出drug，在修改drug数量
		String[] drugs = drugList.split(",");
		for (String drug : drugs) {
			int drugId = Integer.parseInt(drug.split(":")[0]);
			int number = Integer.parseInt(drug.split(":")[1]);
			Drug temp = dataFactory.findDrugById(drugId);
			int currentNumber = temp.getNumber() - number;
			temp.setNumber(currentNumber);
			listRevenue += number * (temp.getSalePrice() - temp.getFirstCost());
			totalCost += number * temp.getSalePrice();
			dataFactory.updateDrug(temp);
		}
		drugRecords.setListRevenue(listRevenue);
		dataFactory.insertDrugList(drugRecords);
		// 根据treatmentId、personId查找drugList,插入drugRecord
		drugRecords = dataFactory.findDrugList(treatment.getId(), personId);
		drugs = drugList.split(",");
		for (String drug : drugs) {
			int drugId = Integer.parseInt(drug.split(":")[0]);
			int number = Integer.parseInt(drug.split(":")[1]);
			DrugRecord drugRecord = new DrugRecord();
			drugRecord.setDrugId(drugId);
			drugRecord.setDrugListId(drugRecords.getId());
			drugRecord.setNumber(number);
			Drug temp = dataFactory.findDrugById(drugId);
			double recordRevenue = number * (temp.getSalePrice() - temp.getFirstCost());
			drugRecord.setRecordRevenue(recordRevenue);
			dataFactory.insertDrugRecord(drugRecord);
		}
		// 插入Reveue
		Revenue revenue = new Revenue();
		revenue.setDate(new Date());
		revenue.setRegistrationFee(5);
		revenue.setRevenue(listRevenue+5);
		revenue.setTreatmentId(treatment.getId());
		revenue.setTotalCost(totalCost);
		dataFactory.insertRevenue(revenue);
		
		result = "就诊完成";
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		ServletActionContext.getResponse().getWriter().print(result);
		return null;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getHealthDescription() {
		return healthDescription;
	}

	public void setHealthDescription(String healthDescription) {
		this.healthDescription = healthDescription;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public String getDrugList() {
		return drugList;
	}

	public void setDrugList(String drugList) {
		this.drugList = drugList;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public String getTreatedDescription() {
		return treatedDescription;
	}

	public void setTreatedDescription(String treatedDescription) {
		this.treatedDescription = treatedDescription;
	}

	public int getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(int treatmentId) {
		this.treatmentId = treatmentId;
	}
}
