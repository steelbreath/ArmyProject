package com.solvd.army.models.structure;

import com.solvd.army.models.documents.*;
import com.solvd.army.models.equipment.Equipment;
import com.solvd.army.models.equipment.Weapon;
import com.solvd.army.models.transport.AirTransport;
import com.solvd.army.models.transport.LandTransport;
import com.solvd.army.models.transport.WaterTransport;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.List;

@XmlRootElement(name = "soldier")
@XmlType(propOrder = { "id", "name", "surname","call_sign","r_id","sub_id" })
public class Soldier {
    private Long id;
    private String name;
    private String surname;
    private String call_sign;
    private Rank r_id;
    private Subdivision sub_id;
    private com.solvd.army.models.documents.Contract contract;
    private DriversLicence driversLicence;
    private List<Weapon> weapons;
    private List<Equipment> equipment;
    private List<AirTransport> airTransports;
    private List<LandTransport> landTransports;
    private List<WaterTransport> waterTransports;

    public Soldier() {}
    public Soldier(Long id, String name, String surname, String call_sign, Rank r_id, Subdivision sub_id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.call_sign = call_sign;
        this.r_id = r_id;
        this.sub_id = sub_id;
    }

    public Long getId() {
        return id;
    }
    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    @XmlElement(name = "surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getCall_sign() {
        return call_sign;
    }
    @XmlElement(name = "call_sign")
    public void setCall_sign(String call_sign) {
        this.call_sign = call_sign;
    }
    public Rank getR_id() {
        return r_id;
    }
    @XmlAttribute
    public void setR_id(Rank r_id) {
        this.r_id = r_id;
    }
    public Subdivision getSub_id() {
        return sub_id;
    }
    @XmlAttribute
    public void setSub_id(Subdivision sub_id) {
        this.sub_id = sub_id;
    }
}
