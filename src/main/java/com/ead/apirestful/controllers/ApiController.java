package com.ead.apirestful.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class ApiController {
	
	@GetMapping("Example")
	public ResponseEntity<Object> index() {
		
		return ResponseEntity.ok("OK");
	}
}