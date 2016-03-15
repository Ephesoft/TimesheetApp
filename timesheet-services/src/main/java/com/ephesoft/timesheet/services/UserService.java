package com.ephesoft.timesheet.services;

import com.ephesoft.timesheet.core.ApplicationException;
import com.ephesoft.timesheet.core.model.User;

public interface UserService {

	public User getUserById(long id);

	public User getUserByName(long firstName);

	public User validateUser(String username, String password)
			throws ApplicationException;

	public User addDetails(User user1);
}
