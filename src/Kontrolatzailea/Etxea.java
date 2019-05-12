package Kontrolatzailea;

public class Etxea extends Ostatu{

	private int LogelaKopurua;
	//private int HartutakoLogelak;
	private double prezioEtxea;
	private String helbideEtxea;
	
	//Kontruktorea hotelak behar dituen datuak sartzeko...

	public Etxea(int id_Hotel, String izena_Hotel,
			double prezioEtxea, String helbideEtxea) {
		super(id_Hotel, izena_Hotel);
		//this.HartutakoLogelak = hartutakoLogelak;
		this.prezioEtxea = prezioEtxea;
		this.helbideEtxea = helbideEtxea;
	}

	public int getLogelaKopurua() {
		return LogelaKopurua;
	}

	public void setLogelaKopurua(int logelaKopurua) {
		LogelaKopurua = logelaKopurua;
	}

	public double getPrezioEtxea() {
		return prezioEtxea;
	}

	public void setPrezioEtxea(double prezioEtxea) {
		this.prezioEtxea = prezioEtxea;
	}

	public String getHelbideEtxea() {
		return helbideEtxea;
	}

	public void setHelbideEtxea(String helbideEtxea) {
		this.helbideEtxea = helbideEtxea;
	}

	@Override
	public int LogelaEskugarri(int logelaKopurua, int hartutakoLogelak) {
		return 0;
	}

	public String comboboxIzena() {
		String cb = this.getOstatu_Izena()+"           Helbidea: "+this.helbideEtxea+"           Prezioa: "+this.prezioEtxea;
		return cb;
	}

}
