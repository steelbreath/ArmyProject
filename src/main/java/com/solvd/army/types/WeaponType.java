package com.solvd.army.types;

import com.solvd.army.equipment.Weapon;
import java.util.List;

public class WeaponType {
    private Long id;
    private String name;
    private Integer quantity;
    private List<Weapon> weapons;

    public WeaponType() {}
    public WeaponType(Long id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
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
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
