package Kontrolatzailea;

import java.io.FileWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Eredua.Konsulta_Erregistro;
import Eredua.Kontsulta_Apartamentua;
import Eredua.Kontsulta_Bezero;
import Eredua.Kontsulta_Erreserba;
import Eredua.Kontsulta_Etxeak;
import Eredua.Kontsulta_Hoteles;
import Ikuspegia.ApartamentuakAukeratuLeihoa;
import Ikuspegia.ErregistroLeihoa;
import Ikuspegia.ErreserbaHasieratu;
import Ikuspegia.ErreserbaHasieratuEtxea;
import Ikuspegia.EskerrikAskoLeihoa;
import Ikuspegia.EtxeakAukeratuLeihoa;
import Ikuspegia.HotelakAukeratuLeihoa;
import Ikuspegia.LoginLeihoa;
import Ikuspegia.OngiEtorriLeihoa;
import Ikuspegia.OrdainduLeihoa;
import Ikuspegia.OrdainduLeihoaEtxeak;
import Ikuspegia.OstauMotaAukeratu;

public class Metodoak {
	static int LogelaKant;

	//Ventana1
	public static void ongietorrileihora() {

		OngiEtorriLeihoa OngiEtorriLeihoa= new OngiEtorriLeihoa();
		OngiEtorriLeihoa.setVisible(true);


	}
	
	//Ventana2 Login
		public static void loginleihora() {
			ArrayList <Bezero> Bezeroak= new ArrayList <Bezero>();
			Bezeroak=Kontsulta_Bezero.BezeroakIkusi();
			LoginLeihoa LoginLeihoa= new LoginLeihoa(Bezeroak);
			LoginLeihoa.setVisible(true);

		}
		
	//Ventana2 Erregistratu
		public static void erregistroleihora() {
			ArrayList <Bezero> Bezeroak= new ArrayList <Bezero>();
			Bezeroak=Kontsulta_Bezero.BezeroakIkusi();
			ErregistroLeihoa ErregistroLeihoa= new ErregistroLeihoa(Bezeroak);
			ErregistroLeihoa.setVisible(true);

		}
		
		public static void ostatumotaaukeratuleihora() {

			OstauMotaAukeratu OstatuMotaAukeratu= new OstauMotaAukeratu();
			OstatuMotaAukeratu.setVisible(true);

		}
		
	//Ventana3
	public static void hotelakaukeratuleihora() {

		ArrayList <Hotel> Hoteles= new ArrayList <Hotel>();
		Hoteles=Kontsulta_Hoteles.HotelakIkusi();
		ArrayList<String> Helbideak =new ArrayList<String>();
		Helbideak=Kontsulta_Hoteles.HelbideakIkusi();
		HotelakAukeratuLeihoa LoginLeihoa= new HotelakAukeratuLeihoa(Hoteles,Helbideak);
		LoginLeihoa.setVisible(true);

	}
	//etxera aukeratzeko leihora joateko
	public static void etxeakaukeratuleihora() {

		ArrayList <Etxea> Etxeak= new ArrayList <Etxea>();
		Etxeak=Kontsulta_Etxeak.EtxeakIkusi();
		ArrayList<String> Helbideak =new ArrayList<String>();
		Helbideak=Kontsulta_Etxeak.HelbideakIkusi();
		EtxeakAukeratuLeihoa EtxeakAukeratu= new EtxeakAukeratuLeihoa(Etxeak,Helbideak);
		EtxeakAukeratu.setVisible(true);

	}
	//Apartamentua aukeratzeko lehiora joateko
	public static void apartamentuakAukeratuleihora() {
		ArrayList<String> Helbideak =new ArrayList<String>();
		Helbideak=Kontsulta_Apartamentua.ApartamentuenHelbideakIkusi();
		ApartamentuakAukeratuLeihoa apartamentuakAukeratuLeihoa= new ApartamentuakAukeratuLeihoa(Helbideak);
		apartamentuakAukeratuLeihoa.setVisible(true);

	}
	
	
	//Erreserba prestatzeko lehioak
		public static void erreserbahasieratu(String hotelak, double PrezioHotel) {
			ErreserbaHasieratu ErreserbaLehioa = new ErreserbaHasieratu(hotelak, PrezioHotel);
			ErreserbaLehioa.setVisible(true);
		}
		
		public static void erreserbahasieratuetxea(String etxeak, double PrezioEtxea) {
			ErreserbaHasieratuEtxea ErreserbaLehioaEtxea = new ErreserbaHasieratuEtxea(etxeak, PrezioEtxea);
			ErreserbaLehioaEtxea.setVisible(true);
		}
		public static void erreserbahasieratuapartamentua(String apartamentuak, double PrezioApartamentua) {
			ErreserbaHasieratuEtxea ErreserbaLehioaEtxea = new ErreserbaHasieratuEtxea(apartamentuak, PrezioApartamentua);
			ErreserbaLehioaEtxea.setVisible(true);
		}

		
	//Ventana4
	public static void ordainduleihora(String hotelak, double prezioHotel, Date sartuData, Date joanData, OheMotak o1,int logelaKopurua) {

		OrdainduLeihoa HotelakAukeratuLeihoa= new OrdainduLeihoa(hotelak,prezioHotel,sartuData, joanData, o1,logelaKopurua);
		HotelakAukeratuLeihoa.setVisible(true);

	}
	//Ventana5
	public static void eskerrikaskoleihoara() {

		EskerrikAskoLeihoa EskerrikAskoLeihoa= new EskerrikAskoLeihoa();
		EskerrikAskoLeihoa.setVisible(true);

	}
	// Erabiltzaile berri bat erregistratzeko
	public static void Erregistratu(ErabiltzaileaIgo e1) {
		Konsulta_Erregistro.Erabiltzailea_erregistratu(e1);
		
	}
	//ErreserbaEtxetik Ordaindu Etxera
	public static void ordainduleihoraetxea(String hotelak, double prezioHotel, Date sartuData, Date joanData, boolean oierbike) {

		OrdainduLeihoaEtxeak ordainduLeihoaEtxeak= new OrdainduLeihoaEtxeak(hotelak,prezioHotel,sartuData, joanData, oierbike);
		ordainduLeihoaEtxeak.setVisible(true);

	}
	
	public static boolean konprobatuNegatibo(double zbk) {
		boolean balidatu=false;
		if (zbk>0)
			balidatu=true;
		return balidatu;
	}

	public static void imprimatuTiketa(Erreserba e1) {

		String nombre = "erreserba.txt";
		try{
			FileWriter fichero = new FileWriter("src\\Kontrolatzailea\\"+nombre);
			fichero.write(e1.toString() + "\r\n");
			fichero.close();

		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static void ErreserbaIgo(Erreserba e1) {
		Kontsulta_Erreserba.InsertErreserba(e1);
		
	}
	
	public static void ErreserbaIgoEtxea(Erreserba e1) {
		Kontsulta_Erreserba.InsertErreserbaEtxea(e1);
		
	}

	public static String kanbioMetodoa(double zbk) {


		double kanbio= zbk;

		int aldatzailea = (int) (kanbio*100); // int-a parentesisen artean dagoena, double-a int-a bihurtzen du
		int itzultzeko = aldatzailea;
		String kanbioa="";
		String pantailaratu="";
		//DEZIMALEN FORMATOA.
		DecimalFormat dezimal = new DecimalFormat("#.00");

		pantailaratu=(" Itzultzeko " + dezimal.format(kanbio) + " eman behar da.\n");
		kanbioa=kanbioa+pantailaratu;
		// para cada moneda
		if (itzultzeko >= 20000) {
			pantailaratu=(" 200�-ko billeteak: " + itzultzeko / 20000+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 20000;
		}
		if (itzultzeko >= 10000) {
			pantailaratu=(" 100�-ko billeteak: " + itzultzeko / 10000+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 10000;
		}
		if (itzultzeko >= 5000) {
			pantailaratu=(" 50�-ko billeteak: " + itzultzeko / 5000+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 5000;
		}
		if (itzultzeko >= 2000) {
			pantailaratu=(" 20�-ko billeteak: " + itzultzeko / 2000+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 2000;
		}
		if (itzultzeko >= 1000) {
			pantailaratu=(" 10�-ko billeteak: " + itzultzeko / 1000+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 1000;
		}
		if (itzultzeko >= 500) {
			pantailaratu=(" 5�-ko billeteak: " + itzultzeko / 500+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 500;
		}
		if (itzultzeko >= 200) {
			pantailaratu=(" 2�-ko txanponak: " + itzultzeko / 200+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 200;
		}
		if (itzultzeko >= 100) {
			pantailaratu=(" 1�-ko txanponak: " + itzultzeko / 100+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 100;
		}
		if (itzultzeko >= 50) {
			pantailaratu=(" 50 zentimoko txanponak: " + itzultzeko / 50+"\n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 50;
		}
		if (itzultzeko >= 20) {
			pantailaratu=(" 20 zentimoko txanponak: " + itzultzeko / 20+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 20;
		}
		if (itzultzeko >= 10) {
			pantailaratu=(" 10 zentimoko txanponak: " + itzultzeko / 10+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 10;
		}
		if (itzultzeko >= 5) {
			pantailaratu=(" 5 zentimoko txanponak: " + itzultzeko / 5+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 5;
		}
		if (itzultzeko >= 2) {
			pantailaratu=(" 2 zentimoko txanponak: " + itzultzeko / 2+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 2;
		}
		if (itzultzeko >= 1) {
			pantailaratu=(" 1 zentimoko txanponak: " + itzultzeko+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = 0;
		}
		return kanbioa;
	}

	public static boolean konprobatuLetra(String zbk) {
		boolean balidatu=false;

		try {
			Double.parseDouble(zbk);
			balidatu = false;
		} catch (NumberFormatException letra) {
			balidatu = true;
		}
		return balidatu;
	}

	public static boolean diruFalta(double zbk,double prezioa) {

		boolean diru_falta=false;
		double preziototala = 0;
		preziototala = (double) (zbk-prezioa);
		if (preziototala<0) {
			diru_falta=true;

		}
		return diru_falta;
	}

	public static String orduaAtera () {
		int hora,minutos = 0;
		Calendar fecha = Calendar.getInstance();

		//ordua hartu eta gorde
		hora =fecha.get(Calendar.HOUR_OF_DAY);
		minutos = fecha.get(Calendar.MINUTE);

		String ordua = hora+":"+minutos;

		if (hora<10) {
			ordua = "0"+hora+":"+minutos;
		}
		if (minutos<10) {
			ordua = hora+":"+"0"+minutos;
		}
		if(hora<10 && minutos<10) {
			ordua = hora+":"+"0"+minutos;
		}
		return ordua;
	}

	public static String dataAteraA�oalFinal () {
		int a�o,mes,dia = 0;

		Calendar fecha = Calendar.getInstance();

		//data hartu eta gorde
		a�o = fecha.get(Calendar.YEAR);
		mes = fecha.get(Calendar.MONTH) + 1;
		dia = fecha.get(Calendar.DAY_OF_MONTH);

		String data = dia+"-"+mes+"-"+a�o;

		if(dia<10) {
			data = "0"+dia+"-"+mes+"-"+a�o;
		}
		if(mes<10) {
			data = dia+"-"+"0"+mes+"-"+a�o;
		}
		if (dia<10 && mes<10) {
			data = "0"+dia+"-"+"0"+mes+"-"+a�o;
		}
		return data;
	}
	public static String dataAtera() {
		int a�o,mes,dia = 0;

		Calendar fecha = Calendar.getInstance();

		//data hartu eta gorde
		a�o = fecha.get(Calendar.YEAR);
		mes = fecha.get(Calendar.MONTH) + 1;
		dia = fecha.get(Calendar.DAY_OF_MONTH);

		String data = a�o+"-"+mes+"-"+dia;

		if(dia<10) {
			data = a�o+"-"+mes+"-"+"0"+dia;
		}
		if(mes<10) {
			data = a�o+"-"+"0"+mes+"-"+dia;
		}
		if (dia<10 && mes<10) {
			data = a�o+"-"+"0"+mes+"-"+"0"+dia;
		}
		return data;
	}
	//	public static void bezeroaIgo(BezeroIgo bezeroIgo) {
	//		Kontrolatzailea.erregistroa(bezeroIgo);
	//	}

	public static double RedondearDosDecimales(double numero)
	{
		return Math.rint(numero*100)/100;
	}

	public static String KalkulatuLetra(int dni){
		String karaktereak="TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo= dni % 23;
		char letra1 = karaktereak.charAt(modulo);
		String letra = Character.toString(letra1);
		return letra; 
	} 

	public static String ateraMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashtext = number.toString(16);

			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		}
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
	
	//hola
	
	public static double prezioaEgunekin(double prezioHotel, Date joanData, Date sartuData, OheMotak o1,int idHotel){
		
		double prezioTrampa = prezioHotel;
		double prezioa0 = 0;
		double prezioa1 = 0;
		double prezioa2 = 0;
		double prezioa3 = 0;
		double prezioa4 = 0;
		
		
		prezioHotel = Kontsulta_Hoteles.PrezioaAtera(idHotel);
		
		
		
		long diff = (joanData.getTime() - sartuData.getTime());
		long diffEguna = (diff / 1000 / 60 / 60 / 24) + 1;
		round(diff, 2);
		if(diffEguna - 1 != 0) {
			prezioHotel = prezioHotel * (diffEguna - 1);	
		}
				
		if(o1.getOheSimpleBat() > 0) {
			 prezioa0 = prezioHotel * o1.getOheSimpleBat();
		}if(o1.getOheBikoitzBat() > 0){
			 prezioa1 = prezioHotel * o1.getOheBikoitzBat() * 1.5; // 50% extra por cada cama doble
		}if(o1.getOheBikoitzBatEtaOheSimpleBat() > 0) {
			 prezioa2 = prezioHotel * o1.getOheBikoitzBatEtaOheSimpleBat() * 1.75; // 75% extra por cada cama doble y simple
		}if(o1.getOheSimpleBi() > 0){
			 prezioa3 = prezioHotel * o1.getOheSimpleBi() * 2; 
		} 
		
		if(o1.getSehaska() > 0) {
			 prezioa4 = ((prezioHotel* 0.3) + prezioHotel) * o1.getSehaska();  //30% por cada Sehaska
		}
		
		prezioHotel = (prezioa0 + prezioa1 + prezioa2 + prezioa3 + prezioa4);
		
		prezioHotel = Math.round(prezioHotel * 100) / 100d;
		
		return (double) prezioHotel;
	}
	
	public static double prezioaEgunekinEtxea(double prezioHotel, Date joanData, Date sartuData) {
		
		long diff = (joanData.getTime() - sartuData.getTime());
		long diffEguna = (diff / 1000 / 60 / 60 / 24) + 1;
		round(diff, 2);
		
		prezioHotel = prezioHotel * (diffEguna - 1);	
		
		prezioHotel = Math.round(prezioHotel * 100) / 100d;
		
		System.out.println(prezioHotel + "   prezio etxea");
		
		return (double) prezioHotel;
	}

	private static void round(long diff, int i) {
	}
	
	public static Date gehituEguna(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }
	
	public static Date gehituUrtea(Date date, int years)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, years);
        return cal.getTime();
    }
	
	private static int ateraSinpleak (int sinpleak) {
		return sinpleak;
	}
	
	public static boolean DataKalkulatu (Date sartzekoDataCliente,Date joatekoDataCliente,ArrayList<java.sql.Date> dataJoan,ArrayList<java.sql.Date> dataEtorri, int oheMotakZbk, String oheMotak, int y, OheMotak o1) {
		int logelaKopurua = 0;
		
		
		if(y == 0) {
			logelaKopurua = o1.getOheSimpleBat();
		} else if(y == 1) {
			logelaKopurua = o1.getOheSimpleBi();
		}else if(y== 2) {
			logelaKopurua = o1.getOheBikoitzBat();
		}else if (y==3) {
			logelaKopurua = o1.getOheBikoitzBatEtaOheSimpleBat();
		}
		
		boolean lekua= false;
		
		int i = 0; // para cada intervalo 
		//System.out.println("No afecta1" + sartzekoDataCliente + "before. " + dataJoan.get(i));
		//System.out.println("No afecta1" + joatekoDataCliente + "before. " + dataJoan.get(i));

		do {
	
			
			if(dataJoan.size() == 0) {
				lekua = true;

				getlogelaKant(logelaKopurua);
				return lekua;
			}
			
			if (sartzekoDataCliente.before(dataJoan.get(i))) { // Comparar dia de entrada comparar con dia de entrada BD
				if (joatekoDataCliente.before(dataJoan.get(i))) { // Comparar dia de salida comprara con dia de entrada BD
					

					++i;
				} else {
					++i;
					--logelaKopurua;// esta fecha esta ocupada, comprobamos la siguiente
				}
			} else if (sartzekoDataCliente.after(dataEtorri.get(i))) { // Comparar dia de entrada con dia de salida BD
				++i;
			} else {
				++i;
				--logelaKopurua;// esta fecha esta ocupada, comprobamos la siguiente
			}
			
			if(logelaKopurua < 0) {
				lekua = false;
			}else {
				lekua = true;
			}
			
	

		} while (i != dataJoan.size());
		
	
		

		getlogelaKant(logelaKopurua);
		
		logelaKopurua = logelaKopurua - oheMotakZbk;
		
		if(logelaKopurua < 0) {
			lekua = false;
		}
		

		return lekua;
	}
	
	public static int getlogelaKant (int logelaKant){
		if(logelaKant==999){
			logelaKant = LogelaKant;
		}else {
			LogelaKant = logelaKant;
			//LogelaKant = 9;
		}
		
		
		
		return logelaKant;
	}
	
	public static double PrezioaTemporadekinKalkulatu (Date joanData, Date etorriData,double prezioa) throws ParseException {
		boolean temporadaAlta=false;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //Para declarar valores en nuevos objetos date, usa el mismo formato date que usaste al crear las fechas 
		//Fechas de Verano
		Date InicioVerano = sdf.parse(joanData.getYear()+"-06-21");
		Date InicioVeranoA�oSiguiente = sdf.parse((joanData.getYear()+1)+"-06-21");
		Date FinVerano = sdf.parse(joanData.getYear()+"-09-23");
		Date FinVeranoA�oSiguiente = sdf.parse((joanData.getYear()+1)+"-09-23");
		//Fechas de Semana Santa
		Date InicioSemanaSanta = sdf.parse(joanData.getYear()+"-04-05");
		Date InicioSemanaSantaA�oSiguiente = sdf.parse((joanData.getYear()+1)+"-04-05");
		Date FinSemanaSanta = sdf.parse(joanData.getYear()+"-04-12");
		Date FinSemanaSantaA�oSiguiente = sdf.parse((joanData.getYear()+1)+"-04-05");
		
		//Verano el Mismo A�o
		if ((joanData.before(InicioVerano)==true && etorriData.after(InicioVerano)==true)) {
		    int dias=(int) ((InicioVerano.getTime()-etorriData.getTime())/86400000);
		    //egun bakoitza en temporada alta 10 euro gehiago
		    prezioa=dias*10;
		}
		else if (FinVerano.after(joanData)==true && FinVerano.before(etorriData)==true) {
		    int dias=(int) ((joanData.getTime()-FinVerano.getTime())/86400000);
		    prezioa=dias*10;
		}
		else if (joanData.before(InicioVerano)==true && etorriData.after(FinVerano)==true) {
		    int dias=(int) ((InicioVerano.getTime()-FinVerano.getTime())/86400000);
		    prezioa=dias*10;
		}
		else if (joanData.after(InicioVerano)==true && etorriData.before(FinVerano)==true) {
		    int dias=(int) ((joanData.getTime()-etorriData.getTime())/86400000);
		    prezioa=dias*10;
		}
		//------------------------------------------------------------------------------
		//SemanaSanta el Mismo A�o
		if ((joanData.before(InicioSemanaSanta)==true && etorriData.after(InicioSemanaSanta)==true)) {
		    int dias=(int) ((InicioSemanaSanta.getTime()-etorriData.getTime())/86400000);
		    prezioa=dias*10;
		}
		else if (FinSemanaSanta.after(joanData)==true && FinSemanaSanta.before(etorriData)==true) {
		    int dias=(int) ((joanData.getTime()-FinSemanaSanta.getTime())/86400000);
		    prezioa=dias*10;
		}
		else if (joanData.before(InicioSemanaSanta)==true && etorriData.after(FinSemanaSanta)==true) {
		    int dias=(int) ((InicioSemanaSanta.getTime()-FinSemanaSanta.getTime())/86400000);
		    prezioa=dias*10;
		}
		else if (joanData.after(InicioSemanaSanta)==true && etorriData.before(FinSemanaSanta)==true) {
		    int dias=(int) ((joanData.getTime()-etorriData.getTime())/86400000);
		    prezioa=dias*10;
		}
		//------------------------------------------------------------------------------
		//Verano el Siguiente A�o
		
		
		//------------------------------------------------------------------------------
		//Semana Santa el Siguiente A�o

		
		else {
			System.out.println("No hay temporada Alta");
		}
		
		
		return prezioa;
	}


	/*private static String[] dataOkupatuta(Date joanData, Date sartuData) {
		String[] egunak;
		
		
		
		return egunak;
	}*/
	public static int SumaSpinners(int spinner1,int spinner2,int spinner3,int spinner4) {
		int sumaTotala=spinner1+spinner1+spinner3+spinner4;
		return sumaTotala;
	}
	
	
}