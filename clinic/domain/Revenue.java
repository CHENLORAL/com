package com.clinic.domain;

import java.util.Date;

/**
 * ����
 * @author youlin
 *
 */
public class Revenue {
	private int id;
	// �������Ӧ�ľ����¼
	private int treatmentId;
	// �Һŷ���
	private double registrationFee;
	// �����õ�����
	private Date date;
	// ���õ�����
	private double revenue;
	// ������֧����Ǯ
	private double totalCost;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
}
