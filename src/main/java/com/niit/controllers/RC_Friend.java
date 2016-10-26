package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.service.UsersService;

@RestController
public class RC_Friend {

	@Autowired
	private UsersService usersService;
	
	@GetMapping("/userList")
	public String getallUsers()
	{
		return usersService.getAllUsers();
	}
}
