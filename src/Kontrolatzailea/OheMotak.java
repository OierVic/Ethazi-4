package Kontrolatzailea;

public class OheMotak {
	public OheMotak() {
		super();
	}
	public OheMotak(int oheSimpleBat, int oheSimpleBi, int oheBikoitzBat, int oheBikoitzBatEtaOheSimpleBat,
			int sehaska) {
		super();
		OheSimpleBat = oheSimpleBat;
		OheSimpleBi = oheSimpleBi;
		OheBikoitzBat = oheBikoitzBat;
		OheBikoitzBatEtaOheSimpleBat = oheBikoitzBatEtaOheSimpleBat;
		Sehaska = sehaska;
	}
	
	private int OheSimpleBat;
	private int OheSimpleBi;
	private int OheBikoitzBat;
	private int OheBikoitzBatEtaOheSimpleBat;
	private int Sehaska;
	
	
	public int getOheSimpleBat() {
		return OheSimpleBat;
	}
	public void setOheSimpleBat(int oheSimpleBat) {
		OheSimpleBat = oheSimpleBat;
	}
	public int getOheSimpleBi() {
		return OheSimpleBi;
	}
	public void setOheSimpleBi(int oheSimpleBi) {
		OheSimpleBi = oheSimpleBi;
	}
	public int getOheBikoitzBat() {
		return OheBikoitzBat;
	}
	public void setOheBikoitzBat(int oheBikoitzBat) {
		OheBikoitzBat = oheBikoitzBat;
	}
	public int getOheBikoitzBatEtaOheSimpleBat() {
		return OheBikoitzBatEtaOheSimpleBat;
	}
	public void setOheBikoitzBatEtaOheSimpleBat(int oheBikoitzBatEtaOheSimpleBat) {
		OheBikoitzBatEtaOheSimpleBat = oheBikoitzBatEtaOheSimpleBat;
	}
	public int getSehaska() {
		return Sehaska;
	}
	public void setSehaska(int sehaska) {
		Sehaska = sehaska;
	}
	
	

}
