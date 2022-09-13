package com.solvd.army.documents;

import com.solvd.army.structure.Soldier;
import java.util.Date;

public class Contract {
    private Long id;
    private Date begin;
    private Date end;
    private Soldier s_id;

    public Contract() {}
    public Contract(Long id, Date begin, Date end, Soldier s_id) {
        this.id = id;
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
