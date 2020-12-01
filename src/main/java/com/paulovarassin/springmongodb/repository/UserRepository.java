package com.paulovarassin.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paulovarassin.springmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
