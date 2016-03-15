package com.ephesoft.timesheet.core.model.dao;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ephesoft.timesheet.core.model.User;

@Repository

@NamedQueries({ @NamedQuery(name = "userData", query = "from user  where userName='?' ,password='?' ") })
@Transactional
public class UserDao extends AbstractJpaDao {

	public User validateUser(String username, String password) {
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u where u.userName = :userName and u.password = :password", User.class);
		query.setParameter("userName", username);
		query.setParameter("password", password);
		System.out.println(query.getParameters());
		User user = getSingleResult(query);
		return user;
	}

	/*public User saveData(String firstName, String lastName,String password1, String email,String UserName) {
		User user = new User();
		user.setLastName(lastName);
		user.setPassword(password1);
		user.setEmail(email);
		user.setUserName(UserName);
		
}*/

	public User saveData(User user1) {
		em.persist(user1);
		return user1;
	}
}