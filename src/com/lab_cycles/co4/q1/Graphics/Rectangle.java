package com.lab_cycles.co4.q1.Graphics;

import java.util.Scanner;

public class Rectangle implements Shape {

    int length;
    int breadth;

    Scanner scanner = new Scanner(System.in);

    public void area() {
        System.out.println("Input length of rectangle : ");
        length = scanner.nextInt();
        System.out.println("Input breadth of rectangle : ");
        length = scanner.nextInt();
        String area = Double.toString(length*breadth);
        System.out.println("Area of the rectangle is : "+area);
    }

}

