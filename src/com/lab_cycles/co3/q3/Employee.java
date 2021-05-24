package com.lab_cycles.co3.q3;

public class Employee extends Person{
  String Empid;
  String Salary;

  Employee(String Name,String Gender,String Address,String Age,String Empid,String Salary)
  {
      super(Name,Gender,Address,Age);
      this.Empid = Empid;
      this.Salary = Salary;
  }

}
