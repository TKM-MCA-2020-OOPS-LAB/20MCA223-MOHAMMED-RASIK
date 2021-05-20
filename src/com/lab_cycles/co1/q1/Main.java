package com.lab_cycles.co1.q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Driver program

        Scanner scan = new Scanner(System.in);
        Product[] products = new Product[3];

        for(int i=0;i<3;i++)
        {
            int count = i+1;

            products[i] = new Product();
            System.out.print("Enter product "+count+" name : ");
            products[i].pname = scan.nextLine();

            System.out.print("Enter product "+count+" code : ");
            products[i].pcode = scan.nextLine();

            System.out.print("Enter product "+count+" price : ");
            products[i].price = Integer.parseInt(scan.nextLine());

        }

        scan.close();

        if(products[0].price< products[1].price &&  products[0].price< products[2].price) {
            System.out.println("The product with lowest price is:"+ products[0].pname);
        }
        if(products[1].price<products[0].price && products[1].price<products[2].price) {
            System.out.println("The product with lowest price is:"+products[1].pname);
        }
        if(products[2].price<products[0].price && products[2].price<products[1].price) {
            System.out.println("The product with lowest price is:"+products[2].pname);
        }


    }
}
