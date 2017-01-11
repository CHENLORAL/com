package com.clinic.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.clinic.domain.Drug;
import com.clinic.domain.DrugList;
import com.clinic.domain.DrugRecord;
import com.clinic.domain.DrugRecordVo;
import com.clinic.domain.Person;
import com.clinic.domain.Registration;
import com.clinic.domain.Revenue;
import com.clinic.domain.TreatedVisit;
import com.clinic.domain.Treatment;
import com.clinic.domain.TreatmentDetailVo;


public class DataFactory {
	/**
	 * 方法描述：通过用户名找到用户信息
	 */
	public Person findPersonByName(String name) {
		if(name == null) {
			return null;
		}
		Person patient = new Person();
		SqlSession session = DBHelper.getSqlSession();
		List<Person> persons = session.getMapper(PersonDao.class).findPersonByName(name);
		if (persons.size() == 0) {
			session.close();
			return null;
		} else {
			patient = persons.get(0);
		}
		session.close();
		return patient;
	}

	public Person checkLoginUser(String name, String password) {
		if(name == null || password == null) {
			return null;
		}
		Person patient = findPersonByName(name);
		if (patient!=null && password!=null && password.equals(patient.getPassword())) {
			return patient;
		} else {
			return null;
		}
	}

	// 插入不指定用户id的记录, 即用户id 按照数据库自己递增
	public boolean insertPerson(Person patient) {
		SqlSession session = DBHelper.getSqlSession();
		session.getMapper(PersonDao.class).insert(patient);
		session.commit();
		session.close();
		return true;
	}

	// 插入不指定用户id的记录, 即用户id 按照数据库自己递增
	public List<Treatment> findTreatmentByPersonId(int personId) {
		List<Treatment> treatmentRecords = new ArrayList<Treatment>();
		SqlSession session = DBHelper.getSqlSession();
		treatmentRecords = session.getMapper(TreatmentDao.class).findTreatmentByPersonId(personId);
		session.close();
		return treatmentRecords;
	}
	

	// 插入不指定挂号id的记录
	public boolean insertRegistration(Registration registration) {
		SqlSession session = DBHelper.getSqlSession();
		session.getMapper(RegistrationDao.class).insert(registration);
		session.commit();
		session.close();
		return true;
	}
	/**
	 * 方法描述：找到未就诊挂号清单
	 */
	public List<Registration> findUntreatedRegistration() {
		SqlSession session = DBHelper.getSqlSession();
		List<Registration> registrations = session.getMapper(RegistrationDao.class).findUntreatedRegistration();
		session.close();
		return registrations;
	}
	/**
	 * 方法描述：找到已就诊清单
	 */
	public List<Treatment> findFinishedTreatment() {
		SqlSession session = DBHelper.getSqlSession();
		List<Treatment> finishedTreatments = session.getMapper(TreatmentDao.class).findFinishedTreatment();
		session.close();
		return finishedTreatments;
	}
	/**
	 * 方法描述：找到所有药物
	 */
	public List<Drug> selectAllDrug() {
		SqlSession session = DBHelper.getSqlSession();
		List<Drug> drugList = session.getMapper(DrugDao.class).selectAll();
		session.close();
		return drugList;
	}
	/**
	 * 方法描述：找到特定挂号单
	 */
	public Registration selectRegistrationById(int registrationId) {
		SqlSession session = DBHelper.getSqlSession();
		List<Registration> registrationList = session.getMapper(RegistrationDao.class).selectRegistrationById(registrationId);
		if (registrationList == null || registrationList.size()==0) {
			session.close();
			return null;
		}
		Registration registration = registrationList.get(0);
		session.close();
		return registration;
	}

	public boolean insertTreatment(Treatment treatment) {
		SqlSession session = DBHelper.getSqlSession();
		session.getMapper(TreatmentDao.class).insert(treatment);
		session.commit();
		session.close();
		return true;
	}

	public Treatment findTreatment(int personId, int registrationId) {
		SqlSession session = DBHelper.getSqlSession();
		Map<String, Object>  map = new HashMap<String, Object> ();
		map.put("personId", personId);
		map.put("registrationId", registrationId);
		List<Treatment> treatmentList = session.getMapper(TreatmentDao.class).findTreatment(map);
		if (treatmentList == null || treatmentList.size()==0) {
			session.close();
			return null;
		}
		Treatment treatment = treatmentList.get(0);
		session.close();
		return treatment;
	}

	public Drug findDrugById(int drugId) {
		SqlSession session = DBHelper.getSqlSession();
		Map<String, Object> map = new HashMap<String, Object>();
		List<Drug> drugList = session.getMapper(DrugDao.class).findDrugById(drugId);
		if (drugList == null || drugList.size()==0) {
			session.close();
			return null;
		}
		Drug drug = drugList.get(0);
		session.close();
		return drug;
	}

	public boolean updateDrug(Drug drug) {
		SqlSession session = DBHelper.getSqlSession();
		session.getMapper(DrugDao.class).updateDrug(drug);
		session.commit();
		session.close();
		return true;
	}

	public boolean insertDrugList(DrugList drugRecords) {
		SqlSession session = DBHelper.getSqlSession();
		session.getMapper(DrugListDao.class).insert(drugRecords);
		session.commit();
		session.close();
		return true;
	}

	public DrugList findDrugList(int treatmentId, int personId) {
		SqlSession session = DBHelper.getSqlSession();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("personId", personId);
		map.put("treatmentId", treatmentId);
		List<DrugList> drugList = session.getMapper(DrugListDao.class).findDrugList(map);
		if (drugList == null || drugList.size()==0) {
			session.close();
			return null;
		}
		DrugList drugRecords = drugList.get(0);
		session.close();
		return drugRecords;
	}

	public boolean insertDrugRecord(DrugRecord drugRecord) {
		SqlSession session = DBHelper.getSqlSession();
		session.getMapper(DrugRecordDao.class).insert(drugRecord);
		session.commit();
		session.close();
		return true;
	}

	public boolean insertRevenue(Revenue revenue) {
		SqlSession session = DBHelper.getSqlSession();
		session.getMapper(RevenueDao.class).insert(revenue);
		session.commit();
		session.close();
		return true;
	}

	public List<Revenue> selectAllRevenue() {
		SqlSession session = DBHelper.getSqlSession();
		List<Revenue> revenues = session.getMapper(RevenueDao.class).selectAll();
		session.close();
		return revenues;
	}

	public Treatment selectTreatmentById(int id) {
		SqlSession session = DBHelper.getSqlSession();
		List<Treatment> treatmentList = session.getMapper(TreatmentDao.class).findTreatmentById(id);
		if (treatmentList == null || treatmentList.size()==0) {
			session.close();
			return null;
		}
		Treatment treatment = treatmentList.get(0);
		session.close();
		return treatment;
	}

	public List<TreatedVisit> selectTreatedVisitById(int treatmentId) {
		SqlSession session = DBHelper.getSqlSession();
		List<TreatedVisit> treatedVisits = session.getMapper(TreatedVisitDao.class).findTreatedVisitByTreatmentId(treatmentId);
		session.close();
		return treatedVisits;
	}

	// 插入不指定用户id的记录, 即用户id 按照数据库自己递增
	public boolean insertTreatedVisit(TreatedVisit treatedVisit) {
		SqlSession session = DBHelper.getSqlSession();
		session.getMapper(TreatedVisitDao.class).insert(treatedVisit);
		session.commit();
		session.close();
		return true;
	}

	public List<DrugRecordVo> findDrugRecordByTreatmentId(int treatmentId) {
		SqlSession session = DBHelper.getSqlSession();
		List<DrugRecordVo> drugRecords = session.getMapper(DrugRecordDao.class).findDrugRecordByTreatmentId(treatmentId);
		session.close();
		return drugRecords;
	}

	public TreatmentDetailVo findTreatmentDetailById(int treatmentId) {
		SqlSession session = DBHelper.getSqlSession();
		List<TreatmentDetailVo> drugList = session.getMapper(TreatmentDao.class).findTreatmentDetailById(treatmentId);
		if (drugList == null || drugList.size()==0) {
			session.close();
			return null;
		}
		TreatmentDetailVo drugRecords = drugList.get(0);
		session.close();
		return drugRecords;
	}
}
