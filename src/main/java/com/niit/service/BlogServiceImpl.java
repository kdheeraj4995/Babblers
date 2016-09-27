package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.niit.dao.BlogDAO;
import com.niit.models.Blog;

@Service
public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogDAO blogDAO;
	
	/*Create New Blog Service*/
	public void createBlog(Blog blog,HttpSession session) 
	{	
		/*Saving userid from session and time to blog object*/
		blog.setB_userid((int)session.getAttribute("userid"));
		blog.setBlogtime(new java.util.Date().toString());
		
		/*Saving blog in database*/
		blogDAO.saveOrUpdate(blog);	
	}

	/*Retrive All Blog List and convert to JSON and saving in String */
	public String  getAllBlogs() 
	{
		List<Blog> list=blogDAO.getBlogs();
		Gson gson=new Gson();
		String data=gson.toJson(list);
		return data;
	}

	/*Delete single blog based on blog id*/
	public void deleteBlog(int blogid) 
	{
		Blog blog= blogDAO.getBlog(blogid);
		blogDAO.deleteBlog(blog);
	}

	/*Edit individual blog based on blog id*/
	public Blog editBlog(int blogid)
	{
		 return blogDAO.getBlog(blogid);
	}
}
