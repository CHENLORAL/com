package com.clinic.persistence;

import java.util.List;

import com.clinic.domain.Registration;

public interface RegistrationDao {
	
	public int insert(Registration registration);
	
	public List<Registration> findUntreatedRegistration();
	
	public List<Registration> selectRegistrationById(int registrationId);
}
