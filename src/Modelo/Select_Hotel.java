package Modelo;
import java.sql.*;
import java.util.ArrayList;

public class Select_Hotel{
	

	public static void Select_Hotel(){
		
			Connection conexion = Conexion.getConexion();	
		try {
		
		Statement s = conexion.createStatement();
       
        // Se realiza la consulta. Los resultados se guardan en el ResultSet rs

       
        String queryL = "SELECT izena FROM hotel";

        ResultSet rs = s.executeQuery(queryL);
              
                
       
       while (rs.next()) {
        	
        	 System.out.println("Izena: "+rs.getString("nombre"));
       

          
        }
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        
	}
		
		
	}
}
		 
		
		
		
		

	
	
		
	

	

	







