package com.lab_cycles.co3.q6;

import java.util.Scanner;

public class Circle implements Shape{

    int radius;
    Scanner scanner = new Scanner(System.in);

    public void perimeter() {
        System.out.println("Input radius of circle : ");
        radius = scanner.nextInt();
        String perimeter = Double.toString(Math.PI*radius*2);
        System.out.println("Circumference of the circle is : "+perimeter);
    }

    public void area() {
        System.out.println("Input radius of circle : ");
        radius = scanner.nextInt();
        String area = Double.toString(Math.PI*radius*radius);
        System.out.println("Area of the circle is : "+area);
    }

}
