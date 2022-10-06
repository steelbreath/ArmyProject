package com.solvd.army.models.equipment;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.List;

@XmlRootElement(name = "ammunition")
@XmlType(propOrder = { "id", "mm", "quantity_in_the_package","packages" })
public class Ammunition {
    private Long id;
    private Integer mm;
    private Integer quantity_in_the_package;
    private Integer packages;
    private List<com.solvd.army.models.equipment.Weapon> weapons;

    public Ammunition() {}
    public Ammunition(Long id, Integer mm, Integer quantity_in_the_package, Integer packages) {
        this.id = id;
        this.mm = mm;
        this.quantity_in_the_package = quantity_in_the_package;
        this.packages = packages;
    }

    public Long getId() {
            return id;
        }
    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getMm() {
        return mm;
    }
    @XmlElement(name = "mm")
    public void setMm(Integer mm) {
        this.mm = mm;
    }
    public Integer getQuantity_in_the_package() {
        return quantity_in_the_package;
    }
    @XmlElement(name = "quantity_in_the_package")
    public void setQuantity_in_the_package(Integer quantity_in_the_package) {
        this.quantity_in_the_package = quantity_in_the_package;
    }
    public Integer getPackages() {
        return packages;
    }
    @XmlElement(name = "packages")
    public void setPackages(Integer packages) {
        this.packages = packages;
    }
}
