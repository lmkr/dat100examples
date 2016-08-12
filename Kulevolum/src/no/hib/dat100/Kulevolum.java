package no.hib.dat100;

public class Kulevolum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fortekst = "Volumet av en kule med radius ";
		final double PI = 3.14;
		double volum;
		double radius;

		radius = 1;
		volum = (4 * PI * radius * radius * radius) / 3;
		System.out.println(fortekst + radius + " er " + volum);

		radius = 2;
		volum = (4 * PI * radius * radius * radius) / 3;
		System.out.println(fortekst + radius + " er " + volum);

		radius = 3;
		volum = (4 * PI * radius * radius * radius) / 3;
		System.out.println(fortekst + radius + " er " + volum);
	}

}
