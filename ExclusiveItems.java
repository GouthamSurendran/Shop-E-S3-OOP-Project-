
import java.io.FileWriter;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class ExclusiveItems extends JFrame implements ActionListener{
	
	
	//left window
	
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
	JPanel panel1;
	JLabel image2;
	
	//main
	
	JLabel excl;
	JButton iphone;
	JButton oneplus;
	
	
	ExclusiveItems(){
		super();
	}
	ExclusiveItems(String s){
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
		bb1.addActionListener(this);
		bb2.addActionListener(this);
		bb3.addActionListener(this);
		bb4.addActionListener(this);
		bb5.addActionListener(this);
		bb6.addActionListener(this);
		bb7.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//main
		excl =new JLabel("Our Exclusive Items's space");
		iphone = new JButton();
		oneplus = new JButton();
		iphone.addActionListener(this);
		oneplus.addActionListener(this);
		
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
		
		
		//main
		
		excl.setBounds(20,0,580,80);
		excl.setBackground(Color.DARK_GRAY);
		excl.setForeground(Color.DARK_GRAY);
		excl.setFont(new Font("Ariel",Font.ITALIC,30));
		excl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		panel2.add(excl);
		
		ImageIcon ip=new ImageIcon("/home/gautham/Desktop/OopMaster/eleven.jpg");
		iphone.setBounds(0,70,600,260);
		iphone.setIcon(ip);
		panel2.add(iphone);
		
		ImageIcon one=new ImageIcon("/home/gautham/Desktop/OopMaster/7t.jpg");
		oneplus.setBounds(0,330,600,260);
		oneplus.setIcon(one);
		panel2.add(oneplus);
		
		
		add(panel2);
		add(panel3);
		setSize(600,610);
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
		else if(p.getSource()==iphone) {
			new iphone();
		}
		else if(p.getSource()==oneplus) {
			new oneplus();
		}
	
}
}

