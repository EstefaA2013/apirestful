package com.ead.apirestful.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ead.apirestful.security.InterceptorJwtIO;



@Component
public class InterceptorJwtIOConfig implements WebMvcConfigurer {

	@Value("${ead.jwt.security.enabled:false}")
	private boolean securityEnabled;
	
	@Autowired
	private InterceptorJwtIO interceptorJwtIO;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		if(securityEnabled) {
			registry.addInterceptor(interceptorJwtIO);
		}
	}
	
}
