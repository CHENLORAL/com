package com.clinic.persistence;

import java.util.List;
import java.util.Map;

import com.clinic.domain.DrugList;

public interface DrugListDao {

	public int insert(DrugList drugList);

	public List<DrugList> findDrugList(Map map);
}
