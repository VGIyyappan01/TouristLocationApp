package com.mycompany.touristlocationapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
	private Container container;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton loginButton;
	private JButton forgotPasswordButton;
	private JButton signup;

	public LoginPage() {

		setTitle("TLA//:Login Page");
		setBounds(300, 90, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		container = getContentPane();
		container.setLayout(null);

		usernameField = new JTextField();
		usernameField.setFont(new Font("Arial", Font.PLAIN, 15));
		usernameField.setSize(190, 20);
		usernameField.setLocation(200, 200);
		container.add(usernameField);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
		passwordField.setSize(190, 20);
		passwordField.setLocation(200, 250);
		container.add(passwordField);

		loginButton = new JButton("LogIn");
		loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
		loginButton.setSize(100, 20);
		loginButton.setLocation(180, 350);
		// loginButton.addActionListener(this);
		container.add(loginButton);

		signup = new JButton("SignUp");
		signup.setFont(new Font("Arial", Font.PLAIN, 15));
		signup.setSize(100, 20);
		signup.setLocation(300, 350);
		// signup.addActionListener(this);
		container.add(signup);

		forgotPasswordButton = new JButton("ForgotPassword");
		forgotPasswordButton.setFont(new Font("Arial", Font.PLAIN, 15));
		forgotPasswordButton.setSize(100, 20);
		forgotPasswordButton.setLocation(50, 400);
		// forgotPasswordButton.addActionListener(this);
		container.add(forgotPasswordButton);
		
		
		loginButton.addActionListener(new LoginButtonListener());
		forgotPasswordButton.addActionListener(new ForgotPasswordButtonListener());

		private class LoginButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());

				// Simple authentication logic (replace with real authentication logic)
				if (username.equals("user") && password.equals("password")) {
					JOptionPane.showMessageDialog(LoginPage.this, "Login successful!");
				} else {
					JOptionPane.showMessageDialog(LoginPage.this, "Invalid username or password.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginPage();
	}

	/*
	 * * // Create and set up the panel JPanel panel = new JPanel();
	 * panel.setLayout(new GridLayout(3, 2));
	 * 
	 * // Add components to the panel panel.add(new JLabel("Username:"));
	 * usernameField = new JTextField(); panel.add(usernameField);
	 * 
	 * panel.add(new JLabel("Password:")); passwordField = new JPasswordField();
	 * panel.add(passwordField);
	 * 
	 * loginButton = new JButton("Login"); forgotPasswordButton = new
	 * JButton("Forgot Password");
	 * 
	 * panel.add(loginButton); panel.add(forgotPasswordButton);
	 */
	// Add action listeners
	/*
	 * loginButton.addActionListener(new LoginButtonListener());
	 * forgotPasswordButton.addActionListener(new ForgotPasswordButtonListener());
	 * 
	 * // Add the panel to the frame // add(panel);
	 * 
	 * // Make the frame visible
	 * 
	 * // Action listener for the login button private class LoginButtonListener
	 * implements ActionListener { public void actionPerformed(ActionEvent e) {
	 * String username = usernameField.getText(); String password = new
	 * String(passwordField.getPassword());
	 * 
	 * // Simple authentication logic (replace with real authentication logic) if
	 * (username.equals("user") && password.equals("password")) {
	 * JOptionPane.showMessageDialog(LoginPage.this, "Login successful!"); } else {
	 * JOptionPane.showMessageDialog(LoginPage.this,
	 * "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE); } } }
	 * 
	 * // Action listener for the forgot password button private class
	 * ForgotPasswordButtonListener implements ActionListener { public void
	 * actionPerformed(ActionEvent e) {
	 * JOptionPane.showMessageDialog(LoginPage.this,
	 * "Password recovery feature is not implemented."); } }
	 * 
	 * public static void main(String[] args) { // Create and display the login page
	 * SwingUtilities.invokeLater(new Runnable() { public void run() { new
	 * LoginPage(); } });
	 */ }

*/