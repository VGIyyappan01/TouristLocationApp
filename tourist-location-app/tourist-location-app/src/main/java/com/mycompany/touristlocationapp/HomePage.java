package com.mycompany.touristlocationapp;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HomePage extends JFrame  {
	private Container container;
	private JLabel Label;
    private JButton btn;
    
    
    public HomePage()
    {
    	 setTitle("HomePage");
         setBounds(300, 90,700, 700);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setResizable(false);
         setBackground(Color.BLUE);

         
         container = getContentPane();
         container.setLayout(null);
         
         Label = new JLabel("WELCOME TO TOURIST LOCATION APP");
         Label.setFont(new Font("Arial", Font.PLAIN, 20));
         Label.setSize(450, 20);
         Label.setLocation(150, 300);
         container.add(Label);
         
         btn = new JButton(">>>");
         btn.setFont(new Font("Arial", Font.PLAIN, 15));
         btn.setSize(100, 20);
         btn.setLocation(300, 400);
         container.add(btn);
         
         btn.addActionListener(new ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent e) {
                  dispose();
                   new LoginPage();
         }
             });

         
         
         setVisible(true);



    
    }
    
    public static void main(String[] args) {
        new HomePage();
    }
    }
    
       