package com.teng.bean;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2021-05-14 21:35
 */
public class Employee implements Serializable {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;
    private int money;
    private Department department;

    public Employee() {
    }

    public Employee(String lastName, int money) {
        this.lastName = lastName;
        this.money = money;
    }

    public Employee(Integer id, String lastName, String email, String gender) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", money=" + money +
                ", department=" + department +
                '}';
    }
}
