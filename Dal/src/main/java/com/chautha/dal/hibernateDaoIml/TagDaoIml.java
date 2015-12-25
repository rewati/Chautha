package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.TagDao;
import com.chautha.dal.entities.Article;
import com.chautha.dal.entities.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Rewati Raman
 */
@Repository
public class TagDaoIml extends BasicEntityDaoIml<Tag> implements TagDao {

    public List<Article> listArticleByTag(String tag) {
        return null;
    }
}
