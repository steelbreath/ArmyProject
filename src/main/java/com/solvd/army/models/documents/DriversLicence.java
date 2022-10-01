package com.solvd.army.models.documents;

import com.solvd.army.models.structure.Soldier;
import java.util.Date;

public class DriversLicence {
    private Long id;
    private String category;
    private Date begin;
    private Date end;
    private Soldier s_id;

    public DriversLicence() {}
    public DriversLicence(Long id, String category, Date begin, Date end, Soldier s_id) {
        this.id = id;
        this.category = category;
        this.begin = begin;
        this.end = end;
        this.s_id = s_id;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Date getBegin() {
        return begin;
    }
    public void setBegin(Date begin) {
        this.begin = begin;
    }
    public Soldier getS_id() {
        return s_id;
    }
    public void setS_id(Soldier s_id) {
        this.s_id = s_id;
    }
    public Date getEnd() {
        return end;
    }
    public void setEnd(Date end) {
        this.end = end;
    }
}
