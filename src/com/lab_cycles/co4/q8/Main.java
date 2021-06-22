package com.lab_cycles.co4.q8;

import java.util.Scanner;

class Main{

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of stack : ");
    int count = scanner.nextInt();
    GenericStack stack = new GenericStack(count);

    while (true) {
        System.out.println("Enter operation : 1)Push 2)Pop 3)Display : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("item to insert :");
                int item = scanner.nextInt();
                stack.push(item);
                break;
            case 2:
                stack.pop();
                break;
            case 3:
                stack.printStack();
        }
    }
}
}
