/*package com.ephesoft.timesheet.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ephesoft.timesheet.core.model.Registration;
import com.ephesoft.timesheet.core.model.User;
import com.ephesoft.timesheet.core.model.dao.RegistrationDao;
import com.ephesoft.timesheet.services.RegistrationServices;

@Service
public class DefaultRegisterService implements RegistrationServices {

	@Autowired
	RegistrationDao registrationDao;

	@Override
	public Registration addDetails(String firstName, String lastName,
			String password, String email, String contact) {
		Registration registration = registrationDao.saveData(firstName,
				lastName, password, email, contact);
		return registration;

	}

	@Override
	public Registration getUserByName(long firstName) {
		// TODO Auto-generated method stub
		return Registration.findOne(Registration.class, firstName);
	}

}
*/