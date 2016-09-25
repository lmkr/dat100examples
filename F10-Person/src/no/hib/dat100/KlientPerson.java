package no.hib.dat100;

public class KlientPerson {

	 public static void main(String[] args) {

	    Person ole = new Person();
	    Person anne = new Person("Siv","Gjerde","Strandgt12",true);
	    
	    ole.setFornavn("Ole");
	    ole.setEtternavn("Olsen");
	    ole.setAdresse("Torget 1");
	    ole.setNorsk(true);
	    ole.skrivFulltNavn();
	    ole.skrivTilstand();
	    
	    anne.skrivFulltNavn();
	    anne.skrivTilstand();
	    	   
	  }
	}
