package com.clinic.persistence;

import java.util.List;

import com.clinic.domain.Revenue;

public interface RevenueDao {

	public int insert(Revenue revenue);

	public List<Revenue> selectAll();
}
