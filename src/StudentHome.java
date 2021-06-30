import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StudentHome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentHome window = new StudentHome();
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
	public StudentHome() {
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
			
			JLabel lblprofile = new JLabel("PROFILE");
			lblprofile.setBounds(28, 83, 175, 69);
			lblprofile.setFont(new Font("Verdana", Font.PLAIN, 40));
			panel.add(lblprofile);
			
		
			JLabel lblname = new JLabel("NAME     :");
			lblname.setBounds(23, 203, 122, 40);
			lblname.setFont(new Font("Verdana", Font.PLAIN, 18));
			panel.add(lblname);
			
			JLabel txtname = new JLabel("");
			txtname.setBounds(155, 201, 338, 46);
			txtname.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
			txtname.setFont(new Font("Verdana", Font.PLAIN, 17));
			panel.add(txtname);
			
			JLabel lblemail = new JLabel("EMAIL    :");
			lblemail.setBounds(23, 260, 122, 40);
			lblemail.setFont(new Font("Verdana", Font.PLAIN, 18));
			panel.add(lblemail);
			
			JLabel txtemail = new JLabel("");
			txtemail.setBounds(155, 258, 338, 46);
			txtemail.setFont(new Font("Verdana", Font.PLAIN, 17));
			txtemail.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
			panel.add(txtemail);
		
			
			JLabel lblprn = new JLabel("PRN       :");
			lblprn.setBounds(23, 317, 122, 40);
			lblprn.setFont(new Font("Verdana", Font.PLAIN, 18));
			panel.add(lblprn);
			
			JLabel txtprn = new JLabel("");
			txtprn.setBounds(155, 315, 338, 46);
			txtprn.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
			txtprn.setFont(new Font("Verdana", Font.PLAIN, 17));
			panel.add(txtprn);
		
			
			JLabel lblclass = new JLabel("CLASS    :");
			lblclass.setBounds(23, 374, 122, 40);
			lblclass.setFont(new Font("Verdana", Font.PLAIN, 18));
			panel.add(lblclass);
			
			JLabel txtclass = new JLabel("");
			txtclass.setBounds(155, 372, 338, 46);
			txtclass.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
			txtclass.setFont(new Font("Verdana", Font.PLAIN, 17));
			panel.add(txtclass);
			
			JLabel lblprojectname = new JLabel("PROJECT NAME :");
			lblprojectname.setBounds(23, 435, 152, 40);
			lblprojectname.setFont(new Font("Verdana", Font.PLAIN, 18));
			panel.add(lblprojectname);
			
			JLabel txtprojectname = new JLabel("");
			txtprojectname.setBounds(155, 486, 338, 46);
			txtprojectname.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
			txtprojectname.setFont(new Font("Verdana", Font.PLAIN, 20));
			panel.add(txtprojectname);
			
			JLabel lblgrpmembers = new JLabel("GROUP MEMBERS :");
			lblgrpmembers.setBounds(28, 543, 224, 40);
			lblgrpmembers.setFont(new Font("Verdana", Font.PLAIN, 18));
			panel.add(lblgrpmembers);
			
			JLabel txtgrpmembers = new JLabel("");
			txtgrpmembers.setBounds(155, 594, 338, 95);
			txtgrpmembers.setFont(new Font("Verdana", Font.PLAIN, 20));
			txtgrpmembers.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
			panel.add(txtgrpmembers);

			
			JLabel lbllogo = new JLabel("");
			lbllogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("ProjectManagementLogo.jpg")).getImage().getScaledInstance(230,206, Image.SCALE_SMOOTH)));
			lbllogo.setBounds(67, 242, 230, 206);
			panel_1.add(lbllogo);
			
			JLabel lbldots = new JLabel("New label");
			lbldots.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("dots.png")).getImage().getScaledInstance(109, 36, Image.SCALE_SMOOTH)));
			lbldots.setBackground(Color.WHITE);
			lbldots.setBounds(28, 11, 109, 36);
			panel_1.add(lbldots);
			
			
			
			//Retrive the data from database and display into the blank labels
			
			
			
			
			
			}catch(Exception e) {
				
			}

	}

}
