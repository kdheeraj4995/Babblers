package com.niit.dao;

import com.niit.models.ForumComments;

public interface ForumCommentsDAO {

	/*Used for creating or updating Forum Comments*/
	public void saveOrUpdate(ForumComments comment);
}
