package com.lab_cycles.co1.q3;

public class ComplexNumber {

    double real,imaginary;

    ComplexNumber(double real,double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber addComplexNumber(ComplexNumber complexNumber1,ComplexNumber complexNumber2)
    {
        double real = complexNumber1.real+ complexNumber2.real;
        double imaginary = complexNumber1.imaginary+complexNumber2.imaginary;
        ComplexNumber complexNumber = new ComplexNumber(real,imaginary);
        return complexNumber;
    }

    String displayComplexNumber()
    {
        return this.real+" + "+this.imaginary+"i";
    }

}
