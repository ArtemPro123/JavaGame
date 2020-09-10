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

public class mode extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public mode() {
		setTitle("SeriousStats");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMean = new JLabel("MODE");
		lblMean.setHorizontalAlignment(SwingConstants.CENTER);
		lblMean.setBackground(Color.WHITE);
		lblMean.setForeground(new Color(72, 61, 139));
		lblMean.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblMean.setBounds(307, 21, 83, 41);
		contentPane.add(lblMean);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new modePlay().setVisible(true);
				mode.this.dispose();
			}
		});
		btnStart.setForeground(Color.WHITE);
		btnStart.setBackground(new Color(0, 128, 0));
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnStart.setBounds(298, 345, 102, 25);
		contentPane.add(btnStart);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new games().setVisible(true);
				mode.this.dispose();
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(298, 381, 102, 25);
		contentPane.add(button);
		
		JTextArea txtrTheMeanIs = new JTextArea();
		txtrTheMeanIs.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrTheMeanIs.setForeground(new Color(255, 255, 255));
		txtrTheMeanIs.setBackground(Color.DARK_GRAY);
		txtrTheMeanIs.setText("The mode is the number that appears the most.\r\n\r\nTo find the mode, order the numbers lowest to highest and \r\nsee which number appears the most often.\r\nFor example: 3, 3, 6, 13, 100 gives a mode of 3, becasue it appears the most.\r\n\r\nYou've 1 minute, on each right answer you will get 100 points!\r\nyour time will start when you press the start button.\r\n\r\nNOTE: If you don't see a repeating number just proceed to the next question ->\r\nByy entring any numeber as the answer and clicking NEXT.");
		txtrTheMeanIs.setBounds(10, 73, 653, 261);
		contentPane.add(txtrTheMeanIs);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 673, 447);
		contentPane.add(label);
		this.setLocationRelativeTo(null);
	}
}
