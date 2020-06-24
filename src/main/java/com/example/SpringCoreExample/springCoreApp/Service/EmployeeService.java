package com.example.SpringCoreExample.springCoreApp.Service;

import com.example.SpringCoreExample.springCoreApp.Model.Employee;
import org.springframework.lang.NonNull;

import java.util.List;

public interface EmployeeService {

    Employee findById(@NonNull Long id);

    List<Employee> findAll();

    Employee saveOrUpdateEmployee(@NonNull Employee employee);

    void deleteEmployee(Long id);
}
