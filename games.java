import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class games extends JFrame {

	private JPanel contentPane;

	public static int Gamepoints=0;
	
	public static int rightAns=0;
	public static int wrongAns=0;
	public static String gameName="";
	/**
	 * Create the frame.
	 */
	public games() {
		Gamepoints=0;
		rightAns=0;
		wrongAns=0;
		gameName="";
		setTitle("SeriousStats");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLAY GAMES");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(214, 161, 143, 53);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("MEAN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mean().setVisible(true);
				games.this.dispose();
			}
		});
//		btnNewButton.setBackground(new Color(0, 102, 255));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(130, 247, 105, 107);
		contentPane.add(btnNewButton);
		
		JButton btnMedian = new JButton("MEDIAN");
		btnMedian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new median().setVisible(true);
				games.this.dispose();
			}
		});
//		btnMedian.setBackground(new Color(0, 102, 255));
		btnMedian.setForeground(new Color(0, 128, 0));
		btnMedian.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMedian.setBounds(276, 247, 105, 107);
		contentPane.add(btnMedian);
		
		JButton btnMode = new JButton("MODE");
		btnMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mode().setVisible(true);
				games.this.dispose();
			}
		});
//		btnMode.setBackground(new Color(0, 102, 255));
		btnMode.setForeground(new Color(75, 0, 130));
		btnMode.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMode.setBounds(426, 247, 105, 107);
		contentPane.add(btnMode);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new characters().setVisible(true);
				games.this.dispose();
			}
		});
		button.setIcon(new ImageIcon(games.class.getResource("/images/"+Login.charid+".png")));
		button.setBounds(517, 11, 121, 109);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("Points");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(517, 422, 50, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setText(Login.points);
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(570, 414, 93, 22);
		contentPane.add(label_2);
		
		JButton btnBack = new JButton("Exit");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				games.this.dispose();
				System.exit(1);
				
			}
		});
		btnBack.setForeground(Color.DARK_GRAY);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(276, 386, 105, 27);
		contentPane.add(btnBack);
		
		JButton btnResults = new JButton("Results");
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new results().setVisible(true);
					games.this.dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnResults.setForeground(Color.DARK_GRAY);
		btnResults.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnResults.setBounds(22, 28, 113, 27);
		contentPane.add(btnResults);
		
		JLabel label_3 = new JLabel("WELCOME");
		label_3.setBackground(new Color(240, 240, 240));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.DARK_GRAY);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_3.setBounds(270, 11, 129, 53);
		contentPane.add(label_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(games.class.getResource("/images/mainPanel.png")));
		label.setBounds(0, 0, 698, 447);
		contentPane.add(label);
		this.setLocationRelativeTo(null);
		try {
			Login.points=Login.db.getPoints(Login.userid);
			label_2.setText(Login.points);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
