package com.ead.apirestful.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.fusionauth.jwt.Verifier;
import io.fusionauth.jwt.domain.JWT;
import io.fusionauth.jwt.hmac.HMACVerifier;

@Component 
public class JwtIO {

	@Value("${ead.jwt.token.secret:secret}")
	private String SECRET;
	@Value("${ead.jwt.timezone:UTC}")
	private String TIMEZONE;
	@Value("${ead.jwt.token.expires-in:3600}")
	private int EXPIRES_IN;
	@Value("${ead.jwt.issuer:none}")
	private String ISSUER;
	
	private JWT jwt(String encodedJWT) {

		Verifier verifier = HMACVerifier.newVerifier(SECRET);

		return JWT.getDecoder().decode(encodedJWT, verifier);
	}
}
