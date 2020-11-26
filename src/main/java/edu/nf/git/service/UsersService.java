package edu.nf.git.service;

import edu.nf.git.dao.UserDao;
import edu.nf.git.dao.impl.UserDaoImpl;
import edu.nf.git.entity.Users;

import java.util.List;

/**
 * @author long
 */
public class UsersService {

    /**
     * 查询列表所有信息
     * @return
     */
    public List<Users> listCity(){
        UserDao dao = new UserDaoImpl();
        return  dao.listCity();
    }
}
