package Eredua;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Kontrolatzailea.Apartamentua;

public class Kontsulta_Apartamentua {
	
	public static ArrayList <String> ApartamentuenHelbideakIkusi() {
		ArrayList <String> Helbideak = new ArrayList<String>();
		String helbideak=null;
		
		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT distinct helbideApartemetu FROM apartamentu");
			while (rs.next()) {
				helbideak = rs.getString("helbideApartemetu");
				Helbideak.add(helbideak);
				
			}
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Helbideak;
		
	}
	
	public static ArrayList <Apartamentua> ApartamentuakHelbidearekinAtera(String helbideaHartu) {
		
		ArrayList <Apartamentua> apartamentu2 = new ArrayList<Apartamentua>();
		int idApartamentu=0;
		String izenaApartamentu=null;

		double prezioaApartamentu;
		String helbideApartamentu=null;
		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT idApartamentu,izenaApartamentu,prezioaApartamentu,helbideApartamentu FROM apartamentu where helbideApartamentu='"+helbideaHartu+"'");
			while (rs.next()) {
				idApartamentu = rs.getInt("idApartamentu");
				izenaApartamentu = rs.getString("izenaApartamentu");
				prezioaApartamentu = rs.getDouble("prezioaApartamentu");
				helbideApartamentu = rs.getString("helbideApartamentu");
				Apartamentua a1 = new Apartamentua(idApartamentu, izenaApartamentu, prezioaApartamentu, helbideApartamentu);
				apartamentu2.add(a1);

			}
			
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return apartamentu2;
		
		
	}

}
