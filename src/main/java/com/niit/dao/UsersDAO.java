package com.niit.dao;

import com.niit.models.User;

public interface UsersDAO {
	
	/*Used for creating or updating user*/
	public void saveOrUpdate(User users);
	
	/*	Used for deleting user*/
	public void delete(User user);
}
