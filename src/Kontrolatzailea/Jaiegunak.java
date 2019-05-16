package Kontrolatzailea;

import java.sql.Date;
import java.util.ArrayList;

public class Jaiegunak {
	public Jaiegunak(ArrayList<Date> jaiDatak, ArrayList<String> jaiIzenak) {
		super();
		this.jaiDatak = jaiDatak;
		this.jaiIzenak = jaiIzenak;
	}
	
	private ArrayList <Date> jaiDatak = new ArrayList<Date>();
	private ArrayList <String> jaiIzenak = new ArrayList<String>();
	
	public ArrayList<Date> getJaiDatak() {
		return jaiDatak;
	}
	public void setJaiDatak(ArrayList<Date> jaiDatak) {
		this.jaiDatak = jaiDatak;
	}
	public ArrayList<String> getJaiIzenak() {
		return jaiIzenak;
	}
	public void setJaiIzenak(ArrayList<String> jaiIzenak) {
		this.jaiIzenak = jaiIzenak;
	}
	@Override
	public String toString() {
		return "Jaiegunak [jaiDatak=" + jaiDatak + ", jaiIzenak=" + jaiIzenak + "]";
	}
}

