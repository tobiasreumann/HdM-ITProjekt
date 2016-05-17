package de.hdm.itprojekt.client;

public class TestAuswahleigenschaft extends TestEigenschaft{

	String[] auswahl;
	
	
	public TestAuswahleigenschaft(String[] a, String b){
		this.bezeichnung = b;
		this.auswahl = a;
	}
	
	public String[] getAuswahl(){
		return auswahl;		
	}
	
	public void setAuswahl(String[] a){
		this.auswahl = a;
	}
	
	
}
