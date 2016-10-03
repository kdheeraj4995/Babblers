package com.niit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.niit.models.ForumComments;
import com.niit.service.ForumCommentsService;

@RestController
public class RC_ForumComment {
	
	@Autowired
	private ForumCommentsService forumCommentsService;
	
	
	@PostMapping("/ForumComments")
	public void ForumComments(@RequestBody ForumComments comment,HttpSession session) 
	{
		forumCommentsService.createForum(comment, session);
	}
	
	@GetMapping("/getAllComments")
	public String getAllComments()
	{          
		return forumCommentsService.getAllComments();
	}

}
