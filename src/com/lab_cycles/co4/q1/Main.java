package com.lab_cycles.co4.q1;



import com.lab_cycles.co4.q1.Graphics.Circle;
import com.lab_cycles.co4.q1.Graphics.Rectangle;
import com.lab_cycles.co4.q1.Graphics.Square;
import com.lab_cycles.co4.q1.Graphics.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int shape;

        System.out.println("Choose a Shape 1)Circle 2)Rectangle 3)Square 4)Triangle : ");
        shape = scanner.nextInt();

        if(shape==1){
            Circle circle = new Circle();
            circle.area();
        }
        else if(shape==2)
        {
            Rectangle rectangle = new Rectangle();
            rectangle.area();
        }
        else if(shape==3)
        {
            Square square = new Square();
            square.area();
        }
        else if(shape==4)
        {
            Triangle triangle = new Triangle();
            triangle.area();
        }
        else {
            System.out.println("Incorrect Shape code.");
        }
    }

}
