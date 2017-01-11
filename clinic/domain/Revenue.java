package com.clinic.domain;

import java.util.Date;

/**
 * 收入
 * @author youlin
 *
 */
public class Revenue {
	private int id;
	// 该收入对应的就诊记录
	private int treatmentId;
	// 挂号费用
	private double registrationFee;
	// 收入获得的日期
	private Date date;
	// 所得的收入
	private double revenue;
	// 病人所支付的钱
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
