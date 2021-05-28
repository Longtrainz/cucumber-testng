package service;

import java.util.List;

import api.Article;


public interface ArticleService {
	List<Article> getArticles(String url);
}
