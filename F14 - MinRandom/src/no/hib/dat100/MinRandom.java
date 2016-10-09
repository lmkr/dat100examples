package no.hib.dat100;

import java.util.Random;

public class MinRandom extends Random {

	// Linja nedanfor er for å unngå advarslar. Ikkje del av pensum.
	private static final long serialVersionUID = 1234567;

	public MinRandom() {
		super();
	}

	public MinRandom(long seed) {
		super(seed);
	}

	public int mellom(int nedre, int ovrevre) {
		int antUlike = ovrevre - nedre + 1;
		return nextInt(antUlike) + nedre;
	}

	public int terningkast() {
		return mellom(1, 6);
	}

	// Overlasting av terningkast
	public int terningkast(int grense) {
		return mellom(1, grense);
	}

	public double mellom(double nedre, double øvre) {
		return nextDouble() * (øvre - nedre) + nedre;
	}
}
