package no.hib.dat100.modell;

/**
 * Klasse for representasjon av eiere av eiendommer.
 * @author Lars Kristensen
 * @version 1.0
 */

public class Eier {

	private String navn;
	private int fodselsnummer;
	
	private KontaktAdresse adresse;

	/**
	 * Konstuerer eier objekt
	 * @param navn - navn paa eier
	 * @param fodselsnummer - fodselsnummer paa eier
	 * @param adresse - kontaktadresse
	 */
	public Eier(String navn, int fodselsnummer, KontaktAdresse adresse) {
		this.navn = navn;
		this.fodselsnummer = fodselsnummer;
		this.adresse = adresse;
	}

	/**
	 * Hent kontaktadresse paa eier.
	 * @return kontraktadresse for eier
	 */
	public KontaktAdresse getAdresse() {
		return adresse;
	}
	
	/**
	 * Sett kontaktadresse for eier.
	 * @param adresse ny kontaktadresse for eier (erstatter eksisterende)
	 */
	public void setAdresse(KontaktAdresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Hent navn.
	 * @return - navn paa eier
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * Hent fodselsnummer.
	 * @return fodselsnummer for eier
	 */
	public int getFodselsnummer() {
		return fodselsnummer;
	}
}
