package Eredua;
import java.sql.*; 

import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Kontrolatzailea.Hotel;

public class Kontsulta_Hoteles{
	
	public static ArrayList <Hotel> HotelakIkusi() {
		ArrayList <Hotel> hotelak = new ArrayList<Hotel>();
		int idHotela=0;
		String hotelIzena=null;
		int logelaKopurua=0;
		int HartutakoLogelak=0;
		int izarKopurua=0;
		Double prezioHotel=null;
		String Helbidea=null;
		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT idHotel,izenaHotel,logelaKopurua,HartutakoLogelak,izarKopurua,prezioHotel,helbideHotel FROM hotel");
			while (rs.next()) {
				idHotela = rs.getInt("idHotel");
				hotelIzena = rs.getString("izenaHotel");
				logelaKopurua = rs.getInt("logelaKopurua");
				HartutakoLogelak = rs.getInt("HartutakoLogelak");
				izarKopurua = rs.getInt("izarKopurua");
				prezioHotel = rs.getDouble("prezioHotel");
				Helbidea = rs.getString("helbideHotel");
				Hotel h1 = new Hotel(idHotela, hotelIzena, logelaKopurua, HartutakoLogelak, izarKopurua, prezioHotel,Helbidea);
				hotelak.add(h1);
				//System.out.println(izena);

			}
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			e.getMessage();
		}
		return hotelak;
		
	}
	
	public static ArrayList <String> HelbideakIkusi() {
		ArrayList <String> Helbideak = new ArrayList<String>();
		String helbideak=null;
		
		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT helbideHotel FROM hotel group by helbideHotel");
			while (rs.next()) {
				helbideak = rs.getString("helbideHotel");
				Helbideak.add(helbideak);
				
			}
			System.out.println();
			System.out.println("Conexioa eginda2");
		}catch(Exception e) {
			e.getMessage();
		}
		return Helbideak;
		
	}
	
	public static ArrayList <Hotel> HotelakHelbidearekinAtera(String helbideaHartu) {
		ArrayList <Hotel> hotelak2 = new ArrayList<Hotel>();
		int idHotela=0;
		String hotelIzena=null;
		int logelaKopurua=0;
		int HartutakoLogelak=0;
		int izarKopurua=0;
		Double prezioHotel=null;
		String Helbidea=null;
		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT idHotel,izenaHotel,logelaKopurua,HartutakoLogelak,izarKopurua,prezioHotel,helbideHotel FROM hotel where helbideHotel='"+helbideaHartu+"'");
			while (rs.next()) {
				idHotela = rs.getInt("idHotel");
				hotelIzena = rs.getString("izenaHotel");
				logelaKopurua = rs.getInt("logelaKopurua");
				HartutakoLogelak = rs.getInt("HartutakoLogelak");
				izarKopurua = rs.getInt("izarKopurua");
				prezioHotel = rs.getDouble("prezioHotel");
				Helbidea = rs.getString("helbideHotel");
				Hotel h1 = new Hotel(idHotela, hotelIzena, logelaKopurua, HartutakoLogelak, izarKopurua, prezioHotel,Helbidea);
				hotelak2.add(h1);
				//System.out.println(izena);

			}
			for (int i = 0; i < hotelak2.size(); i++) {
				hotelak2.get(i);
			}
			
			
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			e.getMessage();
		}
		return hotelak2;
		
		
	}
	
	
	
	
	
	
}