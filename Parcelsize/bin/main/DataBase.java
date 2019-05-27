package main.java;


// Baut eine Datenbankverbinung mit der lokalen Datenbank auf
// Singleton

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	
	
	String url = "jdbc:mysql://mysql_parcelsize:3306/swta";
	String username = "myuser";
	String password = "mypass";

	public static DataBase data;
	private static Connection con;

	private DataBase() {
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			con = null;
		}
	
	}

/**
 * opens a new database connection, if a connection 
 * already exists the method returns the existing one
 * @return DataBase con
 */
	public static Connection openConnection() {
		if (data == null) {
			data = new DataBase();
		}
		return con;
	}
	
/**
 * closes the database connection	
 */
	public static void close(){
		if(data != null){
			try{
			con.close();
			data = null;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}