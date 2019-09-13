import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class homepage extends JFrame implements ActionListener{

	JButton b;
	JPanel panel;
	ImageIcon ii;
	JLabel lb1;
	JLabel lb2;
	JLabel lb3;
	JTextField tf1;
	JPasswordField pf1;
	JButton b1;
	JButton b2;
	
	
	homepage(){
		super();
	}
	
	homepage(String name){
		
		super(name);
		panel=new JPanel();
		ii=new ImageIcon("/home/gautham/Desktop/Prjktsrc/select.jpg");
		lb1=new JLabel();
		lb2=new JLabel("Username");
		lb3=new JLabel("Password");
		tf1=new JTextField();
		pf1=new JPasswordField();
		b1=new JButton("Submit");
		b2=new JButton("Cancel");
		b1.addActionListener(this);
		b2.addActionListener(this);
		addAll();
	}
	
	
	public void addAll() {
		
		setUndecorated(true);
		lb1.setIcon(ii);
		lb1.setBounds(0,0,500,500);
		lb2.setBounds(100,100,150,20);
		lb2.setForeground(Color.BLACK);
		lb2.setFont(new Font("Kalimati",Font.ITALIC,22));
		tf1.setBounds(300,100,150,30);
		tf1.setBackground(Color.GRAY);
		tf1.setForeground(Color.WHITE);
		lb3.setBounds(100,200,150,20);
		lb3.setFont(new Font("Kalimati",Font.ITALIC,22));
		lb3.setForeground(Color.BLACK);
		pf1.setBackground(Color.GRAY);
		pf1.setForeground(Color.WHITE);
		pf1.setBounds(300,200,150,30);
		b1.setFont(new Font("Kalimati",Font.ITALIC,21));
		b2.setFont(new Font("Kalimati",Font.ITALIC,21));
		b1.setForeground(Color.GREEN);
		b2.setForeground(Color.RED);
		b1.setBounds(100,300,150,30);
		b2.setBounds(300,300,150,30);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(pf1);
		panel.add(lb3);
		panel.add(tf1);
		panel.add(lb1);
		add(lb2);
		panel.setLayout(null);
		panel.setSize(500,500);

		add(panel);
		
		setSize(500,400);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			setVisible(false);
			Secondpage t = new Secondpage("Shop-E");
		}
		else System.exit(0);
	}
	
	
	
	
	
}
