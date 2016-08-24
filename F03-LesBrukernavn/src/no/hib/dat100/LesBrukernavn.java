package no.hib.dat100;

import easyIO.In;
import easyIO.Out;

public class LesBrukernavn {
	public static void main(String[] args) {
		In innfil = new In("BrukerInfo.txt");
		Out utfil = new Out("NyBrukerInfo.txt");

		while (!innfil.lastItem()) {
			String fnr = innfil.inWord();
			String brukernavn = innfil.inWord();
			String passord = innfil.inWord();

			utfil.out(brukernavn, 15);
			utfil.outln(fnr);
		}

		innfil.close();
		utfil.close();
	}
}