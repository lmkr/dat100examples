package no.hib.dat100;
import java.util.HashMap;
import java.util.Scanner;
public class Fjell {
	private String navn;
	private int hoyde;	
	
	public Fjell(){
		navn = "";
		hoyde = 0;		
	}
	
	public Fjell(String navn, int hoyde){
		this.navn = navn;
		this.hoyde = hoyde;		
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getHoyde() {
		return hoyde;
	}

	public void setHoyde(int hoyde) {
		this.hoyde = hoyde;
	}
	


	
}// class

