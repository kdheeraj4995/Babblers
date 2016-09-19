package com.niit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Users")
public class User {
	
	@Id
	@GeneratedValue
	@Column(length=15)
	private int userid;
	
	@Column(nullable=false,unique=true,length=20)
	private String username;
	
	@Column(nullable=false,length=20)
	private String name;
	
	@Column(nullable=false,length=20)
	private String password;
	
	@Column(nullable=false,length=10)
	private String gender;
	
	@Column(nullable=false,length=20)
	private String email;
	
	@Column(nullable=false,length=15)
	private int mobile;
	
	@Column(length=20)
	private String Enabled;
	
	@Column(length=20)
	private String Role;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEnabled() {
		return Enabled;
	}
	public void setEnabled(String enabled) {
		Enabled = enabled;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
}
