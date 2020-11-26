package edu.nf.git.dao;

import edu.nf.git.entity.Users;

import java.util.List;

/**
 * @author long
 */
public interface UserDao {

    /**
     * 注册功能
     */
    void add(Users user);

    /**
     * 查询列表信息
     * @return
     */
    List<Users> listCity();
}
