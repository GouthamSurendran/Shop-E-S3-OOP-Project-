import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

public class ViewCart extends JFrame{

	  String[][] data = { 
	            { "Xiaomi Poco f1", "1", "22,999.50" }, 
	            { "Poco phone cover", "2", "299.0" } 
	        }; 
	  String[] columnNames = { "ProductName", "Quantity", "Cost" }; 
	  

	JTable j;
	JScrollPane sp ; 
	JLabel jb;JTextField tf;
	
	
	ViewCart(){
		super();
	}
	
	ViewCart(String S){
		super(S);
		  j = new JTable(data, columnNames); 
		  sp = new JScrollPane(j);
		  jb = new JLabel("Sum Total");
		  tf = new JTextField("23,298.50");
		  addAll();
		  
	}
	
	private void addAll() {
		
		add(jb,BorderLayout.SOUTH);
		add(tf,BorderLayout.EAST);
		j.setFillsViewportHeight(true);
		add(sp);
		setVisible(true);
		setSize(600,600);
		setLocationRelativeTo(null);
		
		
	}

}
	
	
		
				
		
		
	
	
	

