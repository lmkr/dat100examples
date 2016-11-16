package no.hib.dat100.kontaktlisteunntak;

import no.hib.dat100.kontakter.KontaktInfo;
import no.hib.dat100.kontakter.KontaktType;

public class KontaktListeFinnSikkerTester {

	public static void main(String[] args) {

		KontaktListeFinnSikker kp = new KontaktListeFinnSikker();

		kp.leggtilNummer("Lars", KontaktType.MOBIL, 93866491);
		kp.leggtilNummer("Sven-Olai", KontaktType.KONTOR, 87563);

		try {
			KontaktInfo kilmk = kp.finnKontaktInfoSikker("Lars");
			System.out.println("Lars");
			kilmk.visDetaljer();

			KontaktInfo kisoh = kp.finnKontaktInfoSikker("Sven-Olai");
			System.out.println("Sven-Olai");
			kisoh.visDetaljer();

			KontaktInfo kihs = kp.finnKontaktInfoSikker("Harald");
			kihs.visDetaljer();

		} catch (KeyNotUsedException e) {
			System.out.println(e.getMessage());
		}

		// sjekk tilfelle med null argument
		try {
			kp.finnKontaktInfoSikker(null);
		} catch (KeyNotUsedException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
