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
            new Employee(2L, "Tom", "New York")
    ));

    public List<Employee> getEmployees() {
        return employeeList;
    }

    public Employee getEmployee(Long id) {
        return employeeList.stream().filter(e -> (
                e.getEmployeeId() == id
        )).findFirst().get();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void updateEmployee(Employee employee) {
        List<Employee> temp = new ArrayList<>();
        for (Employee e: employeeList) {
            if (e.getEmployeeId() == employee.getEmployeeId()) {
                e.setEmployeeCity(employee.getEmployeeCity());
                e.setEmployeeName(employee.getEmployeeName());
            }
            temp.add(e);
        }
        employeeList = temp;
    }

    public void deleteEmployee(Long id) {
        List<Employee> temp = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getEmployeeId() == id) {
                continue;
            }
            temp.add(e);
        }
        employeeList = temp;
    }
}
