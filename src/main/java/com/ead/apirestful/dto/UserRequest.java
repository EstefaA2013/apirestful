package com.ead.apirestful.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UserRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty(value = "firstname")
	private String firstname;
	@JsonProperty(value = "lastname")
	private String lastname;
	@JsonProperty(value = "username")
	private String username;
	@JsonProperty(value = "password")
	private String password;
}
