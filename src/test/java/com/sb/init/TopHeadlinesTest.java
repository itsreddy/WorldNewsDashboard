package com.sb.init;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.GreaterThan;

import NewsClient.TopHeadlinesEndpoint;
import io.github.ccincharge.newsapi.datamodels.Article;

class TopHeadlinesTest {

	@Test
	void getTopNewsByCountryTestNotNull() throws Exception {
		TopHeadlinesEndpoint topHeadlinesEndpoint = new TopHeadlinesEndpoint();
		List<Article> articles = topHeadlinesEndpoint.getTopNewsByCountry("us");
		assertNotNull(articles);
	}
	
	@Test
	void getTopNewsByCountryTestNonZero() throws Exception {
		TopHeadlinesEndpoint topHeadlinesEndpoint = new TopHeadlinesEndpoint();
		List<Article> articles = topHeadlinesEndpoint.getTopNewsByCountry("us");
		assertTrue(articles.size() > 0);
	}

}
