package com.solvd.army.jaxb;

import com.solvd.army.models.equipment.Ammunition;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AmmunitionXML {
    public void marshal(Ammunition ammunition,String filePath) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Ammunition.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(ammunition, new FileWriter(filePath));
    }
    public static void marshal(List<Ammunition> ammunition, String filePath) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(AmmunitionHolder.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        AmmunitionHolder ammunitionHolder = new AmmunitionHolder(ammunition);
        mar.marshal(ammunitionHolder, new File(filePath));
    }
    public Ammunition unmarshal(String filePath) throws JAXBException, IOException {
        Ammunition ammunition = new Ammunition();
        JAXBContext context = JAXBContext.newInstance(Ammunition.class);
        Unmarshaller um = context.createUnmarshaller();
        ammunition = (Ammunition) um.unmarshal(new File(filePath));
        return ammunition;
    }
    public static List<Ammunition> unmarshalList(String filePath) throws JAXBException, IOException {
        AmmunitionHolder ammunitionHolder = new AmmunitionHolder();
        JAXBContext context = JAXBContext.newInstance(AmmunitionHolder.class);
        Unmarshaller um = context.createUnmarshaller();
        ammunitionHolder =(AmmunitionHolder) um.unmarshal(new File(filePath));
        return ammunitionHolder.getAmmunition();
    }
}
