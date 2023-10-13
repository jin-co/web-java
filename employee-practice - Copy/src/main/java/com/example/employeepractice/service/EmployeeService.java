package com.example.employeepractice.service;

import com.example.employeepractice.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void delete(int id);

    void update(int id);
}
