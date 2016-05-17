package de.hdm.itprojekt.server.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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


		public Profil getSuchprofilByID(int id) {
			//DB Verbindung holen
			Connection con = DBConnection.connection();
			
			try {
				//Leeres SQL Statement
				Statement stmt = con.createStatement();
				//Statement als Query an die DB schicken
				ResultSet rs = stmt.executeQuery("SELECT ID, "
												+ "FROM Profile"
												+ "Where ID = id"
												+ "ORDER BY Nachname");
				
				if (rs.next()) {
					//Tupel in Objekt umwandeln
					Suchprofil sp = new Profil();
					sp.setId(rs.getInt("ID"));
					sp.setGeburtsdatum(rs.getDate("Geburtsdatum"));
					sp.setGeschlecht(rs.getString("Geschlecht"));
					sp.setHaarfarbe(rs.getString("Haarfarbe"));
					sp.setKoerpergroesse(rs.getInt("Koerpergroesse"));
					sp.setAlterMin(rs.getInt("AlterMin"));
					sp.setAlterMin(rs.getInt("AlterMax"));
					sp.setReligion(rs.getString("Religion"));
					sp.setRaucher(rs.getBoolean("Raucher"));
					return sp;
					
				}
			}
			catch (SQLException e2) {
				e2.printStackTrace();
				return null;
			}
			
			return null;
		}
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
