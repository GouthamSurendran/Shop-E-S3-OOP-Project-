

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class CreateAccount extends JFrame implements ActionListener{
	
	JLabel cart;    //LOGO
	JLabel lb1;  //name
	JLabel lb2;  //email
	JLabel lb3;  //phonenumber
	JLabel lb4;  //username
	JLabel lb5;  //password
	JLabel lb6;  //confirm
	JLabel lb7; //image
	JTextField tf1; //name
	JTextField tf2; //email
	JTextField tf3; //phonenumber
	JTextField tf4; //username
	JPasswordField pf1; //password
	JPasswordField pf2; //confirm
	JButton b1; //create
	JButton b2;  //go back
	JPanel panel;
	ImageIcon ii;
	ImageIcon i2;
	
	CreateAccount(){
		super();
	}
	CreateAccount(String s){
		super(s);
		panel =new JPanel();
		ii=new ImageIcon("/home/gautham/Desktop/OopMaster/select.png");
		i2=new ImageIcon("/home/gautham/Desktop/OopMaster/cart.png");
		
		cart  = new JLabel();		
		lb1=new JLabel("Name");
		lb2=new JLabel("E-mail");
		lb3=new JLabel("Phone Number");
		lb4=new JLabel("Username");
		lb5=new JLabel("Password");
		lb6=new JLabel("Confirm Password");
		lb7=new JLabel();
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		pf1=new JPasswordField();
		pf2=new JPasswordField();
		b1=new JButton("Sign up");
		b2=new JButton("Go back");
		b1.addActionListener(this);
		b2.addActionListener(this);
		addAll();
		
	}
	public void addAll() {
		panel.setLayout(null);
		setFont(new Font("Arial",Font.ITALIC,18));
		lb7.setBounds(0,0,500,500);
		lb7.setIcon(ii);
		panel.add(lb7);
		panel.setVisible(true);
		lb1.setBounds(50,80,200,20);
		lb1.setForeground(Color.WHITE);
		lb1.setFont(new Font("Kalimati",Font.ITALIC,20));
		lb2.setBounds(50,130,200,20);
		lb2.setForeground(Color.WHITE);
		lb2.setFont(new Font("Kalimati",Font.ITALIC,20));
		lb3.setBounds(50,180,200,20);
		lb3.setForeground(Color.WHITE);
		lb3.setFont(new Font("Kalimati",Font.ITALIC,20));
		lb4.setBounds(50,230,200,20);
		lb4.setForeground(Color.WHITE);
		lb4.setFont(new Font("Kalimati",Font.ITALIC,20));
		lb5.setBounds(50,280,200,20);
		lb5.setForeground(Color.WHITE);
		lb5.setFont(new Font("Kalimati",Font.ITALIC,20));
		lb6.setBounds(50,330,200,20);
		lb6.setForeground(Color.WHITE);
		lb6.setFont(new Font("Kalimati",Font.ITALIC,20));
		tf1.setBounds(300,80,150,30);
		tf1.setBackground(new Color(0,0,0,15));
		tf1.setForeground(Color.WHITE);
		tf2.setBounds(300,130,150,30);
		tf2.setBackground(new Color(0,0,0,15));
		tf2.setForeground(Color.WHITE);
		tf3.setBounds(300,180,150,30);
		tf3.setBackground(new Color(0,0,0,15));
		tf3.setForeground(Color.WHITE);
		tf4.setBounds(300,230,150,30);
		tf4.setBackground(new Color(0,0,0,15));
		tf4.setForeground(Color.WHITE);
		pf1.setBackground(new Color(0,0,0,15));
		pf1.setForeground(Color.WHITE);
		pf1.setBounds(300,280,150,30);
		pf2.setBackground(new Color(0,0,0,15));
		pf2.setForeground(Color.WHITE);
		pf2.setBounds(300,330,150,30);
		b1.setBounds(30,400,200,30);
		b2.setBounds(275,400,200,30);
		b1.setFont(new Font("Kalimati",Font.ITALIC,18));
		b1.setBackground(new Color(0,0,0,15));
		b1.setForeground(Color.GREEN);
		b2.setFont(new Font("Kalimati",Font.ITALIC,18));
		b2.setForeground(Color.RED);
		b2.setBackground(new Color(0,0,0,15));
		cart.setBounds(390,0,150,100);
		cart.setIcon(i2);
		cart.setBackground(new Color(0,0,0,15));
		
		panel.setBounds(0,0,500,500);
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		add(lb6);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(pf1);
		add(pf2);
		add(b1);
		add(b2);
		add(cart);
		add(panel);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);

		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(null,"Registration Successfull");
			Homepage n=new Homepage();
			this.dispose();
		}
		else {
			Homepage n=new Homepage();
			this.dispose();
		}
	}
}

