package com.solvd.army.dao;


import java.util.List;

public interface DAOPattern <T> {
     T getById(int id);
     void insert(T t);
     void update(int id);
     void delete(int id);
     List<T> getAll();
}
