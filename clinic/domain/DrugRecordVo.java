package com.clinic.domain;
/**
 * 药品记录Vo，一个药品清单对应多条药品记录
 * @author youlin
 *
 */
public class DrugRecordVo {
	// 所开药品name
	private String name;
	// 药品开出数量
	private int number;
	// 药品记录对应的价格
	private double recordRevenue;
	// 药品成本价
	private double firstCost;
	// 药品卖价
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
