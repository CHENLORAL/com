package com.clinic.domain;
/**
 * ҩƷ
 * @author youlin
 *
 */
public class Drug {
	private int id;
	private String name;
	// ҩƷ�ĳɱ�
	private double firstCost;
	// ҩƷ����
	private double salePrice;
	// ҩƷʣ������
	private int number;
	// ҩƷ����
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
