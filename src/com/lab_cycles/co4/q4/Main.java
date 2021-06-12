package com.lab_cycles.co4.q4;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int count;

        System.out.println("Please enter the number of numbers to be calculated : ");
        count = scanner.nextInt();

        int[] numbers = new int[count];

        try {
            System.out.println("Please enter " + count + " numbers : ");

            for (int i = 0; i < count; i++) {
                int num = scanner.nextInt();
                numbers[i] = num;

                if (num < 0) {
                    throw new NegativeNumberException("Negative numbers are not allowed.");
                }

            }

            int sum =0;

            for (int i = 0; i < count; i++) {
                sum += numbers[i];
            }

            float average = (float)sum/count;
            System.out.println("Average of given numbers is : "+average);



        } catch (NegativeNumberException ex) {
            System.out.println("Exception Caught !!");
            System.out.println(ex.getMessage());
        }

    }
}