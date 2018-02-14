package com.qunar.homework.service;

import com.qunar.homework.pojo.Employee;

import java.util.List;

/**
 * Created by yangli on 2016/8/23.
 */
public interface IEmployeeService {
    public Employee getEmployeeById(int employeeId);

    public int saveEmployee(Employee employee);

    public List<Employee> getEmployeeList();
}
