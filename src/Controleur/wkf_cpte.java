package Controleur;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.CAD;
import Model.Map_P;
import Vue.frm_auth;
import Vue.frm_decrypt;

public class wkf_cpte {
	private Map_P map;
	
	private CAD cad;
	
	public wkf_cpte(CAD cad)
	{
		this.cad = cad;
		this.map = new Map_P(); 
		
					frm_auth window = new frm_auth(this);
					window.frame.setVisible(true);
				
		
	} 
	
	
	
	public Boolean pcs_authentifier(String login, String password) {
		String sql = this.map.selectlDbyLoginPassword(login, password);
		ResultSet rs =  this.cad.GetRows(sql, "nul");
		try {
			
		
		if (rs.next()) {
			System.out.println("ok");
			frm_decrypt.view();
			return true;
		} else {
			return false;
			
		}
		 
	}catch(SQLException e) {
		e.printStackTrace();
		
	}
		return false;
	}
}
