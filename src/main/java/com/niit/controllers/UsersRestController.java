package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.Users;
import com.niit.service.UsersService;

@RestController
public class UsersRestController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value = "/PostService", method = RequestMethod.POST )
	public void PostService(@RequestBody Users users) {
		usersService.UserRegistration(users);
	}
}
