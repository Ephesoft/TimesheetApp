package com.ephesoft.timesheet.ui;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ephesoft.timesheet.core.model.Registration;
import com.ephesoft.timesheet.core.model.dao.RegistrationDao;

public class RegistrationController {

	@SuppressWarnings("unused")
	@RequestMapping(value = "/register", method = { RequestMethod.POST })
	public void register(HttpServletRequest request, Model model) {

		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String dob = request.getParameter("dob");
		String contact = request.getParameter("contact");
		Registration registration = new Registration();
		registration.setFirstrName(firstName);
		registration.setLastName(lastName);
		registration.setEmail(email);
		registration.setPassword(password);
		registration.setDob(dob);
		registration.setContactNo(contact);
		
	}
}
