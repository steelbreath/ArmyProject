package com.solvd.army.models.equipment;

import com.solvd.army.models.structure.Soldier;
import com.solvd.army.models.types.EquipmentType;

public class Equipment {
    private Long id;
    private String name;
    private String description;
    private Soldier s_id;
    private EquipmentType e_type_id;

    public Equipment() {}
    public Equipment(Long id, String name, String description, Soldier s_id, EquipmentType e_type_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.s_id = s_id;
        this.e_type_id = e_type_id;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Soldier getS_id() {
        return s_id;
    }
    public void setS_id(Soldier s_id) {
        this.s_id = s_id;
    }
    public EquipmentType getE_type_id() {
        return e_type_id;
    }
    public void setE_type_id(EquipmentType e_type_id) {
        this.e_type_id = e_type_id;
    }
}
