package com.paulovarassin.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paulovarassin.springmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}