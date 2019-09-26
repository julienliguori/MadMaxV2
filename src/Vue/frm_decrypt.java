package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controleur.wkf_decrypt;

public class frm_decrypt {
	static JFrame frame;
	public static JButton button;
	static JButton decrypt;
	static JTextField textField;
	static JTextArea ProgressScreen;

	public JTextArea getProgressScreen() {
		return ProgressScreen;
	}
	
	public JTextField getTextfield() {
		return textField;
	}
	public JFrame getFrame() {
		return frame;
	}
	
	public JButton getButton() {
		
		return button;
	} 
	
	public void setButton(JButton button) {
		this.button = button;
	}
	
	public JButton getDecrypt() {
		return decrypt;
		
	}
	
	public static void view() {
		frame = new JFrame("Upload frame");
		button = new JButton("Upload");
		decrypt = new JButton("Decrypt");
		
		
		textField = new JTextField();
		textField.setBounds(206, 50, 324, 25);
		textField.setEditable(false);
		textField.setColumns(10);
		frame.getContentPane().add(textField);

		
		ProgressScreen = new JTextArea(5, 30);
		ProgressScreen.setBounds(206, 100, 324, 225);
		ProgressScreen.setColumns(10);
		ProgressScreen.setEditable(false);
		
		frame.getContentPane().add(ProgressScreen);

		

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Zizou\\Desktop\\983279.jpg"));
		lblNewLabel.setBounds(0, 0, 767, 461);

		frame.getContentPane().add(decrypt);
		frame.getContentPane().add(button);
		frame.getContentPane().add(lblNewLabel);

		frame.setBounds(100, 100, 783, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		decrypt.setBounds(566, 334, 146, 35);
		button.setBounds(566, 50, 146, 25);
		
	}
}
