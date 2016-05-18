package de.hdm.itprojekt.shared.bo;

import java.util.Vector;

import de.hdm.itprojekt.client.TestEigenschaft;

public class Info extends BusinessObject{

	private static final long serialVersionUID = 1L;
	
	private String wert;
	
	public void setWert(String a){
		this.wert = a;
	}
	
	public String getWert(){
		return wert;
		
	}
	
}
