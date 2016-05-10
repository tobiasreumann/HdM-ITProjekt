package de.hdm.itprojekt.server.db;

import de.hdm.itprojekt.shared.bo.Profil;
import de.hdm.itprojekt.shared.bo.Suchprofil;

public class ProfilMapper {

	private static ProfilMapper profilMapper = null;
	
	protected ProfilMapper(){
	}
	
	public static ProfilMapper profilMapper() {
		if(profilMapper == null){
			profilMapper = new ProfilMapper();
		}
		return profilMapper;

	public Profil insert(Profil p) {
		// TODO Auto-generated method stub
		return null;
	}

}
