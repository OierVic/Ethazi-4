package Kontrolatzailea;

public class Hotel extends Ostatu{
	//atributuak
	
	private int LogelaKopurua;
	private int HartutakoLogelak;
	private int izarKopurua;
	private double prezioHotel;
	private String helbideHotel;
	
	//Kontruktorea hotelak behar dituen datuak sartzeko...

	public Hotel(int id_Hotel, String izena_Hotel, int logelaKopurua, int hartutakoLogelak, int izarKopurua,
			double prezioHotel, String helbideHotel) {
		super(id_Hotel, izena_Hotel);
		this.LogelaKopurua = logelaKopurua;
		this.HartutakoLogelak = hartutakoLogelak;
		this.izarKopurua = izarKopurua;
		this.prezioHotel = prezioHotel;
		this.helbideHotel = helbideHotel;
	}

	public int getLogelaKopurua() {
		return LogelaKopurua;
	}

	public int getHartutakoLogelak() {
		return HartutakoLogelak;
	}

	public int getIzarKopurua() {
		return izarKopurua;
	}

	public double getPrezioHotel() {
		return prezioHotel;
	}

	public String getHelbideHotel() {
		return helbideHotel;
	}

	public void setLogelaKopurua(int logelaKopurua) {
		LogelaKopurua = logelaKopurua;
	}

	public void setHartutakoLogelak(int hartutakoLogelak) {
		HartutakoLogelak = hartutakoLogelak;
	}

	public void setIzarKopurua(int izarKopurua) {
		this.izarKopurua = izarKopurua;
	}

	public void setPrezioHotel(double prezioHotel) {
		this.prezioHotel = prezioHotel;
	}

	public void setHelbideHotel(String helbideHotel) {
		this.helbideHotel = helbideHotel;
	}
	public int LogelaEskugarri (int LogelaKopurua,int HartutakoLogelak) {
		int LogelaEskugarri=LogelaKopurua-HartutakoLogelak;
		return LogelaEskugarri;
	}
	
	

	public String comboboxIzena () {
		//int logelak = this.getLogelaKopurua() - this.getHartutakoLogelak();
		String cb = this.getOstatu_Izena() + "           Logelak eskuragarri: " + LogelaEskugarri(this.getLogelaKopurua(),this.getHartutakoLogelak())+"           Helbidea: "+this.helbideHotel+"           Prezioa: "+this.prezioHotel;
		return cb;
	}
	
	
	
}


