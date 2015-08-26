package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.TagDao;
import com.chautha.dal.entities.Article;
import com.chautha.dal.entities.Tag;

import java.util.List;

/**
 * @author Rewati Raman
 */
public class TagDaoIml extends BasicEntityDaoIml<Tag> implements TagDao {
    @Override
    public List<Article> listArticleByTag(String tag) {
        return null;
    }
}
