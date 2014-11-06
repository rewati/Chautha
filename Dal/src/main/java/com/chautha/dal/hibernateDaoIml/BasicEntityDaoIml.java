package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.BasicEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by rewati on 9/20/14.
 */
@Repository
public class BasicEntityDaoIml< T extends Serializable > implements BasicEntityDao <T>{

    @PersistenceContext
    EntityManager em;

    @Override
    public void save(Serializable object) {
        this.em.persist(object);
    }

    @Override
    public void update(T object) {
        this.em.merge(object);
    }

    @Override
    public T getByUuid(String uuid) {
        return this.em.find(getEntityClass(), uuid);
    }

    @Override
    public List<T> getList(String uuid, Integer lastpage, Integer resultsPerPage) {
        String table = getEntityClass().getName();
        Query q = em.createQuery("select cat from "+table+"  cat");
        q.setFirstResult(lastpage*resultsPerPage+1);
        q.setMaxResults(resultsPerPage);
        return q.getResultList();
    }

    @Override
    public void delete(T object) {

    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public Class<T> getEntityClass() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();

        return (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }
}
