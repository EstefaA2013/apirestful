package com.ead.apirestful.services.interfaces;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ead.apirestful.dto.JwtResponse;


@Service
public class AuthService {

public JwtResponse login(String clientId, String clientSecret) {
		
		
		JwtResponse jwt = JwtResponse.builder()
				.tokenType("bearer")
				.accessToken("kajushdiffhf")
				.issuedAt(System.currentTimeMillis()+"")
				.cliendId(clientId)
				.expiresIn(3600)
				.build();
		
		return jwt;
	}
	
}
