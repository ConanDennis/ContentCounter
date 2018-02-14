package com.qunar.homework.dao;

import com.qunar.homework.pojo.Employee;

import java.util.List;

/**
 * Created by yangli on 2016/8/23`.
 */
public interface IEmployeeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> selectList();
}
