
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	JButton acc;
	
	Secondpage(){
		super();
	}
	
	Secondpage(String s){
		
		super(s);
		panel2=new JPanel();
		bb1=new JButton();
		panel1=new JPanel();
		image2=new JLabel();
		i2=new ImageIcon("/home/gautham/Desktop/OopMaster/dots2.png");
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
		
		welcome =new JLabel("What are you looking for today?");
		smart=new JButton();
		appliances = new JButton();
		acc = new JButton();
		
		addAll();
	}	
	
	
private void addAll(){
		
	panel2.setLayout(null);
	bb1.setIcon(i2);
	setFont(new Font("Arial",Font.ITALIC,18));
	bb1.setBounds(0,0,20,40);
	bb1.setBackground(Color.DARK_GRAY);
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
	ImageIcon nn=new ImageIcon("/home/gautham/Desktop/OopMaster/editprof2.png");
	image2.setIcon(nn);
	image2.setBounds(200,0,400,800);
	panel1.setBounds(200,0,400,800);
	panel1.add(image2);
	add(panel1);
	panel1.setVisible(false);
	panel2.setBounds(0,0,800,800);
	panel3.setBounds(0,0,200,800);
	panel3.setBackground(Color.LIGHT_GRAY);
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
	smart.setBounds(0,80,600,165);
	smart.setIcon(smr);
	panel2.add(smart);
	
	ImageIcon apl=new ImageIcon("/home/gautham/Desktop/OopMaster/appliances.jpg");
	appliances.setBounds(0,245,600,165);
	appliances.setIcon(apl);
	panel2.add(appliances);
	
	ImageIcon clo=new ImageIcon("/home/gautham/Desktop/OopMaster/acc.jpg");
	acc.setBounds(0,410,600,165);
	acc.setIcon(clo);
	panel2.add(acc);
	
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
			setVisible(false);
			dispose();
			editprof t =new editprof("EditProfile");
		}
		else if(p.getSource()==bb4) {
			setVisible(false);
			ViewCart s =new ViewCart("ViewCart");
		}
		else if(p.getSource()==bb5) {
			this.dispose();
			ExclusiveItems excl=new ExclusiveItems("Exclusive Items");
		}
		else if(p.getSource()==bb6) {
			
			int option = 	JOptionPane.showConfirmDialog(bb6, "Are you sure you want to Log Out?");
			if(option == JOptionPane.YES_OPTION) {
			this.dispose();
			Homepage n=new Homepage();
			}
			
		}
		else if(p.getSource()==bb7) {
			this.dispose();
			Secondpage n=new Secondpage("Shop-E");
		}
	}
	
	
	}
	
