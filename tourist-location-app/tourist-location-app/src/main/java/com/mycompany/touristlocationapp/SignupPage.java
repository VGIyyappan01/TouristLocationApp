package com.mycompany.touristlocationapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SignupPage extends JFrame implements ActionListener {
    // Components of the signup form
    private Container container;
    private JLabel titleLabel, nameLabel1,nameLabel2, emailLabel,phonenumberLabel, passwordLabel;
    private JTextField nameField1,nameField2,phonenumberField, emailField;
    private JPasswordField passwordField;
    private JButton submitButton, resetButton;

    // Constructor to set up the GUI
    public SignupPage() {
        setTitle("Signup Form");
        setBounds(300, 90,700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

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

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordLabel.setSize(100, 20);
        passwordLabel.setLocation(50, 300);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordField.setSize(190, 20);
        passwordField.setLocation(150, 300);
        container.add(passwordField);
        
       
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        submitButton.setSize(100, 20);
        submitButton.setLocation(50, 350);
        submitButton.addActionListener(this);
        container.add(submitButton);

        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 15));
        resetButton.setSize(100, 20);
        resetButton.setLocation(200, 350);
        resetButton.addActionListener(this);
        container.add(resetButton);

        setVisible(true);
    }

    // Method to handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            // Process the signup data (e.g., save to a database)
            JOptionPane.showMessageDialog(this, "Signup Successful\nName: " + name + "\nEmail: " + email);
        } else if (e.getSource() == resetButton) {
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new SignupPage();
    }
}
