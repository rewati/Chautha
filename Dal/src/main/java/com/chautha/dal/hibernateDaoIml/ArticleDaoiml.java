package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.ArticleDao;
import com.chautha.dal.entities.Article;
import org.springframework.stereotype.Repository;

/**
 * @author Rewati Raman
 */
@Repository
public class ArticleDaoiml extends BasicEntityDaoIml<Article> implements ArticleDao {
}
