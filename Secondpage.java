
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Secondpage extends JFrame implements ActionListener {
	
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
	JPanel panel1;
	JLabel image2;
	
	
	
	
	//main
	
	
	JLabel welcome;
	JButton smart;
	JButton appliances;
	JButton bb0;
	
	JLabel phone;JLabel App;JLabel Acc;
	
	Secondpage(){
		super();
	}
	
	Secondpage(String s){
		
		super(s);
		panel2=new JPanel();
		bb1=new JButton();
		panel1=new JPanel();
		image2=new JLabel();
		i2=new ImageIcon("/home/gautham/Desktop/OopMaster/img.png");
		bb3=new JButton("Edit Profile");
		bb4=new JButton("View Cart");
		bb5 = new JButton("Exclusive items");
		bb6 = new JButton("Log Out");
		bb7 = new JButton("Home");
		bb2=new JButton();
		
		phone = new JLabel("SmartPhones");
		App = new JLabel("Home appliances");
		Acc = new JLabel("Headphones");
		
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
		
		welcome =new JLabel("What are you looking for today?");
		smart=new JButton();
		appliances = new JButton();
		bb0 = new JButton();
		
		addAll();
	}	
	
	
private void addAll(){
		
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
	
	phone.setBounds(30,100,100,50);
	phone.setFont(new Font("Kalimati",Font.ITALIC,16));
	
	App.setBounds(30,300,150,50);
	App.setFont(new Font("Kalimati",Font.ITALIC,16));
	
	Acc.setBounds(30,500,150,50);
	Acc.setFont(new Font("Kalimati",Font.ITALIC,16));
	
	panel1.setVisible(false);
	panel2.setBounds(0,0,800,800);
	panel3.setBounds(0,0,200,800);
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
	
	welcome.setBounds(20,15,580,40);
	welcome.setBackground(Color.DARK_GRAY);
	welcome.setForeground(Color.DARK_GRAY);
	welcome.setFont(new Font("Comic sans",Font.BOLD,24));
	welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	panel2.add(welcome);
	
	
	ImageIcon smr=new ImageIcon("/home/gautham/Desktop/OopMaster/smart.png");
	smart.setBounds(200,80,400,165);
	smart.setIcon(smr);
	panel2.add(smart);
	
	ImageIcon apl=new ImageIcon("/home/gautham/Desktop/OopMaster/appliances.jpg");
	appliances.setBounds(200,245,400,165);
	appliances.setIcon(apl);
	panel2.add(appliances);
	
	ImageIcon clo=new ImageIcon("/home/gautham/Desktop/OopMaster/acc.jpg");
	bb0.setBounds(200,410,400,165);
	bb0.setIcon(clo);
	panel2.add(bb0);
	
	add(phone);add(App);add(Acc);
	add(panel2);
	add(panel3);
	setSize(600,600);
	setLayout(null);
	setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent p) {
		
		if(p.getSource()==bb1) {
			phone.setVisible(false);
			App.setVisible(false);
			Acc.setVisible(false);
			bb1.setVisible(false);
			panel3.setVisible(true);
			panel2.setVisible(false);
			panel1.setVisible(true);
		}
		else if(p.getSource()==bb2) {
			bb1.setVisible(true);
			phone.setVisible(true);
			App.setVisible(true);
			Acc.setVisible(true);
			panel2.setVisible(true);
			panel3.setVisible(false);
			panel1.setVisible(false);
		}
		else if(p.getSource()==bb3) {
			setVisible(false);
			dispose();
			new editprof("EditProfile");
		}
		else if(p.getSource()==bb4) {
			setVisible(false);
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
			}
			
		}
		else if(p.getSource()==bb7) {
			this.dispose();
			new Secondpage("Shop-E");
		}
	}
	
	
	}
	
