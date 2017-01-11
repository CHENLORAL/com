package com.clinic.domain;

import java.util.Date;

/**
 * 药品清单
 * @author youlin
 *
 */
public class DrugList {
	private int id;
	// 对某人开的药品
	private int personId;
	// 对应就诊记录 id
	private int TreatmentId;
	// 开清单所对应的日期
	private Date date;
	// 药品清单所对应的费用
	private double listRevenue;
	// 开药品所针对的病情
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTreatmentId() {
		return TreatmentId;
	}
	public void setTreatmentId(int treatmentId) {
		TreatmentId = treatmentId;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public double getListRevenue() {
		return listRevenue;
	}
	public void setListRevenue(double listRevenue) {
		this.listRevenue = listRevenue;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
