package com.solvd.army.dao.impl;

import com.solvd.army.dao.AmmunitionDAO;
import com.solvd.army.models.equipment.Ammunition;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class AmmunitionDAOImpl implements AmmunitionDAO {
    private SqlSessionFactory sqlSessionFactory;
    public AmmunitionDAOImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Ammunition getById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Ammunition ammunition = sqlSession.selectOne("test.getAmmunitionById",id);
        sqlSession.close();
        return ammunition;
    }

    @Override
    public void insert(Ammunition ammunition) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("test.insertAmmunition",ammunition);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.update("test.updateAmmunition",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("test.deleteAmmunition",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Ammunition> getAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Ammunition> ammunition = sqlSession.selectList("test.getAll");
        sqlSession.close();
        return ammunition;
    }
}
