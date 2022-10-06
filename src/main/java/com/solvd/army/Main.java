package com.solvd.army;

import com.solvd.army.dao.AmmunitionDAO;
import com.solvd.army.dao.impl.AmmunitionDAOImpl;
import com.solvd.army.models.equipment.Ammunition;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.*;

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

//        String resource = "mybatis/mybatis-config.xml";
//        InputStream inputstream = Resources.getResourceAsStream(resource);
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputstream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();

//        RankDAO rankDAO = sqlSession.getMapper(RankDAO.class);
//        Rank rank = rankDAO.getById(1);
//        LOGGER.info(rank);

        String resource = "mybatis/mybatis-config.xml";
        InputStream inputstream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputstream);

        AmmunitionDAO ammunitionDao = new AmmunitionDAOImpl(sqlSessionFactory);
        Ammunition ammunition = ammunitionDao.getById(1);
        LOGGER.info(ammunition);

    }
}