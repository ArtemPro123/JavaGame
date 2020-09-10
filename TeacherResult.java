import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import java.awt.ScrollPane;
import javax.swing.SwingConstants;

public class TeacherResult extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public TeacherResult() throws SQLException {
		setResizable(false);
		setTitle("SeriousStats - Results");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setHorizontalAlignment(SwingConstants.CENTER);
		lblResults.setForeground(Color.DARK_GRAY);
		lblResults.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblResults.setBounds(281, 24, 131, 53);
		contentPane.add(lblResults);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeacherPanel().setVisible(true);
				TeacherResult.this.dispose();
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(281, 389, 131, 25);
		contentPane.add(button);
		ResultSet rs=Login.db.getResultsforTeacher();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 88, 653, 290);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBounds(0, 88, 468, 310);
		scrollPane.setViewportView(table);
//		contentPane.add(table);
		table.setModel(DbUtils.resultSetToTableModel(rs));
		this.setLocationRelativeTo(null);
		
	
	}
}
