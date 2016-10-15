package no.hib.dat100;

public class Deltidsansatt extends Ansatt {

	public Deltidsansatt(String na, double tl, double bf) {
		super(na, tl, bf);
	}

	/**
	 * @return bonus
	 */

	@Override
	public double beregnbonus() {
		return getTimelonn() * getBonusfaktor();
	}

}
