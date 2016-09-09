package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.UsersDAO;
import com.niit.models.Users;

@Repository("usersServiceDAO")
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO usersDAO;
	
	public void UserRegistration(Users users) {
		usersDAO.saveOrUpdate(users);
	}


}
