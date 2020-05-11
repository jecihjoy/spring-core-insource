package com.example.SpringCoreExample.springCoreApp.Dao;

import com.example.SpringCoreExample.springCoreApp.Model.Employee;

public interface EmployeeDao{

    Employee findById(Long id);
}
