package Model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import Controleur.wkf_decrypt;
import Model.Decrypt;

public class Fichier {
	
	private wkf_decrypt decryptController;
	
	public Fichier() {
		String file = new String();
	}
	
	public String getData(String path) {
		int chara = 0;
		String result = "";
		try{
			FileReader buff = new FileReader(path);
			chara = (char)buff.read();
			
			while (chara != -1) {
				result += (char)chara;
				chara = buff.read();
			}
			buff.close();
			return result;
			}		
			catch (Exception e){
			System.out.println(e.toString());
			}
		return result;
	}
	public void setData(String path, String texte) throws IOException {
		FileWriter fichier = new FileWriter(path);
	    fichier.write (texte);
	    fichier.close();
	}
	
	public String crypter(String texte, String key) {
		return Decrypt.crypt(texte,key);
	}
	public String decrypter(String texte, String attente) {
		return Decrypt.decrypt(texte, attente);
	}
	public void setDecryptController(wkf_decrypt decryptController) {
		this.decryptController = decryptController;
	}
}
