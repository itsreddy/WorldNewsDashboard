package com.itsreddy.NewsClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.ccincharge.newsapi.datamodels.Article;
import io.github.ccincharge.newsapi.requests.RequestBuilder;
import io.github.ccincharge.newsapi.responses.ApiArticlesResponse;

@Component
public class TopHeadlinesEndpoint {
	
	private TopHeadlinesEndpoint() {}
	
	@Autowired
	private NewsApiWrapper newsApiWrapper;
	
	public List<Article> getTopNewsByCountry(String countryId) throws Exception {
		
		RequestBuilder request = new RequestBuilder()
			    .setCountry(countryId)
			    .setLanguage("en");

		ApiArticlesResponse apiArticlesResponse = newsApiWrapper.getNewsApi().sendTopRequest(request);

		String responseStatus = apiArticlesResponse.status();
		// .articles() method returns an ArrayList of articles
		if (responseStatus.equals("ok")) {
			List<Article> newsArticles = apiArticlesResponse.articles();
			return newsArticles;
		} else {
			throw new Exception(responseStatus);
		}
		
	}

}
