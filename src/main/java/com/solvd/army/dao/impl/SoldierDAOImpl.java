package com.solvd.army.dao.impl;


import com.solvd.army.dao.SoldierDAO;
import com.solvd.army.models.structure.Soldier;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class SoldierDAOImpl implements SoldierDAO {
    private SqlSessionFactory sqlSessionFactory;
    public SoldierDAOImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }


    @Override
    public Soldier getById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Soldier soldier = sqlSession.selectOne("test.getSoldierById",id);
        sqlSession.close();
        return soldier;
    }

    @Override
    public void insert(Soldier soldier) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("test.insertSoldier",soldier);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.update("test.updateSoldier",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("test.deleteSoldier",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Soldier> getAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Soldier> soldiers = sqlSession.selectList("test.getAll");
        sqlSession.close();
        return soldiers;
    }

    @Override
    public Soldier findSoldierByName(String name){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Soldier soldier = sqlSession.selectOne("test.getSoldierById",name);
        sqlSession.close();
        return soldier;
    }
}
