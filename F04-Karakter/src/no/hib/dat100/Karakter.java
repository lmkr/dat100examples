package no.hib.dat100;

import java.util.Scanner;

public class Karakter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Oppgi en karakter A..F [STORE BOKSTAVER] ");
		String karakter = tastatur.nextLine();
		switch (karakter) {
			case "A":
				System.out.println("Svært bra");
				break;
			case "B":
				System.out.println(" Meget bra");
				break;
			case "C":
				System.out.println("Bra");
				break;
			case "D":
				System.out.println("Noe bra");
				break;
			case "E":
				System.out.println("Lite bra");
			case "F":
				System.out.println("Ikke bra");
				break;
			default:
				System.out.println("ugyldig karakter");
			}

	}

}
