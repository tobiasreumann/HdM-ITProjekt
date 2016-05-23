package de.hdm.itprojekt.server.db;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import de.hdm.itprojekt.shared.bo.Info;
import de.hdm.itprojekt.shared.bo.Profil;


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
			
			//Aktuell höchsten Primaerschluesselwert identifizieren
			ResultSet rs = stmt.executeQuery("SELECT MAX ID AS maxid FROM Info");
					
					if (rs.next()) {
						//Maximaler Wert wird um 1 erhöht
						i.setId(rs.getInt("maxid")+1);
						
			stmt = con.createStatement();
			
			stmt.executeUpdate("INSERT INTO Info (INFO_ID, Profil_ID) "
								+ "VALUES ("
								+ i.getId()+", "
								+i.getWert()+", "
								+p.getId()+")");
					}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return i;
	}

	public void loeschen(Info i) {
		
			Connection con = DBConnection.connection();
			
			try {
				Statement stmt = con.createStatement();
				stmt.executeUpdate("DELETE FROM Info WHERE ID = "+ i.getId());
			}
			catch (SQLException e2) {
				e2.printStackTrace();
			}
	}

	
	public Info bearbeiten(Info i) {
		Connection con = DBConnection.connection();
		
		try {
			Statement stmt = con.createStatement();
			stmt.executeQuery("UPDATE Profile SET"
					+ "ID='"+i.getId()+"'" 
					+ "Wert='"+i.getWert()+"'"
					+")");
		}
		catch (SQLException e2) {
			e2.printStackTrace();
		}
		
		return i;
	}
}
