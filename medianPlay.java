import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class medianPlay extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static int answer=0;
	int questioncounter=1;
	JLabel label_1;
	JLabel label_3;
	JLabel lblNewLabel;
	JLabel label_2;
	JLabel label_4;
	JLabel label_5;
	JLabel label_6;
	Thread thread;
	private JLabel lblNewLabel_1;
	private JLabel label_7;
	private JButton btnNewButton_1;
	/**
	 * Create the frame.
	 */
	public medianPlay() {
		setTitle("SeriousStats");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Points");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(510, 25, 50, 14);
		contentPane.add(label);
		
		label_1 = new JLabel("");
		label_1.setText(String.valueOf(games.Gamepoints));
		label_1.setForeground(new Color(0, 102, 204));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(570, 11, 93, 39);
		contentPane.add(label_1);
		
		JLabel lblTimer = new JLabel("Timer");
		lblTimer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTimer.setBounds(510, 50, 50, 14);
		contentPane.add(lblTimer);
		
		 label_3 = new JLabel("");
		label_3.setForeground(new Color(0, 102, 204));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(557, 39, 93, 39);
		contentPane.add(label_3);
		
		lblNewLabel = new JLabel("1",SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setBounds(179, 174, 50, 48);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread.stop();
				new games().setVisible(true);
				medianPlay.this.dispose();
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(307, 413, 105, 23);
		contentPane.add(button);
		
		JLabel lblMean = new JLabel("MEDIAN", SwingConstants.CENTER);
		lblMean.setOpaque(true);
		lblMean.setForeground(new Color(0, 128, 0));
		lblMean.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblMean.setBackground(Color.WHITE);
		lblMean.setBounds(307, 25, 105, 48);
		contentPane.add(lblMean);
		
		 label_2 = new JLabel("1", SwingConstants.CENTER);
		label_2.setOpaque(true);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBackground(new Color(0, 128, 0));
		label_2.setBounds(258, 174, 50, 48);
		contentPane.add(label_2);
		
		 label_4 = new JLabel("1", SwingConstants.CENTER);
		label_4.setOpaque(true);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBackground(new Color(0, 128, 0));
		label_4.setBounds(336, 174, 50, 48);
		contentPane.add(label_4);
		
		 label_5 = new JLabel("1", SwingConstants.CENTER);
		label_5.setOpaque(true);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBackground(new Color(0, 128, 0));
		label_5.setBounds(419, 174, 50, 48);
		contentPane.add(label_5);
		
		 label_6 = new JLabel("1", SwingConstants.CENTER);
		label_6.setOpaque(true);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_6.setBackground(new Color(0, 128, 0));
		label_6.setBounds(496, 174, 50, 48);
		contentPane.add(label_6);
		
		JLabel lblWhatIsThe = new JLabel("What is the MEDIAN?");
		lblWhatIsThe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWhatIsThe.setBounds(158, 291, 150, 23);
		contentPane.add(lblWhatIsThe);
		
		textField = new JTextField();
		textField.setBounds(307, 294, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputans=textField.getText();
				if(!inputans.equals("")) {
					double inputanss=Integer.valueOf(inputans);
					if(answer==inputanss) {
						games.Gamepoints=games.Gamepoints+100;
						label_1.setText(String.valueOf(games.Gamepoints));
						games.rightAns++;
					}else {
						games.wrongAns++;
					}
					
				}
				questioncounter++;
				label_7.setText(String.valueOf(questioncounter));
				generateNumbers();
				textField.setText("");
			}
		});
		btnNewButton.setToolTipText("NEXT");
		btnNewButton.setIcon(new ImageIcon(medianPlay.class.getResource("/images/next.PNG")));
		btnNewButton.setBounds(431, 279, 105, 54);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Question: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(283, 117, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		label_7 = new JLabel("1");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setBounds(367, 117, 74, 14);
		contentPane.add(label_7);
		
		btnNewButton_1 = new JButton("Get Result");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread.stop();
				new resultPage().setVisible(true);
				medianPlay.this.dispose();
			}
		});
		btnNewButton_1.setBounds(307, 379, 105, 23);
		contentPane.add(btnNewButton_1);
		this.setLocationRelativeTo(null);
		startTimer();
		generateNumbers();
	}
	  public void startTimer(){
		  	thread = new Thread(){
			    public void run(){
			    	
			    	try {
				         for(int i = 60; ; i--) {
				        	 label_3.setText(String.valueOf(i));
				            Thread.sleep(1000);
				            if(i==0) {
				            	new resultPage().setVisible(true);
				            	medianPlay.this.dispose();
				            	thread.stop();
				            	
				            }
				         }
				      }catch (InterruptedException e) {
//				         System.out.println("Thread  interrupted.");
				      }
			    }
			    
			  };
			  thread.start();  
			  
		  games.gameName="MEDIAN";
	  }
	  public void generateNumbers() {
		  Random r = new Random();
		  int number1 = r.nextInt(10-0) + 0;
		  lblNewLabel.setText(String.valueOf(number1));
		  int number2 = r.nextInt(10-0) + 0;
		  label_2.setText(String.valueOf(number2));
		  int number3 = r.nextInt(10-0) + 0;
		  label_4.setText(String.valueOf(number3));
		  int number4 = r.nextInt(10-0) + 0;
		  label_5.setText(String.valueOf(number4));
		  int number5 = r.nextInt(10-0) + 0;
		  label_6.setText(String.valueOf(number5));
		  
		  int[] numbers= {number1,number2,number3,number4,number5};
		  Arrays.sort(numbers);
		  answer=numbers[2];
		  
	  }
}
