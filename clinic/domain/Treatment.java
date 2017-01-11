package com.clinic.domain;

import java.util.Date;

/**
 * 会诊记录
 * @author youlin
 *
 */
public class Treatment {
	private int id;
	// 就诊人
	private int personId;
	// 挂号记录id
	private int registrationId;
	// 就诊时间
	private Date date;
	// 就诊人病情描述
	private String healthDescription;
	// 就诊人病情描述
	private String suggestion;
	
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
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHealthDescription() {
		return healthDescription;
	}
	public void setHealthDescription(String healthDescription) {
		this.healthDescription = healthDescription;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
}
