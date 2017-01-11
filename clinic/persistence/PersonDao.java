package com.clinic.persistence;

import java.util.List;

import com.clinic.domain.Person;

public interface PersonDao {

	public int insert(Person person);
	
	public int update(Person person);
	
	public List<Person> findPersonByName(String name);
}
