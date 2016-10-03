package com.niit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.ForumComments;

@Repository
public class ForumCommentsDAOImpl implements ForumCommentsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	/*Used for creating or updating Forum Comments*/
	@Transactional
	public void saveOrUpdate(ForumComments comment) {
		sessionFactory.getCurrentSession().saveOrUpdate(comment);
	}

}
