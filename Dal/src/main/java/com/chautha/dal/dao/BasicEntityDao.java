package com.chautha.dal.dao;

import java.io.Serializable;

/**
 * Created by rewati on 9/21/14.
 */
public interface BasicEntityDao< T extends Serializable> {
    public void save(T object);
    public void update(T object);
    public T getByUuid(String uuid);
    public void delete(T object);
}
