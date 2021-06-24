package com.lab_cycles.co4.q9;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
        static void bubbleSort(int array[]) {
            int size = array.length;
            for (int i = 0; i < size - 1; i++)
                for (int j = 0; j < size - i - 1; j++)
                    if (array[j] > array[j + 1]) {

                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
        }

        public static void main(String args[]) {

            Scanner scanner = new Scanner(System.in);


            System.out.println("Number of items to be inserted : ");
            int count = scanner.nextInt();

            int[] data = new int[count];

            System.out.println("Enter the array items : ");

            for(int i=0;i<count;i++)
            {
                data[i] = scanner.nextInt();
            }


            Main.bubbleSort(data);

            System.out.println("Sorted Array in Ascending Order:");
            System.out.println(Arrays.toString(data));
        }
}

