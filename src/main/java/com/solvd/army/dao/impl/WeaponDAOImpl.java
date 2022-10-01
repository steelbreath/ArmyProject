package com.solvd.army.dao.impl;

import com.solvd.army.dao.WeaponDAO;
import com.solvd.army.models.equipment.Weapon;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class WeaponDAOImpl implements WeaponDAO {
    private SqlSessionFactory sqlSessionFactory;
    public WeaponDAOImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Weapon getById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Weapon weapon = sqlSession.selectOne("test.getWeaponById",id);
        sqlSession.close();
        return weapon;
    }

    @Override
    public void insert(Weapon weapon) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("test.insertWeapon",weapon);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.update("test.updateWeapon",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("test.deleteWeapon",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Weapon> getAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Weapon> weapons = sqlSession.selectList("test.getAll");
        sqlSession.close();
        return weapons;
    }
}
