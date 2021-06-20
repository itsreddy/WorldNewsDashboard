package com.itsreddy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itsreddy.NewsClient.TopHeadlinesEndpoint;
import com.itsreddy.model.ArticleWrapper;
import com.itsreddy.repositories.ArticleRepository;

import io.github.ccincharge.newsapi.datamodels.Article;

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

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		if(articleRepository.findAll().isEmpty()) {
//			System.out.println("db is empty");
//			// add new articles to db
//			for (Article a : TopHeadlinesEndpoint.getTopNewsByCountry("us")) {
////				articleRepository.save(new NewsArticle(a));
//				System.out.println(new ArticleWrapper(a));
//			}
//		} else {
//			System.out.println("db is not empty");
//		}
//	}

}
