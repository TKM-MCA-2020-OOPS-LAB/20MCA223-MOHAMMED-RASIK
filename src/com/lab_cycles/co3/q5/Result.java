package com.lab_cycles.co3.q5;

public class Result extends Sports {

    public void displayInfo()
    {
        System.out.println("Academic Result");
        System.out.println("---------------");
        System.out.println("Maths : "+this.maths);
        System.out.println("Science : "+this.science);
        System.out.println("English : "+this.english);
        System.out.println("Social Science : "+this.socialScience);
        System.out.println("Sports Grace : "+this.grace);
        System.out.println("---------------");


        System.out.println("\n");
        System.out.println("Sports Result");
        System.out.println("-------------");
        System.out.println("Sport : "+this.sport);
        System.out.println("Goals : "+this.goals);
        System.out.println("Assists : "+this.assists);
        System.out.println("Minutes Played "+this.minutesPlayed);
        System.out.println("-------------");

    }

}
