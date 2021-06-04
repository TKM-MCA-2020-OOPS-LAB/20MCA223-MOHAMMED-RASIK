package com.lab_cycles.co4.q1.Graphics;

import com.lab_cycles.co4.q1.Graphics.Shape;

import java.util.Scanner;

public class Circle implements Shape {

    int radius;
    Scanner scanner = new Scanner(System.in);

    public void area() {
        System.out.println("Input radius of circle : ");
        radius = scanner.nextInt();
        String area = Double.toString(Math.PI*radius*radius);
        System.out.println("Area of the circle is : "+area);
    }

}
