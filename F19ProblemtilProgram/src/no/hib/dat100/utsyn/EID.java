package no.hib.dat100.utsyn;

import easyIO.In;
import easyIO.Out;

// hjelpeklasse for innlesning av g�rds- og bruksnummer
public class EID {

	int gns; // OVERVEI private og get-metode
	int bns;

	public void readEID(In in, Out out) {
		out.out("Gårdsnummer : ");
		gns = in.inInt();

		out.out("Bruksnummer : ");
		bns = in.inInt();
	}
}
