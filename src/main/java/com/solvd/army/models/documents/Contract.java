package com.solvd.army.models.documents;

import com.solvd.army.jaxb.DateAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.Date;

@XmlRootElement(name = "contract")
@XmlType(propOrder = { "id", "begin", "end","s_id" })
public class Contract {
    private Long id;
    private Date begin;
    private Date end;
    private com.solvd.army.models.structure.Soldier s_id;

    public Contract() {}
    public Contract(Long id, Date begin, Date end, com.solvd.army.models.structure.Soldier s_id) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.s_id = s_id;
    }

    public Long getId() {
        return id;
    }
    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }
    public Date getBegin() {
        return begin;
    }
    @XmlJavaTypeAdapter(DateAdapter.class)
    public void setBegin(Date begin) {
        this.begin = begin;
    }
    public Date getEnd() {
        return end;
    }
    @XmlJavaTypeAdapter(DateAdapter.class)
    public void setEnd(Date end) {
        this.end = end;
    }
    public com.solvd.army.models.structure.Soldier getS_id() {
        return s_id;
    }
    @XmlAttribute
    public void setS_id(com.solvd.army.models.structure.Soldier s_id) {
        this.s_id = s_id;
    }
}
