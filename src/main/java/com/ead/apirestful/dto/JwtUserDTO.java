package com.ead.apirestful.dto;


import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtUserDTO implements Serializable {

	private String uid;
	private String name;
	private String lastname;
	private String role;
	private String country;
	
	
}
