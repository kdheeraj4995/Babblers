package com.niit.service;

import javax.servlet.http.HttpSession;

import com.niit.models.ForumComments;


public interface ForumCommentsService {
	
	/* Create New Comment */
	public void createForum(ForumComments comment,HttpSession session);
}
