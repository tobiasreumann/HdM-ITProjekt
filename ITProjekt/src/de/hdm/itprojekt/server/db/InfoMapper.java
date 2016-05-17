package de.hdm.itprojekt.server.db;

import de.hdm.itprojekt.shared.bo.Info;

public class InfoMapper {
	
private static InfoMapper infoMapper = null;
	
	protected InfoMapper(){
	}
	
	public static InfoMapper infoMapper() {
		if(infoMapper == null){
			infoMapper = new InfoMapper();
		}
		return infoMapper;
	}

	public Info anlegen() {
		// TODO Auto-generated method stub
		return null;
	}

	public void loeschen(Info i) {
		// TODO Auto-generated method stub
		
	}

	public Info bearbeiten() {
		// TODO Auto-generated method stub
		return null;
	}

}
