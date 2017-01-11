package com.clinic.persistence;

import java.util.List;
import java.util.Map;

import com.clinic.domain.Treatment;
import com.clinic.domain.TreatmentDetailVo;

public interface TreatmentDao {

	public List<Treatment> findTreatmentByPersonId(int personId);
	
	public int insert(Treatment treatment);

	public List<Treatment> findFinishedTreatment();

	public List<Treatment> findTreatment(Map<String, Object>  map);
	
	public List<Treatment> findTreatmentById(Integer id);

	public List<TreatmentDetailVo> findTreatmentDetailById(int treatmentId);
}
