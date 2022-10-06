package com.solvd.army.jaxb;

import com.solvd.army.models.documents.Contract;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class ContractsHolder {
    private List<Contract> contracts = new ArrayList<Contract>();

    public ContractsHolder() {
    }

    public ContractsHolder(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public List<Contract> getContracts() {
        return contracts;
    }
    @XmlElement(name = "contract", type = Contract.class)
    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
