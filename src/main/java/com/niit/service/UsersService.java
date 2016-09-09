package com.niit.service;

import org.springframework.stereotype.Service;

import com.niit.models.Users;

@Service
public interface UsersService {

	public void UserRegistration(Users users);
}
