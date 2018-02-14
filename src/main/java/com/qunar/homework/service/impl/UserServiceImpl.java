package com.qunar.homework.service.impl;

import com.qunar.homework.dao.IUserDao;
import com.qunar.homework.pojo.User;
import com.qunar.homework.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangli on 2016/8/10.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int saveUser(User user){
        return userDao.insertSelective(user);
    }

    @Override
    public List<User> getAll(){
        return userDao.selectAll();
    }

    @Override
    public List<User> getUserInRange(String tableName,List<Integer> list){
        return userDao.selectInRange(tableName,list);
    }

    @Override
    public List<User> getUserInRangeM(String tableName,List<String> userNameList) {
        return userDao.selectInRangeM(tableName,userNameList);
    }


}
