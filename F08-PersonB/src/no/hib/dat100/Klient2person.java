package no.hib.dat100;

public class Klient2person {
	public static void main(String[] args) {
		 Person2 pers = new Person2();
		 pers.navn = "Per";
		 int tall = 5;
		 tullOgToys(pers, tall);
		 System.out.println(pers.navn);
		 System.out.println(tall);
	}
	
	static void tullOgToys(Person2 pers, int i) {
		 pers.navn = "Knut";
		 i = 999;
		 pers = new Person2();
	}



}
