import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.*;


public class Headphones extends JFrame implements ActionListener{
	
	
	JPanel panel2;
	JButton bb1;
	ImageIcon i2;
	JButton bb3;
	JButton bb4;
	JButton bb5;
	JButton bb6;
	JButton bb7;
	JButton bb2;
	ImageIcon i3;
	JPanel panel3;
	JLabel image;
	JPanel panel1;	JLabel t2;JLabel t3;JLabel t4;JLabel t5;JLabel t6;JLabel t7;JLabel t8;JLabel t9;
	JLabel image2;  JLabel l2;JLabel l3;JLabel l4;JLabel l5;JLabel l6;JLabel l7;JLabel l8;JLabel l9;
	
	//main
	
	JLabel excl;
	JButton iphone;
	JButton oneplus;
	JButton Phone3;
	JButton Phone4;
	
	
	Headphones(){
		super();
	}
	Headphones(String s){
		super(s);
		
		
		//left window
		
		panel2=new JPanel();
		panel1=new JPanel();
		image2=new JLabel();
		bb1=new JButton();
		i2=new ImageIcon("/home/gautham/Desktop/OopMaster/img.png");
		bb3=new JButton("Edit Profile");
		bb4=new JButton("View Cart");
		bb5 = new JButton("Exclusive items");
		bb6 = new JButton("Log Out");
		bb7 = new JButton("Home");
		bb2=new JButton();
		i3=new ImageIcon("/home/gautham/Desktop/OopMaster/close.png");
		panel3=new JPanel();
		
		l2=new JLabel("Name");
		l3=new JLabel("Realme Buds Wireless");
		l4=new JLabel("Bluetooth");
		l5=new JLabel("5.0");
		l6=new JLabel("Battery");
		l7=new JLabel("12 Hours");
		l8=new JLabel("Price");
		l9=new JLabel("Rs 1,799");
		
		t2=new JLabel("Name");
		t3=new JLabel("OnePlus Bullets Wireless 2");
		t4=new JLabel("Bluetooth");
		t5=new JLabel("5.0");
		t6=new JLabel("Battery");
		t7=new JLabel("14 Hours");
		t8=new JLabel("Price");
		t9=new JLabel("Rs 5,699");
		
		bb1.addActionListener(this);
		bb2.addActionListener(this);
		bb3.addActionListener(this);
		bb4.addActionListener(this);
		bb5.addActionListener(this);
		bb6.addActionListener(this);
		bb7.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//main
		excl =new JLabel("Headphones On, World off!");

		Phone3 = new JButton();
		Phone4 = new JButton();
		
		Phone3.addActionListener(this);
		Phone4.addActionListener(this);
		addAll();
	}
	
	public void addAll() {
		
		//left window
		
		
		panel2.setLayout(null);
		bb1.setIcon(i2);
		setFont(new Font("Arial",Font.ITALIC,18));
		bb1.setBounds(0,0,30,35);
		bb1.setBackground(new Color(0,0,0,15));
		panel2.add(bb1);
		panel2.setVisible(true);
		bb3.setBounds(0,40,200,40);
		bb3.setBackground(Color.DARK_GRAY);
		bb3.setForeground(Color.WHITE);
		bb4.setBackground(Color.DARK_GRAY);
		bb4.setForeground(Color.WHITE);
		bb4.setBounds(0,80,200,40);
		bb5.setBackground(Color.DARK_GRAY);
		bb5.setForeground(Color.WHITE);
		bb5.setBounds(0,120,200,40);
		bb6.setBackground(Color.DARK_GRAY);
		bb6.setForeground(Color.WHITE);
		bb6.setBounds(0,160,200,40);
		bb7.setBackground(Color.DARK_GRAY);
		bb7.setForeground(Color.WHITE);
		bb7.setBounds(0,200,200,40);
		bb2.setBackground(Color.DARK_GRAY);
		bb2.setBounds(160,0,40,40);
		bb2.setIcon(i3);
		ImageIcon nn=new ImageIcon("/home/gautham/Desktop/OopMaster/select.png");
		image2.setIcon(nn);
		image2.setBounds(200,0,400,800);
		
		l2.setBounds(350,90,150,20);
		l3.setBounds(450,90,150,20);
		l4.setBounds(350,140,150,20);
		l5.setBounds(450,140,150,20);
		l6.setBounds(350,190,150,20);
		l7.setBounds(450,190,150,20);
		l8.setBounds(350,240,150,20);
		l9.setBounds(450,240,150,20);
		l2.setFont(new Font("Kalimati",Font.ITALIC,16));
		l2.setForeground(Color.BLACK);
		l3.setFont(new Font("Kalimati",Font.ITALIC,16));
		l3.setForeground(Color.BLACK);
		l4.setFont(new Font("Kalimati",Font.ITALIC,16));
		l4.setForeground(Color.BLACK);
		l5.setFont(new Font("Kalimati",Font.ITALIC,16));
		l5.setForeground(Color.BLACK);
		l6.setFont(new Font("Kalimati",Font.ITALIC,16));
		l6.setForeground(Color.BLACK);
		l7.setFont(new Font("Kalimati",Font.ITALIC,16));
		l7.setForeground(Color.BLACK);
		l8.setFont(new Font("Kalimati",Font.ITALIC,16));
		l8.setForeground(Color.BLACK);
		l9.setFont(new Font("Kalimati",Font.ITALIC,16));
		l9.setForeground(Color.BLACK);
		
		t2.setBounds(350,330,150,20);
		t3.setBounds(450,330,150,20);
		t4.setBounds(350,380,150,20);
		t5.setBounds(450,380,150,20);
		t6.setBounds(350,430,150,20);
		t7.setBounds(450,430,150,20);
		t8.setBounds(350,480,150,20);
		t9.setBounds(450,480,150,20);
		t2.setFont(new Font("Kalimati",Font.ITALIC,16));
		t2.setForeground(Color.BLACK);
		t3.setFont(new Font("Kalimati",Font.ITALIC,16));
		t3.setForeground(Color.BLACK);
		t4.setFont(new Font("Kalimati",Font.ITALIC,16));
		t4.setForeground(Color.BLACK);
		t5.setFont(new Font("Kalimati",Font.ITALIC,16));
		t5.setForeground(Color.BLACK);
		t6.setFont(new Font("Kalimati",Font.ITALIC,16));
		t6.setForeground(Color.BLACK);
		t7.setFont(new Font("Kalimati",Font.ITALIC,16));
		t7.setForeground(Color.BLACK);
		t8.setFont(new Font("Kalimati",Font.ITALIC,16));
		t8.setForeground(Color.BLACK);
		t9.setFont(new Font("Kalimati",Font.ITALIC,16));
		t9.setForeground(Color.BLACK);
		
		panel1.setBounds(200,-5,400,800);
		panel1.add(image2);
		add(panel1);
		panel1.setVisible(false);
		panel2.setBounds(0,0,600,600);
		panel3.setBounds(0,0,200,600);
		panel3.setBackground(Color.DARK_GRAY);
		panel3.add(bb2);
		panel3.add(bb3);
		panel3.add(bb4);
		panel3.add(bb5);
		panel3.add(bb6);
		panel3.add(bb7);
		setVisible(true);
		

		panel2.add(panel3);
		panel3.setLayout(null);
		panel3.setVisible(false);
		
		panel2.add(l2);
		panel2.add(l3);
		panel2.add(l4);
		panel2.add(l5);	
		panel2.add(l6);
		panel2.add(l7);
		panel2.add(l8);
		panel2.add(l9);
		
		panel2.add(t2);
		panel2.add(t3);
		panel2.add(t4);
		panel2.add(t5);	
		panel2.add(t6);
		panel2.add(t7);
		panel2.add(t8);
		panel2.add(t9);
				
		//main
		
		excl.setBounds(20,0,550,80);
		excl.setBackground(Color.DARK_GRAY);
		excl.setForeground(Color.DARK_GRAY);
		excl.setFont(new Font("Ariel",Font.ITALIC,26));
		excl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		panel2.add(excl);
		
		ImageIcon three=new ImageIcon("/home/gautham/Desktop/OopMaster/realme.jpg");
		Phone3.setBounds(20,80,275,230);
		Phone3.setIcon(three);
		panel2.add(Phone3);
		
		ImageIcon four=new ImageIcon("/home/gautham/Desktop/OopMaster/bullet.jpg");
		Phone4.setBounds(20,320,275,230);
		Phone4.setIcon(four);
		panel2.add(Phone4);
		
		
		
		add(panel2);
		add(panel3);
		setSize(600,600);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent p) {
		
		if(p.getSource()==bb1) {
			bb1.setVisible(false);
			panel3.setVisible(true);
			panel2.setVisible(false);
			panel1.setVisible(true);
		}
		else if(p.getSource()==bb2) {
			bb1.setVisible(true);
			panel2.setVisible(true);
			panel3.setVisible(false);
			panel1.setVisible(false);
		}
		else if(p.getSource()==bb3) {
			this.dispose();
			new editprof("Edit Profile");
		}
		else if(p.getSource()==bb4) {
			dispose();
			new ViewCart("ViewCart");
		}
		else if(p.getSource()==bb5) {
			this.dispose();
			new ExclusiveItems("Exclusive Items");
		}
		else if(p.getSource()==bb6) {
			
			int option = 	JOptionPane.showConfirmDialog(bb6, "Are you sure you want to Log Out?");
			if(option == JOptionPane.YES_OPTION) {
			this.dispose();
			try {
				FileWriter file=new FileWriter("/home/gautham/Desktop/OopMaster/products.txt");
				file.write("");
				file.close();
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
			new Homepage();
			}}
		else if(p.getSource()==bb7) {
			dispose();
			new Secondpage("Welcome to Shop-E");
		}
		else if(p.getSource()==bb7) {
			dispose();
			new Secondpage("Welcome to Shop-E");
		}
		else if(p.getSource()==Phone3) {
			try {
				File file=new File("/home/gautham/Desktop/OopMaster/products.txt");
			FileWriter fw=new FileWriter(file,true);
			fw.write("Realme buds wireless,1799\n");
			fw.close();
			JOptionPane.showMessageDialog(null, "Added to cart");
			}
			catch(Exception f){
				JOptionPane.showMessageDialog(null, f);
			}}
			else if(p.getSource()==Phone4) {
				try {
					File file=new File("/home/gautham/Desktop/OopMaster/products.txt");
				FileWriter fw=new FileWriter(file,true);
				fw.write("OnePlus Bullets Wireless 2,5699\n");
				fw.close();
				JOptionPane.showMessageDialog(null, "Added to cart");
				}
				catch(Exception f){
					JOptionPane.showMessageDialog(null, f);
				}
}
	}
}


