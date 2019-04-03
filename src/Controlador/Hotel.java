package Controlador;

public class Hotel extends Ostatu{
	
	

	
	//atributuak
	
	private int izarKopurua;
	private int logelaKopurua;
	private double precioHotel;
	
	//Kontruktorea hotelak behar dituen datuak zartzeko...

	public Hotel(int id_Ostatu, String ostatu_Izena, int izarKopurua, int logelaKopurua, double precioHotel) {
		super(id_Ostatu, ostatu_Izena);
		this.izarKopurua = izarKopurua;
		this.logelaKopurua = logelaKopurua;
		this.precioHotel = precioHotel;
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
	
	public double getPrecioHotel() {
		return precioHotel;
	}
	
	
	
}
