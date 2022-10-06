package com.solvd.army.jaxb;

import com.solvd.army.models.structure.Soldier;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class SoldiersHolder {
    private List<Soldier> soldiers = new ArrayList<Soldier>();

    public SoldiersHolder() {
    }

    public SoldiersHolder(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }
    @XmlElement(name = "soldier", type = Soldier.class)
    public void setSoldiers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }
}
