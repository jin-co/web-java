package com.example.testemployee2.controller;

import com.example.testemployee2.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
    private List<Employee> employeeList;

    @GetMapping("")
    public List<Employee> getEmployees() {

        return employeeList;
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeList.get(id);
    }
}
