package com.itsreddy.NewsClient;

import java.util.HashMap;

import io.github.ccincharge.newsapi.NewsApi;

public class NewsApiObjSingleton {
	
	private final static String API_STRING = "eaafd37bdb8f4948b90a20215937eec3";
	private static final NewsApi newsApi = new NewsApi(API_STRING);
	
	private static final HashMap<String, String> COUNTRYCODES_MAP = new HashMap<String, String>();
	
	private NewsApiObjSingleton(){}
	
	static NewsApi getNewsApi() {
		return newsApi;
	}
	
	public static HashMap<String, String> getCountryCode(String countryCode){
		return COUNTRYCODES_MAP;
	}

}
