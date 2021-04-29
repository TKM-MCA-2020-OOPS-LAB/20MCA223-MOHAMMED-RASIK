package com.lab_cycles.cycle1.co1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Driver program

        Scanner scan = new Scanner(System.in);
        Product[] products = new Product[3];
        Product cheap;

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

        if(products[0].price<products[1].price)
        {
            if(products[0].price<products[2].price)
            {
                cheap = products[0];
            }
            else
            {
                cheap = products[2];
            }
        }
        else
        {
            if(products[1].price<products[2].price)
            {
                cheap = products[1];
            }
            else
            {
                cheap = products[2];
            }
        }

        System.out.print("Cheapest Item is : "+cheap.pname+" & its price is "+cheap.price);

    }
}
