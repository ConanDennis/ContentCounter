package com.qunar.homework.service;
import com.qunar.homework.pojo.User;

import java.util.List;

/**
 * Created by yangli on 2016/8/10.
 */
public interface IUserService {
    public User getUserById(int userId);

    public int saveUser(User user);

    public List<User> getAll();

    public List<User> getUserInRange(String tableName ,List<Integer> list);

    public List<User> getUserInRangeM(String tableName,List<String> userNameList);

}
