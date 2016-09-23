package no.hib.dat100;

import easyIO.*;

public class Student {
	private final int STD = 4;
	private String navn;
	private int antKurs;
	private Kurs[] kurs;

	Student() {
		kurs = new Kurs[STD];
		navn = "";
		antKurs = 0;
	}

	Student(String navn) {
		kurs = new Kurs[STD];
		this.navn = navn;

	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getAntKurs() {
		return antKurs;
	}

	public void setAntKurs(int antKurs) {
		this.antKurs = antKurs;
	}

	public boolean maksKurs() {
		return antKurs == kurs.length;
	}

	public void meldPåKurs(Kurs k) {
		kurs[antKurs] = k;
		antKurs++;
	}

	public void skrivTimeplan() {
		Out skjerm = new Out();
		skjerm.outln("Timeplan for " + navn);
		skjerm.outln();
		skjerm.out("tid/dag\t");
		for (Ukedag dag : Ukedag.values()) {
			skjerm.out(dag + "\t");
		}
		skjerm.out("\n----------------------------------------------------------");
		skjerm.outln("----------------------------------------------------------");

		for (int tid = 8; tid < 22; tid++) {
			skjerm.out(tid, 6);
			skjerm.out("|\t");
			for (int i = 0; i < antKurs; i++) {
				if (kurs[i].getTid() == tid) {
					for (int j = 0; j < kurs[i].getDag().ordinal(); j++) {
						skjerm.out("\t");
					}
					skjerm.out(kurs[i].getKurskode());
				}

			}
			skjerm.outln();
		}

	}//

}// class

