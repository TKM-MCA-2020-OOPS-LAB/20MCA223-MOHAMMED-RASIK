package com.lab_cycles.co3.q7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number of items in Bill : ");
        int count = scanner.nextInt();
        ProductBill[] productBill=new ProductBill[count];
        int billTotal=0;

        for(int i=0;i<count;i++) {
            System.out.println("Enter Product ID : ");
            String productId = scanner.next();
            System.out.println("Enter Name : ");
            String name = scanner.next();
            System.out.println("Enter Quantity : ");
            int qty = scanner.nextInt();
            System.out.println("Unit Price : ");
            int up = scanner.nextInt();

            productBill[i]=new ProductBill(productId,name,up,qty);
        }

        if(count>0){

            productBill[0].printBillHeader();

            for(int i=0;i<count;i++) {
                productBill[i].printBillItem();
                billTotal += productBill[i].total;
            }
            productBill[0].printBillFooter(billTotal);
        }

    }

}
