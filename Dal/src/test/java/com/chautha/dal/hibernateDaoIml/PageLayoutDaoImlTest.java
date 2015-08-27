package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.PageLayoutDao;
import com.chautha.dal.entities.admin.PageLayout;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/hibernate.xml"})
@TransactionConfiguration(defaultRollback=true)
public class PageLayoutDaoImlTest {

    @PersistenceContext
    private EntityManager em;
    PageLayoutDao pageLayoutDao;
    PageLayout pageLayout;

    @Before
    public void setUp() throws Exception {
        PageLayoutDaoIml pageLayoutDaoIml = new PageLayoutDaoIml();
        pageLayoutDaoIml.setEm(em);
        pageLayoutDao = pageLayoutDaoIml;
        pageLayout=createPageLayout();
    }

    @Test
    public void testSave() throws Exception {
        pageLayoutDao.save(pageLayout);
    }

    @Test
    public void testUpdate() throws Exception {
        pageLayout.setContent("updated Test");
    }

    @Test
    public void testGetByUuid() throws Exception {
        PageLayout pageLayout1 = createPageLayout();
        pageLayoutDao.save(pageLayout1);
        pageLayoutDao.getByUuid(pageLayout1.getUuid());
    }

    @Test
    public void testGetList() throws Exception {
        pageLayoutDao.getList(pageLayout.getUuid(),0,10);
    }

    @Test
    public void testDelete() throws Exception {
        pageLayoutDao.delete(pageLayout);
    }

    @Test
    public void testGetPageLayoutList() throws Exception {
        pageLayoutDao.getPageLayoutList();
    }

    private PageLayout createPageLayout(){
        PageLayout pageLayout = new PageLayout();
        pageLayout.setContent("test");
        pageLayout.setName("testname");
        pageLayout.setFooter("footer");
        pageLayout.setHeader("header");
        pageLayout.setLeftBar("LeftBar");
        pageLayout.setRightBar("rightBar");
        pageLayout.setTopBar("topbar");
        return pageLayout;
    }

    public void createFakeData(){
        pageLayoutDao.save(createPageLayout("1"));
        pageLayoutDao.save(createPageLayout("2"));
        pageLayoutDao.save(createPageLayout("3"));
        pageLayoutDao.save(createPageLayout("4"));
        pageLayoutDao.save(createPageLayout("5"));
        pageLayoutDao.save(createPageLayout("6"));
        pageLayoutDao.save(createPageLayout("7"));
        pageLayoutDao.save(createPageLayout("8"));
    }

    private PageLayout createPageLayout(String s){
        PageLayout pageLayout = new PageLayout();
        pageLayout.setContent("test"+s);
        pageLayout.setName("test" + s);
        pageLayout.setFooter("footer"+s);
        pageLayout.setHeader("header"+s);
        pageLayout.setLeftBar("LeftBar"+s);
        pageLayout.setRightBar("rightBar"+s);
        pageLayout.setTopBar("topbar"+s);
        return pageLayout;
    }
}