package com.ead.apirestful.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.ead.apirestful.dto.UsersDTO;
import com.ead.apirestful.services.interfaces.IUsersService;

public class UsersImpl implements IUsersService {

	@Override
	public Page<UsersDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UsersDTO> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UsersDTO> findByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(UsersDTO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(List<UsersDTO> users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int userId) {
		// TODO Auto-generated method stub
		
	}

}
