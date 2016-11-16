package no.hib.dat100.kontaktlisteunntak;

import java.io.IOException;

import javax.swing.JOptionPane;

public class KontaktListeInnlesingTester {

	
	// sti til mappe hvor test filene ligger
	private static String sti = "c:/work/";
	
	// test innlesing fra en gitt fil
    // separer dette ut i en metod så vi enkelt kan kjøre 
    // test med ulike filer for å teste feiltilfeller.
	public static void testLesFil(String filnavn) {
		
		System.out.println("Tester: " + filnavn);
		KontaktListeInnlesing kl = new KontaktListeInnlesing();

		try {
			kl.lesFraFil(sti + filnavn);
		} catch (IOException ioex) {
			System.out.println("Problem med å åpne eller lukke fil");
			kl.nulstill(); // nulstille pga. ikke alt fra fil blev lest
			
		} catch (BadDataFormatException bdex) {
			System.out.println("Feil i format: " + bdex.getMessage());
			kl.nulstill();
		} finally {
			System.out.println("-----------------------------");
		}
	}
	
	public static void main(String[] args) {
		
		// test tilfeller
		testLesFil("test-enfil-som-ikke-finnes.txt");
		testLesFil("test-okfil.txt");
		testLesFil("test-feilformat-antall.txt");
		testLesFil("test-feil-antall.txt");
		testLesFil("test-navn-tomt.txt");
		testLesFil("test-navnikkeunikt.txt");
		testLesFil("test-feiltype.txt");
		testLesFil("test-feilnummer.txt");
}
}
