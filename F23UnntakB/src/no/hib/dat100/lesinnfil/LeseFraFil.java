package no.hib.dat100.lesinnfil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LeseFraFil {

	private static String MAPPE_STR = "/Users/hib/git/dat100examples/F23UnntakB/src/no/hib/dat100/lesinnfil/";

	static public void main(String[] args) {

		String filnavn;

		filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);

		try {
			BufferedReader reader = new BufferedReader(new FileReader(MAPPE_STR + filnavn));

			int linjenummer = 1;

			// les innhold i filen linje for linje
			String linje = reader.readLine();

			while (linje != null) {
				System.out.println(linjenummer + " " + linje);
				linje = reader.readLine();
				linjenummer++;
			}

			reader.close();

		} catch (FileNotFoundException fexn) {
			JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + fexn.getMessage());
		} catch (IOException ioexn) {
			JOptionPane.showMessageDialog(null, "Problemer med å lese eller lukke fil.\n" + ioexn.getMessage());
		}
		// rekkefolge av exceptions viktig her - subklassen først!
	}
}
