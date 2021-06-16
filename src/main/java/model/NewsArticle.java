package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class NewsArticle extends io.github.ccincharge.newsapi.datamodels.Article{
	
	@Id
	private String id;
	
}
