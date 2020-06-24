package com.example.SpringCoreExample.springCoreApp.Dao.impl;

import com.example.SpringCoreExample.springCoreApp.Dao.EmployeeDao;
import com.example.SpringCoreExample.springCoreApp.Model.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDaoImpl extends BaseDao  implements EmployeeDao {

    @Override
    public Employee findById(Long id) {
        return getEntityManager().find(Employee.class, id);
    }

    @Override
    public List<Employee> findAll() {
        return getEntityManager().createQuery("Select e from Employee e").getResultList();
    }

    @Override
    public Employee saveOrUpdateEmployee(Employee employee) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Employee result = em.merge(employee);
        em.getTransaction().commit();
        return result;
    }

    @Override
    public void deleteEmployee(Long id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Employee emp = em.find(Employee.class, id);
        em.remove(emp);
        em.getTransaction().commit();
    }
}
