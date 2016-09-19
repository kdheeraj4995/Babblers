package com.niit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ForumComments {
	
	@Id
	@GeneratedValue
	@Column(length=15)
	private int cid;
	
	@Column(nullable=false,length=15)
	private int c_userid;
	
	@Column(nullable=false,length=15)
	private int c_fid;
	
	@Column(nullable=false)
	private String commentDesc; 
	

}
