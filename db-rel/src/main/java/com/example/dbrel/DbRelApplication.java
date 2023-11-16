package com.example.dbrel;

import com.example.dbrel.dao.AppDAO;
import com.example.dbrel.entity.Employee;
import com.example.dbrel.entity.EmployeeDetail;
import com.example.dbrel.entity.Memo;
import com.example.dbrel.entity.Project;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
//            createEmployeeWithProject(appDAO);
//            findEmployeeWithProjects(appDAO);
//            findProjectForEmployee(appDAO);
//            findEmployeeWithProjectJoinFetch(appDAO);
//            updateEmployee(appDAO);
//            updateProject(appDAO);
//            deleteEmployee(appDAO);
//            deleteProject(appDAO);
//            createProjectWithMemo(appDAO);
            retrieveProjectMemo(appDAO);
        };
    }

    private void retrieveProjectMemo(AppDAO appDAO) {
        int id = 1;
        Project project = appDAO.findProjectAndMemoByProjectId(id);
    }

    private void createProjectWithMemo(AppDAO appDAO) {
        Project project = new Project("Pacman");
        project.addMemo(new Memo("One"));
        project.addMemo(new Memo("Two"));

        appDAO.save(project);
    }

    private void deleteProject(AppDAO appDAO) {
        int id = 1;
        appDAO.deleteProjectByid(id);
    }

    private void updateProject(AppDAO appDAO) {
        int id = 1;
        Project project = appDAO.findProjectById(id);
        project.setTitle("Great");
        appDAO.update(project);
    }

    private void updateEmployee(AppDAO appDAO) {
        int id = 1;
        Employee employee = appDAO.findOne(id);
        employee.setLastName("Good");
        appDAO.update(employee);
    }

    private void findEmployeeWithProjectJoinFetch(AppDAO appDAO) {
        int id = 1;
        Employee employee = appDAO.findEmployeeByIdJoinFetch(id);
        System.out.println(employee);
        System.out.println(employee.getProjects());
    }

    private void findProjectForEmployee(AppDAO appDAO) {
        int id = 1;
        Employee employee = appDAO.findOne(id);

        List<Project> projects = appDAO.findProjectByEmployee(id);
        employee.setProjects(projects);
        System.out.println(employee.getProjects());
    }

    private void findEmployeeWithProjects(AppDAO appDAO) {
        int id = 1;
        Employee employee = appDAO.findOne(id);
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
