package com.itsreddy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.itsreddy.NewsClient.TopHeadlinesEndpoint;
import io.github.ccincharge.newsapi.datamodels.Article;
import com.itsreddy.model.ArticleWrapper;

import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class NewArticleTest {
	
	@Autowired
	TopHeadlinesEndpoint topHeadlinesEndpoint;

	@Test
	void newsArticleAttributesEqualsToTest() throws Exception {
		
		List<Article> articles = topHeadlinesEndpoint.getTopNewsByCountry("us");
		Article article = articles.get(0);
		ArticleWrapper newsArticle = new ArticleWrapper(article);

		assertEquals(article.description(), newsArticle.getDescription());
		assertEquals(article.url(), newsArticle.getUrl());
		assertEquals(article.urlToImage(), newsArticle.getUrlToImage());
		assertEquals(article.author(), newsArticle.getAuthor());
		assertEquals(article.publishedAt(), newsArticle.getPublishedAt());
		assertEquals(article.title(), newsArticle.getTitle());
		
	}

}
