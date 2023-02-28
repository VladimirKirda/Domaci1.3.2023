package Domaci272;

public class Vozac {
	
	private String ime;
	private String prezime;
	private int jmbg;
	private int brgodina;
	
	
	
	public Vozac() {
		super();
	}
	public Vozac(String ime, String prezime, int jmbg, int brgodina) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.brgodina = brgodina;
	}
	
	@Override
	public String toString() {
		return "Ime: "+ime+ ", prezime: "+prezime+ ", jmbg: "+jmbg+ ", Broj godina koje Vozac ima:"+brgodina;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getJmbg() {
		return jmbg;
	}
	public void setJmbg(int jmbg) {
		this.jmbg = jmbg;
	}
	public int getBrgodina() {
		return brgodina;
	}
	public void setBrgodina(int brgodina) {
		this.brgodina = brgodina;
	}
	
	
	
}
