package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.UsersDAO;
import com.niit.models.User;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO usersDAO;
	
	public void UserRegistration(User user) {
		
		user.setEnabled("true");       /*User is enabled when he registers*/
		user.setRole("Role_USER");     /*Default role after registration is User*/
		usersDAO.saveOrUpdate(user);   /*Registering new user*/
	}
}
