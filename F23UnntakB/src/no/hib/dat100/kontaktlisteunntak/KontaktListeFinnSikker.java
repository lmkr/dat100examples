package no.hib.dat100.kontaktlisteunntak;

import no.hib.dat100.kontakter.KontaktInfo;
import no.hib.dat100.kontakter.KontaktListe;

public class KontaktListeFinnSikker extends KontaktListe {

	public KontaktInfo finnKontaktInfoSikker(String navn) throws KeyNotUsedException {
		
		KontaktInfo ki;
		
		// TODO - START
		
		// check parametren navn er null - og signaler IllegalArgumentException exception om nødvendig
		
		// check om kontakter inneholder nøkkelen navn dvs. en verdi for navn 
		// kan gjøres ved å bruke containsKey metoden på hashMap
		
		// hvis ikke nøkkelen finnes signaler en KeyNotUsedException exception
		
		// TODO - SLUTT
		return ki;
	}
}
