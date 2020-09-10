
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	public boolean Logincheck=false;
	public static String name="";
	public static String points="";
	public static String charid="";
	public static String userid="";
	public static String Tname="";
	
	public static dbconnection db=new dbconnection();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setTitle("SeriousStats - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(294, 263, 109, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(294, 361, 109, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(279, 11, 124, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUserName.setBounds(294, 246, 73, 14);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(294, 289, 73, 14);
		contentPane.add(lblPassword);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new signup().setVisible(true);
                Login.this.dispose();
			}
		});
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSignup.setBounds(294, 392, 109, 31);
		contentPane.add(btnSignup);
		
		JRadioButton rdbtnTeacherLogin = new JRadioButton("Teacher Login");
		rdbtnTeacherLogin.setBounds(294, 331, 109, 23);
		contentPane.add(rdbtnTeacherLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(294, 304, 109, 20);
		contentPane.add(passwordField);
		
		JLabel fieldsalert = new JLabel("");
		fieldsalert.setForeground(Color.RED);
		fieldsalert.setBounds(20, 200, 145, 14);
		contentPane.add(fieldsalert);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/mainLogin.jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(0, 0, 673, 447);
		contentPane.add(lblNewLabel);
		
		this.setLocationRelativeTo(null);
		
		/**
		 * functionality
		 */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnTeacherLogin.isSelected()) {
					String username=textField.getText();
					String password=passwordField.getText();
					if(username.equals("") || password.equals("")) {
						fieldsalert.setText("Both Username and Password are Required!");
						return;
					}
					fieldsalert.setText("");
					Logincheck=db.TeacherLogin(username, password);
	//				System.out.println(Logincheck);
					if(Logincheck) {
						new TeacherPanel().setVisible(Logincheck);
						Login.this.dispose();
					}else {
						ImageIcon icon = new ImageIcon(signup.class.getResource("/images/cross.png"));		        	
				        JOptionPane.showMessageDialog(null,"Wrong login Details!","Failure", JOptionPane.PLAIN_MESSAGE,icon);
					}
				}else {
					String username=textField.getText();
					String password=passwordField.getText();
					if(username.equals("") || password.equals("")) {
						fieldsalert.setText("Both Username and Password are Required!");
						return;
					}
					fieldsalert.setText("");
					Logincheck=db.Login(username, password);
	//				System.out.println(Logincheck);
					if(Logincheck) {
						new games().setVisible(Logincheck);
						Login.this.dispose();
					}else {
						ImageIcon icon = new ImageIcon(signup.class.getResource("/images/cross.png"));		        	
				        JOptionPane.showMessageDialog(null,"Wrong login Details!","Failure", JOptionPane.PLAIN_MESSAGE,icon);
					}
				}
				
			}
		});
	}

}
