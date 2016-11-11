package no.hib.dat100.lesinnfil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LeseFraFilForsok {

	private static String MAPPE_STR = "c:/work/";
	private static int ANTALL_FORSOK = 3;

	static public void main(String[] args) {

		String filnavn;

		int forsok = 1;
		boolean lestinn = false;

		while (forsok <= ANTALL_FORSOK && !lestinn) {

			filnavn = JOptionPane.showInputDialog("Filnavn i mappe ( " + forsok
					+ ")" + ":");

			try {
				BufferedReader reader = new BufferedReader(new FileReader(
						MAPPE_STR + filnavn));

				int linjenummer = 1;

				// les innhold i filen linje for linje
				String linje = reader.readLine();

				do {
					linje = reader.readLine();

					if (linje != null) {
						System.out.println(linjenummer + " " + linje);
						linjenummer++;
					}
				} while (linje != null);

				reader.close();
				lestinn = true;

			} catch (IOException exception) {
				// valgt å håndtere alt med superklassen IOException
				JOptionPane.showMessageDialog(null, "Problem med fil.");
				forsok++;
			}
		}
	}
}
