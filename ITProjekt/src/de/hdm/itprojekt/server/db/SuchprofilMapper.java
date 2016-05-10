package de.hdm.itprojekt.server.db;

import de.hdm.itprojekt.shared.bo.Profil;
import de.hdm.itprojekt.shared.bo.Suchprofil;

public class SuchprofilMapper {
	
private static SuchprofilMapper suchprofilMapper = null;
	
	protected SuchprofilMapper(){
	}
	
	public static SuchprofilMapper suchprofilMapper() {
		if(suchprofilMapper == null){
			suchprofilMapper = new SuchprofilMapper();
		}
		return suchprofilMapper;
	}

	public void loeschen(Suchprofil sp) {
		// TODO Auto-generated method stub
		
	}

	public Profil bearbeiten() {
		// TODO Auto-generated method stub
		return null;
	}

	public Suchprofil getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil anlegen(Suchprofil sp) {
		// TODO Auto-generated method stub
		return null;
	}

	//TODO insert()
	
	//TODO loeschen()
	
	//TODO bearbeiten()
	
	//TODO getByID(id)
}
