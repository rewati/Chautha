package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.CategoryDao;
import com.chautha.dal.entities.Article;
import com.chautha.dal.entities.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * @author Rewati Raman
 */
@Repository
public class CategoryDaoIml extends BasicEntityDaoIml<Category> implements CategoryDao {

    public List<Article> listArticleByCategory(UUID categoryUuid) {
        return null;
    }
}
