package de.hdm.itprojekt.server.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import de.hdm.itprojekt.shared.bo.Merkzettel;
import de.hdm.itprojekt.shared.bo.Profil;

public class MerkzettelMapper {
	private static MerkzettelMapper merkzettelMapper = null;
	
	protected MerkzettelMapper(){
	}
	
	public static MerkzettelMapper merkzettelMapper() {
		if(merkzettelMapper == null){
			merkzettelMapper = new MerkzettelMapper();
		}
		return merkzettelMapper;
	}




	public Merkzettel anlegen(Profil p) {
		// TODO Auto-generated method stub
		// TODO SQL Stmt um Merkzettel in die DB zu speichern
		return null;
	}


	public void hinzufuegen(Profil p, Profil vp) {
		Connection con = DBConnection.connection();
		
		try {
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("INSERT INTO Merkzettel (Vermerktes_Profil_ID, Profil_ID) VALUES ("+p.getId()+", "+vp.getId()+"))");
			
//			ResultSet rs = stmt.executeQuery("SELECT Profil_ID FROM Merkzettel WHERE ID = "+p.getId()+")");
//			
//			
//			For (int z, z<)
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		return vp;
	}

	public void entfernen(Profil p, Profil vp) {
		Connection con = DBConnection.connection();
		
		try {
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("DELETE FROM Merkzettel WHERE Vermerktes_Profil_ID = "+vp.getId()+", Profil_ID = "+p.getId()+")");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void alleEntfernen(Profil p) {
		Connection con = DBConnection.connection();
		
		try {
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("DELETE FROM Merkzettel WHERE ID = "+p.getId()+")");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


		//Alle Profile ausgeben
		public Vector<Profil> getProfileFromMerkzettel(Profil p) {
			Connection con = DBConnection.connection();
			
			Vector<Profil> result = new Vector<Profil>();
			
			try {
				Statement stmt = con.createStatement();
				
				
				
				ResultSet rs = stmt.executeQuery("SELECT Name, Vorname"
												+ "FROM Merkzettel JOIN Profil"
												+ "WHERE Profil_ID = "+p.getId()+")");
				
				//Für jedes Ergebnis wird ein Profil-Objekt erstellt
				while (rs.next()) {
					Profil a = new Profil();
					a.setId(rs.getInt("ID"));
					a.setName(rs.getString("Name"));
					a.setVorname(rs.getString("Vorname"));
					
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



	
	
	//TODO Methode hinzufuegen(Profil p) um ein Profil einem Merkzettel hinzuzufuegen
	
	//TODO Methode loeschen(Merkzettel m)
	
	//TODO getByID(id)

}
