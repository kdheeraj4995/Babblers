package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
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

	/* Retrieve logged in User Details */
	public User viewUser(HttpSession session) {
		return usersDAO.viewUser((int) session.getAttribute("userid"));
	}
	
	public String  getAllUsers() 
	{
		List<User> list=usersDAO.UserList();
		Gson gson=new Gson();
		String data=gson.toJson(list);
		return data;
	}
}
