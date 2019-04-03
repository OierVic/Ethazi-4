package Controlador;

public class Hotel extends Ostatu{
	//atributuak
	
	private int izarKopurua;
	private double precioHotel;
	private int Logelaokupatuta;
	private int LogelaTotala;
	//Kontruktorea hotelak behar dituen datuak zartzeko...
	
	public Hotel(int id_Ostatu, String ostatu_Izena, int izarKopurua, double precioHotel, int logelaTotala,
			int logelaokupatuta) {
		super(id_Ostatu, ostatu_Izena);
		this.izarKopurua = izarKopurua;
		this.precioHotel = precioHotel;
		Logelaokupatuta = logelaokupatuta;
		LogelaTotala = logelaTotala;
	}

	public int getIzarKopurua() {
		return izarKopurua;
	}

	public void setIzarKopurua(int izarKopurua) {
		this.izarKopurua = izarKopurua;
	}

	public double getPrecioHotel() {
		return precioHotel;
	}

	public void setPrecioHotel(double precioHotel) {
		this.precioHotel = precioHotel;
	}

	public int getLogelaokupatuta() {
		return Logelaokupatuta;
	}

	public void setLogelaokupatuta(int logelaokupatuta) {
		Logelaokupatuta = logelaokupatuta;
	}

	public int getLogelaTotala() {
		return LogelaTotala;
	}

	public void setLogelaTotala(int logelaTotala) {
		LogelaTotala = logelaTotala;
	}
	

	
	
	
}


