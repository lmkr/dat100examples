/*
 * 
 * Modifisert eks fra lærebok
 */
package no.hib.dat100;

public class Konto {
	private static int nummer = 0;
	private String eier;
	private String adresse;
	private int kontonummer;
	private int saldo;

	Konto() {
		eier = "";
		adresse = "";
		saldo = 0;
		bestemKontonummer();
	}

	Konto(String eier,String adresse, int saldo) {
		this.eier = eier;
		this.adresse = adresse;
		this.saldo = saldo;
		bestemKontonummer();
		
	}
	
	
	public int getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	void settInn(int innskudd) {
		saldo = saldo + innskudd;
	}

	int giSaldo() {
		return saldo;
	}

	String getEier() {
		return eier;
	}

	String getAdresse() {
		return adresse;
	}

	void setEier(String e) {
		eier = e;
	}

	void setAdresse(String a) {
		adresse = a;
	}
	
	void bestemKontonummer() {
		nummer++;
		kontonummer = nummer;
	}
		
		boolean taUt(int uttak) {
			if (uttak > saldo){
				return false;
			}
			saldo = saldo - uttak;
			return true;
		}

	boolean overforTilAnnenKonto(Konto tilKonto, int belop) {
		if (taUt(belop)) {
			tilKonto.settInn(belop);
			return true;
		} else {
			return false;
		}
	}

	void skrivTilstand() {
		System.out.print("Eier: " + eier);
		System.out.print("\tAdresse: " + adresse);
		System.out.print("\t Kontonummer: " + kontonummer);
		System.out.print("\t Saldo: " + saldo);
		System.out.println();

	}

}// class
