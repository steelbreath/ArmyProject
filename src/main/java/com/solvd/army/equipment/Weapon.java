package com.solvd.army.equipment;

import com.solvd.army.structure.Soldier;
import com.solvd.army.types.WeaponType;

public class Weapon {
    private Long id;
    private String name;
    private Integer magazine;
    private Integer weight;
    private Soldier s_id;
    private WeaponType w_type_id;
    private Ammunition ammo_id;

    public Weapon() {}
    public Weapon(Long id, String name, Integer magazine, Integer weight, Soldier s_id, WeaponType w_type_id, Ammunition ammo_id) {
        this.id = id;
        this.name = name;
        this.magazine = magazine;
        this.weight = weight;
        this.s_id = s_id;
        this.w_type_id = w_type_id;
        this.ammo_id = ammo_id;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getMagazine() {
        return magazine;
    }
    public void setMagazine(Integer magazine) {
        this.magazine = magazine;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public Soldier getS_id() {
        return s_id;
    }
    public void setS_id(Soldier s_id) {
        this.s_id = s_id;
    }
    public WeaponType getW_type_id() {
        return w_type_id;
    }
    public void setW_type_id(WeaponType w_type_id) {
        this.w_type_id = w_type_id;
    }
    public Ammunition getAmmo_id() {
        return ammo_id;
    }
    public void setAmmo_id(Ammunition ammo_id) {
        this.ammo_id = ammo_id;
    }
}
