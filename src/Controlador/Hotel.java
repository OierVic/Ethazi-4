package Controlador;

public class Hotel extends Ostatu{
	//atributuak
	
	private int LogelaKopurua;
	private int HartutakoLogelak;
	private int izarKopurua;
	private double prezioHotel;
	private int helbideHotel;
	
	//Kontruktorea hotelak behar dituen datuak sartzeko...

	public Hotel(int id_Hotel, String izena_Hotel, int logelaKopurua, int hartutakoLogelak, int izarKopurua,
			double prezioHotel, int helbideHotel) {
		super(id_Hotel, izena_Hotel);
		LogelaKopurua = logelaKopurua;
		HartutakoLogelak = hartutakoLogelak;
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

	public int getHelbideHotel() {
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

	public void setHelbideHotel(int helbideHotel) {
		this.helbideHotel = helbideHotel;
	}
	
	
	

	
	
	
}


