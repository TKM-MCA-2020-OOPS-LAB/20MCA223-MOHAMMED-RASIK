package com.lab_cycles.co5.q4;//Program name 184.java
//Java Applet program for creating house
import java.awt.*;
import java.applet.*;
 
public class Drawing extends Applet 
{
/*
<applet code="Main184.class" width=400 height=450></applet>
*/
public void paint(Graphics gp)
{ int [] x = {150, 300, 225};
int [] y = {150, 150, 25};
gp.setColor(Color.lightGray);
gp.fillRect(150, 150, 150, 200); //House
gp.setColor(Color.red);
gp.fillRect(200, 250, 50, 100); // Door
gp.setColor(Color.darkGray);
gp.fillPolygon(x, y, 3); // Roof
}


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
