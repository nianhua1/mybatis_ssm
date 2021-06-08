package com.teng.service;

import com.teng.bean.Employee;
import com.teng.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @author shkstart
 * @create 2021-05-19 22:58
 */
@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private SqlSession sqlSession;

    public List<Employee> getEmps(){
        List<Employee> employees = employeeMapper.getEmployees();
        return  employees;
    }

    public void tranAccount(){
        System.out.println("转账开始");
        employeeMapper.reduceMoney(new Employee("ali",100));
        System.out.println("转账中");
        //模拟网络异常
        int i= 12/0;
        employeeMapper.addMoney(new Employee("taozi",100));
        System.out.println("转账结束");
    }

    public void addEmployee(){
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        long start = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            mapper.addEmp(new Employee(null, UUID.randomUUID().toString().substring(1,5),"a","0"));
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
