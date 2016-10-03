 package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.User;
import com.niit.service.UsersService;

@RestController
public class RC_Users {
	
	@Autowired
	private UsersService usersService;
	
	
	@PostMapping("/PostService")
	public void PostService(@RequestBody User user) {
		usersService.UserRegistration(user);
	}
}
