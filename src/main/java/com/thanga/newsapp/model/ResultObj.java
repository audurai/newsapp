package com.thanga.newsapp.model;

import java.io.Serializable;
import java.util.List;

public class ResultObj implements Serializable {

	private String status;
	private String totalResults;
	private List<Article> articles;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
