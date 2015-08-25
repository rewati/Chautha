package com.chautha.services;

import com.chautha.core.model.entities.Article;
import com.chautha.dal.entities.ArticleSearch;

import java.util.List;

/**
 * @author Rewati Raman
 */
public interface ArticleServices {
    void saveArticle(Article article);
    List<Article> getArticles(ArticleSearch articleSearch);
}
