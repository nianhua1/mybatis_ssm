package com.teng.dao;

import com.teng.bean.Employee;

import java.util.List;

/**
 * @author shkstart
 * @create 2021-05-15 10:26
 */

public interface EmployeeMapper {

    public List<Employee> getEmployees();

    public int reduceMoney(Employee employee);

    public int addMoney(Employee employee);

    public int addEmp(Employee employee);

}
