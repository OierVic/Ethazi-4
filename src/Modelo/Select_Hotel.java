package Modelo;
import java.sql.*;
import java.util.ArrayList;

public class Select_Hotel{
	

	public static void Select_Hotel(){
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
		 
		
		
		
		

	
	
		
	

	

	







