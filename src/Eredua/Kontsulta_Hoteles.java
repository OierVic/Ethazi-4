package Eredua;
import java.sql.*; 

import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Ikuspegia.HotelakAukeratuLeihoa;
import Kontrolatzailea.Hotel;
import Kontrolatzailea.Metodoak;
import Kontrolatzailea.OheMotak;

public class Kontsulta_Hoteles{
	
	public static ArrayList <Hotel> HotelakIkusi() {
		ArrayList <Hotel> hotelak = new ArrayList<Hotel>();
		int idHotela=0;
		String hotelIzena=null;
		int logelaKopurua=0;
		int HartutakoLogelak=0;
		int izarKopurua=0;
		Double prezioHotel=null;
		String Helbidea=null;
		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT idHotel,izenaHotel,logelaKopurua,HartutakoLogelak,izarKopurua,prezioHotelSimple,helbideHotel FROM hotel");
			while (rs.next()) {
				idHotela = rs.getInt("idHotel");
				hotelIzena = rs.getString("izenaHotel");
				logelaKopurua = rs.getInt("logelaKopurua");
				HartutakoLogelak = rs.getInt("HartutakoLogelak");
				izarKopurua = rs.getInt("izarKopurua");
				prezioHotel = rs.getDouble("prezioHotelSimple");
				Helbidea = rs.getString("helbideHotel");
				Hotel h1 = new Hotel(idHotela, hotelIzena, logelaKopurua, izarKopurua, prezioHotel,Helbidea);
				hotelak.add(h1);
				//System.out.println(izena);

			}
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return hotelak;
		
	}
	
	public static ArrayList <String> HelbideakIkusi() {
		ArrayList <String> Helbideak = new ArrayList<String>();
		String helbideak=null;
		
		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT distinct helbideHotel FROM hotel");
			while (rs.next()) {
				helbideak = rs.getString("helbideHotel");
				Helbideak.add(helbideak);
				
			}
			System.out.println();
			System.out.println("Conexioa eginda2");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Helbideak;
		
	}
	
	public static ArrayList <Hotel> HotelakHelbidearekinAtera(String helbideaHartu) {
		
		ArrayList <Hotel> hotelak2 = new ArrayList<Hotel>();
		int idHotela=0;
		String hotelIzena=null;
		int logelaKopurua=0;
		//int HartutakoLogelak=0;
		int izarKopurua=0;
		Double prezioHotel=null;
		String Helbidea=null;
		
		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT idHotel,izenaHotel,logelaKopurua,izarKopurua,prezioHotelSimple,helbideHotel FROM hotel where helbideHotel='"+helbideaHartu+"'");
			while (rs.next()) {
				idHotela = rs.getInt("idHotel");
				hotelIzena = rs.getString("izenaHotel");
				logelaKopurua = rs.getInt("logelaKopurua");
				//HartutakoLogelak = rs.getInt("HartutakoLogelak");
				izarKopurua = rs.getInt("izarKopurua");
				prezioHotel = rs.getDouble("prezioHotelSimple");
				Helbidea = rs.getString("helbideHotel");
				Hotel h1 = new Hotel(idHotela, hotelIzena, logelaKopurua, izarKopurua, prezioHotel,Helbidea);
				hotelak2.add(h1);
				//System.out.println(izena);

			}
			for (int i = 0; i < hotelak2.size(); i++) {
				hotelak2.get(i);
			}
			
			
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return hotelak2;
		
		
	}
	
	public static Double PrezioaAtera(int idHotel) {
		
		Double prezioHotel=null;

		
		Connection Conexion = null;
		Statement s =null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"bidaion","root","");
			s =(Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT prezioHotelSimple FROM hotel WHERE idHotel ='"+idHotel+"'");
			while (rs.next()) {
				
				prezioHotel = rs.getDouble("prezioHotelSimple");
				
				//System.out.println(izena);

			}
			System.out.println();
			System.out.println("Conexioa eginda");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

		
		return prezioHotel;
		
	}

	public static ArrayList<java.sql.Date> dataJoan(String oheMotak) {
		ArrayList<java.sql.Date> dataJoan = new ArrayList<java.sql.Date>();
		Date JoatekoData = null;
		int loguelaKopurua;
		int i=0;
		int idHotel = HotelakAukeratuLeihoa.idHotelArtu();

		Connection Conexion = null;
		Statement s = null;

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/" + "bidaion", "root", "");
			s = (Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT dataJoan, "+oheMotak+" FROM erreserba WHERE idOstatu  ='"+idHotel+"' AND "+oheMotak+" > 0"); 
					
			while (rs.next()) {
				JoatekoData = rs.getDate("dataJoan");
				loguelaKopurua = rs.getInt(oheMotak);
				i=0;
				System.out.println("i= " + i);
				do {
					dataJoan.add(JoatekoData);
					System.out.println(i + "--------");
					System.out.println(JoatekoData);

					++i;
					}while(loguelaKopurua > i );

			}
			System.out.println();
			System.out.println("Conexioa eginda");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dataJoan;

	}
	
	public static ArrayList<java.sql.Date> dataEtorri(String oheMotak) {
		ArrayList<java.sql.Date> dataEtorri = new ArrayList<java.sql.Date>();
		Date EtortzekoData = null;
		int loguelaKopurua;
		int i = 0;
		int idHotel = HotelakAukeratuLeihoa.idHotelArtu();

		Connection Conexion = null;
		Statement s = null;

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/" + "bidaion", "root", "");
			s = (Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT dataEtorri, "+oheMotak+" FROM erreserba WHERE idOstatu  ='"+idHotel+"' AND "+oheMotak+" > 0");
			while (rs.next()) {
				EtortzekoData = rs.getDate("dataEtorri");
				loguelaKopurua = rs.getInt(oheMotak);
				
				
				i=0;
				System.out.println("i= " + i);
				do {
				dataEtorri.add(EtortzekoData);
				System.out.println(i + "--------");
				System.out.println(EtortzekoData);
				++i;
				}while(loguelaKopurua > i );
				
				

			}
			System.out.println();
			System.out.println("Conexioa eginda");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dataEtorri;

	}
	
	public static int HoteleanZenbatLekuDauden(String oheMotak) {
		int logelaKopuru=0;
		int idHotel = HotelakAukeratuLeihoa.idHotelArtu();
		Connection Conexion = null;
		Statement s = null;
		
		System.out.println("Nombre del tipo de logela: " + oheMotak);

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/" + "bidaion", "root", "");
			s = (Statement) Conexion.createStatement();

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT "+oheMotak+" FROM hotel where idHotel ='"+idHotel+"'");
			while (rs.next()) {
				logelaKopuru = rs.getInt(oheMotak);

			}
			System.out.println();
			System.out.println("Conexioa eginda");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return logelaKopuru;

	}
	


public static OheMotak logelaKopurua() {
	int idHotel = HotelakAukeratuLeihoa.idHotelArtu();
	OheMotak o2 = null;
	
	Connection Conexion = null;
	Statement s = null;

	try {
		// Class.forName("com.mysql.jdbc.Driver");
		Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/" + "bidaion", "root", "");
		s = (Statement) Conexion.createStatement();

		ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT OheSimpleBat, OheSimpleBi, OheBikoitzBat, OheBikoitzBatEtaOheSimpleBat FROM hotel where idHotel ='"+idHotel+"'");
		
		while (rs.next()) {
			o2.setOheSimpleBat(rs.getInt("OheSimpleBat"));
			o2.setOheSimpleBi(rs.getInt("OheSimpleBi"));
			o2.setOheBikoitzBat(rs.getInt("OheBikoitzBat"));
			o2.setOheBikoitzBatEtaOheSimpleBat(rs.getInt("OheBikoitzBatEtaOheSimpleBat"));


		}
		System.out.println();
		System.out.println("Conexioa eginda");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return o2;
		
	}
	
	
	
	
	
	
	
}