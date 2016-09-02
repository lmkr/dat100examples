
/* 
 * ”Lag et lite program som lar brukeren taste inn nedbørsmengde for de 
 *  syv dagene i en uke. Deretter skal programmet finne ut hvilken dag 
 *  det regnet mest og hvor mye det regnet denne dagen. Svaret skrives 
 *  ut på skjermen.”
 */

import java.util.Scanner;

public class Nedbor {

	public static void main(String[]  args) {

		Scanner tastatur = new Scanner(System.in);

		final int ANTALL_DAGER_I_UKEN = 7;

		String[] dager = { "mandag", "tirsdag", "onsdag", "torsdag", "fredag", "lørdag", "søndag" };

		double[] nedbor = new double[ANTALL_DAGER_I_UKEN]; // Indeks 0..6

		for (int dagNr = 0; dagNr < ANTALL_DAGER_I_UKEN; dagNr++) {
			System.out.print("Tast inn nedbør for " + dager[dagNr] + ": ");
			nedbor[dagNr] = tastatur.nextDouble();
			// tastatur.nextLine();
		}

		int dagMedMaksNedbor = 0;
		for (int dagNr = 1; dagNr < ANTALL_DAGER_I_UKEN; dagNr++) {
			if (nedbor[dagNr] > nedbor[dagMedMaksNedbor]) {
				dagMedMaksNedbor = dagNr;
			}
		}

		System.out.println("Det regnet mest på " + dager[dagMedMaksNedbor] + ". Nedbørsmengden var "
				+ nedbor[dagMedMaksNedbor] + " mm.");
	}
}