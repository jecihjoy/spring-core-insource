package com.example.SpringCoreExample.springCoreApp.Service;

import com.example.SpringCoreExample.springCoreApp.Dao.EmployeeDao;
import com.example.SpringCoreExample.springCoreApp.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee findById(Long id) {
       return employeeDao.findById(id);
    }
}
