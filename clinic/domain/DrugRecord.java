package com.clinic.domain;
/**
 * ҩƷ��¼��һ��ҩƷ�嵥��Ӧ����ҩƷ��¼
 * @author youlin
 *
 */
public class DrugRecord {
	private int id;
	// �����嵥id
	private int drugListId;
	// ����ҩƷid
	private int drugId;
	// ҩƷ��������
	private int number;
	// ҩƷ��¼��Ӧ�ļ۸�
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
