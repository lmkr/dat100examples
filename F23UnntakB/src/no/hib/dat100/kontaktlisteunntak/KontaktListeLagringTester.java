package no.hib.dat100.kontaktlisteunntak;

import no.hib.dat100.kontakter.KontaktInfo;
import no.hib.dat100.kontakter.KontaktType;


public class KontaktListeLagringTester {

	public static void main(String[] args) {
		
		String sti = "";
		
		KontakListeLagring kl = new KontakListeLagring();
		
		kl.leggtilNummer("Lars",KontaktType.MOBIL,93866491);
		kl.leggtilNummer("Sven-Olai",KontaktType.KONTOR,87563);
		
		KontaktInfo kilmk = kl.finnKontaktInfo("Lars");
		System.out.println("Lars");
		kilmk.visDetaljer();
		
		KontaktInfo kisoh = kl.finnKontaktInfo("Sven-Olai");
		System.out.println("Sven-Olai");
		kisoh.visDetaljer();
		
		kl.skrivTilFil(sti + "kontaktliste.txt");
		
	}

}
