package com.chautha.services;

import com.chautha.dal.dao.ArticleDao;
import com.chautha.dal.dao.CategoryDao;
import com.chautha.dal.dao.TagDao;
import com.chautha.dal.entities.Article;
import com.chautha.dal.entities.ArticleSearch;
import com.chautha.dal.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rewati Raman
 */
@Service
public class ArticleCategoryTagServicesIml implements ArticleCategoryTagServices {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private TagDao tagDao;

    public void saveArticle(Article article) {

    }

    public List<Article> getArticles(ArticleSearch articleSearch) {
        return null;
    }

    public Article getArticleByUrlString(String uuid,String url) {
        return articleDao.getArticle(uuid,url);
    }

    public List<Article> getArticlesByCategory(String categoryUuid) {
        return null;
    }

    public List<Article> getArticlesByCategory() {
        return null;
    }

    public List<Article> listArticleByTag(String tag) {
        return null;
    }

    public List<Category> listCategories() {
        return null;
    }

    public List<Category> listTags() {
        return null;
    }
}
