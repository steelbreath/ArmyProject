package com.solvd.army.dao.impl;

import com.solvd.army.dao.ContractDAO;
import com.solvd.army.models.documents.Contract;
import com.solvd.army.models.structure.Soldier;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ContractDAOImpl implements ContractDAO {
    private SqlSessionFactory sqlSessionFactory;
    public ContractDAOImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Contract getById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Contract contract = sqlSession.selectOne("test.getContractById",id);
        sqlSession.close();
        return contract;
    }

    @Override
    public void insert(Contract contract) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("test.insertContract",contract);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.update("test.updateContract",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("test.deleteContract",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Contract> getAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Contract> contracts = sqlSession.selectList("test.getAll");
        sqlSession.close();
        return contracts;
    }
}
