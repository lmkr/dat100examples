package no.hib.dat100;

public class Person {
	// Feltvariabler
	private String fornavn;
	private String etternavn;
	private String adresse;
	private boolean norsk;

	// Konstruktører
	public Person(){
		fornavn = "";
		etternavn = "";
		adresse = "";
		norsk = false;
	}

	public Person(String fornavn, String etternavn, String adresse, boolean norsk){
	  this.fornavn= fornavn;
	  this.etternavn = etternavn;
	  this.adresse = adresse;
	  this.norsk = norsk;
  }
	// Intansmetoder

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public boolean isNorsk() {
		return norsk;
	}

	public void setNorsk(boolean norsk) {
		this.norsk = norsk;
	}
	
	public void skrivFulltNavn() {
		System.out.println("Det fulle navn er " + fornavn + " " + etternavn);
	}

	public void skrivTilstand() {
		System.out.print("Fornavn: " + fornavn);
		System.out.print("\tEtternavn: " + etternavn);
		System.out.print("\tAdresse: " + adresse);
		System.out.print("\tNorsk: " + norsk);
		System.out.println("\n");
	}

}// class