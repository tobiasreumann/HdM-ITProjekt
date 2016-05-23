package de.hdm.itprojekt.server.db;

import java.util.Vector;
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


		public Suchprofil getSuchprofilByID(int id) {
			//DB Verbindung holen
			Connection con = DBConnection.connection();
			
			try {
				//Leeres SQL Statement
				Statement stmt = con.createStatement();
				//Statement als Query an die DB schicken
				ResultSet rs = stmt.executeQuery("SELECT * "
												+ "FROM Profile"
												+ "Where ID = id"
												+ "ORDER BY ID");
				
				if (rs.next()) {
					//Tupel in Objekt umwandeln
					Suchprofil sp = new Suchprofil();
					sp.setId(rs.getInt("ID"));
					
					sp.setGeschlechtAuswahl(rs.getString("Geschlecht"));
					sp.setHaarfarbeAuswahl(rs.getString("Haarfarbe"));
					sp.setAlterMin(rs.getInt("AlterMin"));
					sp.setAlterMin(rs.getInt("AlterMax"));
					sp.setRaucherAuswahl(rs.getBoolean("Raucher"));
					return sp;
					
				}
			}
			catch (SQLException e2) {
				e2.printStackTrace();
				return null;
			}
			
			return null;
		}
		
		
		public Vector<Suchprofil> getAlleSuchprofile(Profil p) {
			
				Connection con = DBConnection.connection();
				
				Vector<Suchprofil> result = new Vector<Suchprofil>();
				
				try {
					Statement stmt = con.createStatement();
					
					ResultSet rs = stmt.executeQuery("SELECCT ID, Name, Vorname"
													+ "FROM Profile"
													+ "ORDER BY Nachname");
					
					//Für jedes Ergebnis wird ein Profil-Objekt erstellt
					while (rs.next()) {
						Suchprofil sp = new Suchprofil();
						sp.setId(rs.getInt("ID"));
						sp.setGeschlechtAuswahl(rs.getString("Geschlecht"));
						sp.setHaarfarbeAuswahl(rs.getString("Haarfarbe"));
						sp.setAlterMin(rs.getInt("AlterMin"));
						sp.setAlterMin(rs.getInt("AlterMax"));
						sp.setRaucherAuswahl(rs.getBoolean("Raucher"));
						
						//Objekte werden in Vector hinzugefügt
						result.addElement(sp);
						
					}
				}
				catch (SQLException e2) {
					e2.printStackTrace();
					return null;
				}
				//Ergebnisvektor wird zurückgegeben
				return result;
			}

	

	//TODO insert()
	public Suchprofil anlegen(Suchprofil sp) {
		Connection con = DBConnection.connection();
		
		try {
			//Leeres SQL Statement
			Statement stmt = con.createStatement();
			
			//Aktuell höchsten Primaerschluesselwert identifizieren
			ResultSet rs = stmt.executeQuery("SELECT MAX(ID) AS maxid FROM Suchprofil");
					
					if (rs.next()) {
						//Maximaler Wert wird um 1 erhöht
						sp.setId(rs.getInt("maxid")+1);
						
					stmt = con.createStatement();
					
					//Hier erfolgt das Einfügen in die DB
					stmt.executeUpdate("INSERT INTO Suchprofil (ID, Geschlecht, Religion, Raucher, AlterMin, AlterMax, Haarfarbe)"
										+ "VALUES ("
										+sp.getId()+", '"
										+sp.getGeschlechtAuswahl()+"', '"
										+sp.isRaucherAuswahl()+"', "
										+sp.getHaarfarbeAuswahl()+"', "
										+sp.getAlterMin()+", "
										+sp.getAlterMax()+")"
										);
					}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
			
		return sp;
	}
	
	
	//Suchprofil aus DB loeschen
		public void loeschen(Suchprofil sp) {
			Connection con = DBConnection.connection();
			
			try {
				Statement stmt = con.createStatement();
				stmt.executeUpdate("DELETE FROM Suchprofil WHERE ID = "+ sp.getId()+")");
			}
			catch (SQLException e2) {
				e2.printStackTrace();
			}
		
			
		}
		
		

		public Suchprofil bearbeiten(Suchprofil sp) {
			Connection con = DBConnection.connection();
			
			try {
				Statement stmt = con.createStatement();
				
				stmt.executeQuery("UPDATE Suchrofil SET"
						+ "AlterMax='"+sp.getAlterMax()+", '" 
						+ "AlterMin='"+sp.getAlterMin()+", '"
						+ "Geschlecht='"+sp.getGeschlechtAuswahl()+", '"
						+ "Haarfarbe='"+sp.getHaarfarbeAuswahl()+", '"
						+ "Raucher="+sp.isRaucherAuswahl()+", "
						+ "WHERE ID="+sp.getId()+")");			
			}
			catch (SQLException e2) {
				e2.printStackTrace();
			}
			
			return sp;
		}
	
	
}
