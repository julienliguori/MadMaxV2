package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.JFileChooser;
import javax.swing.JTextField;

import Model.Decrypt;
import Model.Fichier;
import Model.Map_Dic;
import Vue.frm_decrypt;

public class wkf_decrypt {
	
	public Fichier filesModel;
	public Decrypt decryptModel;
	public Map_Dic dictionnaryModel;
	public frm_decrypt decryptView;
	String content;
	Fichier f;
	JTextField textField;
	JFileChooser j = new JFileChooser(); 
	public wkf_decrypt(Fichier filesM, JTextField textField, Fichier filesModel, 
			Decrypt decryptModel, Map_Dic dictionnaryModel, frm_decrypt decryptView) {
		this.f = filesM;
		this.textField = textField;
		this.filesModel = filesModel;
		this.filesModel.setDecryptController(this);
		this.decryptModel = decryptModel;
		this.dictionnaryModel = dictionnaryModel;
		this.decryptView = decryptView;
	}
	
	public void ButtonDecrypt() {
		
		decryptView.getDecrypt().addActionListener(new ActionListener() {
			public void decrypt(String content) throws IOException {
		/*		String keyval = "douze";
				// TODO : contenu du path
				String hexEncrypted = content;
				int[] intArr = Decrypt.hex2Arr(hexEncrypted, "-", 16);

				System.out.println(Decrypt.decryptV27(intArr, keyval));
				String result = Decrypt.decryptV27(intArr, keyval);
		*/		String result = "hello word";
				decryptView.getProgressScreen().setText("\n Voici votre resultat : " +  result);
				
				
			}
			public void actionPerformed(ActionEvent e) {
			
				try {
					this.decrypt(content);
					

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
	}
	
	static Boolean pcs_decrypter() {
		// TODO Auto-generated method stub
		Fichier o1;
		String reponse;
		try {
			o1 = new Fichier();
			o1.setData("Files\\Source.txt", "je suit une personne sympa");
			
			reponse = o1.getData("Files\\Source.txt");
			System.out.println("message : "+reponse);
			
			reponse = o1.crypter(reponse, "awqpefghaaaa");
			System.out.println("crypte : "+reponse);
			o1.setData("Files\\Test.txt", reponse);
			
			reponse = o1.getData("Files\\Test.txt");
			System.out.println("predecrypte : "+reponse);
			
			reponse = o1.decrypter(reponse, "colier");
			o1.setData("Files\\Resultat.txt", reponse);
			System.out.println(reponse);
			
			System.out.println("Fin");
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
