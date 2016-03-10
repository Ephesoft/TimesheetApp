package com.ephesoft.timesheet.services.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ephesoft.timesheet.services.UserService;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/timesheet-services.xml");
		
		UserService userService = context.getBean(UserService.class);
		
		userService.getUserById(1L);
	}

}
