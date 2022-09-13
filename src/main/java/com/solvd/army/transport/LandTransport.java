package com.solvd.army.transport;

import com.solvd.army.enums.Patency;
import com.solvd.army.structure.Soldier;
import com.solvd.army.types.LandTransportType;

public class LandTransport extends Transport {
    private Patency patency;
    private LandTransportType lt_type_id;

    public LandTransport() {}
    public LandTransport(Long id, String name, String weight, Integer engine_power, Integer max_speed,
                         Integer crew, Soldier s_id, Patency patency, LandTransportType lt_type_id) {
        super(id, name, weight, engine_power, max_speed, crew, s_id);
        this.patency = patency;
        this.lt_type_id = lt_type_id;
    }

    public Patency getPatency() {
        return patency;
    }
    public void setPatency(Patency patency) {
        this.patency = patency;
    }
    public LandTransportType getLt_type_id() {
        return lt_type_id;
    }
    public void setLt_type_id(LandTransportType lt_type_id) {
        this.lt_type_id = lt_type_id;
    }
}
