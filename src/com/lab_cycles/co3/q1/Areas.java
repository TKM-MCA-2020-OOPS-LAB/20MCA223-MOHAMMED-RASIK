package com.lab_cycles.co3.q1;

public class Areas {
    public void area(float length,float breadth)
    {
        System.out.println("Area of reactangle is: "+length*breadth);
    }

    public void area(float radius)
    {
        System.out.println("Area of circle is: "+(radius*radius*Math.PI));
    }

    public void area(float length,float breadth, float height)
    {
        float area = 2*((length*breadth)+(breadth*height)+(length*height));
        System.out.println("Area of cuboid is: "+area);
    }
}
