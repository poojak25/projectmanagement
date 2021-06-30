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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUpTeacher {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpTeacher window = new SignUpTeacher();
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
	public SignUpTeacher() {
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
					Login l= new Login();
					frame.setVisible(false);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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

		
		JLabel lbllogin = new JLabel("SIGN UP");
		lbllogin.setBounds(35, 72, 234, 69);
		lbllogin.setFont(new Font("Verdana", Font.PLAIN, 40));
		panel.add(lbllogin);
		

		JLabel lblname = new JLabel("NAME     :");
		lblname.setBounds(23, 203, 122, 40);
		lblname.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblname);
		
		JTextField txtname = new JTextField("");
		txtname.setBounds(155, 201, 338, 46);
		txtname.setFont(new Font("Verdana", Font.PLAIN, 17));
		panel.add(txtname);
		
		JLabel lblemail = new JLabel("EMAIL    :");
		lblemail.setBounds(23, 260, 122, 40);
		lblemail.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblemail);
		
		JTextField txtemail = new JTextField("");
		txtemail.setBounds(155, 258, 338, 46);
		txtemail.setFont(new Font("Verdana", Font.PLAIN, 17));
		panel.add(txtemail);
	
		JLabel lblpassword = new JLabel("PASSWORD :");
		lblpassword.setBounds(23, 311, 122, 40);
		lblpassword.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblpassword);
		
		JPasswordField txtpassword = new JPasswordField("");
		txtpassword.setBounds(155, 315, 338, 46);
		txtpassword.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel.add(txtpassword);
		
		JLabel lblconfirmpassword = new JLabel("CONFIRM PASSWORD :");
		lblconfirmpassword.setBounds(23, 372, 212, 40);
		lblconfirmpassword.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblconfirmpassword);
		
		JPasswordField txtconfirmpassword = new JPasswordField("");
		txtconfirmpassword.setBounds(155, 423, 338, 46);
		txtconfirmpassword.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel.add(txtconfirmpassword);
		
		JButton btnlogin = new JButton("Sign Up");
		btnlogin.setBackground(Color.DARK_GRAY);
		btnlogin.setForeground(Color.WHITE);
		btnlogin.setBorder(null);
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name	=txtname.getText();
				String Email =txtemail.getText();
				String Password =txtpassword.getText();
				String ConfirmPassword =txtconfirmpassword.getText();
				
				if(Name.equals("")) {
					JOptionPane.showMessageDialog(frame, "ENTER NAME   ", "Message", JOptionPane.NO_OPTION);
				}else if(Email.equals("")) {
					JOptionPane.showMessageDialog(frame, "ENTER EMAIL   ", "Message", JOptionPane.NO_OPTION);
				}else if(Password.equals("")) {
					JOptionPane.showMessageDialog(frame, "ENTER PASSWORD   ", "Message", JOptionPane.NO_OPTION);
				}else if(ConfirmPassword.equals("")) {
					JOptionPane.showMessageDialog(frame, "ENTER CONFIRM PASSWORD   ", "Message", JOptionPane.NO_OPTION);
				}else {
				
					if(!(Password.equals(ConfirmPassword))){
						JOptionPane.showMessageDialog(frame, "PASSWORD & CONFIRM PASSWORD DOESN'T MATCH  ", "Message", JOptionPane.ERROR_MESSAGE);
					}else {
						try {
							
							JOptionPane.showMessageDialog(frame, "REGISTER SUCESSFULLY", "Message", JOptionPane.PLAIN_MESSAGE);
							
							Login l= new Login();
							frame.setVisible(false);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						frame.setVisible(false);
				
					//Store This Content In Database
				
					
					
					
					
					
					}
				}
			}
		});
		btnlogin.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnlogin.setBounds(388, 536, 105, 46);
		panel.add(btnlogin);

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
