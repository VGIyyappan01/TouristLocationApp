
package com.mycompany.touristlocationapp;

import java.awt.*;
import java.awt.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java. util. *;
import java.lang.Thread.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;  

public class HomePage extends JFrame {
		private Container container;
		
	public	HomePage() {

			setTitle("TLA//:HomePage");
			setBounds(300, 90, 700, 700);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(true);

			container = getContentPane();
			container.setLayout(null);
		   
		  
			
 			
			
			
			
			
try   
{  
	
// xml file to get data insert java file
	
File file = new File("C:\\Users\\Iyyappan V\\Documents\\TLA2.xml");  
	
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
DocumentBuilder db = dbf.newDocumentBuilder(); 

Document doc = db.parse(file);

doc.getDocumentElement().normalize();  
System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
NodeList nodeList = doc.getElementsByTagName("district");

for (int i = 0; i < nodeList.getLength(); i++)   
{  
Node node = nodeList.item(i);  
System.out.println("\nNode Name :" + node.getNodeName());  
if (node.getNodeType() == Node.ELEMENT_NODE)   
{  

ArrayList list= new ArrayList<String>();
for(int j = 0;j< nodeList.getLength();j++)
{
	Element eElement = (Element) nodeList.item(j); 
	System.out.println("district name : "+ eElement.getAttribute("name"));

  
  String  str= eElement.getAttribute("name").toString();
  
  list.add(str);
  
  
}
  
  String[] distArray=new String[list.size()];

  list.toArray(distArray);
  JLabel dLabel=new JLabel("Districts");
  add(dLabel);
  dLabel.setBounds(2,1, 100, 50);
  //district list box
  JList<String> dList=new JList<String>(distArray);
  add(dList);
  dList.setBounds(50,10 , 150, 700);
 // add(new JScrollPane(dList),BorderLayout.CENTER);
  
  // touristplace list box
  JList<String> tpList=new JList<String>(distArray);
  add(tpList);
  tpList.setBounds(250,10,150,700);
  tpList.setVisible(false);
  
  //accomonatation list box
  
  JList<String> acList=new JList<String>(distArray);
  add(acList);
  acList.setBounds(500,10,150,700);
  acList.setVisible(false);
  
  


	
  
  
  
    // inside touristplace get the xml file
  
	/*
	 * NodeList nodeList1 = doc.getElementsByTagName("touristplace");
	 * 
	 * for (int i1 = 0; i1 < nodeList1.getLength(); i1++) { Node node1 =
	 * nodeList1.item(i1); System.out.println("\nNode Name :" + node.getNodeName());
	 * if (node1.getNodeType() == Node.ELEMENT_NODE) {
	 * 
	 * ArrayList list1= new ArrayList<String>(); for(int k = 0;k<
	 * nodeList.getLength();k++) { Element eeElement = (Element) nodeList.item(k);
	 * System.out.println("touristplace name : "+ eeElement.getAttribute("name"));
	 * 
	 * String str1= eeElement.getAttribute("name").toString(); list.add(str1);
	 * //store the touristplace countent to listbox
	 * 
	 * String[] distArray1=new String[list.size()]; list.toArray(distArray1);
	 * JList<String> list11=new JList<String>(distArray1); add(list11);
	 * list11.setBounds(100,10 , 200, 700);
	 * 
	 * } } }
	 */// notelist insert to design arreylist 



}
} 


}   
catch (Exception e)   
{  
e.printStackTrace();

}  
 setVisible(true);
 }

 public static void main(String[]args)
 {
	 new HomePage();
	 
 }
}  