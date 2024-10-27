package com.relampamigos.poo;

import java.sql.Date;

public class RepasoDePoo {

 private int code;
 private String name;
 private Date contracDate;
 private int documentIdentification;
 private String contractType;
 private int deparmentCode;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getContracDate() {
        return contracDate;
    }

    public void setContracDate(Date contracDate) {
        this.contracDate = contracDate;
    }

    public int getDocumentIdentification() {
        return documentIdentification;
    }

    public void setDocumentIdentification(int documentIdentification) {
        this.documentIdentification = documentIdentification;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public int getDeparmentCode() {
        return deparmentCode;
    }

    public void setDeparmentCode(int deparmentCode) {
        this.deparmentCode = deparmentCode;
    }

    @Override
    public String toString() {
        return "RepasoDePoo{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", contracDate=" + contracDate +
                ", documentIdentification=" + documentIdentification +
                ", contractType='" + contractType + '\'' +
                ", deparmentCode=" + deparmentCode +
                '}';
    }
}
