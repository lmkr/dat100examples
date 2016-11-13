package no.hib.dat100.runtimeeks;

import javax.swing.JOptionPane;

public class HastighetCheck {

	private static boolean ok = true;

	public static void main(String[] args) {

		int km = 0, tm = 0;
		System.out.println("Starter main().");

		String kmstr = JOptionPane.showInputDialog("Avstand i kilometer");

		if (kmstr.matches("\\d+")) {
			km = Integer.parseInt(kmstr); // konverter streng til heltall
		} else {
			ok = false;
			System.out.println("Feil: Kilometer ikke et tall");
		}
		
		if (ok) { // en koding-strategi for å gå videre hvis ikke feil
			String tmstr = JOptionPane.showInputDialog("Tid i timer");

			if (tmstr.matches("\\d+")) {
				tm = Integer.parseInt(tmstr); // konverter streng til // heltall

				if (tm != 0) { // alterativ koding strategi hvis ikke feil
					skrivHastighet(km, tm);
				}
				else {
					System.out.println("Feil: tid kan ikke være 0");
				}
			}
			else {
				System.out.println("Feil: tid i timer ikke et tall");
			}
		}
		

		System.out.println("Returnerer fra main().");
	}

	private static void skrivHastighet(int kilometer, int timer) {

		System.out.println("Starter skrivHastighet().");

		int hastighet = beregnHastighet(kilometer, timer);

		JOptionPane.showMessageDialog(null, "Hastighet: " + kilometer + "/" + timer + " = " + hastighet);

		System.out.println("Returnerer fra skrivHastighet().");
	}

	private static int beregnHastighet(int avstand, int tid) {

		System.out.println("Start beregnhastighet().");

		int hastighet = avstand / tid;

		System.out.println("Returnerer beregnHastighet().");

		return hastighet;
	}
}
