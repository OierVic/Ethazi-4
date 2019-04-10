package Eredua;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Kontrolatzailea.Bezero;
import Kontrolatzailea.ErabiltzaileaIgo;



public class Konsulta_Erregistro {
	
	
	public static void Erabiltzailea_erregistratu(ErabiltzaileaIgo e1) {
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("INSERT INTO bezero (idBezero,pasahitzaBezero,izenBezero,abizenBezero,telefBezero,postaBezero,jaiotzeData)"
					+ "VALUES('" + e1.getNan() + "', '" + e1.getPasahitza() + "', '" + e1.getErabil_Izena() + "', '" + e1.getErabil_Abizenak() + "', '" + e1.getTelefonoa() + "',  '" + e1.getPostaBezero() + "', '" + e1.getJaiotzeData() + "')");
			
			System.out.println();
			System.out.println("Conexioa eginda");
			
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
	
	
	
	
}