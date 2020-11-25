package edu.nf.git.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author long
 */
public class MybatisUtil {

    //创建SqlSessionFactory对象
    private static SqlSessionFactory sqlSessionFactory;

    //初始化SqlSessionFactory
    static {
        try {
            //解析一个输入流
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    //获取SqlSession
    public static SqlSession getSqlSession(boolean autoCommit){
        return sqlSessionFactory.openSession(autoCommit);
    }
}
