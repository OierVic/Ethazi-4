package Controlador;

public class Hotel extends Ostatu{
	//Kontruktorea hotelak behar dituen datuak zartzeko...
	public Hotel(String hotel_Izena, int izarKopurua, int logelaKopurua) {
		super(logelaKopurua, hotel_Izena);
		this.izarKopurua = izarKopurua;
		this.logelaKopurua = logelaKopurua;
	}
	//atributuak
	
	private int izarKopurua;
	private int logelaKopurua;
	private double precioHotel;
	
	

	public int getIzarKopurua() {
		return izarKopurua;
	}
	public void setIzarKopurua(int izarKopurua) {
		this.izarKopurua = izarKopurua;
	}
	public int getLogelaKopurua() {
		return logelaKopurua;
	}
	public void setLogelaKopurua(int logelaKopurua) {
		this.logelaKopurua = logelaKopurua;
	}
	
	public double getPrecioHotel() {
		return precioHotel;
	}
	
}
