package com.example.employeepractice.rest;

import com.example.employeepractice.dao.EmployeeDAO;
import com.example.employeepractice.entity.Employee;
import com.example.employeepractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
//    private EmployeeDAO employeeDAO;
//
//    public EmployeeController(EmployeeDAO employeeDAO) {
//        this.employeeDAO = employeeDAO;
//    }

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
