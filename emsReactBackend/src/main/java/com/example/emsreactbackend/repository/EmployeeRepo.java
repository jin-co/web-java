package com.example.emsreactbackend.repository;

import com.example.emsreactbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
