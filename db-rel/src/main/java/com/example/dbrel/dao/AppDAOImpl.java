package com.example.dbrel.dao;

import com.example.dbrel.entity.Employee;
import com.example.dbrel.entity.EmployeeDetail;
import com.example.dbrel.entity.Project;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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
                "from Project where employee.id=:data", Project.class
        );
        query.setParameter("data", id);

        //excuting query
        List<Project> project = query.getResultList();
        return project;
    }
}
