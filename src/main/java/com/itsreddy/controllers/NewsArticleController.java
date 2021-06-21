package com.itsreddy.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itsreddy.NewsClient.TopHeadlinesEndpoint;
import com.itsreddy.model.ArticleWrapper;


@RestController
public class NewsArticleController {
	
	@RequestMapping("news/{cid}")
	public List<ArticleWrapper> getCNewsArticlesByCountryId(@PathVariable("cid") String countryId) throws Exception {
		
		return ArticleWrapper.newsArticlesListConstructor(TopHeadlinesEndpoint.getTopNewsByCountry(countryId));
		
	}
}