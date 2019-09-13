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
		bb3=new JButton("Phones");
		bb4=new JButton("Home Appliances");
		bb2=new JButton();
		i3=new ImageIcon("/home/gautham/Desktop/Prjktsrc/close.png");
		panel3=new JPanel();
		bb1.addActionListener(this);
		bb2.addActionListener(this);
		addAll();
	}	
	
	
public void	addAll(){
		
	panel2.setLayout(null);
	bb1.setIcon(i2);
	setFont(new Font("Arial",Font.ITALIC,18));
	bb1.setBounds(0,0,20,40);
	panel2.add(bb1);
	panel2.setVisible(true);
	bb3.setBounds(0,40,200,40);
	bb4.setBounds(0,80,200,40);
	bb2.setIcon(i3);
	bb2.setBackground(Color.BLACK);
	bb2.setBounds(160,0,40,40);
	panel2.setBounds(0,0,800,800);
	add(panel2);
	add(panel3);
	panel3.setBounds(0,0,200,800);
	panel3.add(bb2);
	panel3.add(bb3);
	panel3.add(bb4);
	setVisible(true);
	panel3.setBackground(Color.LIGHT_GRAY);
	
	panel3.setLayout(null);
	panel3.setVisible(false);
	panel2.add(panel3);
	
	setSize(800,800);
	setLayout(null);
	setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent p) {
		
		if(p.getSource()==bb1) {
			bb1.setVisible(false);
			panel3.setVisible(true);
		}
		else if(p.getSource()==bb2) {
			bb1.setVisible(true);
			panel3.setVisible(false);
		}
	}
	
	
	}
	
