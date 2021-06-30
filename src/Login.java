import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Login() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
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
				frame.setVisible(false);
			}
		});
		btnExit.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH)));
		btnExit.setBounds(480, 11, 45, 40);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBorder(null);
		panel.add(btnExit);
		
		JLabel lbllogin = new JLabel("LOGIN");
		lbllogin.setBounds(28, 83, 175, 69);
		lbllogin.setFont(new Font("Verdana", Font.PLAIN, 50));
		panel.add(lbllogin);
		
		JLabel lblusername = new JLabel("USERNAME :");
		lblusername.setBounds(28, 275, 338, 46);
		lblusername.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel.add(lblusername);
		
		JTextField txtusername = new JTextField();
		txtusername.setBounds(28, 332, 338, 46);
		txtusername.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel.add(txtusername);
	
		JLabel lblpassword = new JLabel("PASSWORD :");
		lblpassword.setBounds(28, 405, 338, 46);
		lblpassword.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel.add(lblpassword);
		
		JPasswordField txtpassword = new JPasswordField();
		txtpassword.setBounds(28, 462, 338, 46);
		txtpassword.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel.add(txtpassword);
		

		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton rdbstudent = new JRadioButton("STUDENT");
		rdbstudent.setBackground(Color.WHITE);
		rdbstudent.setBorder(null);
		rdbstudent.setBounds(28, 224, 148, 40);
		rdbstudent.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel.add(rdbstudent);
		
		JRadioButton rdbteacher = new JRadioButton("TEACHER");
		rdbteacher.setBackground(Color.WHITE);
		rdbteacher.setBorder(null);
		rdbteacher.setBounds(218, 224, 148, 40);
		rdbteacher.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel.add(rdbteacher);
		    
		bg.add(rdbstudent);
		bg.add(rdbteacher);
		
		
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.setBackground(Color.DARK_GRAY);
		btnlogin.setForeground(Color.WHITE);
		btnlogin.setBorder(null);
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String UserName	=txtusername.getText();
			String PassWord =txtpassword.getText();
			
			if(UserName.equals("")) {
				JOptionPane.showMessageDialog(frame, "ENTER USER NAME   ", "Message", JOptionPane.NO_OPTION);
			}else if(PassWord.equals("")) {
				JOptionPane.showMessageDialog(frame, "ENTER PASSWORD   ", "Message", JOptionPane.NO_OPTION);
			}else {
		
				 if(rdbstudent.isSelected()){
					
					//do login connectivity and after sucessful login display message and redirect to StudentHome
					
					StudentHome sh = new StudentHome();
					frame.setVisible(false);
					
					
					
					
					
				}else if (rdbteacher.isSelected()){
					//do login connectivity and after after sucessful login display message and  redirect to TeacherHome
					
					TeacherHome sh = new TeacherHome();
					frame.setVisible(false);
					
					
					
					
				
				}else {
					JOptionPane.showMessageDialog(frame, "SELECT OPTION   ", "Message", JOptionPane.NO_OPTION);
					
				}
				
				}
			}
		});
		btnlogin.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnlogin.setBounds(28, 565, 131, 46);
		panel.add(btnlogin);
		
		JButton btncancel = new JButton("SIGN-UP");
		btncancel.setBackground(Color.DARK_GRAY);
		btncancel.setForeground(Color.WHITE);
		btncancel.setBorder(null);
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp su=new SignUp();
				frame.setVisible(false);
				
			}
		});
		btncancel.setFont(new Font("Verdana", Font.PLAIN, 20));
		btncancel.setBounds(243, 565, 123, 46);
		panel.add(btncancel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 366, 700);
		panel_1.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
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