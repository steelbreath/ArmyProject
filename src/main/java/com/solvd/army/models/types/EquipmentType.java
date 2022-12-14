package com.solvd.army.models.types;

import com.solvd.army.models.equipment.Equipment;
import java.util.List;

public class EquipmentType {
    private Long id;
    private String name;
    private Integer quantity;
    private List<Equipment> equipment;

    public EquipmentType() {}
    public EquipmentType(Long id, String name, Integer quantity) {
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
