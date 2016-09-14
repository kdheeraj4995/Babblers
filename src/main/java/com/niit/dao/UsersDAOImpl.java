package com.niit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Users;

@Repository
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/*Used for new user registration or updating*/
	@Transactional
	public void saveOrUpdate(Users users) {
	sessionFactory.getCurrentSession().saveOrUpdate(users);
		
	}

	/*Used to delete user*/
	@Transactional
	public void delete(Users users) {
		sessionFactory.getCurrentSession().delete(users);
	}

}
