package com.lab_cycles.co3.q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int count;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of teachers required : ");
        count = scanner.nextInt();
        Teacher[] teachers = new Teacher[count];

        for(int i=0;i<count;i++) {
            int j = i+1;
            System.out.print("Enter Empid of teacher "+j+" : ");
            String Empid = scanner.next();
            System.out.print("Enter Name of teacher "+j+" : ");
            String Name = scanner.next();
            System.out.print("Enter Salary of teacher "+j+" : ");
            String Salary = scanner.next();
            System.out.print("Enter Address of teacher "+j+" : ");
            String Address = scanner.next();
            System.out.print("Enter department of teacher "+j+" : ");
            String department = scanner.next();
            System.out.print("Enter Subjects of teacher "+j+" : ");
            String Subjects = scanner.next();

            teachers[i] = new Teacher(Empid, Name, Salary, Address, department, Subjects);
        }

        System.out.println("\n-------------------------------------------------------------------------\n");
        System.out.println("Teacher's List \n");


        for(int i=0;i<count;i++) {
            teachers[i].displayTeacherDetails();
        }

    }

}
