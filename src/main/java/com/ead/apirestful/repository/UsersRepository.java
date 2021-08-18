package com.ead.apirestful.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ead.apirestful.entities.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {

}
