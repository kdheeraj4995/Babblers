package com.niit.dao;

import java.util.List;

import com.niit.models.Forum;

public interface ForumDAO {

	/*Used for creating or updating Forum*/
	public void saveOrUpdate(Forum forum);
	
	/*Retrieves all Forums*/
	public List<Forum> getForums();
	
	/*Delete single Forum object*/
	public void deleteForum(Forum forum);
	
	/*Fetch single forum object based on forumid*/
	public Forum getForum(int forumid);
	
	/*Fetch single forum List object based on forumid*/
	public List<Forum> getIndividualForum(int forumid);
	
}
