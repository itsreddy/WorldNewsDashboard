package com.itsreddy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.github.ccincharge.newsapi.datamodels.Article;
import io.github.ccincharge.newsapi.datamodels.Source;

@Document
public class NewsArticle extends io.github.ccincharge.newsapi.datamodels.Article {
	
	@Id
	private String id;
	
	private Source source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
	
	public NewsArticle(Article a) {
		this.setSource(a.source());
		this.setAuthor(a.author());
		this.setDescription(a.description());
		this.setPublishedAt(a.publishedAt());
		this.setTitle(a.title());
		this.setUrl(a.url());
		this.setUrlToImage(a.urlToImage());
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
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
	

}
