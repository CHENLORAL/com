package com.clinic.domain;
/**
 * 药品记录，一个药品清单对应多条药品记录
 * @author youlin
 *
 */
public class DrugRecord {
	private int id;
	// 所属清单id
	private int drugListId;
	// 所开药品id
	private int drugId;
	// 药品开出数量
	private int number;
	// 药品记录对应的价格
	private double recordRevenue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDrugListId() {
		return drugListId;
	}
	public void setDrugListId(int drugListId) {
		this.drugListId = drugListId;
	}
	public int getDrugId() {
		return drugId;
	}
	public double getRecordRevenue() {
		return recordRevenue;
	}
	public void setRecordRevenue(double recordRevenue) {
		this.recordRevenue = recordRevenue;
	}
	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
