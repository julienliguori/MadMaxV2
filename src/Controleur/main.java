package Controleur;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.nio.file.Files;

import javax.swing.JTextField;

import Controleur.wkf_cpte;
import Controleur.wkf_decrypt;
import Model.CAD;
import Model.Fichier;
import Vue.frm_auth;
import Vue.frm_decrypt;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Fichier filesM = new Fichier();
		frm_decrypt decrypt = new frm_decrypt();
		decrypt.view();
		
		JTextField textField = new JTextField();
		
		wkf_decrypt controller = new wkf_decrypt(filesM, textField, filesM, null, null, decrypt);
		decrypt.getButton().addActionListener((ActionListener) controller);
		controller.ButtonDecrypt();*/
		new wkf_cpte(new CAD());
		wkf_decrypt.pcs_decrypter(); 
	}

}
