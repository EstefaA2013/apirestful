package com.ead.apirestful.services.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ead.apirestful.dto.UsersDTO;

@Service
public interface IUsersService {

	Page<UsersDTO> findAll();

	UsersDTO findByUsername(String username);
	
	UsersDTO findByUserId(int userId);

	void save(UsersDTO user);

	void saveAll(List<UsersDTO> users);

	void deleteById(int userId);
}
