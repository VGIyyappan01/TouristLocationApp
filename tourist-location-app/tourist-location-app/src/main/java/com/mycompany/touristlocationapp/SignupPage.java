package com.mycompany.touristlocationapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java. util. *;
import java.lang.Thread.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class SignupPage extends JFrame implements ActionListener {
    
    private Container container;
    private JLabel titleLabel, nameLabel1,nameLabel2, emailLabel,phonenumberLabel,usernameLabel, passwordLabel,confirmPWLabel;
    private JTextField nameField1,nameField2,usernameField,phonenumberField, emailField,confirmPWField;
    private JPasswordField passwordField;
    JButton  signUpButton,resetButton;

    
    public SignupPage() 
	{
    try {	
    		 
        setTitle("Signup Form");
        setBounds(300, 90,700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        container = getContentPane();
        container.setLayout(null);

        titleLabel = new JLabel("Signup Form");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        titleLabel.setSize(200, 30);
        titleLabel.setLocation(100, 30);
        container.add(titleLabel);

        nameLabel1 = new JLabel("First Name");
        nameLabel1.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLabel1.setSize(100, 20);
        nameLabel1.setLocation(50, 100);
        container.add(nameLabel1);

        nameField1 = new JTextField();
        nameField1.setFont(new Font("Arial", Font.PLAIN, 15));
        nameField1.setSize(190, 20);
        nameField1.setLocation(150, 100);
        container.add(nameField1);
        
        nameLabel2 = new JLabel("Last Name");
        nameLabel2.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLabel2.setSize(100, 20);
        nameLabel2.setLocation(50, 150);
        container.add(nameLabel2);
        

        nameField2 = new JTextField();
        nameField2.setFont(new Font("Arial", Font.PLAIN, 15));
        nameField2.setSize(190, 20);
        nameField2.setLocation(150, 150);
        container.add(nameField2);
        
        phonenumberLabel = new JLabel("PhoneNumber");
        phonenumberLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        phonenumberLabel.setSize(100, 20);
        phonenumberLabel.setLocation(50, 200);
        container.add(phonenumberLabel);
        
        phonenumberField = new JTextField();
        phonenumberField.setFont(new Font("Arial", Font.PLAIN, 15));
        phonenumberField.setSize(190, 20);
        phonenumberField.setLocation(150, 200);
        container.add(phonenumberField);


        emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLabel.setSize(100, 20);
        emailLabel.setLocation(50, 250);
        container.add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 15));
        emailField.setSize(190, 20);
        emailField.setLocation(150, 250);
        container.add(emailField);
        
        usernameLabel = new JLabel("UserName");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        usernameLabel.setSize(100, 20);
        usernameLabel.setLocation(50, 300);
        container.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setFont(new Font("Arial", Font.PLAIN, 15));
        usernameField.setSize(190, 20);
        usernameField.setLocation(150, 300);
        container.add(usernameField);
        


        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordLabel.setSize(100, 20);
        passwordLabel.setLocation(50, 350);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordField.setSize(190, 20);
        passwordField.setLocation(150, 350);
        container.add(passwordField);
        
        confirmPWLabel = new JLabel("Confirm PW");
        confirmPWLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        confirmPWLabel.setSize(100, 20);
        confirmPWLabel.setLocation(50, 400);
        container.add(confirmPWLabel);

        
        confirmPWField = new JTextField();
        confirmPWField.setFont(new Font("Arial", Font.PLAIN, 15));
        confirmPWField.setSize(190, 20);
        confirmPWField.setLocation(150, 400);
        container.add(confirmPWField);
       
        
        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 15));
        resetButton.setSize(100, 20);
        resetButton.setLocation(200, 450);
        resetButton.addActionListener(this);
        container.add(resetButton);
        
        signUpButton = new JButton("SignUp");
        signUpButton.setFont(new Font("Arial", Font.PLAIN, 15));
        signUpButton.setSize(100, 20);
        signUpButton.setLocation(50, 450);
        signUpButton.addActionListener(this);
        container.add(signUpButton);
         
        
        //add action listener to the signup button
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerfromed(ActionEvent e) {
            
				String First_Name= nameField1.getText();
            	String Last_Name= nameField2.getText();
            	String PhoneNumber= phonenumberField.getText();
            	String Email= emailField.getText();
            	String UserName= usernameField.getText();
            	String PossWord= new String(passwordField.getText());
            	String Confirm_PW= confirmPWField.getText();
            	
            	registration(First_Name,Last_Name,PhoneNumber,Email,UserName,PossWord,Confirm_PW);
            }	
        });
        
        
        
        private static void registration(String First_Name, String Last_Name, int PhoneNumber,String Email,String UserName,String PossWord,String Confirm_PW ) {
            String jdbcURL = "jdbc:mysql://localhost:3306/registration_db";
            String dbUser = "root";
            String dbPassword = "password";

            try (Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword)) {
                String sql = "INSERT INTO users (First_Name,Last_Name,PhoneNumber,Email,UserName,PossWord,Confirm_PW) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, First_Name);
                statement.setString(2, Last_Name);
                statement.setString(3, PhoneNumber);
                statement.setString(4, Email);
                statement.setString(5, UserName);
                statement.setString(6, PossWord);
                statement.setString(7, Confirm_PW);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "User registered successfully!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
 
		/*
		 * public void actionEvent() { signUpButton.addActionListener(this);
		 * resetButton.addActionListener(this); } public void
		 * actionPerformed(ActionEvent e) { if (e.getSource()==signUpButton) { try {
		 * Connection connection =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/registration_db",
		 * "root", "root"); //Prepared Statement PreparedStatement Pstatement =
		 * connection.prepareStatement("insert into user values(?,?,?,?,?,?,?)"); //
		 * Specifying the values of it's parameter Pstatement.setString(1,
		 * nameField1.getText()); Pstatement.setString(2, nameField2.getText());
		 * Pstatement.setString(3, phonenumberField.getText()); Pstatement.setString(4,
		 * emailField.getText()); Pstatement.setString(5, usernameField.getText());
		 * Pstatement.setString(6, passwordField.getText()); Pstatement.setString(5,
		 * confirmPWField.getText());
		 * 
		 * //Checking for the password match if
		 * (passwordField.getText().equals(confirmPWField.getText())) { // Executing
		 * query Pstatement.executeUpdate(); JOptionPane.showMessageDialog(null,
		 * "Data Registered Successfully"); // go back to login page if registered
		 * successfully
		 * 
		 * } else { JOptionPane.showMessageDialog(null, "Password did not match"); //
		 * Clearing confirm password fields confirmPWField.setText(""); } } catch
		 * (Exception ex) { ex.printStackTrace(); } (e.getSource() == resetButton) { //
		 * Clearing Fields nameField1.setText(""); nameField2.setText("");
		 * phonenumberField.setText(""); emailField.setText("");
		 * usernameField.setText(""); passwordField.setText("");
		 * confirmPWField.setText(""); } } }
		 */
  
  
  
    } catch (Exception ex) {
        ex.printStackTrace();
    }
	
        setVisible(true);

	}
    
}
   


    
    

