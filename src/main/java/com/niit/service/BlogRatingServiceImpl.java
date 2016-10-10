package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.BlogRatingsDAO;
import com.niit.models.BlogRatings;

@Service
public class BlogRatingServiceImpl implements BlogRatingService {

	@Autowired
	private BlogRatingsDAO blogRatingsDAO;
	
	/* Create or Update New Blog Rating */
	public void createBlogRating(BlogRatings blogRatings, HttpSession session) {
		
	/*	BlogRatings b=blogRatingsDAO.getBlogRatings(blogRatings.getBr_bid(),(int)session.getAttribute("userid"));
		System.out.println(b.getBr_bid());
		int bid=b.getBr_bid();
		try{
			if(b != null)	{

			}
		}
		catch (Exception e) {
			blogRatings.setBrid(bid);
		}*/
		
		blogRatings.setBr_userid((int)session.getAttribute("userid"));
		blogRatingsDAO.saveOrUpdate(blogRatings);
	}
	
	/*Blog Rating List*/
	public List<BlogRatings> BlogRatingList(int blogid,HttpSession session){
		return blogRatingsDAO.getBlogs(blogid, (int) session.getAttribute("userid"));	
	}
}
