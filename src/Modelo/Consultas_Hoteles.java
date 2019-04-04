package Modelo;
import java.sql.*; 

import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Controlador.Hotel;

public class Consultas_Hoteles{
	
	public static ArrayList <Hotel> HotelakIkusi() {
		ArrayList <Hotel> hotelak = new ArrayList<Hotel>();
		int idHotela=0;
		String hotelIzena=null;
		int logelaKopurua=0;
		int HartutakoLogelak=0;
		int izarKopurua=0;
		Double prezioHotel=null;
		int PostaKodeaHotel=0;
		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT idHotel,izenaHotel,logelaKopurua,HartutakoLogelak,izarKopurua,prezioHotel,PostaKodeaHotel FROM hotel");
			while (rs.next()) {
				idHotela = rs.getInt("idHotel");
				hotelIzena = rs.getString("izenaHotel");
				logelaKopurua = rs.getInt("logelaKopurua");
				HartutakoLogelak = rs.getInt("HartutakoLogelak");
				izarKopurua = rs.getInt("izarKopurua");
				prezioHotel = rs.getDouble("prezioHotel");
				PostaKodeaHotel = rs.getInt("PostaKodeaHotel");
				Hotel h1 = new Hotel(idHotela, hotelIzena, logelaKopurua, HartutakoLogelak, izarKopurua, prezioHotel,PostaKodeaHotel);
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
	
	
	
	
	
	
	
}
		 
		
		
		
		

	
	
		
	

	

	








