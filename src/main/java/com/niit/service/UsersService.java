package com.niit.service;

import javax.servlet.http.HttpSession;

import com.niit.models.User;


public interface UsersService {

	/*Creating new user*/
	public void UserRegistration(User user);
	
	/*Used to save userid and name in session on Successfull Login*/
	public void LoginSuccess(HttpSession session);
	
	public User viewUser(HttpSession session);
}
