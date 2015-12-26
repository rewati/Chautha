package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.ArticleDao;
import com.chautha.dal.entities.Article;
import com.chautha.dal.entities.admin.PageLayout;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/hibernate.xml"})
@TransactionConfiguration(defaultRollback=true)
public class ArticleDaoImlTest {

    @PersistenceContext
    private EntityManager em;
    private ArticleDao articleDao;
    private ArticleDaoIml articleDaoIml;
    private PageLayoutDaoIml pageLayoutDaoIml;
    private Article testArticle;


    @Before
    public void setUp() throws Exception {
        articleDaoIml = new ArticleDaoIml();
        articleDaoIml.setEm(em);
        articleDao = articleDaoIml;
        pageLayoutDaoIml = new PageLayoutDaoIml();
        pageLayoutDaoIml.setEm(em);
        testArticle = testDBSetup();
    }

    @Test
    public void testSave() throws Exception {
        Article article =  new Article();
        article.setContent("content");
        article.setCreatedDate(new Date());
        article.setHeadTag("headTag");
        article.setPublished(true);
        article.setPublishedDate(new Date());
        article.setTitle("title");
        article.setUrl(UUID.randomUUID().toString());
        PageLayout pageLayout = new PageLayout();
        pageLayout.setCreatedDate(new Date());
        pageLayout.setActive(true);
        pageLayout.setDefaultLayout(true);
        pageLayout.setFooter("footer");
        pageLayout.setHeader("header");
        pageLayout.setLeftBar("leftbar");
        pageLayout.setRightBar("rightbar");
        pageLayout.setTopBar("topbar");
        pageLayout.setName(UUID.randomUUID().toString());
        article.setPageLayout(pageLayout);
        articleDao.save(article);
    }

    @Test
    public void testUpdate() throws Exception {
        testArticle.setHeadTag("UpdatedHeadTag");
        articleDao.update(testArticle);
        Article a = articleDao.getByUuid(testArticle.getUuid());
        Assert.assertNotNull(a);
        Assert.assertEquals(a.getHeadTag(),testArticle.getHeadTag());
    }

    @Test
    public void testGetByUuid() throws Exception {
        Article a = articleDao.getByUuid(testArticle.getUuid());
        Assert.assertNotNull(a);
        Assert.assertEquals(a.getHeadTag(),testArticle.getHeadTag());
    }

    @Test
    public void testGetList() throws Exception {
        List<Article> articles = articleDao.getList();
        Assert.assertNotNull(articles);
        Assert.assertTrue(articles.size()!=0);
    }

    @Test
    public void testGetArticle() throws Exception {
        Article a  = articleDao.getArticle(testArticle.getUuid(),testArticle.getUrl());
        Assert.assertNotNull(a);
        Assert.assertEquals(a.getHeadTag(),testArticle.getHeadTag());
        Assert.assertEquals(a.getUrl(),testArticle.getUrl());
    }

    @Test
    public void testDelete() throws Exception {
        Article articleToDelete = dBSetupForDelete();
        articleDao.delete(articleToDelete);
        Article a = articleDao.getByUuid(articleToDelete.getUuid());
        Assert.assertNull(a);
    }

    private Article testDBSetup() {
        Article article =  new Article();
        article.setContent("content");
        article.setCreatedDate(new Date());
        article.setHeadTag("headTag");
        article.setPublished(true);
        article.setPublishedDate(new Date());
        article.setTitle("titleTest1");
        article.setUrl(UUID.randomUUID().toString());
        PageLayout pageLayout = new PageLayout();
        pageLayout.setCreatedDate(new Date());
        pageLayout.setActive(true);
        pageLayout.setDefaultLayout(true);
        pageLayout.setFooter("footer");
        pageLayout.setHeader("header");
        pageLayout.setLeftBar("leftbar");
        pageLayout.setRightBar("rightbar");
        pageLayout.setTopBar("topbar");
        pageLayout.setName("testPageLayout");
        article.setPageLayout(pageLayout);
        articleDao.save(article);
        return article;
    }

    private Article dBSetupForDelete() {
        Article article =  new Article();
        article.setContent("content");
        article.setCreatedDate(new Date());
        article.setHeadTag("headTag");
        article.setPublished(true);
        article.setPublishedDate(new Date());
        article.setTitle("titleDelete");
        article.setUrl(UUID.randomUUID().toString());
        PageLayout pageLayout = new PageLayout();
        pageLayout.setCreatedDate(new Date());
        pageLayout.setActive(true);
        pageLayout.setDefaultLayout(true);
        pageLayout.setFooter("footer");
        pageLayout.setHeader("header");
        pageLayout.setLeftBar("leftbar");
        pageLayout.setRightBar("rightbar");
        pageLayout.setTopBar("topbar");
        pageLayout.setName(UUID.randomUUID().toString());
        article.setPageLayout(pageLayout);
        articleDao.save(article);
        return article;
    }
}