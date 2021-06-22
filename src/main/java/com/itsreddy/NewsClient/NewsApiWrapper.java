package com.itsreddy.NewsClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.ccincharge.newsapi.NewsApi;

@Component
public final class NewsApiWrapper {
	
	private NewsApiWrapper() {}
	
	@Autowired
	private String getApiString;
	
	private NewsApi newsApi = null;

	public NewsApi getNewsApi() {
		if (newsApi == null) {
			newsApi = new NewsApi(getApiString);
		}
		return newsApi;
	}

}
