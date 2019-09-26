
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class editprof extends JFrame implements ActionListener{

	JLabel jb1;JLabel jb2;JLabel jb3;JLabel jb4;
	JTextField tf1;JPasswordField tf4;JTextField tf3;JTextField tf2;
	JButton Jb;
	
	//Leftwindow code.
	
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
	
	editprof(){
		super();
	}
	
	editprof(String S){
		super(S);
		
		jb1 = new JLabel("Change Username");
		jb2 = new JLabel("Change E-mail");
		jb3 = new JLabel("Change Number");
		jb4 = new JLabel("Change Password");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JPasswordField();
		Jb  = new JButton("Save Changes");
		image  = new JLabel();
		image2 = new JLabel();
		
		//leftwindow code
		
		panel2=new JPanel();
		panel1=new JPanel();
		bb1=new JButton();
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
		addAll();
		
	}
	
	private void addAll() {
		
		jb1.setBounds(60,80,200,40);
		panel2.add(jb1);
		jb1.setFont(new Font("Kalimati",Font.ITALIC,18));
		jb1.setForeground(Color.WHITE);
		jb2.setBounds(60,160,200,40);
		jb2.setFont(new Font("Kalimati",Font.ITALIC,18));
		jb2.setForeground(Color.WHITE);
		panel2.add(jb2);
		jb3.setBounds(60,240,200,40);
		jb3.setFont(new Font("Kalimati",Font.ITALIC,18));
		jb3.setForeground(Color.WHITE);
		panel2.add(jb3);
		jb4.setBounds(60,320,200,40);
		jb4.setFont(new Font("Kalimati",Font.ITALIC,18));
		jb4.setForeground(Color.WHITE);
		panel2.add(jb4);
		
		tf1.setBounds(280,80,180,35);
		tf1.setBackground(new Color(0,0,0,15));
		panel2.add(tf1);
		tf2.setBounds(280,160,180,35);
		tf2.setBackground(new Color(0,0,0,15));
		panel2.add(tf2);
		tf3.setBounds(280,240,180,35);
		tf3.setBackground(new Color(0,0,0,15));
		panel2.add(tf3);
		tf4.setBounds(280,320,180,35);
		tf4.setBackground(new Color(0,0,0,15));
		panel2.add(tf4);
		
		Jb.setBounds(280,420,180,40);
		panel2.add(Jb);
		Jb.setBackground(new Color(0,0,0,15));
		Jb.setForeground(Color.WHITE);
		Jb.setFont(new Font("Kalimati",Font.PLAIN,18));
		ImageIcon n=new ImageIcon("/home/gautham/Desktop/OopMaster/select.png");
		ImageIcon nn=new ImageIcon("/home/gautham/Desktop/OopMaster/select.png");
		image.setIcon(n);
		image.setBounds(0,0,600,600);
		panel2.add(image);
		image2.setIcon(nn);
		image2.setBounds(200,0,400,800);
		panel1.setBounds(200,-5,400,800);
		panel1.add(image2);
		add(panel1);
		panel1.setVisible(false);
		
		//leftwindow
		
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
				editprof n=new editprof("Edit Profile");
			}
			else if(p.getSource()==bb4) {
				dispose();
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
				}}
			else if(p.getSource()==bb7) {
				dispose();
				Secondpage smthn = new Secondpage("Welcome to Shop-E");
			}
		
		}
}
