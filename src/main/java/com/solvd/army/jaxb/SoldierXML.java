package com.solvd.army.jaxb;

import com.solvd.army.models.structure.Soldier;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SoldierXML {
    private static final Logger LOGGER = Logger.getLogger(SoldierXML.class);

    public static void marshal(Soldier soldier, String filePath) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Soldier.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(soldier, new FileWriter(filePath));
    }
    public static void marshal(List<Soldier> soldiers, String filePath) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(SoldiersHolder.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        SoldiersHolder soldiersHolder = new SoldiersHolder(soldiers);
        mar.marshal(soldiersHolder, new File(filePath));
    }
    public static Soldier unmarshal(String filePath) throws JAXBException, IOException {
        Soldier soldier = new Soldier();
        JAXBContext context = JAXBContext.newInstance(Soldier.class);
        Unmarshaller um = context.createUnmarshaller();
        soldier = (Soldier) um.unmarshal(new File(filePath));
        return soldier;
    }
    public static List<Soldier> unmarshalList(String filePath) throws JAXBException, IOException {
        SoldiersHolder soldiersHolder = new SoldiersHolder();
        JAXBContext context = JAXBContext.newInstance(SoldiersHolder.class);
        Unmarshaller um = context.createUnmarshaller();
        soldiersHolder =(SoldiersHolder) um.unmarshal(new File(filePath));
        return soldiersHolder.getSoldiers();
    }
}
