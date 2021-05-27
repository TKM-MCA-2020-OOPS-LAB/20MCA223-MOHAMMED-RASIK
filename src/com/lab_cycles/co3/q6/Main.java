package com.lab_cycles.co3.q6;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int shape,operation;

        System.out.println("Choose a Shape 1)Circle 2)Rectangle : ");
        shape = scanner.nextInt();

        System.out.println("Choose an Operation 1)Perimeter 2)Area : ");
        operation = scanner.nextInt();

        if(shape==1){
            Circle circle = new Circle();
            if(operation==1){
                circle.perimeter();
            }
            else if(operation==2)
            {
                circle.area();
            }
            else {
                System.out.println("Operation code.");
            }
        }
        else if(shape==2)
        {
            Rectangle rectangle = new Rectangle();
            if(operation==1){
                rectangle.perimeter();
            }
            else if(operation==2)
            {
                rectangle.area();
            }
            else {
                System.out.println("Operation code :");
                System.exit(0);
            }
        }
        else {
            System.out.println("Incorrect Shape code.");
        }

    }

}
