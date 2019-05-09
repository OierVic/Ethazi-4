package Eredua;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Kontrolatzailea.Erreserba;

public class Kontsulta_Erreserba {
	
	
	public static void InsertErreserba(Erreserba e1) {
		
		Connection Conexion1 = null;
		
		Statement s1 =null;
		
		try {

			Conexion1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");

			s1 = (Statement) Conexion1.createStatement();

			s1.executeUpdate("INSERT INTO `erreserba` (`idErreserba`, `idOstatu`, `idBezero`, `dataJoan`, `dataEtorri`, `prezioErreserba`, `1sinp`, `2sinp`, `1bik`, `1sinp1bik`, `sehaska`, `erosketaData`, `erosketaOrdua`,`logelaKopuru`) VALUES (NULL, '"+e1.getIdOstatu()+"', '"+e1.getIdBezero()+"', '"+e1.getDataJoan()+"', '"+e1.getDataEtorri()+"', '"+e1.getPrecio()+"', '"+e1.getSinp()+"', '"+e1.getBisinp()+"', '"+e1.getBik()+"', '"+e1.getSinpbik()+"', '"+e1.getSehaska()+"', '"+e1.getEskatutakodata()+"', '"+e1.getEskatutakoOrdua()+"',"+e1.getlogelaKopurua()+")");
			s1.close();

			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int idErreserbaAtera(int idOstatu) {
		int idErreserba=0; 
		
		Connection Conexion = null;
		Statement s =null;

		try {
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT max(idErreserba) FROM erreserba where idOstatu = '"+idOstatu+"'");
			while (rs.next()) {
				idErreserba = rs.getInt("max(idErreserba)");
				
			}
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return idErreserba;
	}
	
	public static int logaletotalaDatuBaseanErreserban(int idOstatu) {
		int logaletotala=0; 
		
		Connection Conexion = null;
		Statement s =null;

		try {
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT SUM(logelaKopuru) from erreserba where idOstatu='"+idOstatu+"'");
			while (rs.next()) {
				logaletotala = rs.getInt("SUM(logelaKopuru)");
				
			}
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return logaletotala;
	}

	//INSERT INTO `erreserba` (`idErreserba`, `idOstatu`, `idBezero`, `dataJoan`, `dataEtorri`, `prezioErreserba`, `1sinp`, `2sinp`, `1bik`, `1sinp1bik`, `sehaska`, `erosketaData`, `erosketaOrdua`) VALUES (NULL, '1', '12345578Z', '2019-05-05', '2019-05-10', '56', '1', '2', '2', '0', '0', '2019-05-08', '00:00');
}
