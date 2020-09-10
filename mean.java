import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class mean extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public mean() {
		setTitle("SeriousStats");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMean = new JLabel("MEAN");
		lblMean.setHorizontalAlignment(SwingConstants.CENTER);
		lblMean.setForeground(Color.RED);
		lblMean.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblMean.setBounds(288, 21, 118, 41);
		contentPane.add(lblMean);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new meanPlay().setVisible(true);
				mean.this.dispose();
			}
		});
		btnStart.setForeground(Color.WHITE);
		btnStart.setBackground(new Color(0, 128, 0));
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnStart.setBounds(288, 360, 118, 25);
		contentPane.add(btnStart);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new games().setVisible(true);
				mean.this.dispose();
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(288, 396, 118, 25);
		contentPane.add(button);
		
		JTextArea txtrTheMeanIs = new JTextArea();
		txtrTheMeanIs.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrTheMeanIs.setForeground(new Color(255, 255, 255));
		txtrTheMeanIs.setBackground(Color.DARK_GRAY);
		txtrTheMeanIs.setText("The mean is the total of the numbers divided by\r\nhow many numbers there are in the sequence.\r\n\r\nTo find the mean, add all the numbers together\r\nthen divide by how many numbers you added together.\r\nFor example: 6 + 3 + 100 + 3 + 13 = 125 \u00F7 5 = 25\r\nThe mean is 25.\r\n\r\nThe mean is not always a whole number.\r\n\r\nYou have 1 minute, on each right answer you will get 100 points!\r\nyour time will start when you press the start button.");
		txtrTheMeanIs.setBounds(10, 73, 653, 276);
		contentPane.add(txtrTheMeanIs);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 673, 447);
		contentPane.add(label);
		this.setLocationRelativeTo(null);
	}
}
