import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class characters extends JFrame {

	private JPanel contentPane;
	JLabel label_12 = new JLabel("0");


	/**
	 * Create the frame.
	 */
	public characters() {
		setTitle("SeriousStats - Characters");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new games().setVisible(true);
				characters.this.dispose();
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(301, 401, 116, 23);
		contentPane.add(button);
		
		JLabel lblUnlockCharacters = new JLabel("Game Shop");
		lblUnlockCharacters.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnlockCharacters.setForeground(new Color(0, 0, 153));
		lblUnlockCharacters.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUnlockCharacters.setBounds(262, 0, 173, 53);
		contentPane.add(lblUnlockCharacters);
		
		JLabel lblNewLabel = new JLabel("Level 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(80, 382, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblLevel = new JLabel("Level 2");
		lblLevel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLevel.setBounds(80, 335, 68, 14);
		contentPane.add(lblLevel);
		
		JLabel lblLevel_1 = new JLabel("Level 3");
		lblLevel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLevel_1.setBounds(80, 295, 68, 14);
		contentPane.add(lblLevel_1);
		
		JLabel lblLevel_2 = new JLabel("Level 4");
		lblLevel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLevel_2.setBounds(80, 250, 68, 14);
		contentPane.add(lblLevel_2);
		
		JLabel lblLevel_3 = new JLabel("Level 5");
		lblLevel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLevel_3.setBounds(80, 214, 68, 14);
		contentPane.add(lblLevel_3);
		
		JLabel lblLevel_4 = new JLabel("Level 6");
		lblLevel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLevel_4.setBounds(80, 167, 68, 14);
		contentPane.add(lblLevel_4);
		
		JLabel lblLevel_5 = new JLabel("Level 7");
		lblLevel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLevel_5.setBounds(80, 125, 68, 14);
		contentPane.add(lblLevel_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
//		lblNewLabel_1.setIcon(new ImageIcon(characters.class.getResource("/images/7.png")));
		lblNewLabel_1.setBounds(158, 113, 58, 39);
		lblNewLabel_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(characters.class.getResource("/images/7.png")).getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH)));
		
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setBounds(158, 152, 58, 39);
		label.setIcon(new ImageIcon(new javax.swing.ImageIcon(characters.class.getResource("/images/6.png")).getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(158, 200, 58, 39);
		label_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(characters.class.getResource("/images/5.png")).getImage().getScaledInstance(label_1.getWidth(), label_1.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(158, 236, 58, 39);
		label_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(characters.class.getResource("/images/4.png")).getImage().getScaledInstance(label_2.getWidth(), label_2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(158, 282, 58, 39);
		label_3.setIcon(new ImageIcon(new javax.swing.ImageIcon(characters.class.getResource("/images/3.png")).getImage().getScaledInstance(label_3.getWidth(), label_3.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(158, 322, 58, 39);
		label_4.setIcon(new ImageIcon(new javax.swing.ImageIcon(characters.class.getResource("/images/2.png")).getImage().getScaledInstance(label_4.getWidth(), label_4.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(158, 372, 58, 39);
		label_5.setIcon(new ImageIcon(new javax.swing.ImageIcon(characters.class.getResource("/images/1.png")).getImage().getScaledInstance(label_5.getWidth(), label_5.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(label_5);
		
		JLabel lblNewLabel_2 = new JLabel("10000");
		lblNewLabel_2.setBounds(350, 127, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPoints = new JLabel("Cost");
		lblPoints.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPoints.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints.setBounds(350, 101, 32, 14);
		contentPane.add(lblPoints);
		
		JLabel label_6 = new JLabel("9000");
		label_6.setBounds(350, 169, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("8000");
		label_7.setBounds(350, 216, 46, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("5000");
		label_8.setBounds(350, 252, 46, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("4000");
		label_9.setBounds(350, 297, 46, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("1000");
		label_10.setBounds(350, 337, 46, 14);
		contentPane.add(label_10);
		
		JButton btnNewButton = new JButton("BUY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.valueOf(Login.points)>=10000) {
					Login.points=String.valueOf(Integer.valueOf(Login.points)-10000);
					Login.charid="7";
					Login.db.updatePoints(Login.points, Login.userid);
					Login.db.updateChar(Login.charid, Login.userid);
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/tick.png"));		        	
			        JOptionPane.showMessageDialog(null,"Purchase Success!","Success", JOptionPane.PLAIN_MESSAGE,icon);
			        label_12.setText(Login.points);
			        
					
				}else {
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/cross.png"));		        	
			        JOptionPane.showMessageDialog(null,"Not Enough Points, Go play and Earn More!","Failure", JOptionPane.PLAIN_MESSAGE,icon);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(518, 123, 68, 23);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("BUY");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.valueOf(Login.points)>=9000) {
					Login.points=String.valueOf(Integer.valueOf(Login.points)-9000);
					Login.charid="6";
					Login.db.updatePoints(Login.points, Login.userid);
					Login.db.updateChar(Login.charid, Login.userid);
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/tick.png"));		        	
			        JOptionPane.showMessageDialog(null,"Purchase Success!","Success", JOptionPane.PLAIN_MESSAGE,icon);
			        label_12.setText(Login.points);
			        
					
				}else {
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/cross.png"));		        	
			        JOptionPane.showMessageDialog(null,"Not Enough Points, Go play and Earn More!","Failure", JOptionPane.PLAIN_MESSAGE,icon);
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(518, 165, 68, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("BUY");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.valueOf(Login.points)>=8000) {
					Login.points=String.valueOf(Integer.valueOf(Login.points)-8000);
					Login.charid="5";
					Login.db.updatePoints(Login.points, Login.userid);
					Login.db.updateChar(Login.charid, Login.userid);
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/tick.png"));		        	
			        JOptionPane.showMessageDialog(null,"Purchase Success!","Success", JOptionPane.PLAIN_MESSAGE,icon);
			        label_12.setText(Login.points);
			        
					
				}else {
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/cross.png"));		        	
			        JOptionPane.showMessageDialog(null,"Not Enough Points, Go play and Earn More!","Failure", JOptionPane.PLAIN_MESSAGE,icon);
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBounds(518, 212, 68, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("BUY");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.valueOf(Login.points)>=5000) {
					Login.points=String.valueOf(Integer.valueOf(Login.points)-5000);
					Login.charid="4";
					Login.db.updatePoints(Login.points, Login.userid);
					Login.db.updateChar(Login.charid, Login.userid);
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/tick.png"));		        	
			        JOptionPane.showMessageDialog(null,"Purchase Success!","Success", JOptionPane.PLAIN_MESSAGE,icon);
			        label_12.setText(Login.points);
			        
					
				}else {
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/cross.png"));		        	
			        JOptionPane.showMessageDialog(null,"Not Enough Points, Go play and Earn More!","Failure", JOptionPane.PLAIN_MESSAGE,icon);
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBounds(518, 248, 68, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("BUY");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.valueOf(Login.points)>=4000) {
					Login.points=String.valueOf(Integer.valueOf(Login.points)-4000);
					Login.charid="3";
					Login.db.updatePoints(Login.points, Login.userid);
					Login.db.updateChar(Login.charid, Login.userid);
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/tick.png"));		        	
			        JOptionPane.showMessageDialog(null,"Purchase Success!","Success", JOptionPane.PLAIN_MESSAGE,icon);
			        label_12.setText(Login.points);
			        
					
				}else {
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/cross.png"));		        	
			        JOptionPane.showMessageDialog(null,"Not Enough Points, Go play and Earn More!","Failure", JOptionPane.PLAIN_MESSAGE,icon);
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBounds(518, 293, 68, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("BUY");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.valueOf(Login.points)>=1000) {
					Login.points=String.valueOf(Integer.valueOf(Login.points)-1000);
					Login.charid="2";
					Login.db.updatePoints(Login.points, Login.userid);
					Login.db.updateChar(Login.charid, Login.userid);
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/tick.png"));		        	
			        JOptionPane.showMessageDialog(null,"Purchase Success!","Success", JOptionPane.PLAIN_MESSAGE,icon);
			        label_12.setText(Login.points);
			        
					
				}else {
					ImageIcon icon = new ImageIcon(characters.class.getResource("/images/cross.png"));		        	
			        JOptionPane.showMessageDialog(null,"Not Enough Points, Go play and Earn More!","Failure", JOptionPane.PLAIN_MESSAGE,icon);
				}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.setBounds(518, 333, 68, 23);
		contentPane.add(button_5);
		
		JLabel label_11 = new JLabel("Points");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setBounds(291, 64, 50, 14);
		contentPane.add(label_11);
		
		
		label_12.setText(Login.points);
		label_12.setForeground(new Color(0, 102, 204));
		label_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_12.setBounds(340, 51, 93, 39);
		contentPane.add(label_12);
		this.setLocationRelativeTo(null);
	}

}
