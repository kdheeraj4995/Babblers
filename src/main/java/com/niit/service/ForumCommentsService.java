package com.niit.service;

import javax.servlet.http.HttpSession;

import com.niit.models.ForumComments;


public interface ForumCommentsService {
	
	/* Create New Comment */
	public void createForum(ForumComments comment,HttpSession session);
	
	/*Retrive All Comment List and convert to JSON and saving in String */
	public String getAllComments(int fid);
}
