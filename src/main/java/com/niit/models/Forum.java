package com.niit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Forum {
	
	@Id
	@GeneratedValue
	@Column(nullable=false,length=15)
	private int fid;
	
	@Column(length=15)
	private int f_userid;
	
	@Column(nullable=false,length=20)
	private String forumName;
	
	
	@Column(nullable=false)
	private String forumDesc;
	
	@Column(nullable=false,length=40)
	private String forumtime;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public int getF_userid() {
		return f_userid;
	}

	public void setF_userid(int f_userid) {
		this.f_userid = f_userid;
	}

	public String getForumName() {
		return forumName;
	}

	public void setForumName(String forumName) {
		this.forumName = forumName;
	}

	public String getForumDesc() {
		return forumDesc;
	}

	public void setForumDesc(String forumDesc) {
		this.forumDesc = forumDesc;
	}

	public String getForumtime() {
		return forumtime;
	}

	public void setForumtime(String forumtime) {
		this.forumtime = forumtime;
	}

}
