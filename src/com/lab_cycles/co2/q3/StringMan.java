package com.lab_cycles.co2.q3;

import java.util.Scanner;

public class StringMan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 words and atleast one of them contain a 's' : ");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        String str_Sample = word1+" "+word2;
        System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
        System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());
        System.out.println(str_Sample.toUpperCase().replace("S", "$"));
    }

}
