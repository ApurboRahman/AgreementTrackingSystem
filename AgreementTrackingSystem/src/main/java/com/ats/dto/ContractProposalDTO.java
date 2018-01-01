package com.ats.dto;

/**
 * Created by md.rahman on 1/1/2018.
 */
public class ContractProposalDTO {
    private Integer serialNo;
    private String contractName;
    private String contractType;
    private String contractBody;
    private String remarks;
    private String agreementType;
    private String department;
    private String party;
    private String adiParty;


    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getContractBody() {
        return contractBody;
    }

    public void setContractBody(String contractBody) {
        this.contractBody = contractBody;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getAdiParty() {
        return adiParty;
    }

    public void setAdiParty(String adiParty) {
        this.adiParty = adiParty;
    }
}
