package no.hib.dat100;

public class Ansatt extends Person {

	// Feltvariabler deklarert i Person
	private String ansattNr;
	private int lonnstrinn;

	// Konstruktører for Ansatt
	public Ansatt(String n, int f, String a, int l) {
		super(n, f); // delegerer til superklassens konstruktør

		setAnsattNr(a);
		setLonnstrinn(l);
	}

	// Hent- og settmetoder for Ansatt
	public String gettAnsattNr() {
		return ansattNr;
	}

	public void setAnsattNr(String a) {
		ansattNr = a;
	}

	public int getLonnstrinn() {
		return lonnstrinn;
	}

	public void setLonnstrinn(int lt) {
		lonnstrinn = lt;
	}

	// Forretningsmetoder for Ansatt
	public int beregnMaanedslonn() {
		return lonnstrinn * 200 + 20000;
	}
}
