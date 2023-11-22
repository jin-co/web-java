package com.example.dbrel.dao;

import com.example.dbrel.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AppDAOImpl implements AppDAO {

    private EntityManager entityManager;

    @Autowired
    public AppDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public Employee findOne(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        List<Project> projects = employee.getProjects();
        for (Project project : projects) {
            project.setEmployee(null);
        }

        entityManager.remove(employee);
    }

    @Override
    public EmployeeDetail findEmployeeDetail(int id) {
        return entityManager.find(EmployeeDetail.class, id);
    }

    @Override
    @Transactional
    public void deleteEmployeeDetail(int id) {
        EmployeeDetail employeeDetail = entityManager.find(EmployeeDetail.class, id);
        employeeDetail.getEmployee().setEmployeeDetail(null);
        entityManager.remove(employeeDetail);
    }

    @Override
    public List<Project> findProjectByEmployee(int id) {
        //creating query
        TypedQuery<Project> query = entityManager.createQuery(
                "select * from Project where employee.id=:data", Project.class
        );
        query.setParameter("data", id);

        //executing query
        List<Project> project = query.getResultList();
        return project;
    }

    @Override
    public Employee findEmployeeByIdJoinFetch(int id) {
        TypedQuery<Employee> query = entityManager.createQuery(
                "select e from Employee e JOIN FETCH e.projects JOIN FETCH e.employeeDetail where e.id = :data", Employee.class
        );
        return null;
    }

    @Override
    @Transactional
    public void update(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    @Transactional
    public void update(Project project) {
        entityManager.merge(project);
    }

    @Override
    @Transactional
    public Project findProjectById(int id) {
        return entityManager.find(Project.class, id);
    }

    @Override
    @Transactional
    public void deleteProjectByid(int id) {
        Project project = entityManager.find(Project.class, id);
        entityManager.remove(project);
    }

    @Override
    @Transactional
    public void save(Project project) {
        entityManager.persist(project);
    }

    @Override
    public Project findProjectAndMemoByProjectId(int id) {
        TypedQuery<Project> query = entityManager.createQuery(
                "select p from Project p JOIN FETCH p.memos where p.id = :data", Project.class
        );
        query.setParameter("data", id);
        Project project = query.getSingleResult();
        return project;
    }

    @Override
    public Workshop findWorkshopAndEmployeeByWorkshopId(int id) {
        TypedQuery<Workshop> query = entityManager.createQuery(
                "select w from Workshop w JOIN FETCH w.employees where w.id = :data", Workshop.class
        );
        query.setParameter("data", id);
        Workshop workshop = query.getSingleResult();
        return workshop;
    }
}
