package Eredua;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

public class Konsulta_jaiegunak {
	
	public static ArrayList <Date> JaiegunakAtera() {
		ArrayList <Date> jaiegunak = new ArrayList<Date>();
		Date jaieguna=null;
		
		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT jaiEguna FROM jaiegunak");
			while (rs.next()) {
				jaieguna = rs.getDate("jaiEguna");
				jaiegunak.add(jaieguna);
				
			}
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return jaiegunak;
		
	}
	
	
	
	
	
	

}
