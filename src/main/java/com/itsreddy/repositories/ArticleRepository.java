package com.itsreddy.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itsreddy.model.ArticleWrapper;

public interface ArticleRepository extends MongoRepository<ArticleWrapper, String>{

}
