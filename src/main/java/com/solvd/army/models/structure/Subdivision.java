package com.solvd.army.models.structure;

import com.solvd.army.models.structure.MilitaryBase;
import com.solvd.army.models.structure.Soldier;

import java.util.List;

public class Subdivision {
    private Long id;
    private String name;
    private Integer quantity;
    private MilitaryBase mb_id;
    private List<Soldier> soldiers;

    public Subdivision() {}
    public Subdivision(Long id, String name, Integer quantity, MilitaryBase mb_id) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.mb_id = mb_id;
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
    public MilitaryBase getMb_id() {
        return mb_id;
    }
    public void setMb_id(MilitaryBase mb_id) {
        this.mb_id = mb_id;
    }
}
