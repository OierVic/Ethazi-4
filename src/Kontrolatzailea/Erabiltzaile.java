package Kontrolatzailea;

import java.util.ArrayList;
import java.util.Scanner;

public class Erabiltzaile {
	



	


	public Erabiltzaile(String nan, String erabil_Izena, String erabil_Abizenak, String pasahitza, String jaiotzeData,
			String postaBezero, String teleBezero) {
		super();
		this.nan = nan;
		this.erabil_Izena = erabil_Izena;
		this.erabil_Abizenak = erabil_Abizenak;
		this.pasahitza = pasahitza;
		this.jaiotzeData = jaiotzeData;
		this.postaBezero = postaBezero;
		this.teleBezero = teleBezero;
	}

	private String nan;
	private String erabil_Izena;
	private String erabil_Abizenak;
	private String pasahitza;
	private String jaiotzeData;
	private String postaBezero;
	private String teleBezero;
	
	
	
	
	
	
	
	
	public String getNan() {
		return nan;
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



	public void setNan(String nan) {
		this.nan = nan;
	}
	
	
	public static Erabiltzaile erregistratu(){
		 Scanner sc = new Scanner(System.in);
		//ArrayList <Erabiltzaile> erregistroa = new ArrayList<Erabiltzaile>();
		
		String nan = sc.nextLine();
		String pasahitza = sc.nextLine();
		String erabil_Izena = sc.nextLine();
		String erabil_Abizenak = sc.nextLine();
		String jaiotzeData = sc.nextLine();
		String postaBezero = sc.nextLine();
		String teleBezero = sc.nextLine();

		
		
		 
		 
		 //System.out.print(getNan() + getPasahitza() + getErabil_Izena() + getErabil_Abizenak() + getJaiotzeData());
		 //Erabiltzaile.add(getNan(), getPasahitza(), getErabil_Izena(), getErabil_Abizenak(), getJaiotzeData());
		 
		 Erabiltzaile e1 = new Erabiltzaile(nan, erabil_Izena, erabil_Abizenak, pasahitza, jaiotzeData, postaBezero, teleBezero );
		 //erregistroa.add(e1);
		 
	
		 return e1;
		
	}

	public String getPostaBezero() {
		return postaBezero;
	}

	public void setPostaBezero(String postaBezero) {
		this.postaBezero = postaBezero;
	}

	public String getTeleBezero() {
		return teleBezero;
	}

	public void setTeleBezero(String teleBezero) {
		this.teleBezero = teleBezero;
	}





	

}
