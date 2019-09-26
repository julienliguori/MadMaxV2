package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Controleur.wkf_cpte;

public class frm_auth {
	private final wkf_cpte controller;
	    
	public JFrame frame;
	private JTextField Username;
	Connection cnx = null;
	java.sql.PreparedStatement prepared =null;
	ResultSet resultat =null ;
	private JPasswordField Password;
	
	/**
	 * Create the application.
	 */
	public frm_auth(wkf_cpte controller) {
		this.controller = controller;
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//cnx =ConnexionMysql.ConnexionDB();
		
		Username = new JTextField();
		Username.setBackground(Color.WHITE);
		Username.setBounds(341, 120, 207, 28);
		frame.getContentPane().add(Username);
		Username.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setForeground(new Color(255, 235, 205));
		lblNewLabel_1.setBounds(240, 120, 91, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblPassword.setForeground(new Color(250, 235, 215));
		lblPassword.setBounds(240, 193, 91, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("Connexion");

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				controller.pcs_authentifier(Username.getText(),new String (Password.getPassword()));
				
			}
			
		});
		btnNewButton.setFont(new Font("Serif",Font.BOLD,20));
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(new Color(112, 128, 144));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(341, 252, 207, 33);
		frame.getContentPane().add(btnNewButton);
		
		Password = new JPasswordField();
		Password.setBackground(new Color(255, 250, 240));
		Password.setBounds(341, 188, 207, 29);
		frame.getContentPane().add(Password);
		
		
		JLabel Password = new JLabel("New label");
		Password.setIcon(new ImageIcon("C:\\Users\\MAN\\Desktop\\Image\\cybersecurite.jpg"));
		Password.setBounds(0, 0, 984, 361);
		frame.getContentPane().add(Password);
	}
}
