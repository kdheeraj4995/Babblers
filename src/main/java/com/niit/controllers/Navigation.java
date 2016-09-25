package com.niit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.service.UsersService;

@Controller
public class Navigation {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value={"/","/Home"})
	public String Homepage()
	{
		return "Home";
	}
	@RequestMapping("/LoginSuccess")
	public String LoginSuccess(HttpSession session)
	{
		/*saving session attributes userid and name*/
		usersService.LoginSuccess(session);
		return "redirect:/Home";
	}
}
  