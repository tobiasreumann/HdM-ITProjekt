package de.hdm.itprojekt.server.db;

import java.sql.*;
public class DBConnection {

	public static void main(String[] args) {
		
		try {
			Connection verbindung = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBName", "Name", "Passwort");
			
			Statement sqlStatement = verbindung.createStatement();
			
			//test
			
			
			
		}
		catch (Exception e){
			e.printStackTrace ();
		}
		
	}

}
