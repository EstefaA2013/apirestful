package com.ead.apirestful.utils.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Excepción personalizado de status 401
 * @author Estefania
 *
 */

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class ApiUnaucthorizazed extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApiUnaucthorizazed(String message) {
		
		super(message);
		
	}

}
