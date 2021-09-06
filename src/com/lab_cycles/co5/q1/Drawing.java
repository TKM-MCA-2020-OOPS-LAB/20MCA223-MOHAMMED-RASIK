package com.lab_cycles.co5.q1;

import java.applet.Applet;  
import java.awt.*;  
  
@SuppressWarnings("deprecation")
public class Drawing extends Applet{  
  
public void paint(Graphics g){  
g.setColor(Color.green);  

g.drawLine(20,30,20,300);  
g.fillRect(70,100,30,30);  
g.fillOval(70,200,30,30);  
  
}  
}  
