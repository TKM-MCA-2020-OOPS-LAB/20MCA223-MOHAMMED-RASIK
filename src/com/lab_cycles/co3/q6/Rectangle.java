package com.lab_cycles.co3.q6;

import java.util.Scanner;

public class Rectangle implements Shape{

    int length;
    int breadth;

    Scanner scanner = new Scanner(System.in);

    public void perimeter() {
        System.out.println("Input length of rectangle : ");
        length = scanner.nextInt();
        System.out.println("Input breadth of rectangle : ");
        length = scanner.nextInt();
        String perimeter = Double.toString(2*(length+breadth));
        System.out.println("Perimeter of the rectangle is : "+perimeter);
    }

    public void area() {
        System.out.println("Input length of rectangle : ");
        length = scanner.nextInt();
        System.out.println("Input breadth of rectangle : ");
        length = scanner.nextInt();
        String area = Double.toString(length*breadth);
        System.out.println("Area of the rectangle is : "+area);
    }

}

