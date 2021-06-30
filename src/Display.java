import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display window = new Display();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Display() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
		frame = new JFrame();
		frame.setTitle("Project Management");
		frame.setResizable(false);
	    frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setBounds(100, 100, 900, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(365, 0, 535, 700);
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnExit = new JButton("");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Login l=new Login();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.setVisible(false);
			}
		});
		btnExit.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH)));
		btnExit.setBounds(480, 11, 45, 40);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBorder(null);
		panel.add(btnExit);
	    
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 366, 700);
		panel_1.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton lblsearchstudent = new JButton("SEARCH STUDENT");
		lblsearchstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchStudent ss=new SearchStudent();
				frame.setVisible(false);
			
			}
		});
		lblsearchstudent.setBounds(144, 289, 214,40 );
		lblsearchstudent.setBackground(Color.DARK_GRAY);
		lblsearchstudent.setForeground(Color.WHITE);
		lblsearchstudent.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(lblsearchstudent);

		JButton lbldisplayall = new JButton("DISPLAY ALL STUDENTS DETAILS");
		lbldisplayall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayAll dall=new DisplayAll();
				frame.setVisible(false);
			}
		});
		lbldisplayall.setBounds(54, 420, 387, 40);
		lbldisplayall.setBackground(Color.DARK_GRAY);
		lbldisplayall.setForeground(Color.WHITE);
		lbldisplayall.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(lbldisplayall);
	
		JLabel lbllogo = new JLabel("");
		lbllogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("ProjectManagementLogo.jpg")).getImage().getScaledInstance(230,206, Image.SCALE_SMOOTH)));
		lbllogo.setBounds(67, 242, 230, 206);
		panel_1.add(lbllogo);
		
		JLabel lbldots = new JLabel("New label");
		lbldots.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("dots.png")).getImage().getScaledInstance(109, 36, Image.SCALE_SMOOTH)));
		lbldots.setBackground(Color.WHITE);
		lbldots.setBounds(28, 11, 109, 36);
		panel_1.add(lbldots);
		}catch(Exception e) {
			
		}
	}

}
