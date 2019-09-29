import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class adminLogin extends JFrame {

	JLabel admin;
	JButton update;         //Increases the number of already updated product stocks.
	JButton inventory;      // should have a method addproduct that adds certain products to the db.
	JButton viewcustomer;   // should show some customer info and also contain a method that denies a specific customer to login.(blocks)
	JButton back;
	JPanel panel;
	JLabel lb1;
	JLabel cart;
	
	
	ImageIcon ii;
	ImageIcon i2;
	
	adminLogin(){
		super();
	}
	
	adminLogin(String S){
		super(S);
		
		admin = new JLabel("Admin page.");
		update = new JButton("UpdateCatalogue");
		inventory = new JButton("ViewInventory");
		viewcustomer = new JButton("CustomerInfo");
		back = new JButton("<--");
		ii=new ImageIcon("/home/gautham/Desktop/OopMaster/select.png");
		i2=new ImageIcon("/home/gautham/Desktop/OopMaster/cart.png");
		lb1 = new JLabel();
		cart = new JLabel();
		panel = new JPanel();
		
		addAll();
	}
	
	private void addAll() {
		
		panel.setLayout(null);
		//setUndecorated(true);         //The function is used to show or hide upper window.
		lb1.setIcon(ii);
		lb1.setBounds(0,0,500,500);
		admin.setBounds(180, 50, 200, 100);
		admin.setFont(new Font("Kalimati",Font.BOLD,24));
		admin.setForeground(Color.DARK_GRAY);
		admin.setForeground(Color.WHITE);
		update.setBounds(150, 150, 200, 100);
		update.setFont(new Font("Kalimati",Font.ITALIC,18));
		update.setBackground(new Color(0,0,0,15));
		update.setForeground(Color.WHITE);
		inventory.setBounds(150, 250, 200, 100);
		inventory.setFont(new Font("Kalimati",Font.ITALIC,18));
		inventory.setBackground(new Color(0,0,0,15));
		inventory.setForeground(Color.WHITE);
		viewcustomer.setBounds(150, 350, 200, 100);
		viewcustomer.setFont(new Font("Kalimati",Font.ITALIC,18));
		viewcustomer.setBackground(new Color(0,0,0,15));
		viewcustomer.setForeground(Color.WHITE);
		back.setBounds(0,420,80,50);
		back.setFont(new Font("Kalimati",Font.ITALIC,18));
		back.setBackground(Color.DARK_GRAY);
		back.setForeground(Color.WHITE);
		
		cart.setBounds(370,30,150,100);
		cart.setIcon(i2);
		cart.setBackground(new Color(0,0,0,15));
		panel.setBounds(0,0,500,500);
		panel.add(lb1);
		add(cart);
		add(admin);
		panel.add(back);
		panel.add(update);
		add(inventory);
		add(viewcustomer);
		
	
		panel.setSize(500,500);
		add(panel);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);
	}
		
		
}
	
