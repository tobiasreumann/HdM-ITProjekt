package de.hdm.itprojekt.server.db;

import de.hdm.itprojekt.shared.bo.Kontaktsperre;
import de.hdm.itprojekt.shared.bo.Profil;

public class KontaktsperreMapper {
	
private static KontaktsperreMapper kontaktsperreMapper = null;
	
	protected KontaktsperreMapper(){
	}
	
	public static KontaktsperreMapper kontaktsperreMapper() {
		if(kontaktsperreMapper == null){
			kontaktsperreMapper = new KontaktsperreMapper();
		}
		return kontaktsperreMapper;
	}



	public Kontaktsperre anlegen(Kontaktsperre k) {
		// TODO Auto-generated method stub
		return null;
	}

	public void loeschen(Profil p) {
		// TODO Auto-generated method stub
		
	}

	public Kontaktsperre getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kontaktsperre hinzufuegen(Profil p) {
		// TODO Auto-generated method stub
		return null;
	}

	public void entfernen(Profil p) {
		// TODO Auto-generated method stub
		
	}

	//TODO getByID(id)
	
	//TODO hinzufuegen()
	
	//TODO entfernen()
}
