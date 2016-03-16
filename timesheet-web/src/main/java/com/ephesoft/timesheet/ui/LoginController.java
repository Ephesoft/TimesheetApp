package com.ephesoft.timesheet.ui;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ephesoft.timesheet.core.ApplicationException;
import com.ephesoft.timesheet.core.model.User;
import com.ephesoft.timesheet.services.UserService;

@Controller
public class LoginController {
	
	protected static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired UserService userService;

    @RequestMapping(value = "/u/{userId}", method = { RequestMethod.GET })
    public String getDeals(@PathVariable("userId") long userId, HttpServletRequest request, Model model) {
    	User user = null;
		try {
			user = userService.validateUser("", "");
		} catch (ApplicationException e) {
			logger.error(e.getMessage(), e);
			//TODO: Throw Exception.
		}
    	user = new User();
    	user.setId(userId);
        model.addAttribute("user", user);
        return "index";

    }
    
    @ResponseBody
    @RequestMapping(value = "/u/ajax/{userId}", method = { RequestMethod.POST })
    public User getDealsAjax(@PathVariable("userId") long userId, HttpServletRequest request, Model model) {
    	User user = null;
		try {
			user = userService.validateUser("", "");
		} catch (ApplicationException e) {
			logger.error(e.getMessage(), e);
			//TODO: Throw Exception.
		}
    	user = new User();
    	user.setId(userId);
        return user;

    }

}
