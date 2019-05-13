package Kontrolatzailea;

import java.sql.Date;

import Eredua.Kontsulta_Erreserba;

public class Erreserba {

	private int idErreserba;
	private int idOstatu;
	private String idBezero;
	private String dataJoan;
	private String dataEtorri;
	private double precio;
	private int sinp;
	private int bisinp;
	private int bik;
	private int sinpbik;
	private int sehaska;
	private String Eskatutakodata;
	private String EskatutakoOrdua;
	private int logelaKopurua;

	//(`idErreserba`, `idOstatu`, `idBezero`, `dataJoan`, `dataEtorri`, `prezioErreserba`, `1sinp`, `2sinp`, `1bik`, `1sinp1bik`, `sehaska`, `erosketaData`, `erosketaOrdua`)
	
	public Erreserba(/* int idErreserba, */ int idOstatu, String idBezero, String dataJoan, String dataEtorri, double precio,
			int sinp, int bisinp, int bik, int sinpbik, int sehaska, String eskatutakodata, String eskatutakoOrdua,int LogelaKopurua) {
		//this.idErreserba = idErreserba;
		this.idOstatu = idOstatu;
		this.idBezero = idBezero;
		this.dataJoan = dataJoan;
		this.dataEtorri = dataEtorri;
		this.precio = precio;
		this.sinp = sinp;
		this.bisinp = bisinp;
		this.bik = bik;
		this.sinpbik = sinpbik;
		this.sehaska = sehaska;
		this.Eskatutakodata = eskatutakodata;
		this.EskatutakoOrdua = eskatutakoOrdua;
		this.logelaKopurua = LogelaKopurua;
	}
	
	
	
	//Erreserba imprimatzeko beste kontruktore bat
	public Erreserba(int idErreserba,int idOstatu, String idBezero, String dataJoan, String dataEtorri, double precio,
			int sinp, int bisinp, int bik, int sinpbik, int sehaska, String eskatutakodata, String eskatutakoOrdua) {
		this.idErreserba = idErreserba;
		this.idOstatu = idOstatu;
		this.idBezero = idBezero;
		this.dataJoan = dataJoan;
		this.dataEtorri = dataEtorri;
		this.precio = precio;
		this.sinp = sinp;
		this.bisinp = bisinp;
		this.bik = bik;
		this.sinpbik = sinpbik;
		this.sehaska = sehaska;
		Eskatutakodata = eskatutakodata;
		EskatutakoOrdua = eskatutakoOrdua;
	}
	
	
	



//	public int getIdErreserba() {
//		return idErreserba;
//	}






//	public void setIdErreserba(int idErreserba) {
//		this.idErreserba = idErreserba;
//	}






	public int getIdOstatu() {
		return idOstatu;
	}






	public void setIdOstatu(int idOstatu) {
		this.idOstatu = idOstatu;
	}






	public String getIdBezero() {
		return idBezero;
	}






	public void setIdBezero(String idBezero) {
		this.idBezero = idBezero;
	}






	public String getDataJoan() {
		return dataJoan;
	}






	public void setDataJoan(String dataJoan) {
		this.dataJoan = dataJoan;
	}






	public String getDataEtorri() {
		return dataEtorri;
	}






	public void setDataEtorri(String dataEtorri) {
		this.dataEtorri = dataEtorri;
	}






	public double getPrecio() {
		return precio;
	}






	public void setPrecio(double precio) {
		this.precio = precio;
	}






	public int getSinp() {
		return sinp;
	}






	public void setSinp(int sinp) {
		this.sinp = sinp;
	}






	public int getBisinp() {
		return bisinp;
	}






	public void setBisinp(int bisinp) {
		this.bisinp = bisinp;
	}






	public int getBik() {
		return bik;
	}






	public void setBik(int bik) {
		this.bik = bik;
	}






	public int getSinpbik() {
		return sinpbik;
	}






	public void setSinpbik(int sinpbik) {
		this.sinpbik = sinpbik;
	}






	public int getSehaska() {
		return sehaska;
	}






	public void setSehaska(int sehaska) {
		this.sehaska = sehaska;
	}






	public String getEskatutakodata() {
		return Eskatutakodata;
	}






	public void setEskatutakodata(String eskatutakodata) {
		Eskatutakodata = eskatutakodata;
	}






	public String getEskatutakoOrdua() {
		return EskatutakoOrdua;
	}






	public void setEskatutakoOrdua(String eskatutakoOrdua) {
		EskatutakoOrdua = eskatutakoOrdua;
	}
	
	
	public int getlogelaKopurua() {
		return logelaKopurua;
	}






	public void setlogelaKopurua(int LogelaKopurua) {
		logelaKopurua = LogelaKopurua;
	}






	@Override
	public String toString() {
		return " \n" + "                                                             Erreserba                        "
				+ " \t\n"
				+ " ----------------------------------------------------------------------------------------------------------------------"
				+ " \t\n"

				+ " -Erreserba Kodea: "+this.idErreserba + " \t" + " -Id Ostatu: " + this.idOstatu + " \t" + "-Id bezero: " + this.idBezero + " \n" + " \n"
				+ "-Erreserba data: "+this.Eskatutakodata+" \t" + " -Ordua: "+this.EskatutakoOrdua+" \t\n"
				+ " \t\n"
				+ "-----------------------------------------------------------------------------------------------------------------------"
				+ " \t\n"
				+" -Joateko data: " + this.dataJoan + " \t\t" + "-Etorri data: " + this.dataEtorri + " \t\n"
				+ " ----------------------------------------------------------------------------------------------------------------------"
				+ " \t\n"

				+ " -Prezioa: " + this.precio + " €";
	}








}
