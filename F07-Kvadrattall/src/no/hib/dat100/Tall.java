package no.hib.dat100;

public class Tall {
	public static void main(String[] args) {
		Kalkulator r = new Kalkulator(); // Oppretter et objekt
		double[] roetter = r.beregnTiRoetter();// returnerer en tabell av tall

		for (int k = 0; k < 10; k++) {
			// System.out.println(roetter[k]); // skriver ut innholdet av
			// tabellen
			System.out.printf("%7.3f %n", roetter[k]);// Formatert 7 posisjoner,
														// 3 desimaler
		}
	}// main
}// class
