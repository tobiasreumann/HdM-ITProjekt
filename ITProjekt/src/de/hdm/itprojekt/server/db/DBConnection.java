package de.hdm.itprojekt.server.db;
 
import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	
	private static Connection con = null;
	private static String url = "jdbc:mysql://localhost:3306/Angestellte";
	private static String user = "root";
	private static String password = "";


		
		public static Connection connection() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url+","+user+","+password);
			
			
			
			
			
		}
		catch (Exception e){
			e.printStackTrace ();
		}
		return con;
		
	}

}
