package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.Forum;
import com.niit.service.ForumService;

@RestController
public class ForumRestController {
	
	@Autowired
	private ForumService forumService;

	@PostMapping("/CreateForum")
	public void CreateForum(@RequestBody Forum forum) {
		forumService.createForum(forum);
	}
	
}
