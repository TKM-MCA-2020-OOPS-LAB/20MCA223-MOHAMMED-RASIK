package com.lab_cycles.co4.q6;

import com.lab_cycles.co4.q5.MultiTable5;
import com.lab_cycles.co4.q5.PrimeNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int fiboCount,evenCount;

        System.out.println("Enter number of Fibonacci Numbers to be listed : ");
        fiboCount = scanner.nextInt();
        System.out.println("Enter number of Even Numbers to be listed : ");
        evenCount = scanner.nextInt();

        FibonacciSeries fibonacciSeries = new FibonacciSeries(fiboCount);
        EvenSeries evenSeries = new EvenSeries(evenCount);

        Thread thread1 = new Thread(evenSeries);
        Thread thread2 = new Thread(fibonacciSeries);

        thread1.start();
        thread2.start();

    }

}
