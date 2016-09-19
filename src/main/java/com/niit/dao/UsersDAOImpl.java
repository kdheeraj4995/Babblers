package com.niit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.User;

@Repository
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/*Used for creating or updating user*/
	@Transactional
	public void saveOrUpdate(User user) {
	sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}

	/*	Used for deleting user*/
	@Transactional
	public void delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

}
