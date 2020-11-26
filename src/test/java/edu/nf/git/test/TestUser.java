package edu.nf.git.test;

import edu.nf.git.dao.UserDao;
import edu.nf.git.dao.impl.UserDaoImpl;
import edu.nf.git.entity.Users;
import org.junit.Test;

import java.util.List;

public class TestUser {

    @Test
    public void testListUser(){
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listCity();
        list.forEach(users -> System.out.println(users.getId()+":"+users.getName()+":"+users.getAge()+":"+users.getTel()));
    }

    @Test
    public void testAddUser(){
        Users user = new Users();
        user.setId(13);
        user.setName("longlong");
        user.setAge(18);
        user.setTel("15083594530");
        UserDao dao = new UserDaoImpl();
        dao.add(user);
    }
}
