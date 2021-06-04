package com.lab_cycles.co4.q1.Graphics;

import java.util.Scanner;

public class Square {

    int side;
    Scanner scanner = new Scanner(System.in);

    public void area() {
        System.out.println("Input side length of square : ");
        side = scanner.nextInt();
        String area = Double.toString(side*side);
        System.out.println("Area of the square : "+area);
    }

}
