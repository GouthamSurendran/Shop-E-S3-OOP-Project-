import java.io.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
public class Homepage extends JFrame implements ActionListener{

	JButton b;
	JLabel cart;
	JPanel panel;
	ImageIcon i3;
	ImageIcon ii;
	ImageIcon i2;
	JLabel lb1;
	JLabel lb2;
	JLabel lb3;
	JLabel lb4;
	JLabel lb5;
	JTextField tf2;
	JTextField tf1;
	JPasswordField pf1;
	JButton b1;
	JButton b2;
	JButton b3;
	
	Homepage(){
		
		super();
		panel=new JPanel();
		ii=new ImageIcon("/home/gautham/Desktop/OopMaster/select.png");
		i2=new ImageIcon("/home/gautham/Desktop/OopMaster/cart.png");
		lb1=new JLabel();
		lb2=new JLabel("Username");
		lb3=new JLabel("Password");
		lb4 = new JLabel("Welcome to Shop-E !");
		i3=new ImageIcon("/home/gautham/Desktop/OopMaster/close.png");
		lb5=new JLabel("Create an account here :");
		tf1=new JTextField();
		pf1=new JPasswordField();
		b1=new JButton("Sign in");
		b2=new JButton();
		b3=new JButton("Sign Up");
		
		cart  = new JLabel();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		addAll();
	}
	
	
	public void addAll() {
		
		setUndecorated(true);
		lb1.setIcon(ii);
		lb1.setBounds(0,0,500,500);
		lb4.setBounds(110,60,300,30);
		lb4.setFont(new Font("Kalimati",Font.ITALIC,24));
		lb4.setForeground(Color.WHITE);
		lb2.setBounds(50,150,150,20);
		lb2.setForeground(Color.WHITE);
		lb2.setFont(new Font("Kalimati",Font.ITALIC,22));
		tf1.setBounds(300,150,150,30);
		tf1.setBackground(new Color(0,0,0,15));
		tf1.setForeground(Color.WHITE);
		lb3.setBounds(50,250,150,20);
		lb3.setFont(new Font("Kalimati",Font.ITALIC,22));
		lb3.setForeground(Color.WHITE);
		lb5.setBounds(50,450,200,20);
		lb5.setFont(new Font("Kalimati",Font.ITALIC,16));
		lb5.setForeground(Color.WHITE);
		pf1.setBackground(new Color(0,0,0,15));
		pf1.setForeground(Color.WHITE);
		pf1.setBounds(300,250,150,30);
		b1.setFont(new Font("Kalimati",Font.ITALIC,21));
		b2.setFont(new Font("Kalimati",Font.PLAIN,21));
		b1.setForeground(Color.GREEN);
		b1.setBackground(new Color(0,0,0,20));
		b2.setForeground(Color.BLACK);
		b1.setBounds(175,350,150,30);
		b2.setBounds(465,0,40,30);
		b3.setBounds(270,450,150,30);
		b3.setFont(new Font("Kalimati",Font.ITALIC,18));
		b3.setForeground(Color.RED);
		
		cart.setBounds(370,30,150,100);
		cart.setIcon(i2);
		cart.setBackground(new Color(0,0,0,15));
		
		b2.setBackground(new Color(0,0,0,15));
		b2.setIcon(i3);
		b3.setBackground(new Color(0,0,0,15));
		b3.setLayout(null);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(pf1);
		panel.add(lb3);
		panel.add(tf1);
		panel.add(lb1);
		add(lb2);
		add(lb4);
		add(lb5);
		add(b3);
		add(cart);
		panel.setLayout(null);
		panel.setSize(500,500);

		add(panel);
		
		setSize(500,500);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String s = "root"; String p = "root";
		
		if(e.getSource()==b1) {
			//setVisible(false);
			dispose();
			String s1=tf1.getText();
			String s2=pf1.getText();
			
			if(s1.equals(s) && s2.equals(p))
			{
				new adminLogin("Administrator");
			}
			else if(!s1.equals("") && !s2.equals("")){
				try {
					File file=new File("/home/gautham/Desktop/OopMaster/users.txt");
				    Scanner read = new Scanner(file);
				    read.useDelimiter("\\n|,");
				    boolean check=false;
				    while(read.hasNext()){
				       String user = read.next();
				       String pass = read.next();
				       if(s1.equals(user) && s2.equals(pass)) {
				    	  check=true;
				       }
				    }
				    if(check) {
				    	new Secondpage("Shop-E");
				    }
				    else {
				    	JOptionPane.showMessageDialog(null, "Authentication failed");
				    	new Homepage();
				      }
				}
				catch(Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
			}
//			else{
//				JOptionPane.showMessageDialog(null, "Username or password incorrect");
//				System.exit(0);
//			}
		}
		else if(e.getSource()==b2)System.exit(0);
		else {
			this.dispose();
			new CreateAccount("Create Account");
		}
	}
	
	
	
	
}
