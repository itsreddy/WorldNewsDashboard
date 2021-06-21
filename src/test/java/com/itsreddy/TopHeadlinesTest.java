package com.itsreddy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.itsreddy.NewsClient.TopHeadlinesEndpoint;
import io.github.ccincharge.newsapi.datamodels.Article;

class TopHeadlinesTest {
	
	@Autowired
	TopHeadlinesEndpoint topHeadlinesEndpoint;

	@Test
	void getTopNewsByCountryTestNotNull() throws Exception {
		List<Article> articles = topHeadlinesEndpoint.getTopNewsByCountry("us");
		assertNotNull(articles);
	}
	
	@Test
	void getTopNewsByCountryTestNonZero() throws Exception {
		List<Article> articles = topHeadlinesEndpoint.getTopNewsByCountry("us");
		assertTrue(articles.size() > 0);
	}

}
