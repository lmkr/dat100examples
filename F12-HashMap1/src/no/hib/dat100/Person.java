package no.hib.dat100;
import java.util.Scanner;

public class Person {
	private String navn;
	private String adresse;
	private String telefonnr;
	
	public Person(){
		navn = "";
		adresse ="";
		telefonnr = "";
	}
	
	public Person(String navn, String adresse, String telefonnr){
		this.navn = navn;
		this.adresse = adresse;
		this.telefonnr = telefonnr;
	}
	
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelefonnr() {
		return telefonnr;
	}
	public void setTelefonnr(String telefonnr) {
		this.telefonnr = telefonnr;
	}
	
	void lesData(){
		Scanner tastatur = new Scanner(System.in);
		System.out.print("oppgi navn: ");
		navn = tastatur.nextLine();
		System.out.print("oppgi adresse: ");
		adresse = tastatur.nextLine();
		System.out.print("oppgi telefonnummer: ");
		telefonnr = tastatur.nextLine();		
	}
	
	void skrivData(){
		System.out.println("Navn               : " + navn);
		System.out.println("Adresse            : " + adresse);
		System.out.println("Telefonnummer      : " + telefonnr);				
	}	

}//class
