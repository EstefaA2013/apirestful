package com.ead.apirestful.validator;

import org.springframework.stereotype.Service;

import com.ead.apirestful.dto.UserRequest;
import com.ead.apirestful.utils.exceptions.ApiUnprocessableEntity;

/**
 * Interface de la validación de datos recibidos 
 * para la creación de usuarios
 * @author Estefania
 *
 */

@Service
public interface UserValidator {

	void validator(UserRequest request) throws ApiUnprocessableEntity;
}
