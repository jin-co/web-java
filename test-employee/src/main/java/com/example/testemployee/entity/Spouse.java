package com.example.testemployee.entity;

import jakarta.persistence.*;

@Entity
public class Spouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int spouseId;
    private String spouseName;
    private String spouseMobile;
    private int age;

    @OneToOne(mappedBy = "spouse")
    private Employee employee;

    public Spouse() {
    }

    public Spouse(String spouseName, String spouseMobile, int age, Employee employee) {
        this.spouseName = spouseName;
        this.spouseMobile = spouseMobile;
        this.age = age;
        this.employee = employee;
    }

    public int getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(int spouseId) {
        this.spouseId = spouseId;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseMobile() {
        return spouseMobile;
    }

    public void setSpouseMobile(String spouseMobile) {
        this.spouseMobile = spouseMobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
