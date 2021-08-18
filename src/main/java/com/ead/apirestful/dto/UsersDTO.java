package com.ead.apirestful.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
public class UsersDTO implements Serializable {

	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
