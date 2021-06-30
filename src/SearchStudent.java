import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SearchStudent {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchStudent window = new SearchStudent();
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
	public SearchStudent() {
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
				TeacherHome l= new TeacherHome();
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
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("ProjectManagementLogo.jpg")).getImage().getScaledInstance(230,206, Image.SCALE_SMOOTH)));
		lbllogo.setBounds(67, 242, 230, 206);
		panel_1.add(lbllogo);
		
		JLabel lbldots = new JLabel("New label");
		lbldots.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("dots.png")).getImage().getScaledInstance(109, 36, Image.SCALE_SMOOTH)));
		lbldots.setBackground(Color.WHITE);
		lbldots.setBounds(28, 11, 109, 36);
		panel_1.add(lbldots);
		
		
		JLabel lblprn1 = new JLabel("ENTER PRN   :");
		lblprn1.setBounds(59, 171, 130, 40);
		lblprn1.setVisible(true);
		lblprn1.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblprn1);
				
		JTextField txtprn1 = new JTextField("");
		txtprn1.setBounds(59, 245, 338, 46);
		txtprn1.setVisible(true);
		txtprn1.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
     	txtprn1.setFont(new Font("Verdana", Font.PLAIN, 17));
		panel.add(txtprn1);
				
		
		JLabel lblname = new JLabel("NAME     :");
		lblname.setBounds(23, 106, 122, 40);
		lblname.setVisible(false);
		lblname.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblname);
		
		JLabel txtname = new JLabel("");
		txtname.setVisible(false);
		txtname.setBounds(155, 106, 338, 46);
		txtname.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
		txtname.setFont(new Font("Verdana", Font.PLAIN, 17));
		panel.add(txtname);
		
		JLabel lblemail = new JLabel("EMAIL    :");
		lblemail.setBounds(23, 171, 122, 40);
		lblemail.setVisible(false);
		lblemail.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblemail);
		
		JLabel txtemail = new JLabel("");
		txtemail.setBounds(155, 171, 338, 46);
		txtemail.setVisible(false);
		txtemail.setFont(new Font("Verdana", Font.PLAIN, 17));
		txtemail.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
		panel.add(txtemail);
	
		
		JLabel lblprn = new JLabel("PRN       :");
		lblprn.setBounds(23, 228, 122, 40);
		lblprn.setVisible(false);
		lblprn.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblprn);
		
		JLabel txtprn = new JLabel("");
		txtprn.setBounds(155, 228, 338, 46);
		txtprn.setVisible(false);
		txtprn.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
		txtprn.setFont(new Font("Verdana", Font.PLAIN, 17));
		panel.add(txtprn);
	
		
		JLabel lblclass = new JLabel("CLASS    :");
		lblclass.setBounds(23, 279, 122, 40);
		lblclass.setVisible(false);
		lblclass.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblclass);
		
		JLabel txtclass = new JLabel("");
		txtclass.setBounds(155, 285, 338, 46);
		txtclass.setVisible(false);
		txtclass.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
		txtclass.setFont(new Font("Verdana", Font.PLAIN, 17));
		panel.add(txtclass);
		
		JLabel lblprojectname = new JLabel("PROJECT NAME :");
		lblprojectname.setBounds(23, 342, 152, 40);
		lblprojectname.setVisible(false);
		lblprojectname.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblprojectname);
		
		JLabel txtprojectname = new JLabel("");
		txtprojectname.setBounds(155, 388, 338, 46);
		txtprojectname.setVisible(false);
		txtprojectname.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
		txtprojectname.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel.add(txtprojectname);
		
		JLabel lblgrpmembers = new JLabel("GROUP MEMBERS :");
		lblgrpmembers.setBounds(23, 456, 224, 40);
		lblgrpmembers.setVisible(false);
		lblgrpmembers.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.add(lblgrpmembers);
		
		JLabel txtgrpmembers = new JLabel("");
		txtgrpmembers.setBounds(155, 507, 338, 95);
		txtgrpmembers.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtgrpmembers.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
		txtgrpmembers.setVisible(false);
		panel.add(txtgrpmembers);
			

		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherHome tp=new TeacherHome();
				frame.setVisible(false);
			
			}
		});
		btnback.setBounds(275, 376, 122,45 );
		btnback.setBackground(Color.DARK_GRAY);
		btnback.setForeground(Color.WHITE);
		btnback.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel.add(btnback);
		

		JButton btnback1 = new JButton("BACK");
		btnback1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display ds=new Display();
				frame.setVisible(false);
			}
		});
		btnback1.setBounds(371, 649, 122, 40);
		btnback1.setBackground(Color.DARK_GRAY);
		btnback1.setForeground(Color.WHITE);
		btnback1.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnback1.setVisible(false);
		panel.add(btnback1);
		
		

		
		JButton btnsearch = new JButton("SEARCH");
		btnsearch.setBackground(Color.DARK_GRAY);
		btnsearch.setForeground(Color.WHITE);
		btnsearch.setBorder(null);
		btnsearch.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				
			String PRN =txtprn1.getText();
			
			if(PRN.equals("")) {
				JOptionPane.showMessageDialog(frame, "ENTER PRN   ", "Message", JOptionPane.NO_OPTION);
			}else {
			
				lblprn1.setVisible(false);
				txtprn1.setVisible(false);
				btnsearch.setVisible(false);
				btnback.setVisible(false);
				
				btnback1.setVisible(true);
				lblname.setVisible(true);
				lblemail.setVisible(true);
				lblclass.setVisible(true);
				lblgrpmembers.setVisible(true);
				lblprn.setVisible(true);
				lblprojectname.setVisible(true);
				txtname.setVisible(true);
				txtemail.setVisible(true);
				txtclass.setVisible(true);
				txtgrpmembers.setVisible(true);
				txtprn.setVisible(true);	
				txtprojectname.setVisible(true);
				
				//get the data of searched student from database and display in the labels
				
				
			
				
				
				
			}		
			}
		});
		btnsearch.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnsearch.setBounds(59, 376, 123, 46);
		panel.add(btnsearch);

		
		}catch(Exception e) {
			
		}
	}
}
	