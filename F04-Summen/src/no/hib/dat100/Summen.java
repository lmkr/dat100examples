package no.hib.dat100;

import java.util.Scanner;

/*

*
* Lag et  program der brukeren kan taste inn et heltall n mellom 2 og 20. 
* Programmet skal beregne og skrive ut summen av alle heltall fra 1 til n 
* (se kjøring). Hvis brukeren taster inn et ugyldig (<2 eller >20) tall, skal 
* programmet be brukeren taste på nytt.
* 
* Eksempel kjøring:
* Tast inn n (et tall mellom 2 og 20): -6
* Feil inntasting. -6 er ikke et tall mellom 2 og 20.
* Tast inn n (et tall mellom 2 og 20): 6
* 1 + 2 + 3 + 4 + 5 + 6 = 21
*
*OBS! Vi ser på venstre side av utrykket:  antall '+'-tegn er 1 mindre enn antall tall
*/

public class Summen {

	public static void main(String[] args) {

		int n;
		int sum1 = 0; // OBS! En lokal variabel må gis verdi før vi bruker den
		int sum2 = 0;
		boolean gyldigInndata;

		Scanner input = new Scanner(System.in);
		/* do-while-løkke ved innlesing */
		do {
			System.out.print("Tast inn n (et tall mellom 2 og 20): ");
			n = input.nextInt();
			gyldigInndata = (n >= 2) && (n <= 20);

			if (!gyldigInndata) {
				System.out.println("Feil inndata. " + n + " er ikke et tall mellom 2 og 20.");
			}
		} while (!gyldigInndata);

		/* while-løkke ved summering */
		int teller = 1;
		while (teller < n) {
			sum1 = sum1 + teller;
			System.out.print(teller + " + ");
			teller = teller + 1; // evt. teller++;
		}
		System.out.println(n + " = " + (sum1 + n));

		/* for-løkke ved summering */
		for (int i = 1; i < n; i++) { // evt.i = i + 1
			sum2 = sum2 + i; // evt. sum += i
			System.out.print(i + " + ");
		}
		System.out.println(n + " = " + (sum2 + n));

	}

}
