package com.clinic.persistence;

import java.util.List;

import com.clinic.domain.TreatedVisit;
import com.clinic.domain.Treatment;


public interface TreatedVisitDao {
	
	public int insert(TreatedVisit treatedVisit);

	public List<TreatedVisit> findTreatedVisitByTreatmentId(int treatmentId);

}
