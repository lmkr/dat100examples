package no.hib.dat100;

public class MainPerson {

	public static void main(String[] args) {

		Person per = new Person("Per", 1950);

		// Kall til metoder definert i Person
		System.out.println(per.info());
		System.out.println("Alder er beregnet til " + per.beregnAlder() + " år");

		// Metoden er definert i Object, men overkjørt i Person
		System.out.println("per.toString() : " + per.toString());

		// Kall til arvet metode definert i Object
		System.out.println("per.equals(per): " + per.equals(per));

	}
}
