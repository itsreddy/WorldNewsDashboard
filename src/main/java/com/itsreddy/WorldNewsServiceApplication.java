package com.itsreddy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itsreddy.NewsClient.TopHeadlinesEndpoint;
import com.itsreddy.model.NewsArticle;
import com.itsreddy.repositories.ArticleRepository;

import io.github.ccincharge.newsapi.datamodels.Article;

@SpringBootApplication
public class WorldNewsServiceApplication implements CommandLineRunner{
	
	private final ArticleRepository articleRepository;
	
	@Autowired
	public WorldNewsServiceApplication(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(WorldNewsServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		if(articleRepository.findAll().isEmpty()) {
			System.out.println("db is empty");
			// add new articles to db
			for (Article a : new TopHeadlinesEndpoint().getTopNewsByCountry("us")) {
//				articleRepository.save(new NewsArticle(a));
				System.out.println(new NewsArticle(a));
			}
		}
	}

}
