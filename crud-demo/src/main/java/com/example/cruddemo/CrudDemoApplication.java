package com.example.cruddemo;

import com.example.cruddemo.dao.EmployeeDAO;
import com.example.cruddemo.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(EmployeeDAO employeeDAO) {
        return runner -> {
            createEmployee(employeeDAO);
            getEmployee(employeeDAO);
            getEmployees(employeeDAO);
            getEmployeesByLastName(employeeDAO);
            updateEmployee(employeeDAO);
            deleteEmployee(employeeDAO);
            deleteAll(employeeDAO);
        };
    }

    private void deleteAll(EmployeeDAO employeeDAO) {
        int deleted = employeeDAO.deleteAll();
        System.out.println(deleted);
    }

    private void deleteEmployee(EmployeeDAO employeeDAO) {
        int id = 1;
        employeeDAO.delete(1);
    }

    private void updateEmployee(EmployeeDAO employeeDAO) {
        int id = 1;
        Employee employee = employeeDAO.findById(id);
        employee.setFirstName("Stone");
        employeeDAO.update(employee);
        System.out.println(employee);
    }

    private void getEmployeesByLastName(EmployeeDAO employeeDAO) {
        List<Employee> employees = employeeDAO.findByLastName("Pa");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private void getEmployees(EmployeeDAO employeeDAO) {
        List<Employee> employees = employeeDAO.findAll();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private void getEmployee(EmployeeDAO employeeDAO) {
        System.out.println("employeeDAO.findById(1) = " + employeeDAO.findById(1));
    }

    private void createEmployee(EmployeeDAO employeeDAO) {
        System.out.println("created");
        Employee employee = new Employee("Tim", "Pa", "pa@c.com");

        employeeDAO.save(employee);
    }
}
