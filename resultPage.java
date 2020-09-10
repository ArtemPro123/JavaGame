import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class resultPage extends JFrame {

	private JPanel contentPane;
	dbconnection db=new dbconnection();


	/**
	 * Create the frame.
	 */
	public resultPage() {
		setResizable(false);
		setTitle("SeriousStats");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResult = new JLabel("Result", SwingConstants.CENTER);
		lblResult.setOpaque(true);
		lblResult.setForeground(Color.WHITE);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblResult.setBackground(Color.DARK_GRAY);
		lblResult.setBounds(248, 47, 175, 48);
		contentPane.add(lblResult);
		
		JButton btnPlayAgain = new JButton("Main Menu");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new games().setVisible(true);
				resultPage.this.dispose();
			}
		});
		btnPlayAgain.setForeground(Color.WHITE);
		btnPlayAgain.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlayAgain.setBackground(new Color(0, 128, 0));
		btnPlayAgain.setBounds(248, 336, 175, 32);
		contentPane.add(btnPlayAgain);
		
		JLabel lblNewLabel = new JLabel("Your Score:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(248, 152, 91, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblRightAnsers = new JLabel("Right Answers:");
		lblRightAnsers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRightAnsers.setBounds(248, 189, 105, 14);
		contentPane.add(lblRightAnsers);
		
		JLabel lblWrongAnswers = new JLabel("Wrong Answers:");
		lblWrongAnswers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWrongAnswers.setBounds(248, 230, 119, 14);
		contentPane.add(lblWrongAnswers);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setText(String.valueOf(games.Gamepoints));
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(377, 152, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("0");
		label.setText(String.valueOf(games.rightAns));
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(377, 189, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("0");
		label_1.setText(String.valueOf(games.wrongAns));
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(377, 230, 46, 14);
		contentPane.add(label_1);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
				resultPage.this.dispose();
				
			}
		});
		btnQuit.setForeground(Color.DARK_GRAY);
		btnQuit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnQuit.setBounds(248, 379, 175, 32);
		contentPane.add(btnQuit);
		this.setLocationRelativeTo(null);
		db.InsertResult(Login.userid, String.valueOf(games.rightAns), String.valueOf(games.wrongAns),games.gameName,Login.name,String.valueOf(games.Gamepoints));
		int updatedpoints=games.Gamepoints+Integer.valueOf(Login.points);
		db.updatePoints(String.valueOf(updatedpoints), Login.userid);
	}

}
