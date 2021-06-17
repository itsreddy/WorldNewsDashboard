package com.itsreddy.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itsreddy.model.NewsArticle;

public interface UserRepository extends MongoRepository<NewsArticle, String>{

}
