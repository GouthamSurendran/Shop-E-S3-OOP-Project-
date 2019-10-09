
 import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;

import javax.swing.table.*;
public class customerInfo extends JFrame implements ActionListener{
	

	  String[] data=new String[4];
	  String[] columnNames = { "Username", "Name", "E-mail","Phone number" }; 
	  

	JTable j;
	JPanel panel1;
	JScrollPane sp ;
	JTextField tf;
	JButton b1;
	JPanel panel2;
	JLabel lb;
	
	DefaultTableModel dtm = new DefaultTableModel(null,columnNames);

	customerInfo(){
		super();
		 j = new JTable(dtm); 
		try {
			  j = new JTable(dtm); 
			    File file = new File("/home/gautham/Desktop/OopMaster/details.txt");
			    Scanner input = new Scanner(file);
			    while (input.hasNextLine()) {
			        data= input.nextLine().split(",");
			        dtm.addRow(data);
			    }	    
			   input.close();
		  tf = new JTextField("Total number of customers" +","+ "Add count variable here");
		  b1=new JButton("Go Back");
		  panel1=new JPanel(new BorderLayout(10,5));
		  panel2=new JPanel();
		  b1.addActionListener(this);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		catch(Exception f){
			JOptionPane.showMessageDialog(null, f);
		}
		  addAll();
		  
	}
	
	private void addAll() {
	    j.setPreferredScrollableViewportSize(new Dimension(600, 400));
		sp=new JScrollPane(j);
		panel1.add(sp, BorderLayout.CENTER);
		panel1.add(tf,BorderLayout.SOUTH);
		b1.setFont(new Font("Ariel",Font.ITALIC,18));
		b1.setForeground(Color.BLUE);
		b1.setBackground(Color.LIGHT_GRAY);
		panel2.add(panel1);
		panel2.add(b1);
		tf.setBackground(Color.WHITE);
		tf.setEditable(false);
		j.setEnabled(false);
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


