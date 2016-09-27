package no.hib.dat100;

import java.util.Scanner;

public class KlientTelefonbok {
	Scanner tastatur = new Scanner(System.in);

	public static void main(String[] args) {
		// Vi tar registreringen i klienten denne gangen
		// Alt innlesing. Da kunne kanskje tenkt på en meny
		// OBS! før fjernFraIndeks kalles MÅ en teste på lovlig indeks 

		final Person[] PERSONTABELL = { new Person("Ole", "Olsen", "Torget 1", 55121314),
				new Person("Kari", "Vik", "Strangt 3", 55657234),
				new Person("Guro", "Johannesen", "Storgt20", 56731819),
				new Person("Siv", "Dalen", "Svingen 20", 57193365),
				new Person("Svein", " Solsvik", "Storgt 9", 58345288) };

		Telefonbok tlfliste = new Telefonbok(); 
		
		//Registerering
		for(int i = 0; i < PERSONTABELL.length; i++){
			tlfliste.settInn(PERSONTABELL[i]);
		}
		
		//Utskrift
		tlfliste.visAlle();
		
		//Søking etter en person
		Person personA = PERSONTABELL[2];
		
		if(tlfliste.soke(personA)){
			System.out.println("Personen er registeret/n");
			//Ev. skrive ut personoppl.
		}else{
			System.out.println("Personen er ikke registeret/n");
		}
		
		//Innsetting
		Person personB = new Person("Anders","Vik","Kronstadv 15", 55854377);
		tlfliste.settInn(personB);
		
		//Utskrift
		tlfliste.visAlle();
		
		//Fjerning av en person på en lovlig indeks
		//ved innlesing så må det testes at indesk > 0 og < liste.size()-1
		Person personC = tlfliste.fjernFraIndeks(2);
		
		if(!tlfliste.soke(personC)){
			System.out.println("personen slettet");
		}else{
			System.out.println("feil i sletting");
		}
		
		//TODO - ta resten selv det som mangler..
		
		//Fjerning av alle i listen
		tlfliste.fjernAlle();
		if(tlfliste.erTom()){
			System.out.println("Ingen registert");
		}else{
			System.out.println("feil ved sletting av alle");
		}
		
				
	}

}//class
