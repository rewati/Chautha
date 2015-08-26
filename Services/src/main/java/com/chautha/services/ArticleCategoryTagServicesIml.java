package com.chautha.services;

import com.chautha.dal.dao.ArticleDao;
import com.chautha.dal.dao.CategoryDao;
import com.chautha.dal.dao.TagDao;
import com.chautha.dal.entities.Article;
import com.chautha.dal.entities.ArticleSearch;
import com.chautha.dal.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Rewati Raman
 */
public class ArticleCategoryTagServicesIml implements ArticleCategoryTagServices {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private TagDao tagDao;

    @Override
    public void saveArticle(Article article) {

    }

    @Override
    public List<Article> getArticles(ArticleSearch articleSearch) {
        return null;
    }

    @Override
    public Article getArticleByUrlString(String urlString) {
        return null;
    }

    @Override
    public List<Article> getArticlesByCategory(String categoryUuid) {
        return null;
    }

    @Override
    public List<Article> getArticlesByCategory() {
        return null;
    }

    @Override
    public List<Article> listArticleByTag(String tag) {
        return null;
    }

    @Override
    public List<Category> listCategories() {
        return null;
    }

    @Override
    public List<Category> listTags() {
        return null;
    }
}
