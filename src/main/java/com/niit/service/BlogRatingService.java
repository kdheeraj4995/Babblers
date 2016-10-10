package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.niit.models.BlogRatings;

public interface BlogRatingService {

	/*Create New Blog Rating*/
	public void createBlogRating(BlogRatings blogRatings,HttpSession session);
	
	/*Blog Rating List*/
	public List<BlogRatings> BlogRatingList(int blogid,HttpSession session);
}
