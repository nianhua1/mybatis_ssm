package com.teng.controller;

import com.teng.bean.Employee;
import com.teng.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2021-05-19 22:51
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/emps")
    public String getEmps(Map<String,Object> map){
        List<Employee> emps = employeeService.getEmps();
        map.put("emps",emps);
        return "list";
    }

    @RequestMapping("/tranAccount")
    public String tranAcc(){
        employeeService.tranAccount();
        return "success";
    }

    @RequestMapping("/addEmp")
    public String addEmployee(){
        employeeService.addEmployee();
        return "success";
    }
}
