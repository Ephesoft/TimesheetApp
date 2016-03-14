package com.ephesoft.timesheet.core.model.dao;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ephesoft.timesheet.core.model.User;

@Repository

@NamedQueries({ @NamedQuery(name = "userData", query = "from user  where userName='?' ,password='?' ") })

public class UserDao extends AbstractJpaDao {

	public User validateUser(String username, String password) {
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u where u.userName = :userName and u.password = :password", User.class);
		query.setParameter("userName", username);
		query.setParameter("password", password);
		System.out.println(query.getParameters());
		User user = getSingleResult(query);
		return user;
	}

}
