package com.example.employeepractice.repos;

import com.example.employeepractice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "workers")
public interface EmpRepo extends JpaRepository<Employee, Integer> {
}
