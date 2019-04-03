package Modelo;
import java.sql.*;
import java.util.ArrayList;

import Controlador.Hotel;

public class Select_Hotel{
	

	public static void Select_Hotel(){
		
		ArrayList <Hotel> hotelak = new ArrayList<Hotel>();
		int idHotela;
		int logelaKopurua;
		String hotelIzena;
		Double prezioHotela;
		int izarKopuru;
		
		
		System.out.println("X --------------------------------------------" );
			Connection conexion = Conexion.getConexion();	
		try {
		
		Statement s = conexion.createStatement();
       
        // Se realiza la consulta. Los resultados se guardan en el ResultSet rs

       
        String queryL = "SELECT o.idOstatu, logelaKopuru, izarKopuru, prezioHotel, izenOstatu FROM hotel h, ostatu o WHERE o.idOstatu = h.idOstatu";

        ResultSet rs = s.executeQuery(queryL);
              
        System.out.println("X --------------------------------------------" );  
       
       while (rs.next()) {
    	 
        	 System.out.println("o.idOstatu: "+rs.getString("o.idOstatu")+ " "+"logelaKopuru: "+ " " +rs.getString("logelaKopuru")+ " " +"izarKopuru: "+rs.getString("izarKopuru")+ " " +"prezioHotel: " + rs.getString("prezioHotel")+" "+ "izenOstatu: " + rs.getString("izenOstatu"));
        	 idHotela=(rs.getInt(1));
				logelaKopurua=(rs.getInt(2));
				izarKopuru=(rs.getInt(3));
				prezioHotela=(rs.getDouble(4));
				hotelIzena=(rs.getString(5));
				
				Hotel h1 = new Hotel(idHotela, hotelIzena, izarKopuru, logelaKopurua, prezioHotela);
				hotelak.add(h1);
				
			

          
        }
        
       
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        
	}
//		public static ArrayList <Cliente> datosCliente() {
//
//			ArrayList <Cliente> arraycliente = new ArrayList<Cliente>();
//			PreparedStatement s=null;
//			Connection konexioa=Conexion.getConexion();
//
//			try {
//				s = konexioa.prepareStatement("select * from cliente");
//				ResultSet rs = s.executeQuery();
//				String dni;
//				String nombre;
//				String apellidos;
//				java.sql.Date fecha_nac;
//				String sexo;
//				String contraseña;
//				while (rs.next()) {
//					dni=(rs.getString(1));
//					nombre=(rs.getString(2));
//					apellidos=(rs.getString(3));
//					fecha_nac=(rs.getDate(4));
//					sexo=(rs.getString(5));
//					contraseña=(rs.getString(6));
//					Cliente cliente= new Cliente(dni, nombre, apellidos, fecha_nac, sexo, contraseña);
//					arraycliente.add(cliente);
//
//				}
//			}catch(Exception e) {e.getMessage();}
//			return arraycliente;
//		}
		
		
	}
}
		 
		
		
		
		

	
	
		
	

	

	







