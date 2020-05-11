package com.example.SpringCoreExample;

import com.example.SpringCoreExample.springCoreApp.Model.Employee;
import com.example.SpringCoreExample.springCoreApp.Service.EmployeeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.SpringCoreExample.springCoreApp")
public class SpringCoreApplication {

    private static Log log = LogFactory.getLog(com.example.SpringCoreExample.SpringCoreExampleApplication.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringCoreApplication.class);

        log.info("Application running");
        //find by id
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        log.info("The employee retrieved is " + employeeService.findById(1l).getFirstName() + " " + employeeService.findById(1l).getLastName());

        //creating new employee
        employeeService.saveOrUpdateEmployee(new Employee("Test Test", "User"));

        //updating existing employee
        Employee em = employeeService.findById(2l);
        em.setLastName("Nipple");
        employeeService.saveOrUpdateEmployee(em);

        //find all
        for (Employee e : employeeService.findAll()) {
            log.info("The employee retrieved is " + e.getFirstName() + " " + e.getLastName());
        }

        //delete employee
        employeeService.deleteEmployee(7l);

        context.close();
    }

}
