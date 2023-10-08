package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    List<Employee> findByLastName(String lastName);

    Employee findById(int id);

    void save(Employee employee);

    void update(Employee employee);

    void delete(int id);

    int deleteAll();
}
