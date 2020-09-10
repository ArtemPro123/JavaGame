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
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TeacherPanel extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public TeacherPanel() {
		setTitle("SeriousStats - Teacher");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeTeacher = new JLabel("WELCOME TEACHER");
		lblWelcomeTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeTeacher.setForeground(Color.DARK_GRAY);
		lblWelcomeTeacher.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcomeTeacher.setBounds(239, 99, 226, 53);
		contentPane.add(lblWelcomeTeacher);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(299, 390, 113, 31);
		contentPane.add(button);
		
		JButton btnViewResults = new JButton("View Student Results");
		btnViewResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new TeacherResult().setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				TeacherPanel.this.dispose();
			}
		});
		btnViewResults.setForeground(Color.DARK_GRAY);
		btnViewResults.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnViewResults.setBounds(219, 163, 270, 108);
		contentPane.add(btnViewResults);
		this.setLocationRelativeTo(null);
	}

}
