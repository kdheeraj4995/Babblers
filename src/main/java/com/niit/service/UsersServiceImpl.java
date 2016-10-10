package com.niit.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.niit.dao.UsersDAO;
import com.niit.models.User;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO usersDAO;
	
	/*Creating new user*/
	public void UserRegistration(User user) 
	{
		user.setEnabled("1");       		/*User is enabled when he registers*/
		user.setRole("ROLE_USER");     /*Default role after registration is User*/
		usersDAO.saveOrUpdate(user);   		/*Registering new user*/
	}

	/*Used to save userid and name in session on Successfull Login*/
	public void LoginSuccess(HttpSession session) 
	{
		String username = SecurityContextHolder.getContext().getAuthentication().getName(); /*Get Logged in Username*/
		User user=usersDAO.getUser(username);												/*Get user object based on username*/
		
		/*saving session attributes*/
		session.setAttribute("userid",user.getUserid());
		session.setAttribute("name", user.getName());
	}

	
	public User viewUser(HttpSession session) {
		return usersDAO.viewUser((int) session.getAttribute("userid"));
	}
}
