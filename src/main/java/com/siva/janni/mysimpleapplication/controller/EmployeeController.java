package com.siva.janni.mysimpleapplication.controller;

import com.siva.janni.mysimpleapplication.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    List<Employee> employees = List.of(
            new Employee(102, "John", 10000),
            new Employee(103, "Johny", 20000),
            new Employee(104, "Holly", 80000),
            new Employee(105, "Jenny", 10000)
    );

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employees;
    }
}
