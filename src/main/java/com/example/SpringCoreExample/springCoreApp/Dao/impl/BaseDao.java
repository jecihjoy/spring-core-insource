package com.example.SpringCoreExample.springCoreApp.Dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BaseDao {

    protected static EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LOCAL_PERSISTENCE");
        return emf.createEntityManager();
    }
}
