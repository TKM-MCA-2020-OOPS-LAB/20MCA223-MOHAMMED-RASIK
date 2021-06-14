package com.lab_cycles.co4.q6;

public class FibonacciSeries implements Runnable{

    int count;
    long[] fibonacciSeries;

    FibonacciSeries(int count){this.count=count;this.fibonacciSeries=new long[count];}

    public void run() {

        this.fibonacciSeries[0]=0;
        this.fibonacciSeries[1]=1;
        this.fibonacciSeries[2]=1;

        for (int i=3;i<count;i++)
        {
            this.fibonacciSeries[i]= this.fibonacciSeries[(i-1)]+ this.fibonacciSeries[(i-2)];

            if(i>91) {
               break;
            }

            System.out.println("Fibonacci Number : " + this.fibonacciSeries[i]);
        }

    }

}
