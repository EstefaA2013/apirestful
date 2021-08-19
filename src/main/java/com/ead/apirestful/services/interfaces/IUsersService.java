package com.ead.apirestful.services.interfaces;

import java.util.List;
import org.springframework.stereotype.Service;

import com.ead.apirestful.dto.UserRequest;
import com.ead.apirestful.dto.UsersDTO;

@Service
public interface IUsersService {

	List<UsersDTO> findAll();

	UsersDTO findByUsername(String username);
	
	UsersDTO findByUserId(int userId);

	void save(UserRequest user);

	void saveAll(List<UserRequest> users);

	void deleteById(int userId);
}
