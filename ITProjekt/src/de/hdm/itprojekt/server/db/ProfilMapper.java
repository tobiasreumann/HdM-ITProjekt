package de.hdm.itprojekt.server.db;

public class ProfilMapper {

	private static ProfilMapper profilMapper = null;
	
	protected ProfilMapper(){
	}
	
	public static ProfilMapper profilMapper() {
		if(profilMapper == null){
			profilMapper = new ProfilMapper();
		}
		return profilMapper;
	}

}
