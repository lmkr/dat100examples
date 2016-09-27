package no.hib.dat100;

import java.util.HashMap;
import java.util.Scanner;

public class KlientHashMap {

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		HashMap<String, Person> personregister = new HashMap<String, Person>();
		System.out.print("Antall personer som skal registereres: ");
		int antall = tastatur.nextInt();

		for (int i = 0; i < antall; i++) {
			System.out.println("Antall gjenværende personer " + (antall - i));
			Person person = new Person();
			person.lesData();
			personregister.put(person.getTelefonnr(), person);
		}

		// Skriver ut alle personobjektene
		System.out.println("Viser alle personer" + "(ukjent rekkefølge) :");

		for (Person person : personregister.values()) {
			person.skrivData();

		}

	}

}
