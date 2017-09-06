package com.webservice.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.webservice.model.User;

public interface UserRepositorio extends MongoRepository<User, String> {
	 public User findOneByName(String name);
}
