package com.example.dbrel.dao;

import com.example.dbrel.entity.Employee;
import com.example.dbrel.entity.EmployeeDetail;
import com.example.dbrel.entity.Memo;
import com.example.dbrel.entity.Project;

import java.util.List;

public interface AppDAO {
    void save(Employee employee);

    Employee findOne(int id);

    void deleteEmployee(int id);

    EmployeeDetail findEmployeeDetail(int id);

    void deleteEmployeeDetail(int id);

    List<Project> findProjectByEmployee(int id);

    Employee findEmployeeByIdJoinFetch(int id);

    void update(Employee employee);

    void update(Project project);

    Project findProjectById(int id);

    void deleteProjectByid(int id);

    void save(Project project);

    Project findProjectAndMemoByProjectId(int id);
}
