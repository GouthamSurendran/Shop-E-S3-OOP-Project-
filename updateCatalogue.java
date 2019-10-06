

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class updateCatalogue extends JFrame implements ActionListener{

	  String[][] data = { 
	            { "Xiaomi Poco f1", "150", "22,999.50" }, { "Poco phone cover", "200", "299.0" }
	            ,{"Boat Rockerz 600","50","2000.0"},
	        }; 
	  String[] columnNames = { "ProductName", "Quantity", "Current Price" }; 
	  

	JTable j;
	JPanel panel1;
	JScrollPane sp ;
	JButton b;
	JButton b1;
	JPanel panel2;
	JLabel lb;
	
	
	updateCatalogue(){
		super();
	}
	
	updateCatalogue(String S){
		super(S);
		  j = new JTable(data, columnNames); 
		  b=new JButton("Update list");
		  b1=new JButton("Go Back");
		  panel1=new JPanel(new BorderLayout(10,5));
		  panel2=new JPanel();
		  b.addActionListener(this);
		  b1.addActionListener(this);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  addAll();
		  
	}
	
	private void addAll() {
	    j.setPreferredScrollableViewportSize(new Dimension(500, 400));
		sp=new JScrollPane(j);
		panel1.add(sp, BorderLayout.CENTER);
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
		setSize(600,600);
		setLocationRelativeTo(null);
		
		
	}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1) {
		this.dispose();
		new adminLogin("Administrator");
	}
}
}
