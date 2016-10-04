package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.ForumComments;

@SuppressWarnings("unchecked")
@Repository
public class ForumCommentsDAOImpl implements ForumCommentsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	/*Used for creating or updating Forum Comments*/
	@Transactional
	public void saveOrUpdate(ForumComments comment) {
		sessionFactory.getCurrentSession().saveOrUpdate(comment);
	}

	@Transactional
	public List<ForumComments> getComments(int fid) {
		@SuppressWarnings("deprecation")
		Criteria c=sessionFactory.getCurrentSession().createCriteria(ForumComments.class);
		c.add(Restrictions.eq("c_fid", fid));
		List<ForumComments> list=c.list();
		return list;
	}

}
