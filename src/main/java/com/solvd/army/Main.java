package com.solvd.army;

import com.solvd.army.connectionPool.BasicConnectionPool;
import com.solvd.army.connectionPool.ConnectionPool;
import com.solvd.army.dao.SoldierDAO;
import com.solvd.army.dao.impl.SoldierDAOImpl;
import com.solvd.army.models.structure.Soldier;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    private static SqlSessionFactory sqlSessionFactory;

    public static void main(String[] args) throws IOException {
//        try {
//            Properties properties = new Properties();
//            properties.load(new FileInputStream("src/main/resources/db.properties"));
//            ConnectionPool connectionPool =  BasicConnectionPool.create(properties.getProperty("db.url"),
//                    properties.getProperty("db.username"),properties.getProperty("db.password"));
//            try (Statement statement = connectionPool.getConnection().createStatement()){
//                statement.execute("insert into 'mydb'.'Ranks' ('rank') values('General')");
//            }
//        }catch (SQLException e){
//            throw new RuntimeException(e.getMessage());
//

        String resource = "mybatis/mybatis-config.xml";
        InputStream inputstream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputstream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SoldierDAO soldierDAO = sqlSession.getMapper(SoldierDAO.class);
        Soldier soldier = soldierDAO.getById(1);
        LOGGER.info(soldier);

//        String resource = "mybatis/mybatis-config.xml";
//        InputStream inputstream = Resources.getResourceAsStream(resource);
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputstream);
//
//        SoldierDAO userDao = new SoldierDAOImpl(sqlSessionFactory);
//        Soldier soldier = userDao.getById(1);
//        LOGGER.info(soldier);

    }
}