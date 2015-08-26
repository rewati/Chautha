package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.CategoryDao;
import com.chautha.dal.entities.Article;
import com.chautha.dal.entities.Category;

import java.util.List;
import java.util.UUID;

/**
 * @author Rewati Raman
 */
public class CategoryDaoIml extends BasicEntityDaoIml<Category> implements CategoryDao {
    @Override
    public List<Article> listArticleByCategory(UUID categoryUuid) {
        return null;
    }
}
