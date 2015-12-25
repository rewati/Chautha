package com.chautha.services;

import com.chautha.dal.entities.Article;
import com.chautha.dal.entities.ArticleSearch;
import com.chautha.dal.entities.Category;

import java.util.List;

/**
 * @author Rewati Raman
 */
public interface ArticleCategoryTagServices {
    void saveArticle(Article article);
    List<Article> getArticles(ArticleSearch articleSearch);
    Article getArticleByUrlString(String uuid,String url);
    List<Article> getArticlesByCategory(String categoryUuid);
    List<Article> getArticlesByCategory();
    List<Article> listArticleByTag(String tag);
    List<Category> listCategories();
    List<Category> listTags();
}
