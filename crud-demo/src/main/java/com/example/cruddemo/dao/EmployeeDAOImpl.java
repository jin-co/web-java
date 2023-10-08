package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Employee student) {
        entityManager.persist(student);
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee order by lastName", Employee.class);

        return query.getResultList();
    }

    @Override
    public List<Employee> findByLastName(String lastName) {
        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee WHERE lastName=:name", Employee.class);
        query.setParameter("name", lastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Employee student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Employee student = entityManager.find(Employee.class, id);
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int deleted = entityManager.createQuery("DELETE FROM Employee").executeUpdate();
        return deleted;
    }
}
