package com.clinic.domain;
/**
 * ҩƷ��¼Vo��һ��ҩƷ�嵥��Ӧ����ҩƷ��¼
 * @author youlin
 *
 */
public class DrugRecordVo {
	// ����ҩƷname
	private String name;
	// ҩƷ��������
	private int number;
	// ҩƷ��¼��Ӧ�ļ۸�
	private double recordRevenue;
	// ҩƷ�ɱ���
	private double firstCost;
	// ҩƷ����
	private double salePrice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getRecordRevenue() {
		return recordRevenue;
	}
	public void setRecordRevenue(double recordRevenue) {
		this.recordRevenue = recordRevenue;
	}
	public double getFirstCost() {
		return firstCost;
	}
	public void setFirstCost(double firstCost) {
		this.firstCost = firstCost;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
}
