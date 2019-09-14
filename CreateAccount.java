package logins;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class CreateAccount extends JFrame implements ActionListener{
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
	CreateAccount(){
		super();
	}
	CreateAccount(String s){
		super(s);
		panel =new JPanel();
		ii=new ImageIcon("/home/sourag/Desktop/create.png");
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
		b1=new JButton("CREATE");
		b2=new JButton("GO BACK");
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
		lb1.setBounds(50,100,200,20);
		lb1.setForeground(Color.BLACK);
		lb1.setFont(new Font("Kalimati",Font.ITALIC,22));
		lb2.setBounds(50,150,200,20);
		lb2.setForeground(Color.BLACK);
		lb2.setFont(new Font("Kalimati",Font.ITALIC,22));
		lb3.setBounds(50,200,200,20);
		lb3.setForeground(Color.BLACK);
		lb3.setFont(new Font("Kalimati",Font.ITALIC,22));
		lb4.setBounds(50,250,200,20);
		lb4.setForeground(Color.BLACK);
		lb4.setFont(new Font("Kalimati",Font.ITALIC,22));
		lb5.setBounds(50,300,200,20);
		lb5.setForeground(Color.BLACK);
		lb5.setFont(new Font("Kalimati",Font.ITALIC,22));
		lb6.setBounds(50,350,200,20);
		lb6.setForeground(Color.BLACK);
		lb6.setFont(new Font("Kalimati",Font.ITALIC,22));
		tf1.setBounds(300,100,150,30);
		tf1.setBackground(Color.GRAY);
		tf1.setForeground(Color.WHITE);
		tf2.setBounds(300,150,150,30);
		tf2.setBackground(Color.GRAY);
		tf2.setForeground(Color.WHITE);
		tf3.setBounds(300,200,150,30);
		tf3.setBackground(Color.GRAY);
		tf3.setForeground(Color.WHITE);
		tf4.setBounds(300,250,150,30);
		tf4.setBackground(Color.GRAY);
		tf4.setForeground(Color.WHITE);
		pf1.setBackground(Color.GRAY);
		pf1.setForeground(Color.WHITE);
		pf1.setBounds(300,300,150,30);
		pf2.setBackground(Color.GRAY);
		pf2.setForeground(Color.WHITE);
		pf2.setBounds(300,350,150,30);
		b1.setBounds(30,400,200,20);
		b2.setBounds(275,400,200,20);
		b1.setFont(new Font("Ariel",Font.BOLD,12));
		b1.setForeground(Color.GREEN);
		b2.setFont(new Font("Ariel",Font.BOLD,12));
		b2.setForeground(Color.RED);
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

