package no.hib.dat100;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		Ansatt a1 = new Deltidsansatt("Per", 200, 1.07);
		Ansatt a2 = new Heltidsansatt("Kari", 250, 1.10, 2);

		HashMap<String, Ansatt> ansatte = new HashMap<String, Ansatt>();

		ansatte.put(a1.getNavn(), a1);
		ansatte.put(a2.getNavn(), a2);

		for (Ansatt a : ansatte.values()) {
			a.skriv();
			System.out.println();
		}
	}

}
