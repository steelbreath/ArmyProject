package com.solvd.army.models.documents;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.army.models.transport.AirTransport;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirTransportJson {
    private static final Logger LOGGER = Logger.getLogger(AirTransportJson.class);

    public static void marshal(AirTransport airTransport, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filePath), airTransport);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
    public static void marshal(List<AirTransport> airTransports, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filePath), airTransports);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
    public static AirTransport unmarshal(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        AirTransport currentAirTransport = null;
        try {
            currentAirTransport = mapper.readValue(new File(filePath), AirTransport.class);
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return currentAirTransport;
    }
    public static List<AirTransport> unmarshalList(String filePath){
        ObjectMapper mapper = new ObjectMapper();
        List<AirTransport> listAirTransports = new ArrayList<>();
        try {
            listAirTransports = mapper.readValue(new File(filePath),
                    mapper.getTypeFactory().constructCollectionType(List.class, AirTransport.class));
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return listAirTransports;
    }
}
