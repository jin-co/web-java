package com.example.employeecrudthymeleaf.service;

import com.example.employeecrudthymeleaf.entity.Employee;
import com.example.employeecrudthymeleaf.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> getAll() {
//        return employeeRepo.findAll();
        return employeeRepo.findAllByOrderByLastNameAsc();
    }

    public Employee getOne(int id) {
        return employeeRepo.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
