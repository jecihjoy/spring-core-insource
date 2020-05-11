package com.example.SpringCoreExample.springCoreApp.Dao;

import com.example.SpringCoreExample.springCoreApp.Model.Employee;

import java.util.List;

public interface EmployeeDao{

    Employee findById(Long id);

    List<Employee> findAll();

    Employee saveOrUpdateEmployee(Employee employee);

    void deleteEmployee(Long id);
}
