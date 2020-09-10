import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	JLabel alertLabel;
	dbconnection db=new dbconnection();

	/**
	 * Create the frame.
	 */
	public signup() {
		setResizable(false);
		setTitle("SeriousStats - SignUp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignUp = new JLabel("SIGN UP");
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setForeground(Color.DARK_GRAY);
		lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSignUp.setBounds(270, 29, 158, 75);
		contentPane.add(lblSignUp);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(signup.class.getResource("/images/signup.png")));
		label.setBounds(463, 11, 200, 193);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(285, 221, 158, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(285, 252, 158, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(285, 283, 158, 20);
		contentPane.add(textField_2);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(200, 222, 75, 14);
		contentPane.add(lblName);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserName.setBounds(200, 253, 87, 20);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(200, 285, 75, 14);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Sign Up");

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(285, 394, 158, 31);
		contentPane.add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
                signup.this.dispose();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(285, 356, 158, 31);
		contentPane.add(btnLogin);
		
		JLabel nameAlert = new JLabel("");
		nameAlert.setForeground(Color.RED);
		nameAlert.setBounds(149, 132, 186, 14);
		contentPane.add(nameAlert);
		
		alertLabel = new JLabel("");
		alertLabel.setForeground(Color.RED);
		alertLabel.setBounds(149, 241, 146, 14);
		contentPane.add(alertLabel);
		
		JLabel userAlert = new JLabel("");
		userAlert.setForeground(Color.RED);
		userAlert.setBounds(149, 183, 186, 14);
		contentPane.add(userAlert);
		this.setLocationRelativeTo(null);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=textField.getText();
				String UserName=textField_1.getText();
				String password=textField_2.getText();
				if(Name.equals("") || UserName.equals("") || password.equals("")) {
					alertLabel.setText("All fields are required*");
					return;
				}
				alertLabel.setText("");
				if(Name.matches(".*\\s+.*")) {
					nameAlert.setText("No space in Name please*");
					return;
				}
				nameAlert.setText("");
				if(UserName.matches(".*\\s+.*")) {
					userAlert.setText("No space in User Name please*");
					return;
				}
				userAlert.setText("");
				String data=Name+" "+UserName+" "+password+" "+"0"+" "+"1";
				boolean signUpcheck=db.signUp(Name, UserName, password);
				if(signUpcheck) {
				
			        ImageIcon icon = new ImageIcon(signup.class.getResource("/images/tick.png"));		        	
			        JOptionPane.showMessageDialog(null,"User Created","Success", JOptionPane.PLAIN_MESSAGE,icon);
			        new Login().setVisible(true);
			        signup.this.dispose();
				}else {
					ImageIcon icon = new ImageIcon(signup.class.getResource("/images/cross.png"));		        	
			        JOptionPane.showMessageDialog(null,"Error! Try Later.","Failure", JOptionPane.PLAIN_MESSAGE,icon);
					
				}
			    
			}	
		});
	}

}
