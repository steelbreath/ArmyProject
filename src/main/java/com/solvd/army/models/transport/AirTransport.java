package com.solvd.army.models.transport;

import com.solvd.army.models.structure.Soldier;
import com.solvd.army.models.types.AirTransportType;

public class AirTransport extends Transport {
    private Integer range_of_flight;
    private Integer max_flight_altitude;
    private AirTransportType at_type_id;

    public AirTransport() {}
    public AirTransport(Long id, String name, String weight, Integer engine_power, Integer max_speed, Integer crew,
                        Soldier s_id, Integer range_of_flight, Integer max_flight_altitude, AirTransportType at_type_id) {
        super(id, name, weight, engine_power, max_speed, crew, s_id);
        this.range_of_flight = range_of_flight;
        this.max_flight_altitude = max_flight_altitude;
        this.at_type_id = at_type_id;
    }

    public Integer getRange_of_flight() {
        return range_of_flight;
    }
    public void setRange_of_flight(Integer range_of_flight) {
        this.range_of_flight = range_of_flight;
    }
    public Integer getMax_flight_altitude() {
        return max_flight_altitude;
    }
    public void setMax_flight_altitude(Integer max_flight_altitude) {
        this.max_flight_altitude = max_flight_altitude;
    }
    public AirTransportType getAt_type_id() {
        return at_type_id;
    }
    public void setAt_type_id(AirTransportType at_type_id) {
        this.at_type_id = at_type_id;
    }
}
