package Domaci272;

public class Test {

	public static void main(String[] args) {
		Vozilo voz = new Vozilo("BMW", "M5", 2022, 2);
		System.out.println(voz.toString());
		Vozac vz = new Vozac("Natasa", "Kirda", 1996, 26);
		System.out.println(vz.toString());
		System.out.println(voz.potrosnjaGoriva(5));
		Kamion k = new Kamion("m","s",2,2);
		System.out.println(k.potrosnjaGoriva(2));
		
		
	}

}
