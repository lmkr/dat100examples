package no.hib.dat100;
import java.util.HashMap;
public class Fjellhoyde {

	public static void main(String[] args) {
		HashMap<String, Integer> fjell = new HashMap<String, Integer>();
		fjell.put("Galdhøpiggen", 2246);
		fjell.put("Glittertinden", 3465);
		fjell.put("Grytkollen", 1836);
		fjell.put("Midtre Fossafjell", 1708);
		fjell.put("Nordre Fossafjell", 1708);
		//Skriv ut map
		skrivMap(fjell);
		System.out.println("Glittertinden lagret" + " " + fjell.containsKey("Glittertinden"));
		System.out.println();
		//Endre
		System.out.print("Endret høyden til Glittertinden");
		fjell.put("Glittertinden",2465);
		skrivMap(fjell);
		//Fjerne
		System.out.println("Fjerne Grytkollen");
		fjell.remove("Grytkollen");
		skrivMap(fjell);
	}
	
	public static void skrivMap(HashMap<String, Integer> map){
		System.out.println("Innholdet i HashMap");
		for(String fjellNavn:map.keySet() ){
			Integer hoyde = map.get(fjellNavn);
			System.out.println(fjellNavn + " " + hoyde.intValue() + " meter");
		}
	}//main
}//class
	
