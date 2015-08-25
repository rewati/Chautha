package com.chautha.dal.dao;

import com.chautha.dal.entities.Article;
import com.chautha.dal.entities.Category;

import java.util.List;
import java.util.UUID;

/**
 * @author Rewati Raman
 */
public interface CategoryDao extends BasicEntityDao<Category> {
    List<Article> listArticleByCategory(UUID categoryUuid);

}
