package main;


// Baut eine Datenbankverbinung mit der lokalen Datenbank auf
// Singleton

import java.sql.*;

public class DataBase {
	
	
	//String url = "jdbc:mysql://mysql_parcelsize:3306/swta";
	//String url = "jdbc\:mysql\://localhost/swta?user\=root&password\=&useJDBCCompliantTimezoneShift\=true&useLegacyDatetimeCode\=false&serverTimezone\=UTC";
	//String url = "jdbc:mysql://localhost:3306/cicd?serverTimezone=UTC";
	String url = "jdbc:mysql://192.168.50.1/swta?user=root&password=&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	//String username = "";
	//String password = "";

	public static DataBase data;
	private static Connection con;

	private DataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//con = DriverManager.getConnection(url, username, password);
			con = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			con = null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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