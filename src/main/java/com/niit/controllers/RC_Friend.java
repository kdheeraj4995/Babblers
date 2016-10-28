package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.User;
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
	
	@GetMapping("/profiledata/{id}")
	public ResponseEntity<User> profileimage(@PathVariable("id") int id)
	{
		User user=usersService.viewUser(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
