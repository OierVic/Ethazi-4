package Kontrolatzailea;

public class Erreserba {

	private static int idErreserba = 1;
	private int idOstatu;
	private String idBezero;
	private String Eskatutakodata;
	private String EskatutakoOrdua;
	private String dataJoan;
	private String dataEtorri;
	private double precio;
	private int sinp;
	private int bisinp;
	private int bik;
	private int sinpbik;

	public Erreserba(int idOstatu, String idBezero,String Eskatutakodata,String EskatutakoOrdua, String dataJoan, String dataEtorri, int nagusiKopuru, int umekopuru,
			double precio, int sinp, int bisinp, int bik, int sinpbik) {
		this.idErreserba=idErreserba++;
		this.idOstatu = idOstatu;
		this.idBezero = idBezero;
		this.Eskatutakodata = Eskatutakodata;
		this.EskatutakoOrdua = EskatutakoOrdua;
		this.dataJoan = dataJoan;
		this.dataEtorri = dataEtorri;
		this.precio = precio;
		this.sinp = sinp;
		this.bisinp = bisinp;
		this.bik = bik;
		this.sinpbik = sinpbik;
		
	}
	
	
	

	public static int getIdErreserba() {
		return idErreserba;
	}




	public static void setIdErreserba(int idErreserba) {
		Erreserba.idErreserba = idErreserba;
	}



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
	



	@Override
	public String toString() {
		return " \n" + "                                                             HOTEL                        "
				+ " \t\n"
				+ " ----------------------------------------------------------------------------------------------------------------------"
				+ " \t\n"

				+ " -Erreserba Kodea: " + idErreserba + " \t" + " -Id Ostatu: " + this.idOstatu + " \t" + "-Id bezero: " + this.idBezero + " \n" + " \n"
				+ "-Erreserba data: "+this.Eskatutakodata+" \t" + " -Ordua: "+this.EskatutakoOrdua+" \t\n"
				+ " \t\n"
				+" -Joateko data: " + this.dataJoan + " \t\t" + "-Etorri data: " + this.dataEtorri + " \t\n"
				+ " ----------------------------------------------------------------------------------------------------------------------"
				+ " \t\n"

				+ " -Nagusi kopuru: " + "  \t   " + "-Ume Kopuru: " + " \t\n" + " \t\n"
				+ " ----------------------------------------------------------------------------------------------------------------------"
				+ " \t\n"

				+ " -Prezioa: " + this.precio + " €";
	}






}
