package com.ead.apirestful.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ead.apirestful.dto.UserRequest;
import com.ead.apirestful.dto.UsersDTO;
import com.ead.apirestful.entities.Users;
import com.ead.apirestful.repository.UsersRepository;
import com.ead.apirestful.services.interfaces.IUsersService;
import com.ead.apirestful.utils.hash.BCrypt;
import com.ead.apirestful.utils.helpers.MHelpers;

@Component
public class UsersImpl implements IUsersService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public List<UsersDTO> findAll() {
		
        List<UsersDTO> dto = new ArrayList<>();
        
        Iterable<Users> users = this.usersRepository.findAll();

        for (Users user : users) {
    
        	UsersDTO usersDTO = MHelpers.modelMapper().map(user, UsersDTO.class);
    
        	dto.add(usersDTO);
        	
        }            
        
        return dto;
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
	public void save(UserRequest user) {

        Users users = MHelpers.modelMapper().map(user, Users.class);
        
        users.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
        
        this.usersRepository.save(users);
	}
	
	@Override
	public void update(UserRequest request, int userId) {
		Optional<Users> users = this.usersRepository.findById(userId);
		
		Users user = users.get();
		user.setFirstname(request.getFirstname());
		user.setLastname(request.getLastname());
		user.setUsername(request.getUsername());
		
		if(!request.getPassword().isEmpty()) {
		    user.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
		}
		
		this.usersRepository.save(user);
	}

	@Override
	public void saveAll(List<UserRequest> users) {
		
		List<Users> u = new ArrayList<>();
		
		for (UserRequest user : users) {
			
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
