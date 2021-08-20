package com.ead.apirestful.validator;

import org.springframework.stereotype.Component;

import com.ead.apirestful.dto.UserRequest;
import com.ead.apirestful.utils.exceptions.ApiUnprocessableEntity;

@Component
public class UserValidatorImpl implements UserValidator{

	@Override
	public void validator(UserRequest request) throws ApiUnprocessableEntity {
		
		if(request.getFirstname() == null || request.getFirstname().isEmpty()) {
			message("El nombre es obligatorio");
		}
		if(request.getFirstname().length() < 3) {
			message("El nombre es muy corto, debe tener mínimo 3 caracteres");
		}
		if(request.getLastname() == null || request.getLastname().isEmpty()) {
			message("El Apellido es obligatorio");
		}
		if(request.getLastname().length() < 3) {
			message("El apellido es muy corto, debe tener mínimo 3 caracteres");
		}
		if(request.getUsername() == null || request.getUsername().isEmpty()) {
			message("El nombre de usuario es obligatorio");
		}
		if(request.getUsername().length() < 6) {
			message("El nombre de usuario es muy corto, debe tener mínimo 6 caracteres");
		}
		if(request.getPassword() == null || request.getPassword().isEmpty()) {
			message("La contraseña es obligatoria");
		}
		if(request.getPassword().length() < 6) {
			message("La contraseña es muy corta, debe tener mínimo 6 caracteres");
		}
		
	}
	
	private void message(String message) throws ApiUnprocessableEntity {
	
		throw new ApiUnprocessableEntity(message);
		
	}

}
