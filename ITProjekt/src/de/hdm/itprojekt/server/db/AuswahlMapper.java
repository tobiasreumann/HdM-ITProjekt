package de.hdm.itprojekt.server.db;

import de.hdm.itprojekt.shared.bo.Auswahl;

public class AuswahlMapper {
	
private static AuswahlMapper auswahlMapper = null;
	
	protected AuswahlMapper(){
	}
	
	public static AuswahlMapper auswahlMapper() {
		if(auswahlMapper == null){
			auswahlMapper = new AuswahlMapper();
		}
		return auswahlMapper;
	}

	public Auswahl anlegen() {
		// TODO Auto-generated method stub
		return null;
	}

}
