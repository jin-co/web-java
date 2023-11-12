package com.example.dbrel.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_detail")
public class EmployeeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String department;

    private String hobby;

    //    @OneToOne(mappedBy = "employeeDetail", cascade = CascadeType.ALL)
    @OneToOne(mappedBy = "employeeDetail", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Employee employee;

    public EmployeeDetail() {
    }

    public EmployeeDetail(String department, String hobby) {
        this.department = department;
        this.hobby = hobby;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
