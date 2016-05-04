package de.hdm.itprojekt.shared.bo;

public class Kontaktsperre extends BusinessObject{

	private static final long serialVersionUID = 1L;
	
	private boolean gesperrt = false;
	
	public Kontaktsperre(){
		
	}
	
	public boolean getGesperrt(){
		return gesperrt;
	}
	
	public void setGesperrt(boolean gesperrt){
		//TODO; pruefen ob Objekt bereits gesperrt ist
		this.gesperrt = gesperrt;
	}
}
