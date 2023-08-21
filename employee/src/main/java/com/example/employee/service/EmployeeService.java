package com.example.employee.service;

import com.example.employee.entity.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1, "John", "Washington"),
            new Employee(2, "Tom", "Waterloo")
    ));

    public List<Employee> getEmployees() {
        return employeeList;
    }

    public Employee getEmployee(int employeeId) {
        return employeeList.stream().filter(e -> (
                e.getEmployeeId() == employeeId
        )).findFirst().get();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void updateEmployee(Employee employee) {
        List<Employee> tempList = new ArrayList<>();
        for (Employee e: employeeList) {
            if(e.getEmployeeId() == employee.getEmployeeId()) {
                e.setEmployeeName(employee.getEmployeeName());
                e.setEmployeeCity(employee.getEmployeeCity());
            }
            tempList.add(e);
        }
        this.employeeList = tempList;
    }

    public void deleteEmployee(int id) {
        List<Employee> tempList = new ArrayList<>();
        for (Employee e: employeeList) {
            if(e.getEmployeeId() == id) {
                continue;
            }
            tempList.add(e);
        }
        this.employeeList = tempList;
    }
}
