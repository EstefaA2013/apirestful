package com.ead.apirestful.utils.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Excepción personalizada de status 422
 * @author Estefania
 *
 */

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class ApiUnprocessableEntity extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApiUnprocessableEntity(String message) {
		
		super(message);
	}

}
