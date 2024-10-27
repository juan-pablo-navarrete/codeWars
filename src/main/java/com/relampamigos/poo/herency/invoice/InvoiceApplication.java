package com.relampamigos.poo.herency.invoice;
import java.util.Arrays;
import java.util.List;
public class InvoiceApplication {

    public static void main(String[] args) {
        List<String> products = Arrays.asList("mouse", "teclado", "monitor");
        ProductInvoice invoice = new ProductInvoice(products, 1L, "2024/10/06", 1250.0);
        invoice.printDetail();
    }
}
