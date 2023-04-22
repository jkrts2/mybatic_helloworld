package com.jkrts.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {

    public static SqlSession getSqlSession(){
        SqlSession SqlSession = null;
        try {
    //获取核心配置文件的输入流
            InputStream is = Resources.getResourceAsStream("mybatis-cofig.xml");
            //获取SqlSessionFactoryBuilder
            SqlSessionFactoryBuilder SqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //获取SqlSessionFactory
            SqlSessionFactory SqlSessionFactory = SqlSessionFactoryBuilder.build(is);
            //获取SqlSession对象
            SqlSession = SqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SqlSession;
    }

}
