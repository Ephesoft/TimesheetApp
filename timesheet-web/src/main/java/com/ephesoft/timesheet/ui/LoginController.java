package com.ephesoft.timesheet.ui;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
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
public class LoginController {
	
	protected static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired UserService userService;

    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String getDeals( HttpServletRequest request, Model model) throws ApplicationException {
    	
    	String userName = request.getParameter("usename");
    	String password = request.getParameter("password");
    	User user = null;
		try {
			user = userService.validateUser(userName, password);
		} catch (ApplicationException e) {
			logger.error(e.getMessage(), e);
			throw new ApplicationException(ResponseCode.UNAUTHORISED);
		}
        model.addAttribute("user", user);
        return "/index.jsp";

    }

}
