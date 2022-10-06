package com.solvd.army.models.structure;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

@JsonRootName(value = "Rank")
public class Rank {
    private Long id;
    private String rank;
    private List<Soldier> soldiers;

    public Rank() {}
    public Rank(Long id, String rank) {
        this.id = id;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
}
