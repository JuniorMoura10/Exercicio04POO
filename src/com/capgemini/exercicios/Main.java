package com.capgemini.exercicios;

public class Main {

    public static void main(String[] args) {

        Invoice inv = new Invoice(1, "notebook", 3, 5500.0f);
        System.out.println("O valor total é de: " + inv.getInvoiceAmount());
    }
}
