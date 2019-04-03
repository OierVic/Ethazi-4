package Controlador;

public class Ostatu {
	public Ostatu(int id_Ostatu, String ostatu_Izena) {
		super();
		this.id_Ostatu = id_Ostatu;
		Ostatu_Izena = ostatu_Izena;
	}
	
	
	protected int id_Ostatu;
	protected String Ostatu_Izena;
	
	
	public int getId_Ostatu() {
		return id_Ostatu;
	}
	public void setId_Ostatu(int id_Ostatu) {
		this.id_Ostatu = id_Ostatu;
	}
	public String getOstatu_Izena() {
		return Ostatu_Izena;
	}
	public void setOstatu_Izena(String ostatu_Izena) {
		Ostatu_Izena = ostatu_Izena;
	}

}


