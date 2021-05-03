package com.lab_cycles.co1.q3;

public class Main {

    public static void main(String[] args) {

        ComplexNumber complexNumber1 = new ComplexNumber(3,5);
        ComplexNumber complexNumber2 = new ComplexNumber(10,4.5);
        ComplexNumber complexNumber3 = new ComplexNumber(0,0);
        complexNumber3 = complexNumber3.addComplexNumber(complexNumber1,complexNumber2);


        System.out.println("("+complexNumber1.displayComplexNumber()+") + ("+complexNumber2.displayComplexNumber()+") = "+complexNumber3.displayComplexNumber());

    }

}
