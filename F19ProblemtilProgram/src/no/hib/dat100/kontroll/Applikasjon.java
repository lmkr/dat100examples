package no.hib.dat100.kontroll;

import no.hib.dat100.modell.EiendomsRegister;
import no.hib.dat100.utsyn.TekstUtsyn;

public class Applikasjon {

	// startpunkt for eiendomsregister applikasjonen
	public static void main(String[] args) {

		if (args.length == 1) {

			// opprett et register
			EiendomsRegister register = new EiendomsRegister(args[0]);

			// opprett kontroll knytttet til register
			Controller controller = new Controller(register);

			// opprett grensesnitt (user interface) knyttet til kontroll
			TekstUtsyn utsyn = new TekstUtsyn(controller);

			// start grensesnitt og brukerinteraksjon
			utsyn.kjor();
			
		} else
			System.out.println("FEIL: Angi kommunenavn ved start");
	}
}
