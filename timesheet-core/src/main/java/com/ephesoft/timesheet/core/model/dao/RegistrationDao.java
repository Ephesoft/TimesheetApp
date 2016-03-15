/*package com.ephesoft.timesheet.core.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ephesoft.timesheet.core.model.Registration;

@Repository
@Transactional
public class RegistrationDao extends AbstractJpaDao {

	public Registration saveData(String firstName, String lastName,String password, String email, String contact) {
		Registration registration = new Registration();
		registration.setFirstrName(firstName);
		registration.setLastName(lastName);
		registration.setPassword(password);
		registration.setEmail(email);
		registration.setContactNo(contact);
		em.persist(registration);
		return registration;

	}
}
*/