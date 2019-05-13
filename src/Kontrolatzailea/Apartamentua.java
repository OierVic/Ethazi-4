package Kontrolatzailea;

import javax.swing.JFrame;

public class Apartamentua extends Ostatu {
	
	private double prezioApartementua;
	private String helbidea;
	
	
	public Apartamentua(int id_Ostatu, String ostatu_Izena, double prezioApartementua, String helbidea) {
		super(id_Ostatu, ostatu_Izena);
		this.prezioApartementua = prezioApartementua;
		this.helbidea = helbidea;
	}
	
	

	public double getPrezioApartementua() {
		return prezioApartementua;
	}



	public void setPrezioApartementua(double prezioApartementua) {
		this.prezioApartementua = prezioApartementua;
	}



	public String getHelbidea() {
		return helbidea;
	}



	public void setHelbidea(String helbidea) {
		helbidea = helbidea;
	}

	public int LogelaEskugarri(int logelaKopurua, int hartutakoLogelak) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public String toString() {
		return "Apartamentua [prezioApartementua=" + this.prezioApartementua + ", Helbidea=" + this.helbidea + "]";
	}


}
