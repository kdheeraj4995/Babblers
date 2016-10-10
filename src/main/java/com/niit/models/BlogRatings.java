package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BlogRatings {

	@Id
	@GeneratedValue
	private int brid;
	private int br_bid;
	private int br_userid;
	private float brating;
	public int getBrid() {
		return brid;
	}
	public void setBrid(int brid) {
		this.brid = brid;
	}
	public int getBr_bid() {
		return br_bid;
	}
	public void setBr_bid(int br_bid) {
		this.br_bid = br_bid;
	}
	public int getBr_userid() {
		return br_userid;
	}
	public void setBr_userid(int br_userid) {
		this.br_userid = br_userid;
	}
	public float getBrating() {
		return brating;
	}
	public void setBrating(float brating) {
		this.brating = brating;
	}
	
}
