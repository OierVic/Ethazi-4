package Eredua;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Kontrolatzailea.Erreserba;

public class Kontsulta_Erreserba {
	
	
	public static void InsertErreserba(Erreserba e1) {
		
		Connection Conexion = null;
		
		Statement s =null;
		
		try {

			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");

			s = (Statement) Conexion.createStatement();

			s.executeUpdate("INSERT INTO `erreserba`(`idOstatu`, `idBezero`, `dataJoan`, `dataEtorri`, `nagusiKopuru`, `umeKopuru`) VALUES (1,'534534D','423-423-422','533-453-453',645,53)");
			s.close();

			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			e.getMessage();
		}
	}
	//INSERT INTO `erreserba`(`idOstatu`, `idBezero`, `dataJoan`, `dataEtorri`, `nagusiKopuru`, `umeKopuru`) VALUES (1,'534534D','423-423-422','533-453-453',645,53)
//	"INSERT INTO 'erreserba' (`idOstatu`, `idBezero`, `dataJoan`, `dataEtorri`, `nagusiKopuru`, `umeKopuru`)"
//	+ " VALUES (`"+e1.getIdOstatu()+"`, `"+e1.getIdBezero()+"`, `"+e1.getDataJoan()+"`, `"+e1.getDataEtorri()+"`, `"+e1.getNagusiKopuru()+"`, `"+e1.getUmekopuru()+"`)"
	// INSERT INTO `erreserba`(`idOstatu`, `idBezero`, `dataJoan`, `dataEtorri`, `nagusiKopuru`, `umeKopuru`) VALUES (1,'534534D','423-423-422','533-453-453',645,53)
}
