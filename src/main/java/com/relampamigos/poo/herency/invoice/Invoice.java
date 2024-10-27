package com.relampamigos.poo.herency.invoice;

public abstract class Invoice {

    public Invoice(Long invoiceNumber, String date, Double totalAmount) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.totalAmount = totalAmount;
    }

    protected Long invoiceNumber;
    protected String date;
    protected Double totalAmount;

    abstract void printDetail();
}
