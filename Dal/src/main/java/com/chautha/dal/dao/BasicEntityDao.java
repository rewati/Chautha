package com.chautha.dal.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rewati on 9/21/14.
 */
public interface BasicEntityDao< T extends Serializable> {
    public void save(T object);
    public void update(T object);
    public T getByUuid(String uuid);
    public List<T> getList(String uuid, Integer lastpage, Integer resultsPerPage);
    public void delete(T object);
}
