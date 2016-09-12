package no.hib.dat100;

public class Palindrom {

	public static void main(String[] args) {
		String s = "omo";
		
		int v = 0;
		int h = s.length() - 1;
		
		while (v < h && s.charAt(v) == s.charAt(h)) {
			v++;
			h--;
		}
		
		boolean palindrom = (v >= h);
		
		if (palindrom){
			System.out.println(s + " er eit palindrom.");
		} else {
			System.out.println(s + " er ikkje eit palindrom.");
		}

		// Ny oppgave
		String t = "Sven-Olai:HiB:7020 Bergen";
		
		String[] svar = t.split(":");
		
		// forenkla for-løkke
		for (String e : svar) {
			System.out.println(e);
		}
	}

}
