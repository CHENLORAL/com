package com.clinic.persistence;

import java.util.List;
import java.util.Map;

import com.clinic.domain.Drug;

public interface DrugDao {

	public List<Drug> selectAll();
	
	public List<Drug> selectDrugById(int id);
	
	public int updateDrug(Drug drug);

	public List<Drug> findDrugById(int drugId);
}
