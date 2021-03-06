package com.itsreddy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.itsreddy.repositories.ArticleRepository;

@ComponentScan
@SpringBootApplication
public class WorldNewsServiceApplication{
	
	private final ArticleRepository articleRepository;
	
	@Autowired
	public WorldNewsServiceApplication(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(WorldNewsServiceApplication.class, args);
	}

	public ArticleRepository getArticleRepository() {
		return articleRepository;
	}

}
