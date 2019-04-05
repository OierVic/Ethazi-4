package Controlador;

public class Erreserba {

	private static int idErreserba = 1;
	private int idOstatu;
	private int idBezero;
	private String dataJoan;
	private String dataEtorri;
	private int nagusiKopuru;
	private int umekopuru;
	private double precio;

	public Erreserba(int idOstatu, int idBezero, String dataJoan, String dataEtorri, int nagusiKopuru, int umekopuru,
			double precio) {
		super();
		this.idOstatu = idOstatu;
		this.idBezero = idBezero;
		this.dataJoan = dataJoan;
		this.dataEtorri = dataEtorri;
		this.nagusiKopuru = nagusiKopuru;
		this.umekopuru = umekopuru;
		this.precio = precio;
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

	public int getIdBezero() {
		return idBezero;
	}

	public void setIdBezero(int idBezero) {
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

	public int getNagusiKopuru() {
		return nagusiKopuru;
	}

	public void setNagusiKopuru(int nagusiKopuru) {
		this.nagusiKopuru = nagusiKopuru;
	}

	public int getUmekopuru() {
		return umekopuru;
	}

	public void setUmekopuru(int umekopuru) {
		this.umekopuru = umekopuru;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return " \n" + "                                                             HOTEL                        "
				+ " \t\n"
				+ " ----------------------------------------------------------------------------------------------------------------------"
				+ " \t\n"

				+ " -Erreserba Kodea: " + idErreserba + " \t" + "-Id bezero: " + idBezero + " \n" + " \n"
				+ " -Joateko data: " + dataJoan + " \t\t" + "-Etorri data: " + dataEtorri + " \t\n"
				+ " ----------------------------------------------------------------------------------------------------------------------"
				+ " \t\n"

				+ " -Nagusi kopuru: " + nagusiKopuru + "     " + "-Ume Kopuru: " + umekopuru + " \t\n" + " \t\n"
				+ " ----------------------------------------------------------------------------------------------------------------------"
				+ " \t\n"

				+ " -Prezioa: " + precio + " €";
	}

}
