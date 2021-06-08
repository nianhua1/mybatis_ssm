package com.teng.bean;

import com.teng.dao.EmployeeMapper;

import java.io.Serializable;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-05-16 21:16
 */
public class Department implements Serializable {
    private Integer id;
    private String departmentName;
    private List<Employee> employees;

    public Department() {
    }

    public Department(Integer id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
