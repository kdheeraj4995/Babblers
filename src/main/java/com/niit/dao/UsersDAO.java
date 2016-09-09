package com.niit.dao;

import com.niit.models.Users;

public interface UsersDAO {

	public void saveOrUpdate(Users users);

	public void delete(Users users);

	public Users get(int username);

}
