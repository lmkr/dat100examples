package no.hib.dat100;

public class Ansatt extends Person {
	private int ansattNr;
	private int lønstrinn;

	public Ansatt(String namn, int fAar, int aNr, int lt) {
		super(namn, fAar);
		ansattNr = aNr;
		lønstrinn = lt;
	}

	public void settAnsattNr(int aNr) {
		ansattNr = aNr;
	}

	public void settLønstrinn(int lt) {
		lønstrinn = lt;
	}

	public int hentAnsattNr() {
		return ansattNr;
	}

	public int hentLønstrinn() {
		return lønstrinn;
	}

	public int beregnMaanedslonn() {
		return 20000 + lønstrinn * 200;
	}

	public String toString() {
		return super.toString() + " - " + "Ansattnr: " + ansattNr + " - " + "Lønstrinn: " + lønstrinn;
	}
}
