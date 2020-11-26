package edu.nf.git.service;

import edu.nf.git.dao.UserDao;
import edu.nf.git.dao.impl.UserDaoImpl;
import edu.nf.git.entity.Users;

import java.util.List;

/**
 * @author long
 */
public class AddService {


    public void AddUsers(Users user){
        UserDao dao = new UserDaoImpl();
        dao.add(user);
    }
}
