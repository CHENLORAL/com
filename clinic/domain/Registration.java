package com.clinic.domain;

import java.util.Date;

/**
 * �Һż�¼
 * @author youlin
 *
 */
public class Registration {
	// id
	private int id;
	// �Һ���Աid
	private int personId;
	// �Һ�����
	private Date date;
	// �Һŷ���
	private double registrationFee;
	// �����˲�������
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
