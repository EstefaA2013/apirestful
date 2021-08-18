package com.ead.apirestful.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import com.ead.apirestful.dto.UsersDTO;
import com.ead.apirestful.repository.UsersRepository;
import com.ead.apirestful.services.interfaces.IUsersService;

@Component
public class UsersImpl implements IUsersService {

	@Autowired
	private UsersRepository usersRepository;
	
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
