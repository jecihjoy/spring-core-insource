package com.example.SpringCoreExample.springCoreApp.Dao;

import com.example.SpringCoreExample.springCoreApp.Model.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Repository
public class EmployeeDao{

    public static EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LOCAL_PERSISTENCE");
        return emf.createEntityManager();
    }

    public Employee findById(Long id) {
        EntityManager em = getEntityManager();
        return em.find(Employee.class, id);
    }
}
