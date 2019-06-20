package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Parcel {
	
	private int length;
	private int width;
	private int height;
	private String size;
	
	public Parcel() {
		
	}
	
	public Parcel(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	
	public Parcel(int length, int width, int height, String size) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.size = size;
	}
	
	public void calculateSize() {
		int gurtmaß = 1 * this.length + 2 * this.width + 2 * this.height;
		System.out.println(gurtmaß);
		// open database connection
		try {
			//System.out.println("Bin jetzt bei database connection");
			Connection con = DataBase.openConnection();
			//System.out.println("Verbindung aufgebaut");
			Statement stmt = con.createStatement();
			//System.out.println("Create Statement ausgeführt");
			ResultSet rs = stmt.executeQuery("SELECT id, size, min_size, max_size " + "FROM packagesize "
					+ "WHERE min_size < '" + gurtmaß + "'" + "AND max_size >= '" + gurtmaß + "'");
			//System.out.println("rs "+rs);
			while (rs.next()) {
				System.out.println(rs.getString("size"));
				this.size = rs.getString("size");
			}
			
			/*PreparedStatement ps = con.prepareStatement("SELECT id, size, min_size, max_size " + "FROM packagesize "
					+ "WHERE min_size < '" + gurtmaß + "'" + "AND max_size >= '" + gurtmaß + "'");
			//ps.setInt(1, gurtmaß);
            ResultSet result = ps.executeQuery();
            System.out.println("result="+result);
            //result.next();
            this.size = result.getString(1);*/
		
		} catch (Exception e) {
			System.out.println("DB-Fehler!" +e.getMessage());
		}
}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}