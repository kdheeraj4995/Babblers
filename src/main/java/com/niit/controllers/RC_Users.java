 package com.niit.controllers;

import java.io.IOException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.niit.dao.UsersDAO;
import com.niit.models.User;
import com.niit.service.UsersService;

@RestController
public class RC_Users {
	
	@Autowired
	private UsersService usersService;
	
	@Autowired
	private UsersDAO usersDAO;
	
	@PostMapping("/PostService")
	public void PostService(@RequestBody User user) {
		usersService.UserRegistration(user);
	}
	
	@PostMapping("/imageUpload")
	public void ImageUpload(@RequestBody MultipartFile file,HttpSession session) throws IOException {

		
		String username = SecurityContextHolder.getContext().getAuthentication().getName(); /*Get Logged in Username*/
		User user=usersDAO.getUser(username);												/*Get user object based on username*/
		
		System.out.println(file.getContentType()+'\n'+file.getName()+'\n'+file.getSize()+'\n'+file.getOriginalFilename());
		/*Blob blob=Hibernate.getLobCreator(sessionFactory.getCurrentSession()).createBlob(file.getInputStream(),file.toString().length());
		System.out.println("hello"+blob);
		user.setImage(blob);
		*/
		user.setImage(file.getBytes());
		this.usersService.UserRegistration(user);
	}
}
