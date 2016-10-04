package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.niit.models.Blog;

public interface BlogService {

	/*Create New Blog*/
	public void createBlog(Blog blog,HttpSession session);
	
	/*Retrive All Blog List and convert to JSON and saving in String */
	public String getAllBlogs();

	/*Delete single blog based on blog id*/
	public void deleteBlog(int blogid);
	
	/*Edit individual blog based on blog id*/
	public Blog editBlog(int blogid);

	/*Retrive Single Blog data and convert to JSON and saving in String */
	public List<Blog> getSingleBlog(int blogid);
	
}
