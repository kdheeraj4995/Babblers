package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Blog {
	
	@Id
	@GeneratedValue
	private int bid;
	private int b_userid;
	private String blogName;
	private String blogDesc;
	private String blogtime;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getB_userid() {
		return b_userid;
	}
	public void setB_userid(int b_userid) {
		this.b_userid = b_userid;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogDesc() {
		return blogDesc;
	}
	public void setBlogDesc(String blogDesc) {
		this.blogDesc = blogDesc;
	}
	public String getBlogtime() {
		return blogtime;
	}
	public void setBlogtime(String blogtime) {
		this.blogtime = blogtime;
	}
}
