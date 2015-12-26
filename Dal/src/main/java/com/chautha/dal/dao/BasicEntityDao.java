package com.chautha.dal.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rewati Raman
 */
public interface BasicEntityDao< T extends Serializable> {
    /**
     * Generic Save. This will save single entity in DB
     * @param object
     */
    public void save(T object);

    /**
     * This will update single entity in db
     * @param object
     */
    public void update(T object);

    /**
     * This will get single object based on uuid provided
     * @param uuid
     * @return
     */
    public T getByUuid(String uuid);

    /**
     *
     * @return
     */
    public List<T> getList();

    /**
     *
     * @param object
     */
    public void delete(T object);
}
