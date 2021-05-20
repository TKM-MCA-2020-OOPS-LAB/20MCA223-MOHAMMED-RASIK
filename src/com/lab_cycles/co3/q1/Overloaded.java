package com.lab_cycles.co3.q1;
import java.util.Scanner;

public class Overloaded {

        public static void main(String[] args) {
            float a,b,c;
            int choice;

            Scanner scanner=new Scanner(System.in);
            Areas areas =  new Areas();

            System.out.println("Enter the surface area to be calculated : ");
            System.out.println("1.Circle");
            System.out.println("2.Rectangle");
            System.out.println("3.Cuboid");
            choice = scanner.nextInt();

            if(choice==1)
            {
                System.out.println("Enter the radius of the circle: ");
                a=scanner.nextInt();
                areas.area(a);
            }
            else if(choice==2)
            {
                System.out.println("Enter the length of the rectangle: ");
                a=scanner.nextInt();
                System.out.println("Enter the breadth of the rectangle: ");
                b=scanner.nextInt();
                areas.area(a,b);
            }
            else if(choice==3)
            {
                System.out.println("Enter the length of the cuboid: ");
                a=scanner.nextInt();
                System.out.println("Enter the breadth of the cuboid: ");
                b=scanner.nextInt();
                System.out.println("Enter the height of the cuboid: ");
                c=scanner.nextInt();
                areas.area(a,b,c);
            }
            else
            {
                System.out.println("Invalid Choice");
            }
        }
}
