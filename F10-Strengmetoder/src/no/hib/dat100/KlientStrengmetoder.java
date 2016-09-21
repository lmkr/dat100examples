package no.hib.dat100;

public class KlientStrengmetoder {
	
	public static void main(String[] args) {
		String t = "otto";		
		if (Strengmetoder.erPalindrom(t)){
		    System.out.println("\"" + t + "\" er et palindrom");
		} else {
			System.out.println("\"" + t + "\" er ikke et palindrom");
		}
		
		Strengmetoder.delOpp("Ole Olsen:Nygårdsgt 1:5020 Bergen", ":");
		Strengmetoder.delOpp("En streng med flere ord", " ");
		
		Strengmetoder.skrivMidten("a");
		Strengmetoder.skrivMidten("ab");
		Strengmetoder.skrivMidten("abc");
		Strengmetoder.skrivMidten("1234567");
		Strengmetoder.skrivMidten("12345678");
	}

}
