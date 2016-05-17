package de.hdm.itprojekt.server.db;


import de.hdm.itprojekt.shared.bo.Auswahl;
import de.hdm.itprojekt.shared.bo.Eigenschaft;

public class EigenschaftMapper {
private static EigenschaftMapper eigenschaftMapper = null;
	
	protected EigenschaftMapper(){
	}
	
	public static EigenschaftMapper eigenschaftMapper() {
		if(eigenschaftMapper == null){
			eigenschaftMapper = new EigenschaftMapper();
		}
		return eigenschaftMapper;
	}


	
	public void loeschen() {
		// TODO Auto-generated method stub
		
	}

	public Auswahl bearbeiten() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
