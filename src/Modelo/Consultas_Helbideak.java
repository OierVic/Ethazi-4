package Modelo;
import java.sql.*;

import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Controlador.Hotel;
import Controlador.Ostatu;

public class Consultas_Helbideak{
	
	public static void ArrayHelbide() {
		String[] helbideArray =new String[50];
	
		
		String helbidea;
		
		
		Connection Conexion = null;
		Statement s =null;
int i = 0;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"prueba","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT Helbidea FROM `hotel`");
			while (rs.next()) {
				helbidea = rs.getString("Helbidea");
				helbideArray[i] = helbidea;
				
				i++;
				//System.out.println(izena);

			}
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			e.getMessage();
		}
		
		
	}
	
	
	
	
	
	
	
}
		 
		
		
		
		

	
	
		
	

	

	








