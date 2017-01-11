package com.clinic.domain;
/**
 * 药品
 * @author youlin
 *
 */
public class Drug {
	private int id;
	private String name;
	// 药品的成本
	private double firstCost;
	// 药品卖价
	private double salePrice;
	// 药品剩余数量
	private int number;
	// 药品描述
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
