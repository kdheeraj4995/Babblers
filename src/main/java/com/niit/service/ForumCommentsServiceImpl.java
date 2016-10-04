package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.niit.dao.ForumCommentsDAO;
import com.niit.models.ForumComments;

@Service
public class ForumCommentsServiceImpl implements ForumCommentsService {

	@Autowired
	private ForumCommentsDAO forumCommentsDAO;
	
	
	/* Create New Comment */
	public void createForum(ForumComments comment,HttpSession session) {
		
		/*Saving userid from session and time to forum object*/
		comment.setC_userid((int)session.getAttribute("userid"));
		comment.setCommenttime(new java.util.Date());
		
		forumCommentsDAO.saveOrUpdate(comment);
	}

	public String getAllComments(int fid) 
	{
	List<ForumComments> list= forumCommentsDAO.getComments(fid);
	Gson gson=new Gson();
	String data=gson.toJson(list);
	return data;
	}

}
