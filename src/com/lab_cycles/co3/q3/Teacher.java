package com.lab_cycles.co3.q3;


public class Teacher extends Employee {

    String department;
    String Subjects;

    Teacher(String Name,String Gender,String Address,String Age,String Empid,String Salary,String department,String Subjects) {
        super(Name,Gender,Address,Age,Empid,Salary);
        this.department = department;
        this.Subjects = Subjects;
    }

    void displayTeacherDetails()
    {
        System.out.println("Empid : "+this.Empid+" Name : "+this.Name+" Gender : "+this.Gender+" Age : "+this.Age+" Salary : "+this.Salary+" Address : "+this.Address+"department : "+this.department+" Subjects : "+this.Subjects);
    }

}
