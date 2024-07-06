package com.mycompany.touristlocationapp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/*
 * public class DashBoard {
 * 
 * public DashBoard() { try { JFrame frame = new JFrame("DashBoard ");
 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setBounds(300,
 * 90, 700, 700);
 * 
 * 
 * 
 * 
 * 
 * frame.setVisible(true); }catch (Exception e) {
 * System.out.println("Something went wrong dash"); } } public static void
 * main(String[]args) { new DashBoard(); } }
 */
import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.awt.*;
import java.io.File;
import javax.swing.*;
import java.awt.*;

import java.awt.*;    

public class DashBoard  
{    
    
	DashBoard() {    
    
        Frame f = new Frame();      
        List l1 = new List(5);   
        l1.setBounds(100, 100, 75, 75);    
        f.add(l1);   
  
          
        f.setSize(400, 400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
  
 
public static void main(String args[])    
{    
   new DashBoard();    
}    
}    
/*
 * public class DashBoard { public static void main(String[] args) {
 * SwingUtilities.invokeLater(() -> { // Create a new JFrame JFrame frame = new
 * JFrame("DashBoard"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * frame.setSize(300, 200);
 * 
 * // Parse the XML file and get the items String[] items =
 * parseXML("C:\\Users\\Iyyappan V\\Documents\\TLA2.xml");
 * 
 * // Create a JList with the items JList<String> list = new JList<>(items);
 * 
 * // Add the list to a JScrollPane JScrollPane scrollPane = new
 * JScrollPane(list);
 * 
 * // Add the scrollPane to the frame frame.add(scrollPane,
 * BorderLayout.CENTER);
 * 
 * // Set frame visibility frame.setVisible(true); }); }
 * 
 * private static String[] parseXML(String filePath) { try { File file = new
 * File(filePath); DocumentBuilderFactory dbFactory =
 * DocumentBuilderFactory.newInstance(); DocumentBuilder dBuilder =
 * dbFactory.newDocumentBuilder(); Document doc = dBuilder.parse(file);
 * doc.getDocumentElement().normalize();
 * 
 * NodeList nodeList = doc.getElementsByTagName("district"); String[] districts
 * = new String[nodeList.getLength()];
 * 
 * for (int i = 0; i < nodeList.getLength(); i++) { districts[i] =
 * nodeList.item(i).getTextContent(); }
 * 
 * return districts ; } catch (Exception e) { e.printStackTrace(); return new
 * String[]{}; } } }
 */