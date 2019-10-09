import java.io.FileWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.text.ParseException;
import java.awt.event.*;
public class order extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextArea ta;
	JPanel panel1;
	JButton b1;

	order(){
		super("Place Order");
		l1=new JLabel();
		l2=new JLabel("Enter the address");
		l3=new JLabel("We only accept COD");
		ta=new JTextArea();
		panel1=new JPanel();
		b1=new JButton("Place Order");
		b1.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addAll();
	}
	
	public void addAll() {
		ImageIcon ii=new ImageIcon("/home/gautham/Desktop/OopMaster/select.png");
		l1.setBounds(0,0,600,500);
		l1.setIcon(ii);
		l2.setBounds(50,100,200,20);
		l2.setFont(new Font("Kalimati",Font.ITALIC,20));
		l2.setForeground(Color.WHITE);
		l3.setBounds(50,250,200,20);
		l3.setFont(new Font("Kalimati",Font.ITALIC,16));
		l3.setForeground(Color.WHITE);
		ta.setBounds(300,100,250,250);
		b1.setBounds(50,300,150,30);
		b1.setFont(new Font("Kalimati",Font.ITALIC,21));
		b1.setForeground(Color.GREEN);
		b1.setBackground(new Color(0,0,0,20));
		panel1.add(l2);
		panel1.add(l3);
		panel1.add(ta);
		panel1.add(b1);
		panel1.add(l1);
		panel1.setLayout(null);
		panel1.setSize(600,500);
		panel1.setVisible(true);
		add(panel1);
		setSize(600,500);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DAY_OF_MONTH, 7);  
			String newDate = sdf.format(c.getTime()); 
			JOptionPane.showMessageDialog(null, "Thanks for shopping with us...\n Your items will be delivered within "+newDate);
			try {
				FileWriter file=new FileWriter("/home/gautham/Desktop/OopMaster/products.txt");
				file.write("");
				file.close();
			}
			catch(Exception f) {
				JOptionPane.showMessageDialog(null, f);
			}
			this.dispose();
			new Secondpage("Shop-E");
		}
	}
}
