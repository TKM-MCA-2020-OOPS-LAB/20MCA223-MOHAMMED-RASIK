package com.lab_cycles.co4.q6;

public class EvenSeries implements Runnable {


    int count;
    int[] fibonacciSeries;

    EvenSeries(int count){this.count=count;}

    public void run() {

        for (int i=0;i<count;i++)
        {
           if(i%2==0)
           {
               System.out.println("Even Number : "+i);
           }
        }

    }



}
