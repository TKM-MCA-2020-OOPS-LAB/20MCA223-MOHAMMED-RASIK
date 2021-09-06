package com.lab_cycles.co5.q2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Main implements ActionListener {

    Button b1;
    TextField t1, t2, t3;
    Label lb1, lb2, lb3, lb4;
    Frame f;

    Main() {
        f = new Frame("Find biggest number");

        t1 = new TextField();
        t1.setBounds(200, 50, 150, 30);
        f.add(t1);

        t2 = new TextField();
        t2.setBounds(200, 80, 150, 30);
        f.add(t2);
        
        t3 = new TextField();
        t3.setBounds(200, 110, 150, 30);
        f.add(t3);
        
        lb1 = new Label("Enter First Number :");
        lb1.setBounds(5, 50, 150, 30);
        f.add(lb1);

        lb2 = new Label("Enter Second Number :");
        lb2.setBounds(5, 80, 150, 30);
        f.add(lb2);
        
        lb3 = new Label("Enter Third Number :");
        lb3.setBounds(5, 110, 150, 30);
        f.add(lb3);

        lb4 = new Label("Result :");
        lb4.setBounds(5, 140, 300, 30);
        f.add(lb4);

        b1 = new Button("Compare");
        b1.setBounds(90, 200, 100, 30);
        f.add(b1);

        b1.addActionListener(this);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());

        if (e.getSource().equals(b1)) {
            if(a>b) {
            	if(a>c) {
            		lb4.setText(String.valueOf(a+" is the biggest number."));
            	}
            	else 
            	{
            		lb4.setText(String.valueOf(c+" is the biggest number."));
            	}
            	
            }
            else {
            	if(b>c){
            		lb4.setText(String.valueOf(b+" is the biggest number."));
            	}
            	else 
            	{
            		lb4.setText(String.valueOf(c+" is the biggest number."));
            	}
            }

        }

    }

    public static void main(String args[]) {
        Main t = new Main();
    }
}