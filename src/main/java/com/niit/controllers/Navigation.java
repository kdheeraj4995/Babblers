
package com.niit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Navigation {
	@RequestMapping("/")
	public String Homepage(HttpSession session) {
		session.setAttribute("user","kdheeraj");
		return "Home";
	}
}
