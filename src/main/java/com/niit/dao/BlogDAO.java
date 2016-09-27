package com.niit.dao;

import java.util.List;

import com.niit.models.Blog;

public interface BlogDAO {

	/*Used for creating or updating Blog*/
	public void saveOrUpdate(Blog blog);
	
	/*Retrieves all Blogs*/
	public List<Blog> getBlogs();
	
	/*Delete single Blog object*/
	public void deleteBlog(Blog blog);
	
	/*Fetch single blog object based on blogid*/
	public Blog getBlog(int blogid);
}
