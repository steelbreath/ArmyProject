package com.solvd.army.models.types;

import com.solvd.army.models.transport.AirTransport;
import java.util.List;

public class AirTransportType {
    private Long id;
    private String name;
    private Integer quantity;
    private List<AirTransport> airTransports;

    public AirTransportType() {}
    public AirTransportType(Long id, String name, Integer quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
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
}
