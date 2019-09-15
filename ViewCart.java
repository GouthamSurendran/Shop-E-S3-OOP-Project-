package logins;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

public class ViewCart extends JFrame implements ActionListener{

	  String[][] data = { 
	            { "Xiaomi Poco f1", "1", "22,999.50" }, 
	            { "Poco phone cover", "2", "299.0" } 
	        }; 
	  String[] columnNames = { "ProductName", "Quantity", "Cost" }; 
	  

	JTable j;
	JPanel panel1;
	JScrollPane sp ;
	JTextField tf;
	JButton b;
	JButton b1;
	JPanel panel2;
	JLabel lb;
	
	
	ViewCart(){
		super();
	}
	
	ViewCart(String S){
		super(S);
		  j = new JTable(data, columnNames); 
		  tf = new JTextField("23,298.50");
		  b=new JButton("CheckOut");
		  b1=new JButton("Go Back");
		  panel1=new JPanel(new BorderLayout(10,5));
		  panel2=new JPanel();
		  b.addActionListener(this);
		  b1.addActionListener(this);
		  addAll();
		  
	}
	
	private void addAll() {
	    j.setPreferredScrollableViewportSize(new Dimension(500, 150));
		sp=new JScrollPane(j);
		panel1.add(sp, BorderLayout.CENTER);
		panel1.add(tf,BorderLayout.SOUTH);
		b.setFont(new Font("Ariel",Font.ITALIC,18));
		b.setBackground(Color.LIGHT_GRAY);
		b.setForeground(Color.BLUE);
		b1.setFont(new Font("Ariel",Font.ITALIC,18));
		b1.setForeground(Color.BLUE);
		b1.setBackground(Color.LIGHT_GRAY);
		panel2.add(panel1);
		panel2.add(b);
		panel2.add(b1);
		getContentPane().add(panel2);
		setVisible(true);
		validate();
		pack();
		setSize(700,400);
		setLocationRelativeTo(null);
		
		
	}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1) {
		this.dispose();
		Secondpage n=new Secondpage("Shop-E");
	}
}
}
