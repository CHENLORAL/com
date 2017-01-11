package com.clinic.domain;

import java.util.Date;

/**
 * 挂号记录
 * @author youlin
 *
 */
public class Registration {
	// id
	private int id;
	// 挂号人员id
	private int personId;
	// 挂号日期
	private Date date;
	// 挂号费用
	private double registrationFee;
	// 就诊人病情描述
	private String healthDescription;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	public String getHealthDescription() {
		return healthDescription;
	}
	public void setHealthDescription(String healthDescription) {
		this.healthDescription = healthDescription;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
