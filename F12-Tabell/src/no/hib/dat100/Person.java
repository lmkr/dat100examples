package no.hib.dat100;

public class Person {
	// Feltvariabler
	String navn;
	String adresse;
	String tlfnr; //entydig

	// Konstruktører
	public Person() {
		navn = "";
		adresse = "";
		tlfnr = "";
	}

	public Person(String navn, String adresse, String tlfnr) {
		this.navn = navn;
		this.adresse = adresse;
		this.tlfnr = tlfnr;
	}

	// Intansmetoder
	public String getNavn() {
		return navn;
	}

	void setNavn(String navn) {
		this.navn = navn;
	}

	public String getTlfnr() {
		return tlfnr;
	}

	public void setTlfnr(String tlfnr) {
		this.tlfnr = tlfnr;
	}

	public String getAdresse() {
		return adresse;
	}

	void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	void skrivTilstand() {
		System.out.print("Navn: " + navn);
		System.out.print("\tAdresse: " + adresse);
		System.out.print("\tTelefonr: " + tlfnr);
		System.out.println();
	}
	
	@Override
	public boolean equals(Object obj) {		
		Person other = (Person) obj;		
		return tlfnr == other.tlfnr;		
	}	
}