package com.mycompany.touristlocationapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame {

    public WelcomePage() {
    	try {
        
        setTitle("Welcome Page");
        setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to My Application!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 24));     
        add(welcomeLabel, BorderLayout.CENTER);
        JButton closeButton = new JButton(">>>");
        closeButton.setFont(new Font("Serif", Font.PLAIN, 18));
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                dispose();
                 new LoginPage();
       }
           });
    
        add(closeButton, BorderLayout.SOUTH);
    	}catch (Exception e) {
    	      System.out.println("Something went wrong Welcome");
        }
        
    	setBounds(300, 90, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
       
         new WelcomePage();
         new SignupPage();
         new LoginPage();
    }
}
