package com.ead.apirestful.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UsersDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	@JsonProperty(value = "created_at")
	private Date createdAt;
	@JsonProperty(value = "updated_at")
	private Date updatedAt;
	
	
}
