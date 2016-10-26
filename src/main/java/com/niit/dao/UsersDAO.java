package com.niit.dao;

import java.util.List;

import com.niit.models.User;

public interface UsersDAO {
	
	/*Used for creating or updating user*/
	public void saveOrUpdate(User users);
	
	/*	Used for deleting user*/
	public void delete(User user);
	
	/*Used to retrieve single user based on username*/
	public User getUser(String username);
	
	/* Retrieveuser details based on id */
	public User viewUser(int userid);
	
	/*Retrieve user list*/
	public List<User> UserList();
}
