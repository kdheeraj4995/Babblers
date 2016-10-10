package com.niit.dao;


import java.util.List;


import com.niit.models.BlogRatings;

public interface BlogRatingsDAO {

	/*Used for creating or updating Blog Rating for Single user on a Blog*/
	public void saveOrUpdate(BlogRatings blog);
	
	/*Fetch BlogRating of particular LoggedIn User on particualar blog*/
	public BlogRatings getBlogRatings(int blogid,int userid);
	
	/*Retrieves all Blogs*/
	public List<BlogRatings> getBlogs(int bid,int userid);
}
