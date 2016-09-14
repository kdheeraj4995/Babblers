package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.UsersDAO;
import com.niit.models.Users;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO usersDAO;
	
	public void UserRegistration(Users users) {
		
		/*User is enabled when he registers*/
		users.setEnabled("true");
		
		/*Default role after registration is User*/
		users.setRole("Role_USER");
		
		/*Registering new user*/
		usersDAO.saveOrUpdate(users);
	}
}
