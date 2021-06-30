import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
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
		
		JButton lblAddStudent = new JButton("I Am Student");
		lblAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpStudent ss=new SignUpStudent();
				frame.setVisible(false);
			
			}
		});
		lblAddStudent.setBounds(67, 415, 159,40 );
		lblAddStudent.setBackground(Color.DARK_GRAY);
		lblAddStudent.setForeground(Color.WHITE);
		lblAddStudent.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(lblAddStudent);

		JButton lblAddTeacher = new JButton("I Am Teacher");
		lblAddTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpTeacher st=new SignUpTeacher();
				frame.setVisible(false);
			}
		});
		lblAddTeacher.setBounds(338, 415, 159, 40);
		lblAddTeacher.setBackground(Color.DARK_GRAY);
		lblAddTeacher.setForeground(Color.WHITE);
		lblAddTeacher.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(lblAddTeacher);
		
		JLabel labelstudent = new JLabel("");
		labelstudent.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("student.png")).getImage().getScaledInstance(159,170, Image.SCALE_SMOOTH)));
		labelstudent.setBounds(67, 223, 159, 124);
		panel.add(labelstudent);
		
		JLabel labelteacher = new JLabel("");
		labelteacher.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("teacher.png")).getImage().getScaledInstance(159,124, Image.SCALE_SMOOTH)));
		labelteacher.setBounds(338, 223, 159, 124);
		panel.add(labelteacher);
	
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
