package Kontrolatzailea;

public class Bezero {


	private String idBezeroNan;
	private String izenBezero;
	private String abizenBezero;
	private int tlfBezero;
	private String postaBezero;
	
	public Bezero(String idBezeroNan, String izenBezero, String abizenBezero, int tlfBezero, String postaBezero) {
		this.idBezeroNan = idBezeroNan;
		this.izenBezero = izenBezero;
		this.abizenBezero = abizenBezero;
		this.tlfBezero = tlfBezero;
		this.postaBezero = postaBezero;
	}

	public String getidBezeroNan() {
		return idBezeroNan;
	}

	public void setidBezeroNan(String idBezero) {
		this.idBezeroNan = idBezero;
	}

	public String getIzenBezero() {
		return izenBezero;
	}

	public void setIzenBezero(String izenBezero) {
		this.izenBezero = izenBezero;
	}

	public String getAbizenBezero() {
		return abizenBezero;
	}

	public void setAbizenBezero(String abizenBezero) {
		this.abizenBezero = abizenBezero;
	}

	public int getTlfBezero() {
		return tlfBezero;
	}

	public void setTlfBezero(int tlfBezero) {
		this.tlfBezero = tlfBezero;
	}

	public String getPostaBezero() {
		return postaBezero;
	}

	public void setPostaBezero(String postaBezero) {
		this.postaBezero = postaBezero;
	}

	@Override
	public String toString() {
		return "Bezero [idBezero=" + idBezeroNan + ", izenBezero=" + izenBezero + " " + abizenBezero
				+ ", tlfBezero=" + tlfBezero + ", postaBezero=" + postaBezero + "]";
	}
	
	
	
	
}