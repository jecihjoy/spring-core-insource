package com.example.SpringCoreExample.springCoreApp.Service.impl;

import com.example.SpringCoreExample.springCoreApp.Dao.EmployeeDao;
import com.example.SpringCoreExample.springCoreApp.Model.Employee;
import com.example.SpringCoreExample.springCoreApp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee findById(Long id) {
        return employeeDao.findById(id);
    }
}
