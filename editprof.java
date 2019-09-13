import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class editprof extends JFrame{

	JLabel jb1;JLabel jb2;JLabel jb3;JLabel jb4;
	JTextField tf1;JPasswordField tf4;JTextField tf3;JTextField tf2;
	JButton Jb;
	
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
		
		Jb = new JButton("Save Changes");
		addAll();
		
	}
	
	private void addAll() {
		
		jb1.setBounds(60,80,200,40);
		add(jb1);
		jb1.setFont(new Font("Kalimati",Font.PLAIN,18));
		jb2.setBounds(60,160,200,40);
		jb2.setFont(new Font("Kalimati",Font.PLAIN,18));
		add(jb2);
		jb3.setBounds(60,240,200,40);
		jb3.setFont(new Font("Kalimati",Font.PLAIN,18));
		add(jb3);
		jb4.setBounds(60,320,200,40);
		jb4.setFont(new Font("Kalimati",Font.PLAIN,18));
		add(jb4);
		
		tf1.setBounds(280,80,180,35);
		tf1.setBackground(Color.LIGHT_GRAY);
		add(tf1);
		tf2.setBounds(280,160,180,35);
		tf2.setBackground(Color.lightGray);
		add(tf2);
		tf3.setBounds(280,240,180,35);
		tf3.setBackground(Color.lightGray);
		add(tf3);
		tf4.setBounds(280,320,180,35);
		tf4.setBackground(Color.lightGray);
		add(tf4);
		
		Jb.setBounds(280,420,180,40);
		add(Jb);
		Jb.setBackground(Color.lightGray);
		Jb.setFont(new Font("Kalimati",Font.BOLD,18));
		
		
		setSize(600,600);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
}
