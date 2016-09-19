package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ForumDAO;
import com.niit.models.Forum;

@Service
public class ForumServiceImpl implements ForumService{

	@Autowired
	private ForumDAO forumDAO;
	
	public void createForum(Forum forum) {
		
		forum.setForumtime(new java.util.Date().toString());
		forumDAO.saveOrUpdate(forum);
	}
}
