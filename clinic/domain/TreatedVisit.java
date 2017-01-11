package com.clinic.domain;

import java.util.Date;

/**
 * 诊后随访
 * @author youlin
 *
 */
public class TreatedVisit {
	private int id;
	// 对应的就诊记录
	private int treatmentId;
	// 对应的病人id
	private int personId;
	// 随访时 对病人的身体描述
	private String treatedDescription;
	// 随访日期
	private Date date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTreatmentId() {
		return treatmentId;
	}
	public void setTreatmentId(int treatmentId) {
		this.treatmentId = treatmentId;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getTreatedDescription() {
		return treatedDescription;
	}
	public void setTreatedDescription(String treatedDescription) {
		this.treatedDescription = treatedDescription;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
