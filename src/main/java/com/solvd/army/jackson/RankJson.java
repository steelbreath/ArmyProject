package com.solvd.army.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.army.models.structure.Rank;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RankJson {
    private static final Logger LOGGER = Logger.getLogger(RankJson.class);

    public static void marshal(Rank rank, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filePath), rank);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
    public static void marshal(List<Rank> ranks, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filePath), ranks);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
    public static Rank unmarshal(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        Rank currentRank = null;
        try {
            currentRank = mapper.readValue(new File(filePath), Rank.class);
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return currentRank;
    }
    public static List<Rank> unmarshalList(String filePath){
        ObjectMapper mapper = new ObjectMapper();
        List<Rank> listRanks = new ArrayList<>();
        try {
            listRanks = mapper.readValue(new File(filePath),
                    mapper.getTypeFactory().constructCollectionType(List.class, Rank.class));
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return listRanks;
    }
}
