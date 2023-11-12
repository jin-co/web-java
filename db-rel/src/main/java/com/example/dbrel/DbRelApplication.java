package com.example.dbrel;

import com.example.dbrel.dao.AppDAO;
import com.example.dbrel.entity.Employee;
import com.example.dbrel.entity.EmployeeDetail;
import com.example.dbrel.entity.Project;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DbRelApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbRelApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runner -> {
//            createEmployee(appDAO);
//            findOne(appDAO);
//            deleteEmployee(appDAO);
//            findEmployeeDetail(appDAO);
//            deleteEmployeeDetail(appDAO);
            createEmployeeWithProject(appDAO);
        };
    }

    private void createEmployeeWithProject(AppDAO appDAO) {
        Employee employee = new Employee("Saq", "Oneal", "saq@s.com");
        EmployeeDetail employeeDetail = new EmployeeDetail("Sale", "Basket ball");
        employee.setEmployeeDetail(employeeDetail);
        Project project1 = new Project("P-one");
        Project project2 = new Project("P-two");
        employee.add(project1);
        employee.add(project2);
        appDAO.save(employee);
    }

    private void deleteEmployeeDetail(AppDAO appDAO) {
        int id = 2;
        appDAO.deleteEmployeeDetail(id);
    }

    private void findEmployeeDetail(AppDAO appDAO) {
        int id = 1;
        EmployeeDetail employeeDetail = appDAO.findEmployeeDetail(id);
        System.out.println(employeeDetail);
        System.out.println(employeeDetail.getEmployee());
    }

    private void deleteEmployee(AppDAO appDAO) {
        int id = 1;
        appDAO.deleteEmployee(id);
    }

    private void findOne(AppDAO appDAO) {
        int id = 1;
        Employee employee = appDAO.findOne(id);
        System.out.println(employee);
        System.out.println(employee.getEmployeeDetail());
    }

    private void createEmployee(AppDAO appDAO) {
        Employee employee = new Employee("Saq", "Oneal", "saq@s.com");
        EmployeeDetail employeeDetail = new EmployeeDetail("Sale", "Basket ball");
        employee.setEmployeeDetail(employeeDetail);
        appDAO.save(employee);
    }
}
