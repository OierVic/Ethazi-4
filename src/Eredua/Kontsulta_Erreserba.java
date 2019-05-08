package Eredua;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Kontrolatzailea.Erreserba;

public class Kontsulta_Erreserba {
	
	
	public static void InsertErreserba(Erreserba e1) {
		
		Connection Conexion1 = null;
		
		Statement s1 =null;
		
		try {

			Conexion1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");

			s1 = (Statement) Conexion1.createStatement();

			//s1.executeUpdate("INSERT INTO `erreserba` (`idErreserba`, `idOstatu`, `idBezero`, `dataJoan`, `dataEtorri`, `prezioErreserba`, `1sinp`, `2sinp`, `1bik`, `1sinp1bik`, `sehaska`, `erosketaData`, `erosketaOrdua`) VALUES (null,"+ e1.getIdOstatu()+",'"+e1.getIdBezero()+"',"+e1.getDataJoan()+", "+e1.getDataEtorri()+", "+e1.getPrecio()+", "+e1.getSinp()+", "+e1.getBisinp()+", "+e1.getBik()+", "+e1.getSinpbik()+", "+e1.getSehaska()+", "+e1.getEskatutakodata()+", "+e1.getEskatutakoOrdua()+")");
			s1.executeUpdate("INSERT INTO `erreserba` (`idErreserba`, `idOstatu`, `idBezero`, `dataJoan`, `dataEtorri`, `prezioErreserba`, `1sinp`, `2sinp`, `1bik`, `1sinp1bik`, `sehaska`, `erosketaData`, `erosketaOrdua`) VALUES (NULL, '"+e1.getIdOstatu()+"', '"+e1.getIdBezero()+"', '"+e1.getDataJoan()+"', '"+e1.getDataEtorri()+"', '"+e1.getPrecio()+"', '"+e1.getSinp()+"', '"+e1.getBisinp()+"', '"+e1.getBik()+"', '"+e1.getSinpbik()+"', '"+e1.getSehaska()+"', '"+e1.getEskatutakodata()+"', '"+e1.getEskatutakoOrdua()+"')"      );
			s1.close();

			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			e.getMessage();
		}
	}

	//INSERT INTO `erreserba` (`idErreserba`, `idOstatu`, `idBezero`, `dataJoan`, `dataEtorri`, `prezioErreserba`, `1sinp`, `2sinp`, `1bik`, `1sinp1bik`, `sehaska`, `erosketaData`, `erosketaOrdua`) VALUES (NULL, '1', '12345578Z', '2019-05-05', '2019-05-10', '56', '1', '2', '2', '0', '0', '2019-05-08', '00:00');
}
