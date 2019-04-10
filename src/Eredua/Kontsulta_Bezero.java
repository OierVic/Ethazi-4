package Eredua;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Kontrolatzailea.Bezero;

public class Kontsulta_Bezero {
	public static ArrayList <Bezero> BezeroakIkusi() {
		ArrayList <Bezero> bezeroak = new ArrayList<Bezero>();
		int idBezero=0;
		String izenBezero = null;
		String abizenBezero = null;
		int tlfBezero = 0;
		String postaBezero = null;		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT idBezero, izenBezero, abizenBezero, telefBezero, postaBezero FROM bezero");
			while (rs.next()) {
				idBezero = rs.getInt("idBezero");
				izenBezero = rs.getString("izenBezero");
				abizenBezero = rs.getString("abizenBezero");
				tlfBezero = rs.getInt("telefBezero");
				postaBezero = rs.getString("postaBezero");
				Bezero b1 = new Bezero(tlfBezero, postaBezero, postaBezero, tlfBezero, postaBezero);
				bezeroak.add(b1);
				System.out.println(b1);

			}
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			e.getMessage();
		}
		return bezeroak;
		
	}
}