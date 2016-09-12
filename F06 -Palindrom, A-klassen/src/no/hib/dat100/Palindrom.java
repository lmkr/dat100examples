package no.hib.dat100;

public class Palindrom {

	public static void main(String[] args) {
		String s = "axxna";

		int v = 0;
		int h = s.length() - 1;

		while ((v < h) && (s.charAt(v) == s.charAt(h))) {
			v++;
			h--;
		}

		boolean palindrom = (v >= h);
		if (palindrom) {
			System.out.println(s + " er eit palindrom");
		} else {
			System.out.println(s + " er ikkje eit palindrom");
		}

		// Ny oppgave
		String t = "Sven-Olai:HiB:7020 Bergen:Norge";
		
		String[] svar = t.split(":");
		for (String e : svar) {
			System.out.println(e);
		}
	}

}
