package com.solvd.army.jaxb;

import com.solvd.army.models.documents.Contract;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ContractXML {
    public void marshal(Contract contract, String filePath) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Contract.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(contract, new FileWriter(filePath));
    }
    public static void marshal(List<Contract> contracts, String filePath) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(ContractsHolder.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ContractsHolder contractsHolder = new ContractsHolder(contracts);
        mar.marshal(contractsHolder, new File(filePath));
    }
    public Contract unmarshal(String filePath) throws JAXBException, IOException {
        Contract contract = new Contract();
        JAXBContext context = JAXBContext.newInstance(Contract.class);
        Unmarshaller um = context.createUnmarshaller();
        contract = (Contract) um.unmarshal(new File(filePath));
        return contract;
    }
    public static List<Contract> unmarshalList(String filePath) throws JAXBException, IOException {
        ContractsHolder contractsHolder = new ContractsHolder();
        JAXBContext context = JAXBContext.newInstance(ContractsHolder.class);
        Unmarshaller um = context.createUnmarshaller();
        contractsHolder =(ContractsHolder) um.unmarshal(new File(filePath));
        return contractsHolder.getContracts();
    }
}
