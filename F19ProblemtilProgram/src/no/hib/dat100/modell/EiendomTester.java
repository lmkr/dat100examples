package no.hib.dat100.modell;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Simpel test klasse for eiendomsregister.
 * @author Lars Kristensen
 * @version 1.0
 */
public class EiendomTester {

	@Test
	public void EnkelTest() {

		// opprett test register
		EiendomsRegister register = new EiendomsRegister("bergen");
		
		NeringsEiendom ne = new NeringsEiendom(10,10,202020);
		UtleieEiendom ue = new UtleieEiendom(10,20,1096,10000);
		
		// legg eiendommer inn i register - etablerer forbindelser mellom objekt
		register.registrerEiendom(ne);
		register.registrerEiendom(ue);
		
		
		KontaktAdresse ka1 = new KontaktAdresse("Nymarksveien", 42, 5020, "Bergen", "Norge");
		KontaktAdresse ka2 = new KontaktAdresse("Fyllingsveien", 84, 5120, "Fyllingen", "Bahamas");
		
		Eier bente = new Eier("Bente Rask", 1741, ka1);
		Eier odd = new Eier("Odd Vanden", 1560, ka2);
		
		// etablerer forbindelser mellom eier og adresse objekter
		register.registrerEier(bente, 10,10);
		register.registrerEier(odd, 10, 20);
		
		// etablerer forbindelser mellom eiendomsobjekter
		ne.registrerNabo(ue);
		ue.registrerNabo(ne);
		
		// hent ut informasjon og gjør noen enkle sjekk
		assertEquals(ne,register.finnEiendom(10, 10));
		
		ArrayList<Eier> neeiere = register.finnEiendom(10, 10).getEiere();
		
		assertEquals(1,neeiere.size());
		assertEquals(bente,neeiere.get(0));
		
		assertEquals(ue,register.finnEiendom(10, 20));
		
		ArrayList<Eier> ueeiere = register.finnEiendom(10, 20).getEiere();
		
		assertEquals(1,ueeiere.size());
		assertEquals(odd,ueeiere.get(0));
		
	}

}
