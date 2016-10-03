package com.niit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.Forum;
import com.niit.service.ForumService;

@RestController
public class RC_Forum {
	
	@Autowired
	private ForumService forumService;

	@PostMapping("/CreateForum")
	public void CreateForum(@RequestBody Forum forum,HttpSession session) 
	{
		forumService.createForum(forum,session);
	}
	
	@GetMapping("/getAllForums")
	public String getAllForums()
	{
		return forumService.getAllForums();
	}	
	
	@DeleteMapping("/deleteForum/{forumid}")
	public void deleteForum(@PathVariable("forumid") int forumid)
	{
		forumService.deleteForum(forumid);
	}
	
	@GetMapping("/editForum/{forumid}")
	public ResponseEntity<Forum> editForum(@PathVariable("forumid") int forumid)
	{
		Forum forum=forumService.editForum(forumid);
		return new ResponseEntity<Forum>(forum, HttpStatus.OK);
	}
}
