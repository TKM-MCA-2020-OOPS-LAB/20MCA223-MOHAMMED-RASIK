package com.lab_cycles.co4.q2;

import com.lab_cycles.co4.q2.Arithmetic.AdditionOperation;
import com.lab_cycles.co4.q2.Arithmetic.DivisionOperator;
import com.lab_cycles.co4.q2.Arithmetic.MultiplicationOperator;
import com.lab_cycles.co4.q2.Arithmetic.SubtractionOperation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation : 1.Add, 2.Subtract, 3.Multiply, 4.Divide");
        int choice = scanner.nextInt();

        System.out.println("Enter the numbers : ");
        int number1 = scanner.nextInt();
        int number2= scanner.nextInt();

        System.out.println("The Result is : 3");

        switch (choice){
            case 1:
                AdditionOperation additionOperation = new AdditionOperation();
                System.out.println(additionOperation.operateNumbers(number1,number2));
                break;
            case 2:
                SubtractionOperation subtractionOperation = new SubtractionOperation();
                System.out.println(subtractionOperation.operateNumbers(number1,number2));
                break;
            case 3:
                MultiplicationOperator multiplicationOperator = new MultiplicationOperator();
                System.out.println(multiplicationOperator.operateNumbers(number1,number2));
                break;
            case 4:
                DivisionOperator divisionOperator = new DivisionOperator();
                System.out.println(divisionOperator.operateNumbers(number1,number2));
                break;
            default:
                System.out.println("Invalid Code");
        }

    }

}
