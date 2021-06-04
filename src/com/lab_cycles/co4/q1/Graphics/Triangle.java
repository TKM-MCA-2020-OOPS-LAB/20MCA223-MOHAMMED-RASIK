package com.lab_cycles.co4.q1.Graphics;

import java.util.Scanner;

public class Triangle {

    int height;
    int breadth;

    Scanner scanner = new Scanner(System.in);

    public void area() {

        System.out.println("Input height of the triangle : ");
        height = scanner.nextInt();
        System.out.println("Input breadth of triangle : ");
        breadth = scanner.nextInt();
        String area = Double.toString((height*breadth)/2f);
        System.out.println("Area of the triangle is : "+area);

    }

}
