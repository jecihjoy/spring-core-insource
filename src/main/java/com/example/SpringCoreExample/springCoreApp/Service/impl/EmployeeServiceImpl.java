package com.example.SpringCoreExample.springCoreApp.Service.impl;

import com.example.SpringCoreExample.springCoreApp.Dao.EmployeeDao;
import com.example.SpringCoreExample.springCoreApp.Model.Employee;
import com.example.SpringCoreExample.springCoreApp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee findById(Long id) {
        return employeeDao.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee saveOrUpdateEmployee(Employee employee) {
        return employeeDao.saveOrUpdateEmployee(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeDao.deleteEmployee(id);
    }
}
