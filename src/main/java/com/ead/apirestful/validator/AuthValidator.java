package com.ead.apirestful.validator;

import java.util.Objects;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.ead.apirestful.utils.exceptions.ApiUnaucthorizazed;

@Component
public class AuthValidator {

	private static final String CLIENT_CREDENTIALS="client_credentials";
	
	public void Validate(MultiValueMap<String, String>paraMap, String grantType) throws ApiUnaucthorizazed {
		
		if(grantType.isEmpty() || !grantType.equals(CLIENT_CREDENTIALS)) {
			message("El campo grant_type es invalido");
		}
		
		if (Objects.isNull(paraMap) || 
				paraMap.getFirst("client_id").isEmpty() ||
				paraMap.getFirst("client_secret").isEmpty()
				) {
			message("client_id y/o client_secret son invalidos");
			
		}
		
	}
	
	private void message(String message) throws ApiUnaucthorizazed {
		throw new ApiUnaucthorizazed(message);
	}
}
