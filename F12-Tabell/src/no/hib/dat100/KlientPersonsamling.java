package no.hib.dat100;

public class KlientPersonsamling {

	 public static void main(String[] args) {
		// Vi tar registreringen i klienten denne gangen
			
			final Person[] PERSONTABELL = { new Person("Ole Olsen", "Torget 1", "55121314"),
					new Person("Kari Vik", "Strangt 3", "55657234"),
					new Person("Guro Johannesen", "Storgt20", "56731819"),
					new Person("Siv  Dalen", "Svingen 20", "57193365"),
					new Person("Svein  Solsvik", "Storgt 9", "58345288") };
			//Fyll på gjerne med flere ..

			Personsamling samling = new Personsamling(); 
			
			//Registrering
			for(int i = 0; i < PERSONTABELL.length; i++){
				samling.leggTilBak(PERSONTABELL[i]);
			}
			//TODO
			//Lag kall til metoder for å legge til, søke og slette og se om det virker
	 }	
			
	}//class


	    
	