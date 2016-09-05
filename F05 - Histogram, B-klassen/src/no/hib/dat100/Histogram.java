package no.hib.dat100;

import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		final int MAKS = 200;
		int[] frekvensTab = new int[MAKS];
		
		Scanner tastatur = new Scanner(System.in);
		System.out.println("Skriv inn tal frå og med 0 til og med " + (MAKS - 1));
		System.out.println("Avslutt ved å skrive eit tal utanfor intervallet");
		int tal = tastatur.nextInt();
		
		while (tal >= 0 && tal < MAKS) {
			frekvensTab[tal]++;
			tal = tastatur.nextInt();
		}
		
		tastatur.close();
		
		// Krev at det er lest inn minst ein lovleg verdi
		int start = 0;
		while (frekvensTab[start] == 0) {
			start++;
		}
		
		int slutt = MAKS - 1;
		while (frekvensTab[slutt] == 0) {
			slutt--;
		}
		
		System.out.println();;
		System.out.println("Histogram");
		System.out.println("Minste verdi " + start);
		System.out.println("Største verd " + slutt);
		System.out.println();;
		
		for (int i = start; i <= slutt; i++) {
			// %3d set av 3 plassar for eit heiltal. Kunne også brukt easyIO
			System.out.printf("%3d:", i );
			for (int j = 0; j < frekvensTab[i]; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
