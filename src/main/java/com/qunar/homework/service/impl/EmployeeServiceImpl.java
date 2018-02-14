package com.qunar.homework.service.impl;

import com.qunar.homework.dao.IEmployeeDao;
import com.qunar.homework.pojo.Employee;
import com.qunar.homework.service.IEmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangli on 2016/8/23.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {
    @Resource
    private IEmployeeDao employeeDao;

    @Override
    public Employee getEmployeeById(int employeeId) {
        return employeeDao.selectByPrimaryKey(employeeId);
    }

    @Override
    public int saveEmployee(Employee employee) {
        return employeeDao.insertSelective(employee);
    }

    @Override
    public List<Employee> getEmployeeList() {
        return employeeDao.selectList();
    }
}
