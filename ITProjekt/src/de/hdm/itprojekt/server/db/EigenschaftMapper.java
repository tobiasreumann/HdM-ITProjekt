package de.hdm.itprojekt.server.db;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import de.hdm.itprojekt.shared.bo.Auswahl;
import de.hdm.itprojekt.shared.bo.Eigenschaft;
import de.hdm.itprojekt.shared.bo.Profil;

public class EigenschaftMapper {
private static EigenschaftMapper eigenschaftMapper = null;
	
	protected EigenschaftMapper(){
	}
	
	public static EigenschaftMapper eigenschaftMapper() {
		if(eigenschaftMapper == null){
			eigenschaftMapper = new EigenschaftMapper();
		}
		return eigenschaftMapper;
	}
	
	public Vector<Eigenschaft> getAlleEigenschaften() {
Connection con = DBConnection.connection();
		
		Vector<Eigenschaft> result = new Vector<Eigenschaft>();
		
		try {
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECCT ID, Bezeichnung"
											+ "FROM Eigenschaft"
											+ "ORDER BY Wert");
			
			
			while (rs.next()) {
				Eigenschaft e = new Eigenschaft();
				e.setId(rs.getInt("ID"));
				e.setBezeichnung(rs.getString("Bezeichnung"));
			
				result.addElement(e);
				
			}
		}
		catch (SQLException e2) {
			e2.printStackTrace();
			return null;
		}
	
		return result;
	}


	
	public void loeschen(Eigenschaft e) {
		Connection con = DBConnection.connection();
		
		try {
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("DELETE FROM Eigenschaft WHERE ID = "+e.getId()+")");
			
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
	}

	public Eigenschaft bearbeiten(Eigenschaft e) {
		Connection con = DBConnection.connection();
		
		try {
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("UPDATE Eigenschaft SET Bezeichnung = '"+e.getBezeichnung()+"')");
			
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
		return e;
	}

	

}
