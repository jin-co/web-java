package com.example.testemployee.controller;

import com.example.testemployee.entity.Employee;
import com.example.testemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void delelteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
