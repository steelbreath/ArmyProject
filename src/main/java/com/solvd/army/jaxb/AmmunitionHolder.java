package com.solvd.army.jaxb;

import com.solvd.army.models.equipment.Ammunition;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class AmmunitionHolder {
    private List<Ammunition> ammunition = new ArrayList<Ammunition>();

    public AmmunitionHolder() {
    }

    public AmmunitionHolder(List<Ammunition> ammunition) {
        this.ammunition = ammunition;
    }

    public List<Ammunition> getAmmunition() {
        return ammunition;
    }
    @XmlElement(name = "ammunition", type = Ammunition.class)
    public void setAmmunition(List<Ammunition> ammunition) {
        this.ammunition = ammunition;
    }
}
