package de.hdm.itprojekt.server.db;


import java.sql.*;
import java.util.Vector;

import org.eclipse.jdt.internal.core.DeleteElementsOperation;

import de.hdm.itprojekt.shared.bo.Profil;



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

	
	
	//Alle Profile ausgeben
	public Vector<Profil> getAlleProfile() {
		Connection con = DBConnection.connection();
		
		Vector<Profil> result = new Vector<Profil>();
		
		try {
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECCT ID, Name, Vorname"
											+ "FROM Profile"
											+ "ORDER BY Nachname");
			
			//Für jedes Ergebnis wird ein Profil-Objekt erstellt
			while (rs.next()) {
				Profil p = new Profil();
				p.setId(rs.getInt("ID"));
				p.setName(rs.getString("Name"));
				p.setVorname(rs.getString("Vorname"));
				
				//Objekte werden in Vector hinzugefügt
				result.addElement(p);
				
			}
		}
		catch (SQLException e2) {
			e2.printStackTrace();
			return null;
		}
		//Ergebnisvektor wird zurückgegeben
		return result;
	}
	

	//Profil anhand der ID ausgeben
	public Profil getProfilByID(int id) {
		//DB Verbindung holen
		Connection con = DBConnection.connection();
		
		try {
			//Leeres SQL Statement
			Statement stmt = con.createStatement();
			//Statement als Query an die DB schicken
			ResultSet rs = stmt.executeQuery("SELECCT ID, Name, Vorname"
											+ "FROM Profile"
											+ "Where ID = id"
											+ "ORDER BY Nachname");
			
			if (rs.next()) {
				//Tupel in Objekt umwandeln
				Profil p = new Profil();
				p.setId(rs.getInt("ID"));
				p.setGeburtsdatum(rs.getDate("Geburtsdatum"));
				p.setGeschlecht(rs.getString("Geschlecht"));
				p.setHaarfarbe(rs.getString("Haarfarbe"));
				p.setGroesse(rs.getInt("Koerpergroesse"));
				p.setName(rs.getString("Name"));
				p.setVorname(rs.getString("Vorname"));
				p.setReligion(rs.getString("Religion"));
				p.setRaucher(rs.getBoolean("Raucher"));
				return p;
				
			}
		}
		catch (SQLException e2) {
			e2.printStackTrace();
			return null;
		}
		
		return null;
	}

	
	
	
	//Profil anhand des Nachnamen ausgeben
	public Profil getProfilByName(String Name) {
		//DB Verbindung holen
		Connection con = DBConnection.connection();
		
		try {
			//Leeres SQL Statement
			Statement stmt = con.createStatement();
			//Statement als Query an die DB schicken
			ResultSet rs = stmt.executeQuery("SELECCT ID, Name, Vorname, Alter..."
											+ "FROM Profile"
											+ "Where ID = id"
											+ "ORDER BY Nachname");
			
			if (rs.next()) {
				//Tupel in Objekt umwandeln
				Profil p = new Profil();
				p.setId(rs.getInt("ID"));
				p.setGeburtsdatum(rs.getDate("Geburtsdatum"));
				p.setGeschlecht(rs.getString("Geschlecht"));
				p.setHaarfarbe(rs.getString("Haarfarbe"));
				p.setGroesse(rs.getInt("Koerpergroesse"));
				p.setName(rs.getString("Name"));
				p.setVorname(rs.getString("Vorname"));
				p.setReligion(rs.getString("Religion"));
				p.setRaucher(rs.getBoolean("Raucher"));
				return p;
				
			}
		}
		catch (SQLException e2) {
			e2.printStackTrace();
			return null;
		}
		
		return null;
	}
	
	
	
	
	public Profil anlegen(Profil p) {
		Connection con = DBConnection.connection();
		
		try {
			//Leeres SQL Statement
			Statement stmt = con.createStatement();
			
			//Aktuell höchsten Primaerschluesselwert identifizieren
			ResultSet rs = stmt.executeQuery("SELECT MAX ID AS maxid FROM Profile");
					
					if (rs.next()) {
						//Maximaler Wert wird um 1 erhöht
						p.setId(rs.getInt("maxid")+1);
						
					stmt = con.createStatement();
					
					//Hier erfolgt das Einfügen in die DB
					stmt.executeUpdate("INSERT INTO Profile (ID, Nachname, Vorname... ");
					}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
			
		return p;
	}

	
	
	
	//Nutzer-Objekt aus DB loeschen
	public void loeschen(Profil p) {
		Connection con = DBConnection.connection();
		
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate("DELETE FROM Profile WHERE ID = "+ p.getId());
		}
		catch (SQLException e2) {
			e2.printStackTrace();
		}
	
		
	}

	public Profil bearbeiten(Profil p) {
		Connection con = DBConnection.connection();
		
		try {
			Statement stmt = con.createStatement();
			stmt.executeQuery("UPDATE Profile SET"
					+ "Name='"+p.getName()+"'" 
					+ "Vorname='"+p.getVorname()+"'"
					+ "Geschlecht='"+p.getGeschlecht()+"'"
					+ "Haarfarbe='"+p.getHaarfarbe()+"'"
					+ "Koerpergroesse='"+p.getGroesse()+"'"
					+ "Geburtsdatum='"+p.getGeburtsdatum()+"'"
					+ "Religion='"+p.getReligion()+"'"
					+ "WHERE ID="+p.getId());			
		}
		catch (SQLException e2) {
			e2.printStackTrace();
		}
		
		return p;
	}
	
	
	

	
	

}
