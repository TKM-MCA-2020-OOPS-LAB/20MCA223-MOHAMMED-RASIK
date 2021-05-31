package com.lab_cycles.co3.q7;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ProductBill implements Bill {

    String productId = "";
    String productName="";
    int unitPrice = 0;
    int quantity = 0;
    int total = 0;

    ProductBill(String productId,String productName,int unitPrice,int quantity){
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.total = unitPrice*quantity;
    }

    public void printBillHeader() {
        System.out.println("Order No : " + Math.random() * 1000);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Date : " + dtf.format(now));

        System.out.println("Product ID                Name  Quantity  Unit Price       Total ");
        System.out.println("-----------------------------------------------------------------");
    }

    public void printBillItem()
    {
        System.out.format("%10s%20s%10d%12d%12d \n",this.productId,this.productName,this.unitPrice,this.quantity,this.total);
    }

    public void printBillFooter(int billTotal)
    {
        System.out.println("-----------------------------------------------------------------");
        System.out.format("%64s \n","Net. Amount : "+billTotal);
    }

}
