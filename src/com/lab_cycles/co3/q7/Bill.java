package com.lab_cycles.co3.q7;

public interface Bill {

    String productId = "";
    String productName="";
    int unitPrice = 0;
    int quantity = 0;
    int total = 0;
    public void printBillItem();
    public void printBillHeader();
    public void printBillFooter(int billTotal);

}


