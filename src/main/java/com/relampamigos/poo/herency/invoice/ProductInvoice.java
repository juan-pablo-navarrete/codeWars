package com.relampamigos.poo.herency.invoice;
import java.util.List;
public class ProductInvoice extends Invoice {

    private List<String> products;

    public ProductInvoice(List<String> products, Long invoiceNumber,
                          String date, Double totalAmount) {
        super(invoiceNumber, date, totalAmount);
        this.products = products;
    }

    @Override
    void printDetail() {
        for (String product : this.products) {
            System.out.println(product);
        }
    }
}
