
package com.niit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Navigation {
	@RequestMapping(value={"/","/Home"})
	public String Homepage()
	{
		return "Home";
	}
	@RequestMapping("/LoginSuccess")
	public String LoginSuccess(HttpSession session)
	{
		
		return "redirect:/Home";
	}
}
  