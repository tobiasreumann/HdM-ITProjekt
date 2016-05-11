package de.hdm.itprojekt.server.db;

import de.hdm.itprojekt.shared.bo.Beschreibung;
import de.hdm.itprojekt.shared.bo.Eigenschaft;

public class BeschreibungMapper {

private static BeschreibungMapper beschreibungMapper = null;
	
	protected BeschreibungMapper(){
	}
	
	public static BeschreibungMapper beschreibungMapper() {
		if(beschreibungMapper == null){
			beschreibungMapper = new BeschreibungMapper();
		}
		return beschreibungMapper;
	}

	public Beschreibung bearbeiten(Eigenschaft e) {
		// TODO Auto-generated method stub
		return null;
	}

	public Beschreibung anlegen() {
		// TODO Auto-generated method stub
		return null;
	}





}
