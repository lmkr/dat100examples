package no.hib.dat100;
import java.util.HashMap;
import java.util.Scanner;

public class FjellRegister {
	private HashMap<String,Fjell> map;
	
	FjellRegister(){
		map = new HashMap<String, Fjell>();
	}
	
	public HashMap<String, Fjell> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Fjell> map) {
		this.map = map;
	}
	
	public void skrivMap() {
		System.out.println();
		System.out.println("Innholdet i HashMap");
		for (String fjellNavn : map.keySet()) {
			Fjell fjell = map.get(fjellNavn);
			System.out.println(fjellNavn + "\t" + fjell.getHoyde() + " meter");
		}
	}
	
	public void setteInn(){
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Oppgi navn på fjell :");
		String navn = tastatur.nextLine();
		System.out.print("Oppgi høyden i meter :");
		int hoyde = tastatur.nextInt();
		Fjell fjell = new Fjell(navn, hoyde);
		//sette inn i map
		map.put(navn, fjell);
	}
	
	
	public void soke(){
		Scanner tastatur = new Scanner(System.in);	
		System.out.print("Oppgi navn på fjell som skal søkes etter :");
		String fjellNavn = tastatur.nextLine();
		boolean svar = map.containsKey(fjellNavn);
		if (svar){
			System.out.println("Fjellet er registert " + fjellNavn + "\t" + map.get(fjellNavn).getHoyde() + " meter");
		}
		else{
			System.out.println("Fjellet er ikke registeret");
		}	
	}
	
	public void endre(){
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Oppgi navn på fjell som skal få ny høyde :");
		String navn = tastatur.nextLine();
		System.out.print("Oppgi den nye høyden i meter :");
		int hoyde = tastatur.nextInt();
		//sette inn i map
		Fjell fjell = new Fjell(navn, hoyde);
		map.put(navn,fjell);			
		System.out.println();
	}
	
	public void fjerne(){
		Scanner tastatur = new Scanner(System.in);
		System.out.println("Oppgi navn på fjell som skal fjernes :");
		String navn = tastatur.nextLine();
		map.remove(navn);
		System.out.println();
		
	}	

}//class
