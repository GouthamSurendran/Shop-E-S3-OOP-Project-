

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class viewCatalogue extends JFrame implements ActionListener{

	  String[][] data = { 
	            { "iPhone XI pro max", "109,900" }, { "Oneplus 7T", "37999" }
	            ,{"Samsung Automatic","28,499"},{"Samsung Frost Free","2,59,990"},{"Realme Buds Wireless","1799"},{"OnePlus Bullets Wireless 2","5699"},{"Redmi Note 8 Pro","16,999"},{"Asus Rog Phone 2",",37,999"}
	        }; 
	  String[] columnNames = { "ProductName", "Current Price" }; 
	  

	JTable j;
	JPanel panel1;
	JScrollPane sp ;
	JButton b1;
	JPanel panel2;
	JLabel lb;
	
	
	viewCatalogue(){
		super();
	}
	
	viewCatalogue(String S){
		super(S);
		  j = new JTable(data, columnNames); 
		  b1=new JButton("Go Back");
		  panel1=new JPanel(new BorderLayout(10,5));
		  panel2=new JPanel();
		  b1.addActionListener(this);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  addAll();
		  
	}
	
	private void addAll() {
	    j.setPreferredScrollableViewportSize(new Dimension(500, 400));
		sp=new JScrollPane(j);
		panel1.add(sp, BorderLayout.CENTER);
		b1.setFont(new Font("Ariel",Font.ITALIC,18));
		b1.setForeground(Color.BLUE);
		b1.setBackground(Color.LIGHT_GRAY);
		panel2.add(panel1);
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
