package de.hdm.itprojekt.server.db;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import de.hdm.itprojekt.shared.bo.Info;
import de.hdm.itprojekt.shared.bo.Profil;
import de.hdm.itprojekt.shared.bo.Suchprofil;

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
	
	
	public Vector<Info> getInfosVonProfil(Profil p) {
			
			Connection con = DBConnection.connection();
			
			Vector<Info> result = new Vector<Info>();
			
			try {
				Statement stmt = con.createStatement();
				
				ResultSet rs = stmt.executeQuery("SELECT ID, Wert"
												+ "FROM Info"
												+ "WHERE Profil_ID = "+p.getId()
												+ "ORDER BY Wert)");
				
				//Für jedes Ergebnis wird ein Profil-Objekt erstellt
				while (rs.next()) {
					Info i = new Info();
					i.setId(rs.getInt("ID"));
					i.setWert(rs.getString("Wert"));
				
					
					//Objekte werden in Vector hinzugefügt
					result.addElement(i);
					
				}
			}
			catch (SQLException e2) {
				e2.printStackTrace();
				return null;
			}
			//Ergebnisvektor wird zurückgegeben
			return result;
		}
	

	
	
	
	public Info anlegen(Info i, Profil p) {
		Connection con = DBConnection.connection();
		
		try {
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("INSERT INTO Info ()
			
		}
		
		
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
