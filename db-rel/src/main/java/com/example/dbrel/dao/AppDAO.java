package com.example.dbrel.dao;

import com.example.dbrel.entity.Employee;
import com.example.dbrel.entity.EmployeeDetail;

public interface AppDAO {
    void save(Employee employee);

    Employee findOne(int id);

    void deleteEmployee(int id);

    EmployeeDetail findEmployeeDetail(int id);

    void deleteEmployeeDetail(int id);
}
