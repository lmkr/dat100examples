package no.hib.dat100.kontaktlisteunntak;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import no.hib.dat100.kontakter.KontaktInfo;
import no.hib.dat100.kontakter.KontaktListe;

public class KontakListeLagring extends KontaktListe {

	// hash-map legger i superkllasen KontaktList og har navnet 'kontakter'
	public void skrivTilFil(String filnavn) {
		
		
		// TODO - START
		
		// åpne filen (PrintWriter og FileWriter)
		PrintWriter f = new PrintWriter (new FileWriter(filnavn));
		
		// skriv ut antall poster først - bruk size metode på HashMap og println på PrintWriteren f
		
		// TODO
		// iterer over alle nøker i hash map'en 
		// bruk keySet til å få alle nøkkeler 
		// og get metodene for å skive hver post i til filen
		
		// lukk filen
		f.close();
		}
		
		// håndtere/fange opp eventuelle expeptions
		
		// TODO - SLUTT
}
