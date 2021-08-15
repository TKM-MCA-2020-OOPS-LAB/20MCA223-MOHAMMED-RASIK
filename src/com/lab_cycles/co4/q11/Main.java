package com.lab_cycles.co4.q11;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n;
        String data;
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println("Enter number of strings to be inserted : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Enter the string(s) : ");
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            data = scanner.nextLine();
            linkedList.add(data);
        }
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Removing all the elements....");
        linkedList.clear();
        System.out.println(linkedList);
    }

}