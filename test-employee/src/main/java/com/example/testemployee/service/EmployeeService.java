package com.example.testemployee.service;

import com.example.testemployee.entity.Address;
import com.example.testemployee.entity.Employee;
import com.example.testemployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(int employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    public void addEmployee(Employee employee) {
        ArrayList<Address> addressArrayList = new ArrayList<>();
        for (Address address : employee.getAddress()) {
            addressArrayList.add(new Address(
                    address.getZip(),
                    address.getCity(),
                    address.getState(),
                    address.getCountry()
            ));
        }
        employee.setAddress(addressArrayList);
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee) {
        /*
         * jpa only has the save command.
         * If the ID sent exists in the DB,
         * it will be updated otherwise new item will be saved
         */
        employeeRepository.save(employee);
    }

    public void deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
