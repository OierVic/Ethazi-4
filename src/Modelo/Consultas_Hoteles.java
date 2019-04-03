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


			String queryL = "SELECT o.idOstatu, o.izenOstatu, logelaKopurua, izarKopurua, prezioHotel, izenOstatu,logelaOkupatuta FROM hotel h, ostatu o WHERE o.idOstatu = h.idOstatu";

			ResultSet rs = s.executeQuery(queryL);

			System.out.println("X --------------------------------------------" );  

			while (rs.next()) {

				System.out.println("o.idOstatu: "+rs.getString("o.idOstatu")+ " "+"logelaKopurua: "+ " " +rs.getString("logelaKopurua")+ " " +"izarKopuru: "+rs.getString("izarKopuru")+ " " +"prezioHotel: " + rs.getString("prezioHotel")+" "+ "izenOstatu: " + rs.getString("izenOstatu"));
				idHotela=(rs.getInt(1));
				hotelIzena=(rs.getString(2));
				logelaKopurua=(rs.getInt(3));
				izarKopuru=(rs.getInt(4));
				prezioHotela=(rs.getDouble(5));
				logelahartuta=(rs.getInt(6));

				Hotel h1 = new Hotel(idHotela, hotelIzena, izarKopuru, prezioHotela, logelahartuta, logelaKopurua);
				hotelak.add(h1);

			}


		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		return hotelak;
		
	}
}
		 
		
		
		
		

	
	
		
	

	

	








