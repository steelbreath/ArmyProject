package com.solvd.army.dao;

import com.solvd.army.models.structure.Soldier;

public interface SoldierDAO extends DAOPattern<Soldier> {
    Soldier findSoldierByName(String name);
}
