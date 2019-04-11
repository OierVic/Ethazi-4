package Kontrolatzailea;

public abstract class Ostatu {
	
	protected int id_Ostatu;
	protected String Ostatu_Izena;
	
	public Ostatu(int id_Ostatu, String ostatu_Izena) {
		super();
		this.id_Ostatu = id_Ostatu;
		Ostatu_Izena = ostatu_Izena;
	}
	
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
	
	//Metodo abstact que tiene que aparecer cuantas habitaciones estan libres
	public abstract int LogelaEskugarri (int logelaKopurua,int hartutakoLogelak);
	
	

}


