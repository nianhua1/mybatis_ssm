package com.teng.dao;

import com.teng.bean.Department;

/**
 * @author shkstart
 * @create 2021-05-16 21:43
 */
public interface DepartmentMapper {
    public Department getDeptById(Integer id);

    public Department getDeptByIdPlus(Integer id);

    public Department getDeptByIdStep(Integer id);
}
