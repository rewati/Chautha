package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.ArticleDao;
import com.chautha.dal.entities.Article;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

/**
 * @author Rewati Raman
 */
@Repository
public class ArticleDaoIml extends BasicEntityDaoIml<Article> implements ArticleDao {

	public Article getArticle(String uuid, String url) {
		String table = getEntityClass().getName();
		Query q = em.createQuery("select cat from "+table+"  cat where uuid = '"+uuid+"' and url = '"+url+"'");
		return (Article) q.getSingleResult();
	}
}
