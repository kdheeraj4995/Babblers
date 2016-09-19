package com.niit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Forum;

@Repository
public class ForumDAOImpl implements ForumDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	/*Used for creating or updating Forum*/
	@Transactional
	public void saveOrUpdate(Forum forum) {
		sessionFactory.getCurrentSession().saveOrUpdate(forum);
	}

}
