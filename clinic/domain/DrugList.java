package com.clinic.domain;

import java.util.Date;

/**
 * ҩƷ�嵥
 * @author youlin
 *
 */
public class DrugList {
	private int id;
	// ��ĳ�˿���ҩƷ
	private int personId;
	// ��Ӧ�����¼ id
	private int TreatmentId;
	// ���嵥����Ӧ������
	private Date date;
	// ҩƷ�嵥����Ӧ�ķ���
	private double listRevenue;
	// ��ҩƷ����ԵĲ���
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
