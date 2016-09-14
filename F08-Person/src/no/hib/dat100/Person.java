package no.hib.dat100;

public class Person {
	// Feltvariabler
	private String fornavn;
	private String etternavn;
	private String adresse;
	private boolean norsk;

	// Intansmetoder
	void setFornavn(String nyFornavn) {
		fornavn = nyFornavn;
	}

	void setEtternavn(String nyEtternavn) {
		etternavn = nyEtternavn;
	}

	void setAdresse(String nyAdresse) {
		adresse = nyAdresse;
	}

	void setNorsk(boolean nyNorsk) {
		norsk = true;
	}

	String getFornavn() {
		return fornavn;
	}

	String getEtternavn() {
		return etternavn;
	}

	String getAdresse() {
		return adresse;
	}

	boolean isNorsk() {
		return norsk;
	}

	public void skrivFulltNavn() {
		System.out.println("Det fulle navn er " + fornavn + " " + etternavn);
	}

	void skrivTilstand() {
		System.out.print("Fornavn: " + fornavn);
		System.out.print("\tEtternavn: " + etternavn);
		System.out.print("\tAdresse: " + adresse);
		System.out.print("\tNorsk: " + norsk);
		System.out.println();
	}
}