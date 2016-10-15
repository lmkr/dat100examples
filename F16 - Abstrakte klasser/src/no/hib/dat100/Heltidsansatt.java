package no.hib.dat100;

public class Heltidsansatt extends Ansatt {
	private int ansiennitetsfaktor;

	public Heltidsansatt(String na, double tl, double bf, int af) {
		super(na, tl, bf);
		ansiennitetsfaktor = af;
	}

	@Override
	public double beregnbonus() {
		return getTimelonn() * getBonusfaktor() * ansiennitetsfaktor;
	}

}
