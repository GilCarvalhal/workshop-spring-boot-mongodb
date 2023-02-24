package com.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}