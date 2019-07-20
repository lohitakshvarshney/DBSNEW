package com.DBS.Hack2Win.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private String emailId;
	
	private String name;
	private String lastname;
	public String getUid() {
		return emailId;
	}
	public void setUid(String uid) {
		this.emailId = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + emailId + ", name=" + name + ", lastname=" + lastname + "]";
	}
	

}
