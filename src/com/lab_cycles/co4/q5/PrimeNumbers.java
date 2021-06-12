package com.lab_cycles.co4.q5;

import java.util.Scanner;

public class PrimeNumbers extends Thread {

    int count;
    int primeCount = 0;

    PrimeNumbers(int count){
        this.count=count;
    }

    public void run() {

        for(int i=1;primeCount<count;i++){
            boolean isPrime=true;
            if(i==1)
            {
                i++;
            }

            for (int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                System.out.println("Prime Number : "+i);
                primeCount++;
            }
        }

    }
}
