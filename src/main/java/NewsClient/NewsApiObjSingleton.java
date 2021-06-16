package NewsClient;

import io.github.ccincharge.newsapi.NewsApi;

public class NewsApiObjSingleton {
	
	private final static String newsApiString = "eaafd37bdb8f4948b90a20215937eec3";
	private static final NewsApi newsApi = new NewsApi(newsApiString);
	
	private NewsApiObjSingleton(){}
	
	static NewsApi getNewsApi() {
		return newsApi;
	}

}
