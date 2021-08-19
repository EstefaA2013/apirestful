package com.ead.apirestful.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import com.ead.apirestful.dto.UsersDTO;
import com.ead.apirestful.entities.Users;
import com.ead.apirestful.repository.UsersRepository;
import com.ead.apirestful.services.interfaces.IUsersService;
import com.ead.apirestful.utils.MHelpers;

@Component
public class UsersImpl implements IUsersService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public Page<UsersDTO> findAll() {
		
		Page<Users> users = this.usersRepository.findAll();

		return users.map(this::convertToUsersDTO);
	}

	@Override
	public UsersDTO findByUsername(String username) {

        Optional<Users> users = this.usersRepository.findByUsername(username);
        
        if(!users.isPresent()) {
        	return null;
        }
        
        return MHelpers.modelMapper().map(users.get(), UsersDTO.class);
	}

	@Override
	public UsersDTO findByUserId(int userId) {

		Optional<Users> users = this.usersRepository.findById(userId);
        
        if(!users.isPresent()) {
        	return null;
        }
        
        return MHelpers.modelMapper().map(users.get(), UsersDTO.class);
	}

	@Override
	public void save(UsersDTO user) {

        Users users = MHelpers.modelMapper().map(user, Users.class);
        
        this.usersRepository.save(users);
	}

	@Override
	public void saveAll(List<UsersDTO> users) {
		
		List<Users> u = new ArrayList<>();
		
		for (UsersDTO user : users) {
			
			Users us = MHelpers.modelMapper().map(user, Users.class);
		
			u.add(us);
		}
		
		this.usersRepository.saveAll(u);

		
		
	}

	@Override
	public void deleteById(int userId) {

		this.usersRepository.deleteById(userId);
	}

	private UsersDTO convertToUsersDTO(final Users users) {
	    return MHelpers.modelMapper().map(users, UsersDTO.class);
	}
}
