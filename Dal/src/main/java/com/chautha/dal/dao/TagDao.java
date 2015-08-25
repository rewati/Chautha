package com.chautha.dal.dao;

import com.chautha.dal.entities.Article;
import com.chautha.dal.entities.Tag;

import java.util.List;

/**
 * @author Rewati Raman
 */
public interface TagDao extends BasicEntityDao<Tag> {
    List<Article> listArticleByTag(String tag);
}
