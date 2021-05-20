package com.lab_cycles.co3.q2;


public class Teacher extends Employee {

    String department;
    String Subjects;

    Teacher(String Empid, String Name, String Salary, String Address,String department,String Subjects) {
        super(Empid, Name, Salary, Address);
        this.department = department;
        this.Subjects = Subjects;
    }

    void displayTeacherDetails()
    {
        System.out.println("Empid : "+this.Empid+" Name : "+this.Name+" Salary : "+this.Salary+" Address : "+this.Address+"department : "+this.department+" Subjects : "+this.Subjects);
    }

}
