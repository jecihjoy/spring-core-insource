package com.example.SpringCoreExample.springCoreApp.Dao.impl;

import com.example.SpringCoreExample.springCoreApp.Dao.EmployeeDao;
import com.example.SpringCoreExample.springCoreApp.Model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends BaseDao  implements EmployeeDao {

    @Override
    public Employee findById(Long id) {
        return getEntityManager().find(Employee.class, id);
    }
}
