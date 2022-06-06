package com.eliseusan.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eliseusan.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	

	
}
