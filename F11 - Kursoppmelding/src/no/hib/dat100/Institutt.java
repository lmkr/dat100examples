package no.hib.dat100;

import easyIO.*;

public class Institutt {
	private final int STDK = 10;
	private final int STDS = 300;
	private int antKurs;
	private Kurs[] kurs;
	private int antStudenter;
	private Student[] studenter;

	// In tast = new In();
	// Out skjerm = new Out();

	Institutt() {
		kurs = new Kurs[STDK];
		studenter = new Student[STDS];
		antKurs = 0;
		antStudenter = 0;

	}

	public int getAntKurs() {
		return antKurs;
	}

	public void setAntKurs(int antKurs) {
		this.antKurs = antKurs;
	}

	public int getAntStudenter() {
		return antStudenter;
	}

	public void setAntStudenter(int antStudenter) {
		this.antStudenter = antStudenter;
	}

	public void lesFraFil() {

		In fil = new In("register.txt");

		while (!fil.lastItem()) {
			String kurskode = fil.inWord();
			int dag = fil.inInt();
			int tid = fil.inInt();
			Ukedag ukedag = Ukedag.finnDag(dag);
			kurs[antKurs] = new Kurs(kurskode, ukedag, tid);
			antKurs++;
		}// while

	}

	public void meny() {
		In tast = new In();
		Out skjerm = new Out();
		String meny =

		"\n" + "1 -  meld student på kurs\n"
				+ "2 -  lag timeplan for student \n" + "3 -  avslutt program\n"
				+ "\n" + "valg: ";

		int valg = 0;

		do {
			skjerm.out(meny);
			valg = tast.inInt();

			switch (valg) {
			case 1:
				registrerStudent();
				break;
			case 2:
				skrivTimeplan();
				break;
			case 3: // avslutter
				break;
			default:
				skjerm.outln("Ukjent menyvalg");
			}
		} while (valg != 3); // løkke

	}// metode

	public Student finnStudent() {
		In tast = new In();
		Out skjerm = new Out();

		skjerm.out("Gi navn på studenten: ");
		String navn = tast.inLine();

		// Student finnes
		Student stud = null;
		for (int i = 0; i < antStudenter; i++) {
			if (navn.equals(studenter[i].getNavn())) {
				stud = studenter[i];
			}
		}

		// Ny student
		if (stud == null) {
			if (antStudenter == studenter.length) {
				skjerm.outln("Kan ikke registrere flere studenter. ");
			} else {
				stud = new Student(navn);
				studenter[antStudenter] = stud;
				antStudenter++;
			}
		}

		return stud;
	}

	Kurs finnKurs(String kurskode) {
		Kurs kurset = null;
		for (int i = 0; i < antKurs; i++) {
			if (kurs[i].getKurskode().equals(kurskode)) {
				kurset = kurs[i];

			}

		}
		return kurset;

	}//

	public void registrerStudent() {
		In tast = new In();
		Out skjerm = new Out();
		Student stud = finnStudent();
		if (stud == null) {// maks antall studenter er nådd
			return;
		}
		skjerm.out("Oppgi kurskode (blank linje avslutter): ");
		String kurskode = tast.readLine();

		while (!kurskode.equals("")) {
			Kurs k = finnKurs(kurskode);
			if (stud.maksKurs()) {
				skjerm.outln("Kan ikke følge flere kurs. ");
			} else if (k == null) {
				skjerm.outln("Ukjent kurskode");
			} else if (k.erFullt()) {
				skjerm.outln("Beklager - kurset er fullt!");
			} else {
				k.meldPåStudent(stud);
				stud.meldPåKurs(k);
				skjerm.outln(stud.getNavn() + " påmeldt " + kurskode);
			}

			skjerm.out("Kurskode (blank linje avslutter): ");
			kurskode = tast.readLine();

		}

	}//

	void skrivTimeplan() {
		Student stud = finnStudent();
		if (stud != null) {
			stud.skrivTimeplan();
		}

	}

}// class


