package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.BasicEntityDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Rewati Raman
 */
public abstract class BasicEntityDaoIml< T extends Serializable > implements BasicEntityDao <T>{


    private static final Logger logger = LoggerFactory.getLogger(BasicEntityDaoIml.class);

    @PersistenceContext
    EntityManager em;

    public void save(Serializable object) {
        this.em.persist(object);
    }

    public void update(T object) {
        this.em.merge(object);
    }

    public T getByUuid(String uuid) {
        return this.em.find(getEntityClass(), uuid);
    }

    public List<T> getList(String uuid, Integer lastpage, Integer resultsPerPage) {
        String table = getEntityClass().getName();
        Query q = em.createQuery("select cat from "+table+"  cat");
        q.setFirstResult(lastpage*resultsPerPage+1);
        q.setMaxResults(resultsPerPage);
        return q.getResultList();
    }

    public List<T> getList() {
        String table = getEntityClass().getName();
        Query q = em.createQuery("select cat from "+table+"  cat");
        return q.getResultList();
    }

    public void delete(T object) {
        this.em.remove(object);
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public Class<T> getEntityClass() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();

        return (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }
}
