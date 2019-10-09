
import javax.swing.table.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
import java.io.*;
public class ViewCart extends JFrame implements ActionListener{

	String[] data = new String[3];
	  String[] columnNames = { "ProductName", "Cost" }; 
	  

	JTable j;
	JPanel panel1;
	JScrollPane sp ;
	JTextField tf;
	JButton b;
	JButton b1;
	JPanel panel2;
	JLabel lb;
	DefaultTableModel dtm = new DefaultTableModel(null,columnNames);
	
	ViewCart(){
		super();
	}
	
	ViewCart(String S){
		super(S);
		try {
		  j = new JTable(dtm); 
		    File file = new File("/home/gautham/Desktop/OopMaster/products.txt");
		    int price=0;
		    Scanner input = new Scanner(file);
		    while (input.hasNextLine()) {
		        data= input.nextLine().split(",");
		        dtm.addRow(data);
		        price+=Integer.parseInt(data[1]);
		    }	    
		   input.close();
		  tf = new JTextField(Integer.toString(price));
		  b=new JButton("CheckOut");
		  b1=new JButton("Go Back");
		  panel1=new JPanel(new BorderLayout(10,5));
		  panel2=new JPanel();
		  b.addActionListener(this);
		  b1.addActionListener(this);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  addAll();
		}
		catch(Exception f){
			JOptionPane.showMessageDialog(null, f);
		}
		  
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
		tf.setBackground(Color.WHITE);
		tf.setEditable(false);
		j.setEnabled(false);
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
		new Secondpage("Shop-E");
	}
	else if(e.getSource()==b){
		this.dispose();
		new order();
	}
}
}
