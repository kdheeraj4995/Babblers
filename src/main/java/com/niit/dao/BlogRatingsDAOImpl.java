package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.models.BlogRatings;


@Repository
@SuppressWarnings({"deprecation"})
public class BlogRatingsDAOImpl implements BlogRatingsDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	/*Used for creating or updating Blog Rating for Single user on a Blog*/
	@Transactional
	public void saveOrUpdate(BlogRatings blogRatings) {
		sessionFactory.getCurrentSession().saveOrUpdate(blogRatings);
	}

	/*Fetch BlogRating of particular LoggedIn User on particualar blog*/
	@Transactional
	public BlogRatings getBlogRatings(int blogid,int userid) {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(BlogRatings.class);
		c.add(Restrictions.eq("br_bid", blogid));
		c.add(Restrictions.eq("br_userid", userid));
		BlogRatings blogRatings=(BlogRatings)c.uniqueResult();
		return blogRatings;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<BlogRatings> getBlogs(int bid,int userid) {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(BlogRatings.class);
		c.add(Restrictions.eq("br_bid", bid));
		c.add(Restrictions.eq("br_userid", userid));
		List<BlogRatings> list=c.list();
		return list;
	}

}
