package no.hib.dat100;

public class Soking {

	/*************************************************************************************************/
	// Søkealgoritmer
	/*************************************************************************************************/

	/**
	 * Metoden gjør et binært søk i en sortert tabell av heltall
	 * 
	 * @param data er data som skal søkes i
	 * @param min er startindeks
	 * @param maks er sluttindeks
	 * @param el  er elementet vi søker etter
	 * @return sann dersom elementet ble funnet ellers usann.
	 */

	/* Rekursiv binærsøk som returnerer ved funn ellers -1 */

	public static int binaerSok(int[] data, int min, int maks, int el) {
		// Returnerer indeksen til målelementet hvis det fins ellers -1
		if (min > maks) { // basistilfelle, ingen element
			return -1;
		}

		int midten = (min + maks) / 2;
		int midtTall = data[midten];
		if (el == midtTall) { // basistilfelle, finner elementet
			return midten;
		}
		if (el < midtTall) {// ( vil her også fungere med else if)
			return binaerSok(data, min, midten - 1, el);
		} else { // resultat > 0
			return binaerSok(data, midten + 1, maks, el);
		}
	}// metode

	
	public static int binaerSok2(int[] data, int min, int maks, int el) {
		int resultat;
		// Returnerer indeksen til målelementet hvis det fins ellers -1
		if (min > maks) { // basistilfelle, ingen element
			resultat = -1;
		}
		int midten = (min + maks) / 2;
		int midtTall = data[midten];
		if (el == midtTall) { // basistilfelle, finner elementet
			resultat = midten;
		}
		if (el < midtTall) {// ( vil her også fungere med else if)
			resultat= binaerSok(data, min, midten - 1, el);
		} else { // resultat > 0
			resultat = binaerSok(data, midten + 1, maks, el);
		}
		return resultat;
	}// metode
	
	/* Ikke rekursiv binærsøk som returnerer indeks */
	public static int binaerSok3(int[] data, int min, int maks, int el) {
		// Returnerer indeksen til målelementet hvis det fins ellers -1
		int forste = min;
		int siste = maks;
		int indeks = -1;
		boolean funnet = false;
		while ((forste <= siste) && !(funnet)) {
			int midten = (forste + siste) / 2;
			int midtTall = data[midten];
			if (el == midtTall) {
				funnet = true;
				indeks = midten;
			} else if (el < midtTall) {// Søk i nedre halvdel
				siste = midten - 1;
			} else {// Søk i øvre halvdel
				forste = midten + 1;
			}
		} // while

		return indeks;
	}//

}// class
