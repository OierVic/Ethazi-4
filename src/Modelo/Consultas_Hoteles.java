package Modelo;
import java.sql.*;
import java.util.ArrayList;

import Controlador.Hotel;

public class Consultas_Hoteles{
	

	public static ArrayList<Hotel> Select_Hotel(){
		ArrayList <Hotel> hotelak = new ArrayList<Hotel>();
		int idHotela;
		int logelaKopurua;
		String hotelIzena;
		Double prezioHotela;
		int izarKopuru;
		int logelahartuta;


		System.out.println("X --------------------------------------------" );
		Connection conexion = Conexion.getConexion();	
		try {

			Statement s = conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs


			String queryL = "SELECT o.idOstatu, logelaOkupatuta, izarKopurua, prezioHotel, o.izenOstatu, logelaKopurua FROM hotel h, ostatu o WHERE o.idOstatu = h.idOstatu";

			ResultSet rs = s.executeQuery(queryL);

			System.out.println("X --------------------------------------------" );  

			while (rs.next()) {

				System.out.println("(1).o.idOstatu: "+rs.getString("o.idOstatu")+ " "+"(2).logelaKopurua: "+ " " +rs.getString("logelaKopurua")+ " " +"(3).izarKopurua: "+rs.getString("izarKopurua")+ " " +"(4).prezioHotel: " + rs.getString("prezioHotel")+" "+ "(5).izenOstatu: " + rs.getString("izenOstatu")+" "+ "6.logelaOkupatuta: " + rs.getString("logelaOkupatuta"));
				idHotela=(rs.getInt(1));
				logelaKopurua=(rs.getInt(2));
				izarKopuru=(rs.getInt(3));
				prezioHotela=(rs.getDouble(4));
				hotelIzena=(rs.getString(5));
				logelahartuta=(rs.getInt(6));

				Hotel h1 = new Hotel(idHotela,logelaKopurua, izarKopuru, prezioHotela,hotelIzena, logelahartuta);
				hotelak.add(h1);
				
				//System.out.println(h1);
				

			}


		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		return hotelak;
		
	}
}
		 
		
		
		
		

	
	
		
	

	

	








