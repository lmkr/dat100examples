package no.hib.dat100;

public class Personsamling {
	
	   private final int STDK = 4;
	   private int antall;
	   private Person [] samling; // usortert
	   /******************************************************************
	     Oppretter en tom liste med standard kapasitet.
	   /******************************************************************/
	   public Personsamling(){	     
	      samling = new Person[STDK];
	      antall = 0;
	   }
	   /******************************************************************
	     Oppretter en tom liste med spesifisert kapasitet.
	  / ******************************************************************/
	   public Personsamling (int startKapasitet){
	          samling = new Person[startKapasitet];
	          antall = 0;
	   }
	   
	   /******************************************************************
	     Legger det spesifiserte elementet bak i listen.
	   ******************************************************************/
	public void leggTilBak(Person person) {
		if (antall == samling.length) {
			utvid();
		}
		samling[antall] = person;
		antall++;
	}

	   /******************************************************************
	     Fjerner og returnerer personen med gitt tlfnr.
	   /******************************************************************/
	   public Person fjern (Person person){
	      Person resultat = null;
	      int indeks = finn(person);
	      if (indeks != -1){
	          resultat = samling[indeks];
	          samling[indeks] = samling[antall];
	          antall--; 
	        
	      }//if
	      return resultat;
	   } 

//	     Returnerer tabellindeksen til den spesifiserte personen.
//	     Returnerer  (-1) hvis ikke funnet.
	/******************************************************************/
	private int finn(Person person) {
		int i = 0;
		int resultat = -1;
		boolean funnet = false;
		if (!erTom()) {
			while (!funnet && i < antall) {
				if (person.getTlfnr().equals(samling[i].getNavn())) {
					funnet = true;
				} else {
					i++;
				}
			}
			if (funnet) {
				resultat = i;
			}
		}
		return resultat;

	}
	   /******************************************************************
	     Returnerer sann hvis samlingen er tom og usann ellers..
	   /******************************************************************/
	   public boolean erTom(){
	      return(antall == 0);
	   }
	    
	   /******************************************************************
	     Oppretter en ny og større samling. Vi må lagre innholdet av denne
	     samlingen.
	   /******************************************************************/
	   private void utvid()  {
	      Person[] hjelpeTabell = new Person[samling.length*2];
	      for (int i=0; i < samling.length; i++){
	         hjelpeTabell[i] = samling[i];
	      }
	      samling = hjelpeTabell;
	   }

	public void visAlle() {
		for (int i = 0; i < antall; i++) {
			samling[i].skrivTilstand();
		}
	}

	}//class

