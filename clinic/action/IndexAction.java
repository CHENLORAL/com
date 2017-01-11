package com.clinic.action;

import java.util.List;

import com.clinic.domain.Person;
import com.clinic.domain.Registration;
import com.clinic.domain.Revenue;
import com.clinic.domain.Treatment;
import com.clinic.persistence.DataFactory;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport  {
	private String name = "";
	private String password = "";
	private String repassword = "";
	private String sex = "";
	private String telephone = "";
	private String address = "";
	private List<Treatment> treatmentRecords;
	private List<Registration> untreatedRegistrations;
	private List<Treatment> finishedTreatments;
	private List<Revenue> revenues;
	
	public static final String USER_SESSION = "user_session";
	public static final String IS_ADMIN = "is_admin";

	public String execute() {
		DataFactory dataFactory = new DataFactory();
		System.out.println("µÇÂ¼ÓÃ»§: " + name);
		System.out.println("ÃÜÂë: " + password);
		if (name.equalsIgnoreCase("") || password.equalsIgnoreCase("")) {
			return "index";
		}
		Person patient = new Person();
		patient = dataFactory.checkLoginUser(name, password);
		if (patient == null) {
			return "index";
		}
		ActionContext.getContext().getSession().put(USER_SESSION, patient);
		treatmentRecords = dataFactory.findTreatmentByPersonId(patient.getId());
		return "success";
	}
	
	public String register() {
		if (name.equalsIgnoreCase("") || password.equalsIgnoreCase("") 
				|| repassword.equalsIgnoreCase("") || !password.equals(repassword)) {
			return "error";
		}
		Person patient = new Person();
		patient.setName(name);
		patient.setPassword(password);
		patient.setSex(sex);
		patient.setTelephone(telephone);
		patient.setAddress(address);
		
		DataFactory dataFactory = new DataFactory();
		dataFactory.insertPerson(patient);
		return "success";
	}
	
	public String adminLogin() {
		DataFactory dataFactory = new DataFactory();
		System.out.println("µÇÂ¼ÓÃ»§: " + name);
		System.out.println("ÃÜÂë: " + password);
		if ("Admin".equalsIgnoreCase(name) || "123456".equalsIgnoreCase(password)) {
			untreatedRegistrations = dataFactory.findUntreatedRegistration();
			finishedTreatments = dataFactory.findFinishedTreatment();
			revenues = dataFactory.selectAllRevenue();
			ActionContext.getContext().getSession().put(USER_SESSION, null);
			ActionContext.getContext().getSession().put(IS_ADMIN, true);
			return "success";
		}
		return "index";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static String getUserSession() {
		return USER_SESSION;
	}

	public List<Treatment> getTreatmentRecords() {
		return treatmentRecords;
	}

	public void setTreatmentRecords(List<Treatment> treatmentRecords) {
		this.treatmentRecords = treatmentRecords;
	}

	public List<Registration> getUntreatedRegistrations() {
		return untreatedRegistrations;
	}

	public void setUntreatedRegistrations(List<Registration> untreatedRegistrations) {
		this.untreatedRegistrations = untreatedRegistrations;
	}

	public List<Treatment> getFinishedTreatments() {
		return finishedTreatments;
	}

	public void setFinishedTreatments(List<Treatment> finishedTreatments) {
		this.finishedTreatments = finishedTreatments;
	}

	public static String getIsAdmin() {
		return IS_ADMIN;
	}

	public List<Revenue> getRevenues() {
		return revenues;
	}

	public void setRevenues(List<Revenue> revenues) {
		this.revenues = revenues;
	}
}
