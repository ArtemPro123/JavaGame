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

public class median extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public median() {
		setTitle("SeriousStats");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMean = new JLabel("MEDIAN");
		lblMean.setHorizontalAlignment(SwingConstants.CENTER);
		lblMean.setForeground(new Color(0, 128, 0));
		lblMean.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblMean.setBounds(283, 21, 116, 41);
		contentPane.add(lblMean);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new medianPlay().setVisible(true);
				median.this.dispose();
			}
		});
		btnStart.setForeground(Color.WHITE);
		btnStart.setBackground(new Color(0, 128, 0));
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnStart.setBounds(283, 360, 116, 25);
		contentPane.add(btnStart);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new games().setVisible(true);
				median.this.dispose();
			}
		});
		button.setForeground(new Color(51, 51, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(283, 396, 116, 25);
		contentPane.add(button);
		
		JTextArea txtrTheMeanIs = new JTextArea();
		txtrTheMeanIs.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrTheMeanIs.setForeground(new Color(255, 255, 255));
		txtrTheMeanIs.setBackground(Color.DARK_GRAY);
		txtrTheMeanIs.setText("The median is the middle value.\r\n\r\nTo find the median, order the numbers from higherst to lowest and see which one\r\nis in the middle of the list.\r\nFor example: 3, 3, 6, 13, 100 gives the middle number of 6\r\nSo, that means the median is 6.\r\n\r\nRemeber you only have 1 minute, on each right answer you will get 100 points!\r\nyour time will start when you press the start button.");
		txtrTheMeanIs.setBounds(10, 73, 653, 265);
		contentPane.add(txtrTheMeanIs);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 673, 447);
		contentPane.add(label);
		this.setLocationRelativeTo(null);
	}
}
