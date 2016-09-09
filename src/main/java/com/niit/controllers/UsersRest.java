package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.niit.models.Users;

@Controller
public class UsersRest {

	@RequestMapping(value="/Register", method = RequestMethod.POST)
	public @ResponseBody String RegisterUser(@RequestBody Users users) 
	{
		StringBuilder reponseData = new StringBuilder();
		reponseData.append("username: "+users.getUsername()+" ");
		reponseData.append("password: "+users.getPassword()+" ");
		reponseData.append("mobile: "+users.getMobile());
		
		return reponseData.toString();
	}
	
}
