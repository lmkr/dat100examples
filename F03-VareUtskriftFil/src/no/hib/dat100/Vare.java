package no.hib.dat100;

import easyIO.Out;

public class Vare {

	public static void main(String[] args) {
		final int BREDDE1 = 13;
		final int BREDDE2 = 6;
		Out utfil = new Out("prisliste.txt");

		utfil.out("VARESLAG", BREDDE1);
		utfil.outln("PRIS", BREDDE2);

		utfil.out("Torsk", BREDDE1);
		utfil.outln(150.5, 2, BREDDE2);

		utfil.out("Uer", BREDDE1);
		utfil.outln(120.2, 2, BREDDE2);

		utfil.out("Sild", BREDDE1);
		utfil.outln(89.90, 2, BREDDE2);

		utfil.close();
	}

}
