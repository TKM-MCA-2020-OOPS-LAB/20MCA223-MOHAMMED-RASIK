package com.lab_cycles.co2.q2;

import java.util.Scanner;

public class SearchItem {

    public static void main(String[] args) {

        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        //User will be asked to enter the count of strings
        System.out.print("Enter number of strings you would like to enter: ");
        count = scan.nextInt();


        String[] str = new String[count];

        //User is entering the strings and they are stored in an array
        System.out.println("Enter the Strings one by one: ");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }


        System.out.println("Enter the String to be searched : ");
        String searchString = scan3.nextLine();



        for (int i = 0; i < count; i++)
        {
            if(str[i].equals(searchString)){
                System.out.println("The required string is in position : "+(i));
                System.exit(0);
            }
        }

        scan.close();
        scan2.close();
        scan3.close();

        System.out.println("Could not find required string in Array.");

    }

}
