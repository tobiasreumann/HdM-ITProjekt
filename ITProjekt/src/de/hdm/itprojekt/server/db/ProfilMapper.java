package de.hdm.itprojekt.server.db;

import java.sql.*;

public class ProfilMapper {

	
	private static ProfilMapper profilMapper = null;
	
	
	protected ProfilMapper() {
		
	}
	
	
	public static ProfilMapper profilMapper() {
		if (profilMapper == null) {
			profilMapper = new ProfilMapper();
		}
		return profilMapper;
	}
	
	
	/*public Profil findeProfilNachID (int id) {
		Connection con = DBConnection.connection();
	}
	*/
}
