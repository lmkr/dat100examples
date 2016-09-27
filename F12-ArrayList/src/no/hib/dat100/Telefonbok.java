package no.hib.dat100;
import java.util.ArrayList;
import java.util.Scanner;

public class Telefonbok {
	private ArrayList<Person>liste; 
	
	/**
	 * Konstruktør
	 */
	public Telefonbok(){
		liste = new ArrayList<>();
	}
	
	/**
	 * 
	 * @param person som settes inn
	 */
	public void settInn(Person person){			 
		 liste.add(person);
	}
	/**
	
	 * @param indeks indeksen der  personen kommer inn
	 * @param person personen som settes in
	 */
	public void settInnPaaIndeks(int indeks, Person person){
		liste.add(indeks,person);
	}
	/**
	
	 * @param person
	 * @return  returnerer og fjerner
	 */
	public boolean fjern(Person person){
		return liste.remove(person);		
	}
	/**
	 * 
	 * @param indeks må være lovlig indeks!
	 * @return returnerer og fjerner personen med indeks
	 */
	public Person fjernFraIndeks(int indeks){
		return liste.remove(indeks);
	}
	
	/**
	 * 
	 * @param person 
	 * skriver ut opplysninger for person
	 *
	 */
	public void vis(Person person){
		person.skrivTilstand();		
	}
	/**
	 * Viser alle personene
	 */
	public void visAlle(){
		for(int i = 0; i < liste.size();i++ ){
			vis(liste.get(i));
		}
	}
	
	/**
	 * Skriv ut alle personopplysninger
	 */
	public void fjernAlle(){
		for(int i = 0; i < liste.size();i++){
			fjern(liste.remove(i)); //ALt. bare skrive liste.clear();
		}		
	}
	
	/**
	 *
	 * @param p person som søkes etter
	 * @return true hvis funnet ellers false
	 */
	public boolean soke(Person p){
		boolean funnet = false;
		if(liste.contains(p)){
			funnet = true;
		}
		return funnet;
	}
	
	/**
	 * 
	 * @return true hvis listen er tom ellers false
	 */
	public boolean erTom(){
		return (liste.size() == 0);
	}
	

}//class
