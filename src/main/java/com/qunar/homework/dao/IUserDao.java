package com.qunar.homework.dao;
import com.qunar.homework.pojo.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();

    List<User> selectInRange(@Param("tableName")String tableName , @Param("idList") List<Integer> idList);

    List<User> selectInRangeM(@Param("tableName")String tableName , @Param("userNameList") List<String> userNameList);

}