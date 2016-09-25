package no.hib.dat100;

import java.util.Scanner;

public class Histogram {

	private static int N_ELEMENT = 200;
	private static int[] histTabell = new int[N_ELEMENT]; 
	public static void lesInn() {
		Scanner tastatur = new Scanner(System.in);
		/*
		 * OBS! Tall og indekser følger hverandre. Anta at tallet er j, så er
		 * histTabell[j] antall forekomster av j og tilsvarende vil antall av
		 * tallet j+1 være lagret i histTabell[j+1].
		 */
		// Les tallene
		System.out.println("Angi tallene (0-199). Et tall pr. linje. Avslutt med -1.");
		int tall = tastatur.nextInt(); // Les det første tallet
		while (tall >= 0 && tall < histTabell.length) {
			histTabell[tall]++; // Registrering av hyppighet
			tall = tastatur.nextInt();
			// Les neste tall
		}
	}

	private static int finnMinsteInd() {
		/* Utnytter at en heltallstabell initialiseres med 0-verdier. */
		/* Stopper hvis vi påtreffer tall ulik 0 */
		int minsteInd = 0;
		while (minsteInd < histTabell.length && histTabell[minsteInd] == 0) {
			minsteInd++;
		}
		return minsteInd;
	}

	private static int finnStorsteInd() {
		int storsteInd = histTabell.length - 1;
		while (storsteInd >= 0 && histTabell[storsteInd] == 0) {
			storsteInd--;
		}
		return storsteInd;
	}

	public static void skrivUt() {
		/* Skriv histogram */
		int minsteInd = finnMinsteInd();
		int storsteInd = finnStorsteInd();
		System.out.println("Tall\t:\tHyppighet");
		for (int i = minsteInd; i <= storsteInd; i++) {
			System.out.print(i + "\t:\t");
			for (int stjerne = 1; stjerne <= histTabell[i]; stjerne++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}//class