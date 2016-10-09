package no.hib.dat100;

public class MainAnsatt {

	public static void main(String[] args) {

		Ansatt ane = new Ansatt("Ane", 1980, 12345, 58);

		// Kall til metoder definert i Ansatt
		System.out.println("Ansattnr  : " + ane.hentAnsattNr());
		System.out.println("Lønnstrinn: " + ane.hentLønstrinn());
		System.out.println("Månedslønn: " + ane.beregnMaanedslonn());

		// Kall til arvede metoder definert i Person
		System.out.println(ane.info());
		System.out.println("Alder er beregnet til " + ane.beregnAlder() + " år");

		// Kall til arvet metode definert i Object
		System.out.println("ane.equals(ane): " + ane.equals(ane));

		/*
		 * Om de kommenterer bort toString() i Ansatt og kompilerer på nytt, vil
		 * vi få kalla toString() i Person. Om vi kommenter også bort den og
		 * kompilerer på nytt, vil vi få kalla toString i Object. Meir om dette
		 * seinare.
		 */

		System.out.println("ane.toString() : " + ane.toString());

	}
}
