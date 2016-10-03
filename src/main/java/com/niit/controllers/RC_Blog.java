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

import com.niit.models.Blog;
import com.niit.service.BlogService;

@RestController
public class RC_Blog {
	
	@Autowired
	private BlogService blogService;

	@PostMapping("/CreateBlog")
	public void CreateBlog(@RequestBody Blog blog,HttpSession session) 
	{
		blogService.createBlog(blog,session);
	}
	
	@GetMapping("/getAllBlogs")
	public String getAllBlogs()
	{
		return blogService.getAllBlogs();
	}	
	
	@DeleteMapping("/deleteBlog/{blogid}")
	public void deleteBlog(@PathVariable("blogid") int blogid)
	{
		blogService.deleteBlog(blogid);
	}
	
	@GetMapping("/editBlog/{blogid}")
	public ResponseEntity<Blog> editBlog(@PathVariable("blogid") int blogid)
	{
		Blog blog=blogService.editBlog(blogid);
		return new ResponseEntity<Blog>(blog, HttpStatus.OK);
	}
}
