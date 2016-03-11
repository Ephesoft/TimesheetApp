package com.ephesoft.timesheet.ui;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ephesoft.timesheet.core.model.User;
import com.ephesoft.timesheet.services.UserService;

@Controller
public class LoginController {
	
	@Autowired UserService userService;

    @RequestMapping(value = "/u", method = { RequestMethod.GET })
    public String getDeals(HttpServletRequest request, Model model) {
    	User user = userService.validateUser("", "");
    	user = new User();
    	user.setId(23);
        model.addAttribute("user", user);
        return "user";

    }

}
