import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Secondpage extends JFrame implements ActionListener {
	
	JPanel panel2;
	JButton bb1;
	ImageIcon i2;
	JButton bb3;
	JButton bb4;
	JButton bb5;
	JButton bb6;
	JButton bb2;
	ImageIcon i3;
	JPanel panel3;
	
	Secondpage(){
		super();
	}
	
	Secondpage(String s){
		
		super(s);
		panel2=new JPanel();
		bb1=new JButton();
		i2=new ImageIcon("/home/gautham/Desktop/Prjktsrc/more.jpg");
		bb3=new JButton("Edit Profile");
		bb4=new JButton("View Cart");
		bb5 = new JButton("Exclusive items");
		bb6 = new JButton("Log Out");
		bb2=new JButton();
		i3=new ImageIcon("/home/gautham/Desktop/Prjktsrc/close.png");
		panel3=new JPanel();
		bb1.addActionListener(this);
		bb2.addActionListener(this);
		bb3.addActionListener(this);
		bb4.addActionListener(this);
		bb5.addActionListener(this);
		bb6.addActionListener(this);
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
	bb2.setBackground(Color.DARK_GRAY);
	bb2.setBounds(160,0,40,40);
	bb2.setIcon(i3);
	panel2.setBounds(0,0,800,800);
	panel3.setBounds(0,0,200,800);
	panel3.setBackground(Color.LIGHT_GRAY);
	panel3.add(bb2);
	panel3.add(bb3);
	panel3.add(bb4);
	panel3.add(bb5);
	panel3.add(bb6);
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
		}
		else if(p.getSource()==bb2) {
			bb1.setVisible(true);
			panel2.setVisible(true);
			panel3.setVisible(false);
		}
		else if(p.getSource()==bb3) {
			setVisible(false);
			editprof t =new editprof("EditProfile");
		}
	}
	
	
	}
	
