package Controlador;

public class Hotel {
	//Kontruktorea hotelak behar dituen datuak zartzeko...
	public Hotel(String hotel_Izena, int izarKopurua, int logelaKopurua) {
		super();
		Hotel_Izena = hotel_Izena;
		this.izarKopurua = izarKopurua;
		this.logelaKopurua = logelaKopurua;
	}
	//atributuak
	private int idHotel;
	private String Hotel_Izena;
	private int izarKopurua;
	private int logelaKopurua;
	private double precioHotel;
	
	

	public String getHotel_Izena() {
		return Hotel_Izena;
	}
	public void setHotel_Izena(String hotel_Izena) {
		Hotel_Izena = hotel_Izena;
	}
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
	public int getIdHotel() {
		return idHotel;
	}
	public double getPrecioHotel() {
		return precioHotel;
	}
	
}
