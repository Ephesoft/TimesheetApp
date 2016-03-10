package com.ephesoft.timesheet.core.model.dao;

import org.springframework.stereotype.Repository;

import com.ephesoft.timesheet.core.model.User;

@Repository
public class UserDao extends AbstractJpaDao {
	
	public User validateUser(String username, String password) {
		return null;
	}

}
