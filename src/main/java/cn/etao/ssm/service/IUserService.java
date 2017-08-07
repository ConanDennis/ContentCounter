package cn.etao.ssm.service;
import cn.etao.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
