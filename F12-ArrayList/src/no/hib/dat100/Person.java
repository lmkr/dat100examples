package no.hib.dat100;

public class Person {
	// Feltvariabler
	private String fornavn;
	private String etternavn;
	private String adresse;
	private int telefonnr;
	

	// Konstruktører
	public Person(){
		fornavn = "";
		etternavn = "";
		adresse = "";
		telefonnr = 0;
	}

	public Person(String fornavn, String etternavn, String adresse, int telefonnr){
	  this.fornavn= fornavn;
	  this.etternavn = etternavn;
	  this.adresse = adresse;
	  this.telefonnr = telefonnr;
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
	
	public int getTelefonnr() {
		return telefonnr;
	}

	public void setTelefonnr(int telefonnr) {
		this.telefonnr = telefonnr;
	}
	
	public void skrivFulltNavn() {
		System.out.println("Det fulle navn er " + fornavn + " " + etternavn);
	}

	public void skrivTilstand() {
		System.out.print("Fornavn: " + fornavn);
		System.out.print("\tEtternavn: " + etternavn);
		System.out.print("\tAdresse: " + adresse);
		System.out.print("\ttelefonnr: " + telefonnr);
		System.out.println("\n");
	}

	
	@Override
	public boolean equals(Object obj) {		
		Person other = (Person) obj;		
		return telefonnr == other.telefonnr;		
	}	

}// class