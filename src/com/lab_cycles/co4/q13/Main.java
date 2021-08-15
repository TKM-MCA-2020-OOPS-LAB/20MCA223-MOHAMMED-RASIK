package com.lab_cycles.co4.q13;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the queue : ");
        int n=scanner.nextInt();
        System.out.println("Enter the elements : ");
        for(int i =0;i<n;i++)
        {
            String st=scanner.next();
            queue.add(st);

        }
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("Iterating the queue elements\n : ");
        for (String value : queue) {
            System.out.println(value);
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements \n");
        for (String s : queue) {
            System.out.println(s);
        }
    }

}