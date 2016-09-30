  
package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Forum;

@Repository
@SuppressWarnings({"unchecked" , "deprecation"})
public class ForumDAOImpl implements ForumDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	/*Used for creating or updating Forum*/
	@Transactional
	public void saveOrUpdate(Forum forum) {
		sessionFactory.getCurrentSession().saveOrUpdate(forum);
	}

	/*Retrieves all Forums*/
	@Transactional
	public List<Forum> getForums() {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Forum.class);
		List<Forum> list=c.list();
		return list;
	}

	/*Delete single Forum object*/
	@Transactional
	public void deleteForum(Forum forum) {
		sessionFactory.getCurrentSession().delete(forum);
	}

	/*Fetch single forum object based on forumid*/
	@Transactional
	public Forum getForum(int forumid) {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Forum.class);
		c.add(Restrictions.eq("fid", forumid));
		Forum forum=(Forum) c.uniqueResult();
		return forum;
	}

	@Transactional
	public List<Forum> getIndividualForum(int forumid) {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Forum.class);
		c.add(Restrictions.eq("fid", forumid));
		List<Forum> list=c.list();
		return list;
	}

}
