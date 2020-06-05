package com.svg.etu.feed;

import java.sql.Timestamp;

public class FeedVO {
	private int id;
	private int user_id;
	private String img;
	private String garbage_type;
	private int location;
	private Timestamp created_at;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getGarbage_type() {
		return garbage_type;
	}
	public void setGarbage_type(String garbage_type) {
		this.garbage_type = garbage_type;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	
	
}
