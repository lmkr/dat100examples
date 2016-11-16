package no.hib.dat100.kontaktlisteunntak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import no.hib.dat100.kontakter.KontaktInfo;
import no.hib.dat100.kontakter.KontaktListe;
import no.hib.dat100.kontakter.KontaktType;

public class KontaktListeInnlesing extends KontaktListe {

	public void lesFraFil(String filnavn) throws BadDataFormatException,
			IOException {

		BufferedReader reader = null;
		String linje = "";
		
		int linjenummer = 1; // brukes som del av feilmelding

		try {
			reader = new BufferedReader(new FileReader(filnavn));

			linje = reader.readLine();
			int antall = Integer.parseInt(linje);
			
			// les inn antall poster
			while (antall > 0) {

				// les inn navn og sjekk
				linjenummer++; // inkrementer altid før lesning siden det kan gi
								// en exception å lese
				linje = reader.readLine();

				if (linje != null) {
					if (linje.isEmpty()) {
						throw new BadDataFormatException("Tomt navn. Linje "
								+ linjenummer);
					}
				}

				String navn = linje;
				
				// les inn kontakttype og sjekk
				linjenummer++;
				linje = reader.readLine();

				KontaktType kontakttype = null;

				if (linje != null) {
					
				if (linje.equals("KONTOR")) {
					kontakttype = KontaktType.KONTOR;
				} else if (linje.equals("MOBIL")) {
					kontakttype = KontaktType.MOBIL;
				} else {
					throw new BadDataFormatException("Feil kontakttype. Linje "
							+ linjenummer + ":" + linje);
				}}

				// les inn nummer og sjekk
				linjenummer++;
				linje = reader.readLine();

				int nummer = Integer.parseInt(linje);

				// opprett kontaktinfo objekt
				KontaktInfo kontaktinfo = new KontaktInfo(kontakttype, nummer);

				// legg inn i tabell hvis ikke allerede finnes
				if (!kontakter.containsKey(navn)) {
					kontakter.put(navn, kontaktinfo);
				} else {
					throw new BadDataFormatException("Navn ikke unikt. Linje "
							+ linjenummer + ":" + navn);
				}
			}

			if (antall != 0) {
				throw new BadDataFormatException("Feil i antall poster.");
			}

			reader.close();

		} catch (NumberFormatException nfex) {
			throw new BadDataFormatException(
					"Linje " + linjenummer + " " + nfex.getMessage());
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}
}
