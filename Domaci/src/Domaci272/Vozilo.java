package Domaci272;

public class Vozilo {
	private String marka;
	private String model;
	private int godiste;
	private int cenaLitre;
	
	public Vozilo() {
		super();
	}


	public Vozilo(String marka, String model, int godiste, int cenaLitre) {
		super();
		this.marka = marka;
		this.model = model;
		this.godiste = godiste;
		this.cenaLitre =cenaLitre;
	}
	
	
	public int potrosnjaGoriva (int cenaLitre) {
		return 8*cenaLitre;
	}
	
	@Override
	public String toString() {
		return "Marka: "+marka+ ", model: "+model+ ", godiste:" +godiste+", Cena litre goriva:" +cenaLitre;
	}
	
	public int getCenaLitre() {
		return cenaLitre;
	}


	public void setCenaLitre(int cenaLitre) {
		this.cenaLitre = cenaLitre;
	}

	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getGodiste() {
		return godiste;
	}


	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	
	
	
	
}
