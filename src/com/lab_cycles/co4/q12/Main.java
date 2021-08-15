package com.lab_cycles.co4.q12;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of Stack : ");
        int num=scanner.nextInt();

        for(int i =0;i<num;i++)
        {
            System.out.println("Add element for Stack : ");
            String str=scanner.next();
            stack.add(str);
        }

        System.out.println();
        System.out.println("Initial Stack: " + stack);
        System.out.println("Enter the position of element in stack to be removed: ");

        int pos=scanner.nextInt();

        String rem = stack.remove(pos);

        System.out.println("\nRemoved element: "+ rem);
        System.out.println("\nFinal Stack: " + stack);

    }

}
