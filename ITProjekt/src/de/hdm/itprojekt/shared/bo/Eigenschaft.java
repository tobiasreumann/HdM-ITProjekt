package de.hdm.itprojekt.shared.bo;

public class Eigenschaft extends BusinessObject{

	private static final long serialVersionUID = 1L;
	
	private String bezeichnung;
	
	public Eigenschaft(){
		
	}
	
	public String getBezeichnung(){
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung){
		this.bezeichnung = bezeichnung;
	}
}
