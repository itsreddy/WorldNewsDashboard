package com.sb.init;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import NewsClient.TopHeadlinesEndpoint;
import io.github.ccincharge.newsapi.datamodels.Article;
import model.NewsArticle;

class NewArticleTest {

	@Test
	void newsArticleAttributesEqualsToTest() throws Exception {
		
		TopHeadlinesEndpoint topHeadlinesEndpoint = new TopHeadlinesEndpoint();
		List<Article> articles = topHeadlinesEndpoint.getTopNewsByCountry("us");
		Article article = articles.get(0);
		NewsArticle newsArticle = new NewsArticle(article);

		assertEquals(article.source(), newsArticle.getSource());
		assertEquals(article.description(), newsArticle.getDescription());
		assertEquals(article.url(), newsArticle.getUrl());
		assertEquals(article.urlToImage(), newsArticle.getUrlToImage());
		assertEquals(article.author(), newsArticle.getAuthor());
		assertEquals(article.publishedAt(), newsArticle.getPublishedAt());
		assertEquals(article.title(), newsArticle.getTitle());
		
	}
	
//	@Test
	void newsArticleEqualsToTest() throws Exception {
		
		TopHeadlinesEndpoint topHeadlinesEndpoint = new TopHeadlinesEndpoint();
		List<Article> articles = topHeadlinesEndpoint.getTopNewsByCountry("us");
		Article article = articles.get(0);
		NewsArticle newsArticle = new NewsArticle(article);

		assertEquals(article, newsArticle);
	}
	

//	private void assertEquals(String string, Article article, NewsArticle newsArticle) {
//		// TODO Auto-generated method stub
//		
//		assertTrue(true);
//	}

}