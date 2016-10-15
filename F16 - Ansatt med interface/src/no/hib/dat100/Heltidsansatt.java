package no.hib.dat100;

public class Heltidsansatt extends Ansatt implements Kredittverdig {
	private int ansiennitetsfaktor;

	public Heltidsansatt(String na, double tl, double bf, int af) {
		super(na, tl, bf);
		ansiennitetsfaktor = af;
	}

	@Override
	public double beregnKreditt() {
		return getTimelonn() * 300;
	}

	@Override
	public double beregnbonus() {
		return getTimelonn() * getBonusfaktor() * ansiennitetsfaktor;
	}

	@Override
	public void skriv() {
		super.skriv();
		System.out.println("Kreditt: " + beregnKreditt());
	}

}
