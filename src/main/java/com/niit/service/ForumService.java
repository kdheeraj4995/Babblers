package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.niit.models.Forum;

public interface ForumService {

	/*Create New Forum*/
	public void createForum(Forum forum,HttpSession session);
	
	/*Retrive All Forum List and convert to JSON and saving in String */
	public String getAllForums();

	/*Delete single forum based on forum id*/
	public void deleteForum(int forumid);
	
	/*Edit individual forum based on forum id*/
	public Forum editForum(int forumid);
	
	/*Retrive Single Forum data and convert to JSON and saving in String */
	public List<Forum> getSingleForum(int forumid);

}