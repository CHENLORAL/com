package com.clinic.domain;

import java.util.Date;

/**
 * ������
 * @author youlin
 *
 */
public class TreatedVisit {
	private int id;
	// ��Ӧ�ľ����¼
	private int treatmentId;
	// ��Ӧ�Ĳ���id
	private int personId;
	// ���ʱ �Բ��˵���������
	private String treatedDescription;
	// �������
	private Date date;
	
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
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getTreatedDescription() {
		return treatedDescription;
	}
	public void setTreatedDescription(String treatedDescription) {
		this.treatedDescription = treatedDescription;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
