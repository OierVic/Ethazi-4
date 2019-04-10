package Kontrolatzailea;

import java.util.ArrayList;
import java.util.Scanner;

public class ErabiltzaileaIgo {

	private String nan;
	private String erabil_Izena;
	private String erabil_Abizenak;
	private String pasahitza;
	private String jaiotzeData;
	private int telefonoa;
	private String postaBezero;
	
	
	public ErabiltzaileaIgo(String nan, String erabil_Izena, String erabil_Abizenak, String pasahitza, String jaiotzeData,
			int telefonoa, String postaBezero) {
		super();
		this.nan = nan;
		this.erabil_Izena = erabil_Izena;
		this.erabil_Abizenak = erabil_Abizenak;
		this.pasahitza = pasahitza;
		this.jaiotzeData = jaiotzeData;
		this.telefonoa = telefonoa;
		this.postaBezero = postaBezero;
	}


	public String getNan() {
		return nan;
	}


	public void setNan(String nan) {
		this.nan = nan;
	}


	public String getErabil_Izena() {
		return erabil_Izena;
	}


	public void setErabil_Izena(String erabil_Izena) {
		this.erabil_Izena = erabil_Izena;
	}


	public String getErabil_Abizenak() {
		return erabil_Abizenak;
	}


	public void setErabil_Abizenak(String erabil_Abizenak) {
		this.erabil_Abizenak = erabil_Abizenak;
	}


	public String getPasahitza() {
		return pasahitza;
	}


	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}


	public String getJaiotzeData() {
		return jaiotzeData;
	}


	public void setJaiotzeData(String jaiotzeData) {
		this.jaiotzeData = jaiotzeData;
	}


	public int getTelefonoa() {
		return telefonoa;
	}


	public void setTelefonoa(int telefonoa) {
		this.telefonoa = telefonoa;
	}


	public String getPostaBezero() {
		return postaBezero;
	}


	public void setPostaBezero(String postaBezero) {
		this.postaBezero = postaBezero;
	}



	





	

}
