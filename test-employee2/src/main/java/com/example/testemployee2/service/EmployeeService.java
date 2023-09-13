package com.example.testemployee2.service;

import com.example.testemployee2.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1L, "John", "Washington"),
            new Employee(1L, "John", "Washington")
    ));

    public List<Employee> getEmployees() {
        return employeeList;
    }

    public Employee getEmployee(Long id) {
        return employeeList.stream().filter(e -> (
                e.getId() == id
        )).findFirst().get();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public updateEmployee(Employee employee) {
        List<Employee> temp = new ArrayList<>();
        employeeList.stream().filter(e -> (
                e.getId() == employee.getId()
                ))
        employeeList
    }

}
