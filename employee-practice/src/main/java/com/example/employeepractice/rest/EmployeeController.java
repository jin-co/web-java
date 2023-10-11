package com.example.employeepractice.rest;

import com.example.employeepractice.dao.EmployeeDAO;
import com.example.employeepractice.entity.Employee;
import com.example.employeepractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{id")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.findById(id);
        if (employee == null) {
            throw new RuntimeException("not found");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeService.save(employee);
        employee1.setId(0);
        return employee1;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeService.save(employee);
        return employee1;
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.findById(id);
        if (employee == null) {
            throw new RuntimeException("not exist");
        }
        employeeService.delete(id);
        return "deleted";
    }
}
