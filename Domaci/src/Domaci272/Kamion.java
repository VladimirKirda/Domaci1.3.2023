package Domaci272;

public class Kamion extends Vozilo{
	public int potrosnjaGoriva (int cenaLitre) {
		return 2*8*cenaLitre;
	}

	public Kamion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kamion(String marka, String model, int godiste, int cenaLitre) {
		super(marka, model, godiste, cenaLitre);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
