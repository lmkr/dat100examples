package no.hib.dat100;

import java.util.Scanner;

public class KlientSok {

	public static void main(String[] args) {
		// Sortert heltallstabell
		int tab[] = {10,20,30,40,50,60,70,80,90,100};
		Scanner tastatur = new Scanner(System.in);

		System.out.println("oppgi et heltall: ");
		int element = tastatur.nextInt();

		/* Rekursiv binærsøking som returnerer indeksen, -1 ved ikke-funn */
		System.out.println("\nUtskrift fra rekursiv binaersoking som returnerer indeksen, -1 ved ikke-funn.");
		int ind = Soking.binaerSok(tab, 0, tab.length - 1, element); 
		System.out.println("indeksen er " + ind);
		if (ind > -1) {
			System.out.print(tab[ind]);
			System.out.println(" er med");
		} else {
			System.out.print(element);
			System.out.println(" er ikke med");
		}
		// -------------------------------------------------------------------------------------
		
		/*
		 * Ikke-rekursiv binærsøking som returnerer indeksen, -1 ved ikke-funn
		 */
		System.out.println("\nUtskrift fra ikke-rekursiv binaersoking som returnerer indeksen, -1 ved ikke-funn.");
		ind = Soking.binaerSok2(tab, 0, tab.length - 1, element);
		System.out.println("indeksen er " + ind);
		if (ind > -1) {
			System.out.print(tab[ind]);
			System.out.println(" er med");
		} else {
			System.out.print(element);
			System.out.println(" er ikke med");
		}			

	}

}
