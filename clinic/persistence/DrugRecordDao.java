package com.clinic.persistence;

import java.util.List;

import com.clinic.domain.DrugRecord;
import com.clinic.domain.DrugRecordVo;

public interface DrugRecordDao {

	public int insert(DrugRecord drugRecord);

	public List<DrugRecordVo> findDrugRecordByTreatmentId(int treatmentId);
}
