package edu.nf.git.service;

import edu.nf.git.dao.UserDao;
import edu.nf.git.dao.impl.UserDaoImpl;
import edu.nf.git.entity.Users;

/**
 * @author long
 */
public class AddService {

    public Users addUser(Users user){
        UserDao dao = new UserDaoImpl();
        dao.add(user);
        return user;
    }
}
