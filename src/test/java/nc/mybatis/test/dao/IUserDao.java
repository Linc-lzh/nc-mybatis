package nc.mybatis.test.dao;

import nc.mybatis.test.po.User;

import java.util.List;

public interface IUserDao {

    User queryUserInfoById(Long id);
    
    List<User> queryUserList(User user);
}
