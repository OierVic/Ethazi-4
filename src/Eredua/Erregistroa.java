package Eredua;

import java.sql.DriverManager;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Kontrolatzailea.Erabiltzaile;



public class Erregistroa {		
public static  void Erabiltzailea_erregistratu() {	
	System.out.println("Entra en el metodo de bd");
	Erabiltzaile h1 = Erabiltzaile.erregistratu();
	System.out.println("Sale del metodo para introducir datos y el resultado es: " + h1.getNan());
Connection Conexion = null;
Statement s =null;
try {

	Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");

	s = (Statement) Conexion.createStatement();

	s.executeUpdate("INSERT INTO bezero VALUES('" + h1.getNan() + "', '" + h1.getPasahitza() + "', '" + h1.getErabil_Izena() + "', '" + h1.getErabil_Abizenak() + "', '" + h1.getTeleBezero() + "',  '" + h1.getPostaBezero() + "', '" + h1.getJaiotzeData() + "')");
	s.close();

	System.out.println("Conexioa eginda");
}catch(Exception e) {
	e.getMessage();
}
}
}


	
	
		
	

	

	







