package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.PageLayoutDao;
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
import java.util.List;

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
        PageLayout p = pageLayoutDao.getByUuid(pageLayout.getUuid());
        Assert.assertNotNull(p);
        Assert.assertEquals(p.getUuid(),pageLayout.getUuid());
    }

    @Test
    public void testUpdate() throws Exception {
        pageLayoutDao.save(pageLayout);
        pageLayout.setName("NameUpdated");
        pageLayout.setFooter("footerUpdated");
        pageLayout.setHeader("headerUpdated");
        pageLayout.setLeftBar("LeftBarUpdated");
        pageLayout.setRightBar("rightBarUpdated");
        pageLayout.setTopBar("topbarUpdated");
        pageLayoutDao.update(pageLayout);
        PageLayout p = pageLayoutDao.getByUuid(pageLayout.getUuid());
        Assert.assertNotNull(p);
        Assert.assertEquals(p.getName(),"NameUpdated");
    }

    @Test
    public void testGetByUuid() throws Exception {
        PageLayout pageLayout1 = createPageLayout();
        pageLayoutDao.save(pageLayout1);
        pageLayoutDao.getByUuid(pageLayout1.getUuid());
        PageLayout p = pageLayoutDao.getByUuid(pageLayout1.getUuid());
        Assert.assertNotNull(p);
        Assert.assertEquals(p.getUuid(),pageLayout1.getUuid());
    }

    @Test
    public void testGetList() throws Exception {
        createFakeData();
        List<PageLayout> ps = pageLayoutDao.getList();
        Assert.assertNotNull(ps);
        Assert.assertEquals(ps.size(),8);
    }

    @Test
    public void testDelete() throws Exception {
        pageLayoutDao.save(pageLayout);
        PageLayout p = pageLayoutDao.getByUuid(pageLayout.getUuid());
        Assert.assertNotNull(p);
        pageLayoutDao.delete(pageLayout);
        p = pageLayoutDao.getByUuid(pageLayout.getUuid());
        Assert.assertNull(p);
    }

    private PageLayout createPageLayout(){
        PageLayout pageLayout = new PageLayout();
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
        pageLayout.setName("test" + s);
        pageLayout.setFooter("footer"+s);
        pageLayout.setHeader("header"+s);
        pageLayout.setLeftBar("LeftBar"+s);
        pageLayout.setRightBar("rightBar"+s);
        pageLayout.setTopBar("topbar"+s);
        return pageLayout;
    }
}