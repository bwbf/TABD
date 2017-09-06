package com.webservice.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.webservice.model.Gari;

public interface UserRepositorio extends MongoRepository<Gari, String> {
	 public Gari findOneByName(String name);
}
