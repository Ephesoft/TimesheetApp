package com.ephesoft.timesheet.ui;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ephesoft.timesheet.core.ApplicationException;
import com.ephesoft.timesheet.core.model.ResponseCode;
import com.ephesoft.timesheet.core.model.User;
import com.ephesoft.timesheet.services.UserService;

@Controller
public class RegistrationController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/register", method = { RequestMethod.POST })
	public String saveData(HttpServletRequest request, Model model) {

		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String userName = request.getParameter("username");
		User user1 = new User();
		user1.setFirstName(firstName);
		user1.setLastName(lastName);
		user1.setEmail(email);
		user1.setPassword(password);
		user1.setUserName(userName);

		try {
			user1 = userService.addDetails(user1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("User", user1);
		return "/select.jsp";
	}
}
