package edu.nf.git.dao.impl;

import edu.nf.git.dao.UserDao;
import edu.nf.git.entity.Users;
import edu.nf.git.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author long
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void add(Users user) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).add(user);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Users> listCity() {
        //获取SqlSession对象，并设置为自动提交
        try (SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listCity();
        }catch (RuntimeException e){
            throw e;
        }
    }
}
