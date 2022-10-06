package com.solvd.army.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.army.models.equipment.Weapon;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeaponJson {
    private static final Logger LOGGER = Logger.getLogger(WeaponJson.class);

    public static void marshal(Weapon weapon, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filePath), weapon);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
    public static void marshal(List<Weapon> weapons, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filePath), weapons);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
    public static Weapon unmarshal(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        Weapon currentWeapon = null;
        try {
            currentWeapon = mapper.readValue(new File(filePath), Weapon.class);
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return currentWeapon;
    }
    public static List<Weapon> unmarshalList(String filePath){
        ObjectMapper mapper = new ObjectMapper();
        List<Weapon> listWeapons = new ArrayList<>();
        try {
            listWeapons = mapper.readValue(new File(filePath),
                    mapper.getTypeFactory().constructCollectionType(List.class, Weapon.class));
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return listWeapons;
    }
}
