package com.itsreddy.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.itsreddy.NewsClient.TopHeadlinesEndpoint;

import io.github.ccincharge.newsapi.datamodels.Article;
import io.github.ccincharge.newsapi.datamodels.Source;

@Document(collection = "laterArticles")
public class ArticleWrapper {
	
	@Id
	private String id;
	@Field("sourceField")
	private SourceWrapper source;
	@Field("authorField")
	private String author;
	@Field("titleField")
	private String title;
	@Field("descriptionField")
	private String description;
	@Field("urlField")
	private String url;
	@Field("urlToImageField")
	private String urlToImage;
	@Field("publishedAtField")
	private String publishedAt;
	
	// this is for spring, we don't use it
	@SuppressWarnings("unused")
	private ArticleWrapper() {}
	
	public ArticleWrapper(Article a) {
		this.setSource(a.source());
		this.setAuthor(a.author());
		this.setDescription(a.description());
		this.setPublishedAt(a.publishedAt());
		this.setTitle(a.title());
		this.setUrl(a.url());
		this.setUrlToImage(a.urlToImage());
	}

	public SourceWrapper getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = new SourceWrapper(source.id(), source.name(), source.description(), source.url(), source.category(), source.language(), source.country());
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlToImage() {
		return urlToImage;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}

	public String getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}
	
	public static List<ArticleWrapper> newsArticlesListConstructor(List<Article> articles){
		List<ArticleWrapper> newsArticles = new ArrayList<ArticleWrapper>();
		for (Article a : articles) {
			newsArticles.add(new ArticleWrapper(a));
		}
		return newsArticles;
	}
	
	

	public static class SourceWrapper {
		
	    private String id;
	    private String name;
	    private String description;
	    private String url;
	    private String category;
	    private String language;
	    private String country;
		
		public SourceWrapper(String id, String name, String description, String url, String category, String language, String country) {
			this.setId(id);
			this.setName(name);
			this.setDescription(description);
			this.setUrl(url);
			this.setCategory(category);
			this.setLanguage(language);
			this.setCountry(country);
		}
	
		public String getId() {
			return id;
		}
	
		public void setId(String id) {
			this.id = id;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public String getDescription() {
			return description;
		}
	
		public void setDescription(String description) {
			this.description = description;
		}
	
		public String getUrl() {
			return url;
		}
	
		public void setUrl(String url) {
			this.url = url;
		}
	
		public String getCategory() {
			return category;
		}
	
		public void setCategory(String category) {
			this.category = category;
		}
	
		public String getLanguage() {
			return language;
		}
	
		public void setLanguage(String language) {
			this.language = language;
		}
	
		public String getCountry() {
			return country;
		}
	
		public void setCountry(String country) {
			this.country = country;
		}
		
		
	}

}
