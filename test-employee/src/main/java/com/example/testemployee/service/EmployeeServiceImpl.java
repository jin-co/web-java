package com.example.testemployee.service;

import com.example.testemployee.entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1, "Tom", "Washington"),
            new Employee(2, "Jack", "New York")
    ));

    @Override
    public List<Employee> getEmployees() {
        return employeeList;
    }

    @Override
    public Employee getEmployee(int id) {
//        return employeeList.stream().filter(e -> (
//                e.getEmployeeId() == id
//                )).findFirst().get();
        return employeeList.get(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        List<Employee> tempList = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getEmployeeId() == employee.getEmployeeId()) {
                e.setEmployeeName(employee.getEmployeeName());
                e.setEmployeeCity(employee.getEmployeeCity());
            }
            tempList.add(e);
        }
        employeeList = tempList;
    }

    @Override
    public void deleteEmployee(int id) {
        List<Employee> tempList = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getEmployeeId() == id) {
                continue;
            }
            tempList.add(e);
        }
        employeeList = tempList;
    }
}
