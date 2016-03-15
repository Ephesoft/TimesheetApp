package com.ephesoft.timesheet.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ephesoft.timesheet.core.ApplicationException;
import com.ephesoft.timesheet.core.model.ResponseCode;
import com.ephesoft.timesheet.core.model.User;
import com.ephesoft.timesheet.core.model.dao.UserDao;
import com.ephesoft.timesheet.services.UserService;

@Service
public class DefaultUserService implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public User getUserById(long id) {
		return userDao.findOne(User.class, id);
	}

	@Override
	public User getUserByName(long firstName) {
		return User.findOne(User.class, firstName);
	}

	@Override
	public User validateUser(String userName, String password)
			throws ApplicationException {
		User user = userDao.validateUser(userName, password);
		if (user == null) {
			throw new ApplicationException(ResponseCode.UNAUTHORISED);
		}
		return user;
	}

	@Override
	public User addDetails(User user1) {
		User user = userDao.saveData(user1);
		return user1;
	}

}
