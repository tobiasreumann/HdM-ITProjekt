package de.hdm.itprojekt.server.db;

import java.util.Vector;

import de.hdm.itprojekt.shared.bo.Profil;
import de.hdm.itprojekt.shared.bo.Suchprofil;

public class ProfilMapper {

	private static ProfilMapper profilMapper = null;
	public Vector<Profil> anlegen;

	
	protected ProfilMapper(){
	}
	
	public static ProfilMapper profilMapper() {
		if(profilMapper == null){
			profilMapper = new ProfilMapper();
		}
		return profilMapper;
	}


	public Profil getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil anlegen(Profil p) {
		// TODO Auto-generated method stub
		return null;
	}

	public void loeschen(Profil p) {
		// TODO Auto-generated method stub
		
	}

	public Profil bearbeiten() {
		// TODO Auto-generated method stub
		return null;
	}

	public Vector<Profil> getProfile() {
		 Vector <Profil> result   = new Vector<Profil>();
		 //Statement muss hin => Profile müssen gefüllt und zum Vector hinzugefügt werden
		 
		return result;
	}
	
	//TODO getByID(id)
	
	//TODO loeschen()
	
	//TODO bearbeiten()
	
	//TODO Vector<Profil> getProfile()

}
