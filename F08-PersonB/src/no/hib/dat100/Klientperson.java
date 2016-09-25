package no.hib.dat100;

public class Klientperson {

	 public static void main(String[] args) {

	    Person ole = new Person();
	    Person anne = new Person();
	    //Alt 1
	    ole.fornavn ="Ole";
	    ole.etternavn = "Olsen";
	    ole.adresse = "Torget 1";
	    ole.norsk = true;
	    ole.skrivTilstand();
	    
	    //Alt 2
	    ole.setFornavn("Ole");
	    ole.setEtternavn("Olsen");
	    ole.setAdresse("Torget 1");
	    ole.setNorsk(true);
	    ole.skrivTilstand(); 
	    ole.skrivFulltNavn();
	    
	    anne.setFornavn("Anne");
	    anne.skrivTilstand();
	   
	  }
	}
