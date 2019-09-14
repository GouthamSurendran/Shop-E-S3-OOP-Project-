package logins;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Homepage extends JFrame implements ActionListener{

	JButton b;
	JPanel panel;
	ImageIcon ii;
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
		ii=new ImageIcon("/home/sourag/Desktop/select.jpg");
		lb1=new JLabel();
		lb2=new JLabel("Username");
		lb3=new JLabel("Password");
		lb4=new JLabel("Phone Number");
		lb5=new JLabel("Create an account here :");
		tf2=new JTextField();
		tf1=new JTextField();
		pf1=new JPasswordField();
		b1=new JButton("Submit");
		b2=new JButton("Cancel");
		b3=new JButton("Sign Up");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		addAll();
	}
	
	
	public void addAll() {
		
		setUndecorated(true);
		lb1.setIcon(ii);
		lb1.setBounds(0,0,500,500);
		lb2.setBounds(50,100,150,20);
		lb2.setForeground(Color.BLACK);
		lb2.setFont(new Font("Kalimati",Font.ITALIC,22));
		tf1.setBounds(300,100,150,30);
		tf1.setBackground(Color.GRAY);
		tf1.setForeground(Color.WHITE);
		lb3.setBounds(50,200,150,20);
		lb3.setFont(new Font("Kalimati",Font.ITALIC,22));
		lb3.setForeground(Color.BLACK);
		lb4.setBounds(50,300,200,20);
		lb4.setFont(new Font("Kalimati",Font.ITALIC,22));
		lb4.setForeground(Color.BLACK);
		lb5.setBounds(100,450,200,20);
		lb5.setFont(new Font("Ariel",Font.ITALIC,12));
		lb5.setForeground(Color.BLACK);
		pf1.setBackground(Color.GRAY);
		pf1.setForeground(Color.WHITE);
		pf1.setBounds(300,200,150,30);
		tf2.setBounds(300,300,150,30);
		tf2.setBackground(Color.GRAY);
		tf2.setForeground(Color.WHITE);
		b1.setFont(new Font("Kalimati",Font.ITALIC,21));
		b2.setFont(new Font("Kalimati",Font.ITALIC,21));
		b1.setForeground(Color.GREEN);
		b2.setForeground(Color.RED);
		b1.setBounds(50,400,150,30);
		b2.setBounds(300,400,150,30);
		b3.setBounds(275,450,150,20);
		b3.setFont(new Font("Ariel",Font.BOLD,12));
		b3.setForeground(Color.RED);
		b3.setBackground(new Color(0,0,0,64));
		b3.setLayout(null);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(pf1);
		panel.add(lb3);
		panel.add(tf1);
		panel.add(lb1);
		add(lb2);
		add(lb4);
		add(tf2);
		add(lb5);
		add(b3);
		panel.setLayout(null);
		panel.setSize(500,500);

		add(panel);
		
		setSize(500,500);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			setVisible(false);
			String s1=tf1.getText();
			String s2=pf1.getText();
			if(s1.equals(s2)) {
				Secondpage t= new Secondpage("Shop-E");
				}
			else{
				JOptionPane.showMessageDialog(null, "Username or password incorrect");
				System.exit(0);
			}
		}
		else if(e.getSource()==b2)System.exit(0);
		else {
			this.dispose();
			CreateAccount n=new CreateAccount("Create Account");
		}
	}
	
	
	
	
	
}
