package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.niit.models.Forum;

public interface ForumService {

	/*Create New Forum*/
	public void createForum(Forum forum,HttpSession session);
	
	/*Retrive All Forum List*/
	public List<Forum> getAllForums();

	/*Delete single forum based on forum id*/
	public void deleteForum(int forumid);
	
	/*Edit individual forum based on forum id*/
	public Forum editForum(int forumid);
}
