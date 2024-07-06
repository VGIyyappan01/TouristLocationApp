package com.mycompany.touristlocationapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener.*;
import java.io.FileReader;
import java.io.IOException;
import java. util. *;
import java.lang.Thread.*;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;





public class LoginPage extends JFrame {
	private Container container;
	private JLabel usernameLabel,passwordLabel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton loginButton;
	private JButton forgotPasswordButton;
	private JButton signup;

	public LoginPage() {

		setTitle("TLA//:Login Page");
		setBounds(300, 90, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);

		container = getContentPane();
		container.setLayout(null);
		
		usernameLabel = new JLabel("User Name :");
		usernameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		usernameLabel.setSize(190, 20);
		usernameLabel.setLocation(200, 175);
        container.add(usernameLabel);


		usernameField = new JTextField("username");
		usernameField.setFont(new Font("Arial", Font.PLAIN, 15));
		usernameField.setSize(200, 30);
		usernameField.setLocation(200, 200);
		container.add(usernameField);
		
		passwordLabel = new JLabel("Password :");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordLabel.setSize(190, 20);
        passwordLabel.setLocation(200, 235);
        container.add(passwordLabel);


		passwordField = new JPasswordField("Password");
		passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
		passwordField.setSize(200, 30);
		passwordField.setLocation(200, 260);
		container.add(passwordField);

		loginButton = new JButton("LogIn");
		loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
		loginButton.setSize(100, 20);
		loginButton.setLocation(180, 350);
	//	loginButton.addActionListener(this);
		container.add(loginButton);
		
		
		//log in button event 
		
	 void mouseLogin (MouseEvent event) {

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users?" + "user=root&password=password");
	            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username =? AND password =?");
	            ps.setString(1, usernameField.getText());
	            ps.setString(2, passwordField.getText());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                JOptionPane.showMessageDialog(null, "You are logged in");
	            } else {
	                JOptionPane.showMessageDialog(null, "Wrong password or username");
	            }
	        } catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
	        if (event.getSource() instanceof Button) {
	            if (event.getSource() == loginButton) {
	                new FadeIn(loginButton).play();
	            }
	        }
	    }
		
		
		
		signup = new JButton("SignUp");
		signup.setFont(new Font("Arial", Font.PLAIN, 15));
		signup.setSize(100, 20);
		signup.setLocation(300, 350);
	//	signup.addActionListener(this);
		container.add(signup);
		
		signup.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                 dispose();
                  new SignupPage();
        }
            });
        forgotPasswordButton = new JButton("ForgotPassword");
		forgotPasswordButton.setFont(new Font("Arial", Font.PLAIN, 15));
		forgotPasswordButton.setSize(150, 20);
		forgotPasswordButton.setLocation(50, 400);
	  //  forgotPasswordButton.addActionListener(this);
		container.add(forgotPasswordButton);
		
		setVisible(true);
}
}
	

  

	

