package com.solvd.army.transport;

import com.solvd.army.structure.Soldier;
import com.solvd.army.types.WaterTransportType;

public class WaterTransport extends Transport {
    private Integer sailing_autonomy;
    private Integer max_immersion_depth;
    private WaterTransportType wt_type_id;

    public WaterTransport() {}
    public WaterTransport(Long id, String name, String weight, Integer engine_power, Integer max_speed, Integer crew,
                          Soldier s_id, Integer sailing_autonomy, Integer max_immersion_depth, WaterTransportType wt_type_id) {
        super(id, name, weight, engine_power, max_speed, crew, s_id);
        this.sailing_autonomy = sailing_autonomy;
        this.max_immersion_depth = max_immersion_depth;
        this.wt_type_id = wt_type_id;
    }

    public Integer getSailing_autonomy() {
        return sailing_autonomy;
    }
    public void setSailing_autonomy(Integer sailing_autonomy) {
        this.sailing_autonomy = sailing_autonomy;
    }
    public Integer getMax_immersion_depth() {
        return max_immersion_depth;
    }
    public void setMax_immersion_depth(Integer max_immersion_depth) {
        this.max_immersion_depth = max_immersion_depth;
    }
    public WaterTransportType getWt_type_id() {
        return wt_type_id;
    }
    public void setWt_type_id(WaterTransportType wt_type_id) {
        this.wt_type_id = wt_type_id;
    }
}
