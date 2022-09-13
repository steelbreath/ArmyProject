package com.solvd.army.transport;

import com.solvd.army.structure.Soldier;

public abstract class Transport {
    private Long id;
    private String name;
    private String weight;
    private Integer engine_power;
    private Integer max_speed;
    private Integer crew;
    private Soldier s_id;

    public Transport() {}
    public Transport(Long id, String name, String weight, Integer engine_power, Integer max_speed, Integer crew, Soldier s_id) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.engine_power = engine_power;
        this.max_speed = max_speed;
        this.crew = crew;
        this.s_id = s_id;
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
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public Integer getEngine_power() {
        return engine_power;
    }
    public void setEngine_power(Integer engine_power) {
        this.engine_power = engine_power;
    }
    public Integer getMax_speed() {
        return max_speed;
    }
    public void setMax_speed(Integer max_speed) {
        this.max_speed = max_speed;
    }
    public Integer getCrew() {
        return crew;
    }
    public void setCrew(Integer crew) {
        this.crew = crew;
    }
    public Soldier getS_id() {
        return s_id;
    }
    public void setS_id(Soldier s_id) {
        this.s_id = s_id;
    }
}
