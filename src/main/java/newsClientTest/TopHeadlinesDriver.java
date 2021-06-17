package newsClientTest;

import java.util.List;

import NewsClient.TopHeadlinesEndpoint;
import io.github.ccincharge.newsapi.datamodels.Article;

public class TopHeadlinesDriver {
	
	public static void main() throws Exception {
		TopHeadlinesEndpoint topHeadlinesEndpoint = new TopHeadlinesEndpoint();
		List<Article> articles = topHeadlinesEndpoint.getTopNewsByCountry("us");
		
		System.out.println(articles.toString());
	}

}
