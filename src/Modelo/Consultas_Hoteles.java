package Modelo;
import java.sql.*;

import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Controlador.Hotel;

public class Consultas_Hoteles{
	

//	public static ArrayList<Hotel> HotelakIkusi(){
//		ArrayList <Hotel> hotelak = new ArrayList<Hotel>();
//		int idHotela=0;
//		int logelaKopurua=0;
//		String hotelIzena=null;
//		Double prezioHotela=null;
//		int izarKopuru=0;
//		int logelahartuta=0;
//
//
//		Connection conexion = Conexion.getConexion();	
//		try {
//
//			Statement s = conexion.createStatement();
//
//			String queryL = "SELECT o.idOstatu, o.izenOstatu, logelaKopurua, izarKopurua, prezioHotel, o.izenOstatu,logelaOkupatuta FROM hotel h, ostatu o WHERE o.idOstatu = h.idOstatu";
//
//			ResultSet rs = s.executeQuery(queryL);
//
//			System.out.println("X --------------------------------------------" );  
//
//			while (rs.next()) {
//
//				System.out.println("(1).o.idOstatu: "+rs.getString("o.idOstatu")+ " "+"(2).logelaKopurua: "+ " " +rs.getString("logelaKopurua")+ " " +"(3).izarKopurua: "+rs.getString("izarKopurua")+ " " +"(4).prezioHotel: " + rs.getString("prezioHotel")+" "+ "(5).izenOstatu: " + rs.getString("izenOstatu")+" "+ "6.logelaOkupatuta: " + rs.getString("logelaOkupatuta"));
//				idHotela=(rs.getInt(1));
//				//logelaKopurua=(rs.getInt(2));
//				izarKopuru=(rs.getInt(3));
//				prezioHotela=(rs.getDouble(4));
//				hotelIzena=(rs.getString(5));
//				//logelahartuta=(rs.getInt(6));
//
//				//Hotel h1 = new Hotel(idHotela, hotelIzena, izarKopuru, prezioHotela, logelahartuta, logelaKopurua);
//				//hotelak.add(h1);
//
//			}
//
//
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//
//		}
//		return hotelak;
//		
//	}
	
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

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT idHotel,izenHotel,logelaKopurua,HartutakoLogelak,izarKopurua,prezioHotel,PostaKodeaHotel FROM hotel");
			while (rs.next()) {
				idHotela = rs.getInt("idHotel");
				hotelIzena = rs.getString("izenHotel");
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
		 
		
		
		
		

	
	
		
	

	

	








