package com.niit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.service.ForumService;
import com.niit.service.UsersService;

@Controller
public class Navigation {
	
	@Autowired
	private UsersService usersService;
	
	@Autowired
	private ForumService forumService;
	
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
	
	@RequestMapping("blog")
	public String Blog(Model m)
	{
		m.addAttribute("BlogClicked", "true");
		return "Home";
	}
	
	@RequestMapping("forum")
	public String Forum(Model m)
	{
		m.addAttribute("ForumClicked", "true");
		return "Home";
	}
	
	@RequestMapping("forum/{fid}")
	public String ViewIndividualForum(@PathVariable("fid") int fid,  Model m)
	{
		m.addAttribute("forumList", forumService.getSingleForum(fid));
		m.addAttribute("IndividualForum", "true");
		return "Home";
	}
	
	@RequestMapping("chat")
	public String Chat(Model m)
	{
		m.addAttribute("ChatClicked", "true");
		return "Home";
	}
}
  