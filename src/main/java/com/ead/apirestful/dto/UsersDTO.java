package com.ead.apirestful.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UsersDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int user_id;
	private String firstname;
	private String lastname;
	private String username;
	private Date created_at;
	private Date updated_at;
	public int getId() {
		return user_id;
	}
	public void setId(int user_id) {
		this.user_id = user_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
}
