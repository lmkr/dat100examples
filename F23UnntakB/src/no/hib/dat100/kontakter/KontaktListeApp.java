package no.hib.dat100.kontakter;

import java.util.HashMap;

public class KontaktListeApp {

	// simpel eksempel på en applikasjon som bruker KontaktListe klassene
	static public void main(String args[]) {
	
		KontaktListe kl = new KontaktListe();
		
		kl.leggtilNummer("Lars",KontaktType.MOBIL,93866491);
		kl.leggtilNummer("Sven-Olai",KontaktType.KONTOR,87563);
		
		KontaktInfo kilmk = kl.finnKontaktInfo("Lars");
		System.out.println("Lars");
		kilmk.visDetaljer();
		
		KontaktInfo kisoh = kl.finnKontaktInfo("Sven-Olai");
		System.out.println("Sven-Olai");
		kisoh.visDetaljer();
		
		KontaktInfo kihs = kl.finnKontaktInfo("Harald");
		kihs.visDetaljer();
	}
}
